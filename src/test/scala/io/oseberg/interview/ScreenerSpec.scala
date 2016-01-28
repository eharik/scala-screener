package io.oseberg.interview

import java.io.File
import org.scalatest._
import scala.io._

class ScreenerSpec extends FlatSpec with Matchers {

  behavior of "FileStats"

  val src = Source.fromFile("./src/test/resources/DoI.txt")
  val fileStats = new FileStats(src)

  it must "count the lines in a file" in {
    val expectedLines = 41
    fileStats.lineCount should be (expectedLines)
  }

  it must "count all the words in a file" in {
    val expectedWords = 1335
    fileStats.totalWordCount should be (expectedWords)
  }

  it must "count occurences of a specific word in a file" in (pending)

  it must "calculate the frequency of all words in a file" in (pending)
}
