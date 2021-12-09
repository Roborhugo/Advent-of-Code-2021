package day02

/** Model of our submarine*/
object Submarine:
  var depth = 0
  var position = 0

  /** Moves submarine distance steps forward*/
  def forward(distance: Int) = 
    position += distance
  
  /** Moves submarine distance steps up*/
  def up(distance: Int) = 
    depth -= distance


  /** Moves submarine distance steps down*/
  def down(distance: Int) = 
    depth += distance