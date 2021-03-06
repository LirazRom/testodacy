package writers

sealed trait Writer {
  def write(msg: String)
}

case object FileWriter extends Writer {
  override def write(msg: String): Unit = println(msg)
}
case object MemoryWriter extends Writer {
  val buffer: String = ""
  override def write(msg: String): Unit  = println(msg)
}
