import org.scalatest.funsuite.AnyFunSuite

class LineCountTestSuite extends AnyFunSuite {

  test("Line count should be 4") {
    assert(4 == new LineCount("WordCount.txt").get())
  }

}
