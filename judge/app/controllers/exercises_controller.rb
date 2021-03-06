class ExercisesController < ApplicationController
  before_filter :req_psetter, :except=>[:getvalid,:exercise]

  # GET /exercises
  # GET /exercises.json
  def index
    @exercises = Exercise.all

    respond_to do |format|
      format.html # index.html.erb
      format.json { render :json => @exercises }
    end
  end

  def getvalid
      @exercises = Exercise.where("from_date <= :cdate and to_date >= :cdate",{:cdate => DateTime.now.to_s(:db)})
      @past_exercises = Exercise.where("to_date <= :cdate",{:cdate => DateTime.now.to_s(:db)})
      @future_exercises = Exercise.where("from_date > :cdate",{:cdate => DateTime.now.to_s(:db)})
  end

  def exercise
    @exercise = Exercise.find(params[:id])
    @problems = @exercise.exercise_problems.order(:problem_number)
    respond_to do |format|
        if(!@exercise.current?)
           format.html { redirect_to :root, :notice => 'the exercise is not running' }
        else
           format.html 
        end
    end
  end

  # GET /exercises/1
  # GET /exercises/1.json
  def show
    @exercise = Exercise.find(params[:id])

    respond_to do |format|
      format.html # show.html.erb
      format.json { render :json => @exercise }
    end
  end

  # GET /exercises/new
  # GET /exercises/new.json
  def new
    @exercise = Exercise.new

    respond_to do |format|
      format.html # new.html.erb
      format.json { render :json => @exercise }
    end
  end

  # GET /exercises/1/edit
  def edit
    @exercise = Exercise.find(params[:id])
  end

  # POST /exercises
  # POST /exercises.json
  def create
    @exercise = Exercise.new(params[:exercise])

    respond_to do |format|
      if @exercise.save
        format.html { redirect_to @exercise, :notice => 'exercise was successfully created.' }
        format.json { render :json => @exercise, :status => :created, :location => @exercise }
      else
        format.html { render :action => "new" }
        format.json { render :json => @exercise.errors, :status => :unprocessable_entity }
      end
    end
  end

  # PUT /exercises/1
  # PUT /exercises/1.json
  def update
    @exercise = Exercise.find(params[:id])

    respond_to do |format|
      if @exercise.update_attributes(params[:exercise])
        format.html { redirect_to @exercise, :notice => 'exercise was successfully updated.' }
        format.json { head :no_content }
      else
        format.html { render :action => "edit" }
        format.json { render :json => @exercise.errors, :status => :unprocessable_entity }
      end
    end
  end

  # DELETE /exercises/1
  # DELETE /exercises/1.json
  def destroy
    @exercise = Exercise.find(params[:id])
    @exercise.destroy

    respond_to do |format|
      format.html { redirect_to exercises_url }
      format.json { head :no_content }
    end
  end
end
