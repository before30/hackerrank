package datastructure.arrays

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LeftRotationSuite extends FunSuite {


  test("rotate test") {
    val list: List[Int] = List(1,2,3,4,5)
    val expected: List[Int] = List(2, 3, 4, 5, 1)
    assert(LeftRotation.leftRotate(list) == expected, s"rotate($list) should equal to $expected")
  }

  test("rotate n times") {
    val list: List[Int] = List(1,2,3,4,5)
    val expected: List[Int] = List(5, 1, 2, 3, 4)
    assert(LeftRotation.leftRotateNtimes(list, 4) == expected, s"rotate($list) should equal to $expected")
  }
}
