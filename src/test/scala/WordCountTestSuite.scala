import org.scalatest.funsuite.AnyFunSuite

class WordCountTestSuite extends AnyFunSuite {

  test("Word count should be 11") {
    assert(11 == new WordCount("WordCount.txt").get())
  }

}
