abstract class Element {
  def contents: Array[String]
  def width: Int = if (height == 0) 0 else contents(0).length
  def height: Int = contents.length

  def above(that: Element): Element = {
    new ArrayElement(this.contents ++ that.contents)
  }

  def beside(that: Element): Element = {
    new ArrayElement(
      for {
        (line1, line2) <- this.contents zip that.contents
      } yield line1 + line2
    )
  }

  override def toString(): String = contents mkString "\n"
}

class ArrayElement(val contents: Array[String]) extends Element

// LineElement is-a Element
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
    ch: Char,
    override val width: Int,
    override val height: Int
) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}
