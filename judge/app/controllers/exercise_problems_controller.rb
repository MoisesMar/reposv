class ExerciseProblemsController < ApplicationController
  before_filter :req_psetter, :except => [:show]
    
    def show
      @exercise_problem = ExerciseProblem.find(params[:id])
      @problem = @exercise_problem.problem
    end
    
    def create
        @exercise = Exercise.find(params[:exercise_id])
        @exercise_problem = @exercise.exercise_problems.create(params[:exercise_problem])
        redirect_to exercise_path(@exercise)
    end

    def destroy
        @exercise = Exercise.find(params[:exercise_id])
        @exercise_problem = @exercise.exercise_problems.find(params[:id])
        @exercise_problem.destroy
        redirect_to exercise_path(@exercise)
    end

  def download
    ep = ExerciseProblem.find(params[:id])
    problem = ep.problem
    exercise = ep.exercise
    if exercise.current?
      send_file problem.pdescription.path, :type=>"application/pdf"
    end
  end
end
