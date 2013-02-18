package scalanight

import common._

object Functions {

  // write a function hello that returns a string "Hello!"
  def hello(): String = ???
  
   // write a function helloName that returns a string "Hello <name>"
  def helloName(name: String): String = ???
  
  // Write a function to sum all integers between two given numbers a and b:
  def sumInts(a: Int, b: Int): Int = ???
 //    if (a > b) 0 else a + sumInts(a + 1, b)

  // Write a function to sum the squares (x * x) 
  // of all integers between two given numbers a and b
  // e.g. sum of squares from 2 to 4 =  2*2 + 3*3 + 4*4 = 
  def sumSquares(a: Int, b: Int): Int = ???
  

  // Rewrite functions sumInts and sumSquares using the given 
  // sum function that takes a function and the range
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts2(a: Int, b: Int): Int = ???
  def sumSquares2(a: Int, b: Int): Int = ???

}