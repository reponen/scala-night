package fi.kilosoft.scalanight

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloSuite extends FunSuite {
 
  test("the name is set correctly in constructor") {
    val p = Person("Barney Rubble") 
    assert(p.name == "Barney Rubble")
  }
 
  test("a Person's name can be changed") {
    val p = Person("Chad Johnson") 
    p.name = "Ochocinco"
    assert(p.name == "Ochocinco")
  }
}