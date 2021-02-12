package graph

import org.apache.spark.sql.types._
import io.prophecy.libs._
import io.prophecy.libs.UDFUtils._
import io.prophecy.libs.Component._
import io.prophecy.libs.DataHelpers._
import io.prophecy.libs.SparkFunctions._
import io.prophecy.libs.FixedFileFormatImplicits._
import org.apache.spark.sql.ProphecyDataFrame._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import config.ConfigStore._
import graph._

@Visual(id = "SQLStatement0", label = "SQLStatement0", x = 290, y = 50, phase = 0)
object SQLStatement0 {

  def apply(spark: SparkSession): SQLStatement = {
    import spark.implicits._

    val out = spark.sql("select * from in0")

    out

  }

}
