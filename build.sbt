//name := "test_1"
//
//version := "0.1"
//
//scalaVersion := "2.12.6"
//
//libraryDependencies ++= {
//  val suffix = if (scalaVersion.value.startsWith("2.11")) "_2.11" else ""
//  Seq(
//    "org.apache.flink" % s"flink-scala$suffix"           % flinkV % "optional",
//    "org.apache.flink" % s"flink-streaming-scala$suffix" % flinkV % "optional"
//  )
//}