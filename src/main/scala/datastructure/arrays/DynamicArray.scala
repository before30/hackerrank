package datastructure.arrays

import java.util
import java.util.regex.Pattern

/**
  * Created by before30 on 2016. 7. 27..
  */
object DynamicArray {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val q = sc.nextInt()
    sc.nextLine()
    var lastAns:Long = 0L
    val seqList = new Array[java.util.ArrayList[Long]](n)
    for ( i <- 0 until n ) {
      seqList(i) = new util.ArrayList[Long]()
    }

    for ( i <- 0 until q ) {

      val query = sc.nextLine()
      val (command:Int, x:Long, y:Long) = {
        val pattern = Pattern.compile("(\\d) (\\d) (\\d)")
        val m = pattern.matcher(query)

        if (m.find()) (m.group(1).toInt, m.group(2).toLong, m.group(3).toLong)
        else (-1, -1, -1)
      }

      command match {
        case 1 => {
          val idx = (x ^ lastAns) % n
          val temp:java.util.ArrayList[Long] = seqList(idx.toInt)

          temp.add(y)

        }
        case 2 => {
          val idx = (x ^ lastAns) % n

          val temp = seqList(idx.toInt)
          val tempI = y % temp.size()
          lastAns = temp.get(tempI.toInt)
          println(lastAns)

        }
      }

    }

  }
}
