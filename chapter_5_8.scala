
class Car(val manufacturer: String, val modelName: String) {
  var modelYear = -1
  var licensePlate = ""
  def this(manufacturer: String, modelName: String, modelYear: Int, licensePlate: String) {
    this(manufacturer, modelName)
    this.modelYear = modelYear
    this.licensePlate = licensePlate
  }
  def this(manufacturer: String, modelName: String, modelYear: Int) {
    this(manufacturer, modelName)
    this.modelYear = modelYear
    this.licensePlate = licensePlate
  }
  def this(manufacturer: String, modelName: String, licensePlate: String) {
    this(manufacturer, modelName)
    this.modelYear = modelYear
    this.licensePlate = licensePlate
  }
}

val auto = new Car("Hersteller", "Name", 2013, "TueV")

println(auto.manufacturer)
