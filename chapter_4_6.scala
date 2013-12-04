import java.util.Calendar._

val months = scala.collection.mutable.LinkedHashMap[String, Int](
"Monday" -> MONDAY,
"Friday" -> FRIDAY,
"Wednesday" -> WEDNESDAY,
"Thursday" -> THURSDAY,
"Saturday" -> SATURDAY,
"Tuesday" -> TUESDAY,
"Sunday" -> SUNDAY
)

println(months)