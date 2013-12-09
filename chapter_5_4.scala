
class Time(val hours: Int, val min: Int) {
  if (min > 60) {
    private val privateMin = min % 60
    if (hours > 24) private val privateHours = hours % 24 + (min / 60)
    else private val privateHours = hours + (min / 60)
  }
  else {
    private val privateMin = min
    if (hours > 24) private val privateHours = hours % 24 + min
    else private val privateHours = hours + min
  }
  val minutesSinceMidnight = privateHours * 60 + privateMin
  def before(other: Time): Boolean = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }
}

val test = Time()