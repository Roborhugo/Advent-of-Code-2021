package day02

object Submarine:
  var depth = 0
  var position = 0

  def forward(distance: Int) = 
    position += distance

  def up(distance: Int) = 
    depth -= distance

  def down(distance: Int) = 
    depth += distance