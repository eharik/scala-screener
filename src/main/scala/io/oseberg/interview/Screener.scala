package io.oseberg.interview

import java.io.File
import scala.annotation.tailrec
import scala.io._

object Screener extends App {
  val src = Source.fromFile("./src/main/resources/DoI.txt")
  // TODO - Print stuff to stdout


}

class FileStats(source: BufferedSource) {
  type Word = String

  def lineCount: Int = ???
  def totalWordCount: Int = ???
  def wordCount(word: Word): Int = ???

  // bonus - recursive function to determine all word frequency
  //@tailrec
  def wordFreq(
      buffer: BufferedSource,
      freq: Map[String, Int]): Map[String, Int] = ???
}
