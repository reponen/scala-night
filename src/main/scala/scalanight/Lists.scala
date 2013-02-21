package scalanight

import common._

object Lists {
  def head(inLst: List[Int]): Int = inLst.head

  def tail(inLst: List[Int]): Int = ???
  
  // :: creates a new list
  def odd(inLst: List[Int]): List[Int] = {
    if (inLst == Nil) Nil
    else if (inLst.head % 2 == 1) inLst.head :: odd(inLst.tail)
    else odd(inLst.tail)
  }
  
  def even(inLst: List[Int]): List[Int] = ???

}