package day02

/** Starts program*/
@main
def main(filename: String) = 
  val submarine = new Submarine
  val aimedSubmarine = new AimedSubmarine

  movement(input(filename), submarine)
  movement(input(filename), aimedSubmarine)

  println(s"Final depth * position of Submarine: ${submarine.depth * submarine.position}")
  println(s"Final depth * position of Aimed Submarine: ${aimedSubmarine.depth * aimedSubmarine.position}")

/** Moves submarine using planned course (input) */
def movement(course: Vector[(String, Int)], submarine: Submarine): Unit = 
  course.foreach(command => command._1 match
    case "forward" => submarine.forward(command._2)
    case "down" => submarine.down(command._2)
    case "up" => submarine.up(command._2))

/** Gets input as workable Vector*/
def input(filename: String): Vector[(String, Int)] = 
  import scala.io.Source // To read from unput file

  val lines = for line <- Source.fromFile(filename).getLines yield line
  
  lines.toVector.map(c => (c.split(' ')(0), c.split(' ')(1).toInt))