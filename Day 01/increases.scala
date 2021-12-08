package day01

/** puzzleInput as a workable Vector[Int]*/
val input: Vector[Int] = 
  puzzleInput.split(' ').map(_.toInt).toVector

/** Counts number of increases in a depth measurement */
def countIncreases(depthMeasurements: Vector[Int]): Int = 
  var counter: Int = 0
  
  // Loops for every element in depthMeasurements except the first one
  for i <- depthMeasurements.indices.tail do
    if depthMeasurements(i) > depthMeasurements(i-1) then counter += 1
  counter 
  
