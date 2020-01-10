object Main {
  def main(args: Array[String]) {
    //val stream = Stream.continually(scala.io.StdIn.readLine).takeWhile(_ != "END").force
    //val vec = stream.map(_.toInt).toVector

    val vec = Stream.continually(scala.io.StdIn.readLine).takeWhile(_ != "END").force.map(_.toInt).toVector

    var result = 0;
    for((x,i) <- vec.zipWithIndex) {
      if(i%2 == 1)
        result = result + x * 2
    }

    println(result)
  }
}