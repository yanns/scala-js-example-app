package example

import scala.scalajs.js
import js.Dynamic.{ global => g }
import js.annotation.JSExport
import rx._


@JSExport
object ScalaJSExample {

  val model = Var("world")

  @JSExport
  def main(): Unit = {
    val paragraph = g.document.createElement("p")
    paragraph.innerHTML = s"<strong>Hello ${model()}!</strong>"
    g.document.getElementById("playground").appendChild(paragraph)
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
