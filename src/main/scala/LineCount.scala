import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

class LineCount(fileName: String) {

  def get(): Long = {
    val sparkContext = SparkContext.getOrCreate(new SparkConf().setAppName("lc").setMaster("local"))
    val textFile: RDD[String] = sparkContext.textFile(fileName)
    textFile.count()
  }

}
