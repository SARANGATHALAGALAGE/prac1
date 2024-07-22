object coverprice {
  def main(args: Array[String]): Unit = {
    var price: Float = 0.0
    var discount: Float = 0.40
    var copies: Int = 0
    var cost: Double = 0

    print("Enter Cover Price: ")
    price = scala.io.StdIn.readFloat()
    price = price * (1 - discount)
    print("Enter number of copies: ")
    copies = scala.io.StdIn.readInt()

    if (copies <= 50 && copies > 0) {
      cost = 3 * copies + (price * copies)
    } else {
      cost = 3 * 50
      cost = cost + (0.75 * (copies - 50)) + (price * copies)
    }
    // cost = cost + (price * copies)
    print("Total wholesale cost = " + cost)
  }
}
