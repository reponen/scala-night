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
  
  test("tail() returns the list excluding the first element (head) of a list") {
    val list = List(1,2,3,4,5)
    assert(Lists.tail(list) === List(2,3,4,5))
  }

  test("odd() returns only odd numbers") {
    val lst=List(1,7,2,8,5,6,3,9,14,12,4,10)
    assert(Lists.odd(lst) === List(1,7,5,3,9))
  }

  test("even () returns only even numbers") {
    val lst=List(1,7,2,8,5,6,3,9,14,12,4,10)
    assert(Lists.even(lst) === List(2,8,6,14,12,4,10))
  }
  
  test("test getNth") {
	  assert(Lists.getNth(2, List(1,2,3,4,5,6,7,8)) === 3)  
  }
  
  test("sum") {
     assert(Lists.sum(List(1,2,3,5)) === 15)
  }
  
  test("max") {
    assert(Lists.max(List(1,2,3,5,6,7,6,5,4,3,2,1)) === 7)
  }
  
  test("sequence") {
    assert(Lists.sequence(3, 11, 2) ===	List(3, 5, 7, 9, 11))
    assert(Lists.sequence(3, 8, 3)  === List(3,6))
    assert(Lists.sequence(3, 2, 1)  === List())
  }
}