package scalanight

import common._

object Lists {
  def head(inLst: List[Int]): Int = inLst.head

  def tail(inLst: List[Int]): Int = ???

  /**
   * This method filters even numbers, and returns a list containing only odd numbers
   */
  def odd(inLst: List[Int]): List[Int] = {
    if (inLst == Nil) Nil
    else if (inLst.head % 2 == 1) inLst.head :: odd(inLst.tail)
    else odd(inLst.tail)
  }

  /**
   * Write a method that filters odd numbers, and returns a list containing only even numbers
   */
  def even(inLst: List[Int]): List[Int] = ???

  /**
   * Write a method getNth that returns the nth item of list
   * 
   * use only tail, head and isEmpty or pattern matching + recursion 
   */
  def getNth[T](n: Int, list: List[T]): T = ???
  

  /**
   * Write a method that recursively calculates length of a list
   */
  def length[T](list: List[T]): Int = ???
  
  /**
   * Write a method that recursively reverses a list
   * 
   * Example:
   *  Lists.reverse(List(1,2,3)) == List(3,2,1)
   */
  def reverse[T](list: List[T]): List[T] = ???
  
  /**
   *  Find out whether a list is a palindrome.
   *  
   *  Example:
   *   isPalindrome(List(1))             == true
   *   isPalindrome(List(1, 1))          == true 
   *   isPalindrome(List(1, 2, 3, 2, 1)) == true
   *   isPalindrome(List(1, 2, 3, 2))    == false
   */
  def isPalindrome(list: List[Int]): Boolean = ???

  /**
   * This method computes the sum of all elements in the list xs. There are
   * multiple techniques that can be used for implementing this method, and
   * you will learn during the class.
   *
   * For this example assignment you can use the following methods in class
   * `List`:
   *
   *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   *  - `xs.head: Int` returns the head element of the list `xs`. If the list
   *    is empty an exception is thrown
   *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
   *    list `xs` without its `head` element
   *
   *  ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
   *  solution.
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
  def sum(xs: List[Int]): Int = ???

  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * You can use the same methods of the class `List` as mentioned above.
   *
   * ''Hint:'' Again, think of a recursive solution instead of using looping
   * constructs. You might need to define an auxiliary method.
   *
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
  def max(xs: List[Int]): Int = ???

  /**
   * Write a function sequence that takes 3 arguments low, high, and stride, all assumed to be numbers.
   * Further assume stride is positive. sequence produces a list of numbers from low to high (including
   * low and possibly high) separated by stride and in sorted order.
   * 
   * Examples:
   * 
   * 	Call:					Result:
   * 	sequence(3, 11, 2) 	= 	List(3, 5, 7, 9, 11)
   * 	sequence(3, 8, 3)  	=	List(3, 6)
   * 	sequence(3, 2, 1)  	=	List()
   */
  def sequence(low: Int, high: Int, stride: Int): List[Int] = ???

  
}