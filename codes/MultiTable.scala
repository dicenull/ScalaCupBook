def printMultiTable(): Unit = {

  for (i <- 1 to 10) {
    for (j <- 1 to 10) {

      val prod = (i * j).toString

      val padding = " " * (4 - prod.length)
      print(padding + prod)
    }

    println()
  }
}
