package day02

/** Model of our submarine*/
class Submarine: 
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


class AimedSubmarine extends Submarine:
  var aim = 0

  /** Moves submarine distance steps forward and distance * */
  override def forward(distance: Int): Unit = 
    position += distance
    depth += distance * aim

  /** Rotates submarine up by rotation*/
  override def up(rotation: Int): Unit = 
    aim -= rotation


  /** Moves submarine distance steps down*/
  override def down(rotation: Int): Unit = 
    aim += rotation