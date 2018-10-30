import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.flink.table.api.TableEnvironment
import org.apache.flink.table.api.scala._
//import org.apache.flink.streaming.api.scala._

import org.apache.flink.table.sources.CsvTableSource

object tableapi {

  def main(args: Array[String]): Unit = {
  print("start table api")
     case class struct (   unique_transaction_id:String ,description_unmasked :String  )

    import org.apache.flink.api.common.typeinfo.TypeInformation
    import org.apache.flink.api.common.typeinfo.Types
    //val fieldNames: Array[String] = Array("unique_transaction_id", "description_unmasked")
    //val fieldTypes: Array[TypeInformation[_]] = Array(Types.STRING, Types.STRING)

    //val csvSource: TableSource = new CsvTableSource()

//    val env = ExecutionEnvironment.getExecutionEnvironment
//    val tableEnv = TableEnvironment.getTableEnvironment(env)
//    val data = "D:\\flink\\input_data\\test_3col.txt"
//    val ds = env.readCsvFile[struct](data);
//    //,lineDelimiter = "\n", fieldDelimiter = ":",ignoreFirstLine = false    )
//    System.exit(1)
//    //val rds= tableEnv.registerTable("tab",ds.toTable(tableEnv))
//    val rds= tableEnv.registerTable("tab",ds.toTable(tableEnv))
//    val sqlresult =tableEnv.sqlQuery("select * from tab").toDataSet[struct1]
//    sqlresult.print()
//    sqlresult.writeAsCsv("D:\\flink\\output_data\\test_3col_op.txt")
//    env.execute()
//    print ("over")
  }

}
