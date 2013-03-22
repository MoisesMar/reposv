class Score < ActiveRecord::Base
   has_many :submission
   belongs_to :exercise
   
   attr_accessible :rank, :total

#   def suma(n)
#     return n+10
#   end

end
