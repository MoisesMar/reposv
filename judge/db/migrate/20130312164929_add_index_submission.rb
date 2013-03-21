class AddIndexSubmission < ActiveRecord::Migration
  def up
	add_index :submissions, :score_id
  end

  def down
  end
end
