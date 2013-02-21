package scalanight

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite {
 
  test("head() returns the first element of a list") {
    val list = List(1,2,3,4,5)
    assert(Lists.head(list) === 1)
  }
  
  test("tail() returns the first element of a list") {
    val list = List(1,2,3,4,5)
    assert(Lists.tail(list) === 5)
  }

  test("odd() returns only odd numbers") {
    val lst=List(1,7,2,8,5,6,3,9,14,12,4,10)
    assert(Lists.odd(lst) === List(1,7,5,3,9))
  }

  test("even () returns only even numbers") {
    val lst=List(1,7,2,8,5,6,3,9,14,12,4,10)
    assert(Lists.even(lst) === List(2,8,6,14,12,4,10))
  }
}