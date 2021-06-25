package SparkPack

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import sys.process._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._


object Spark_Sachin_Obj {
 
  println("----- Raw Data -----")
val list_int = List(1,2,3,4,5,6,7,8) 
list_int.foreach(println)
  
}