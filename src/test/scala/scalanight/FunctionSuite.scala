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

  test("test abs") {
    assert(abs(3.456) === 3.456)
    assert(abs(-5.233) === 5.233)
  }

  test("test square of 5 equals 25") {
    assert(square(5) === 25)
  }

  test("sumInts of 1,2,3,4,5 equals 15") {
    assert(sumInts(2, 5) === 15)
  }

  test("sumSquares of 2,3,4 equals 29") {
    assert(sumSquares(2, 4) === 29)
  }
  
  test("sumIntsHi of 1,2,3,4,5 equals 15") {
    assert(sumIntsHi(2, 5) === 15)
  }

  test("sumSquaresHi of 1,2,3,4,5 equals 55") {
    assert(sumSquaresHi(1, 5) === 55)
  }
  
  test("test newtons square") {
    assert(newtonSqrt(2) - 1.414 < 0.001 )
  }

}