package scalanight

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Functions._

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  
  test("col=0,row=2") {
    assert(pascal(0, 2) === 1)
  }

  test("col=1,row=2") {
    assert(pascal(1, 2) === 2)
  }

  test("col=1,row=3") {
    assert(pascal(1, 3) === 3)
  }

  test("col=3,row=5") {
    assert(pascal(3, 5) === 10)
  }

  test("col=5,row=5") {
    assert(pascal(5, 5) === 1)
  }

  test("out of bounds col=7,row=5 is zero") {
    assert(pascal(7, 5) === 0)
  }

}
