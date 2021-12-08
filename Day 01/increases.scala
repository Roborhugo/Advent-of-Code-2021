package day01

@main
def start(filename: String): Unit = 
  println(s"Singles: ${countIncreases(input(filename))}")
  println(s"Triples: ${countIncreases(inputSlide3(filename))}")

/** Input as a workable Vector[Int]*/
def input(filename: String): Vector[Int] = 
  import scala.io.Source // To read from unput file

  val lines = for line <- Source.fromFile(filename).getLines yield line
  lines.toVector.map(_.toInt)

def inputSlide3(filename: String): Vector[Int] = 
  input(filename).sliding(3).toVector.map(_.sum)

/** Counts number of increases in a depth measurement */
def countIncreases(depthMeasurements: Vector[Int]): Int = 
  var counter: Int = 0
  
  // Loops for every element in depthMeasurements except the first one
  for i <- depthMeasurements.indices.tail do
    if depthMeasurements(i) > depthMeasurements(i-1) then counter += 1
  counter 
  
