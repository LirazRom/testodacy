import writers.{MemoryWriter, FileWriter}

object Main {

  def main(args: Array[String]): Unit = {

  }

  def writeTo(toFile: Boolean): Unit = {
    if(toFile)
      FileWriter.write("hello")
    else
      MemoryWriter.write("hello")
  }
}
