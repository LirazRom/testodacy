package writers

sealed trait Writer
case object FileWriter extends Writer
case object MemoryWriter extends Writer
