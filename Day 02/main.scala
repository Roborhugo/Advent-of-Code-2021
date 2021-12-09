package day02

/** Moves submarine using planned course (input) */
def movement(course: Vector[(String, Int)]): Unit = 
  course.foreach(command => command._1 match
    case "forward" => Submarine.forward(command._2)
    case "down" => Submarine.down(command._2)
    case "up" => Submarine.up(command._2))