package tethys.writers

import org.scalatest.FlatSpec
import org.scalatest.Matchers.{value => _, _}
import tethys.{JsonObjectWriter, JsonWriter}
import tethys.commons.TokenNode._
import tethys.writers.SimpleJsonObjectWriterTest.TestData
import tethys.writers.instances.SimpleJsonObjectWriter
import tethys.writers.tokens.SimpleTokenWriter._

class SimpleJsonObjectWriterTest extends FlatSpec {
  behavior of "SimpleJsonObjectWriter"

  it should "write correct object to TokenWriter" in {
    implicit val testWriter: SimpleJsonObjectWriter[TestData] = {
      JsonWriter.obj[TestData]
        .addField("a")(_.a)
        .addField("b")(_.b)
        .addField("c")(_.b.isEmpty)
    }

    TestData(1, "test").asTokenList shouldBe obj(
      "a" -> 1,
      "b" -> "test",
      "c" -> false
    )
  }

  it should "write correct object to TokenWriter for concatenated writers" in {
    implicit val testWriter: JsonObjectWriter[TestData] = {
      JsonWriter.obj[TestData].addField("a")(_.a)
        .concat(JsonWriter.obj[TestData].addField("b")(_.b))
        .addField("c")(_.b.isEmpty)
    }

    TestData(1, "test").asTokenList shouldBe obj(
      "a" -> 1,
      "b" -> "test",
      "c" -> false
    )
  }
}

object SimpleJsonObjectWriterTest {

  case class TestData(a: Int, b: String)

}
