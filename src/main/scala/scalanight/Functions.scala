package scalanight

import common._

object Functions {

  /**
   * EXERCISE 1.
   * write a function hello that returns a string "Hello!"
   */
  def hello(): String = ???

  /**
   * EXERCISE 2.
   * write a function helloName that returns a string "Hello <name>"
   */
  def helloName(name: String): String = ???

  /**
   * EXERCISE 3.
   * write  functions square that returns the square of the given parameter
   */
  def square(x: Double): Double = ???

  /**
   * EXERCISE 4.
   * write function abs that takes a double and returns its absolute value
   */
  def abs(x: Double): Double = ???

  /**
   * EXERCISE 5.
   *  Write a function to sum all integers between two given numbers a and b
   */
  def sumInts(a: Int, b: Int): Int = ???

  /**
   * EXERCISE 6.
   * Write a function to sum the squares (x * x)
   * of all integers between two given numbers a and b
   * e.g. sum of squares from 2 to 4 =  2*2 + 3*3 + 4*4 =
   *
   */
  def sumSquares(a: Int, b: Int): Int = ???

  /**
   * EXERCISE 7.
   * Rewrite functions sumInts and sumSquares in terms of the given
   * abstract sum function that takes a function and the range
   *
   * hint: scala anonymous functions!
   */
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumIntsHi(a: Int, b: Int): Int = ???
  def sumSquaresHi(a: Int, b: Int): Int = ???
  // ----

  /**
   * EXERCISE 8. Square Roots by Newton�s Method
   *
   * write a function
   *    def sqrt(x: Double): Double = ...
   *
   * which computes the square root of x.
   * A common way to compute square roots is by Newton�s method of successive approximations.
   * One starts with an initial guess y (say: y = 1). One then repeatedly
   * improves the current guess y by taking the average of y and x/y.
   *
   * As an example, the next three columns indicate the guess y, the quotient x/y, and their average for the
   * first approximations of the sqrt(2):
   *    1 		2/1 = 2 			1.5
   *    1.5 	2/1.5 = 1.3333 		1.4167
   *    1.4167 	2/1.4167 = 1.4118 	1.4142
   *    1.4142 	... ...
   *    y 		x/y 				(y + x/y)/2
   *
   * One can implement this algorithm in Scala by a set of small functions, which each
   * represent one of the elements of the algorithm.
   *
   * Your task is to implement the three helper functions.
   * hint: you may find previously defined functions square and abs
   *       helpful
   *       
   * hint: the precision needed is 0.001
   */
  def newtonSqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double = ???
    def improve(guess: Double, x: Double) = ???
    def isGoodEnough(guess: Double, x: Double) = ???

    sqrtIter(1.0, 2)
  }

  /**
   * **********************************************
   * Below problems are much more difficult  than the previous ones
   */

  /**
   * EXERCISE 9: Pascal�s Triangle
   *
   * The following pattern of numbers is called Pascal�s triangle:
   * 	 1
   *    1 1
   *   1 2 1
   *  1 3 3 1
   * 1 4 6 4 1
   *    ...
   *
   * Implement the pascal function which takes a column c and a row r,
   * counting from 0 and returns the number at that spot in the triangle.
   * For example, pascal(0,2)=1, pascal(1,2)=2 and pascal(1,3)=3.
   *
   * See: http://en.wikipedia.org/wiki/Pascal's_triangle
   *
   */
  def pascal(c: Int, r: Int): Int = ???

  /**
   *  EXERCISE 10: Parentheses Balancing
   *
   *  Write a recursive function which verifies the balancing of parentheses in a string,
   *  which we represent as a List[Char] not a String. For example, the function should
   *  return true for the following strings:
   *
   * 	(if (zero? x) max (/ 1 x))
   *    I told him (that it�s not (yet) done). (But he wasn�t listening)
   *
   * The function should return false for the following strings:
   *    :-)
   *    ())(
   *
   * The last example shows that it�s not enough to verify that a string contains the
   * same number of opening and closing parentheses.
   *
   * There are three methods on List[Char] that are useful for this exercise:
   *
   * chars.isEmpty: Boolean returns whether a list is empty
   * chars.head: Char returns the first element of the list
   * chars.tail: List[Char] returns the list without the first element
   *
   * Hint: you can define an inner function if you need to pass extra parameters to your function.
   *
   * Testing: You can use the toList method to convert from a String to a List[Char]: e.g. "(just an) example".toList.
   */
  def balance(chars: List[Char]): Boolean = ???

}