class Testcase < ActiveRecord::Base
  belongs_to :problem

  has_many :submissions, :dependent => :destroy

  attr_accessible :jtype,:infile,:outfile
  has_attached_file :infile, :path => ":rails_root/protected/correct/:basename:id.:extension", :url => ":basename:id.:extension"
  has_attached_file :outfile, :path => ":rails_root/protected/correct/:basename:id.:extension", :url => ":basename:id.:extension"
  validates_attachment_presence :infile
  validates_attachment_size :infile, :less_than => 20.megabytes
  validates_attachment_presence :outfile
  validates_attachment_size :outfile, :less_than => 20.megabytes

  def self.judgeTypes
    [['Download Input',1],['Upload source',2]]
  end

  def self.judgeTypeHash
      {1=>:downloadInput, 2 => :uploadSource}
  end

end
