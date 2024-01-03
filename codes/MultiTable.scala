def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

def printMultiTable(): Unit = {
  for (i <- 1 to 10) {
    print(makeRowSeq(i).mkString)

    println()
  }
}
