package datastructure.arrays

import scala.annotation.tailrec

/**
  * Created by before30 on 2016. 7. 26..
  */
object LeftRotation {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var times = sc.nextInt()
    var arr = new Array[Int](n);

    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    val integers = arr.toList
    println(leftRotateNtimes(integers, times).mkString(" "))
  }

  def leftRotate(integers: List[Int]): List[Int] = {
    (integers.head :: integers.tail.reverse).reverse
  }

  @tailrec
  def leftRotateNtimes(integers: List[Int], n: Int): List[Int] = {
    if (n == 0) integers
    else leftRotateNtimes(leftRotate(integers), n  - 1)
  }

}
