
class Time(val hours: Int, val min: Int) {
  def before(other: Time): Boolean = {
    hours < other.hours && min < other.min
  }
}

val time = new Time(12, 46)