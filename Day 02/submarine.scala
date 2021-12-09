package day02

/** Model of our submarine*/
object Submarine:
  var depth = 0
  var position = 0

  /** Moves submarine distance steps forward*/
  def forward(distance: Int): Unit = 
    position += distance
  
  /** Moves submarine distance steps up*/
  def up(distance: Int): Unit = 
    depth -= distance


  /** Moves submarine distance steps down*/
  def down(distance: Int): Unit = 
    depth += distance