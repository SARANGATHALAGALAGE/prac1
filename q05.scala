object run extends App {
  def easy(d: Int): Float = {
    return (8 * d)
  }
  def tempo(e: Int): Float = {
    return (7 * e)
  }
  var ans: Float = easy(2) + tempo(3) + easy(2)
  print(ans)
}
