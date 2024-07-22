object Sample {
  def main(args: Array[String]): Unit = {
    var radius: Double = 0.0
    var area: Double = 0.0

    print("Enter radius: ")
    radius = scala.io.StdIn.readDouble()
    area = 3.14f * radius * radius
    println("Area of circle: " + area)
  }
}
