import org.apache.hadoop.mapred.InvalidInputException
import org.scalatest.funsuite.AnyFunSuite

class FileNotFoundTest extends AnyFunSuite {

  test("Throw InvalidInputException when file not found") {
    assertThrows[InvalidInputException] {
      new LineCount("UnknownFile.txt").get()
    }
  }

}
