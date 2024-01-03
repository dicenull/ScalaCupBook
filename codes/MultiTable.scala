def printMultiTable(): Unit = {

  for (i <- 1 to 10) {
    for (j <- 1 to 10) {

      val prod = (i * j).toString

      var k = prod.length

      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
    }

    println()
  }
}
