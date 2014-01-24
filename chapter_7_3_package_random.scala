
//package random

class Number {
  val a = 1664525
  val b = 1013904223
  val n = 32
  var previous: Int = 0
  def sedSeed(seed: Int) {
    previous = seed
  }
  def nextInt(): Int = {
    previous = (previous * a + b) % (2^n)
    previous
  }
  def nextDouble(): Double = {
    previous = (previous * a + b) % (2^n)
    previous
  }
}

val randomNumber = new Number
println("Set seed: " + randomNumber.sedSeed(4561))
println("Next Double:" + randomNumber.nextDouble())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Double:" + randomNumber.nextDouble())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Set seed: " + randomNumber.sedSeed(451))
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
println("Next Int:" + randomNumber.nextInt())
