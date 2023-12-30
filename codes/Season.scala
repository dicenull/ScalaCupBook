import ChecksumAccumulator.calculate

object Season extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
