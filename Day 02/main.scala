package day02

/** Moves submarine using planned course (input) */
def movement(course: Vector[(String, Int)]): Unit = 
  course.foreach(command => command._1 match
    case "forward" => Submarine.forward(command._2)
    case "down" => Submarine.down(command._2)
    case "up" => Submarine.up(command._2))

/** Gets input as workable Vector*/
def input(filename: String): Vector[(String, Int)] = 
  import scala.io.Source // To read from unput file

  val lines: Vector[String] = for line <- Source.fromFile(filename).getLines yield line
  
  lines.map(c => (c.split(' ')(0), c.split(' ')(1)))