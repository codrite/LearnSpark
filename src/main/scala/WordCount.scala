import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

class WordCount(fileName: String) {

  def get(): Long = {
    val sparkContext = SparkContext.getOrCreate(new SparkConf().setAppName("wc").setMaster("local"))
    val textFile: RDD[String] = sparkContext.textFile(fileName)
    textFile.map(line => line.split(" ").length).reduce((left, right) => left + right)
  }

}
