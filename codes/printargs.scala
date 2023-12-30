@main def entryPoint(args: String*) = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }

  printArgs(args.toArray)

  println(formatArgs(args.toArray))
}

def printArgs(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

def formatArgs(args: Array[String]) = args.mkString("\n")
