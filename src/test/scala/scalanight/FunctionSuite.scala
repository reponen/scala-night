package scalanight

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Functions._

@RunWith(classOf[JUnitRunner])
class FunctionSuite extends FunSuite {

  test("hello returns Hello") {
    assert(hello() === "Hello")
  }

  test("helloName() ") {
    assert(helloName("Frankie") === "Hello Frankie")
  }

  test("sumInts of 1,2,3,4,5 returns 15") {
    assert(sumInts(2, 5) === 15)
  }
}