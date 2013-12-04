class Counter {
  private var value = (Int.MaxValue - 2)//0
  def increment() {
    if ( value < Int.MaxValue ) value += 1
    else throw new IllegalStateException("\nvalue greater than maximal value of integers\n")
  }
  def current = value
}

var MyCounter = new Counter

println(MyCounter.current)
MyCounter.increment()
println(MyCounter.current)
MyCounter.increment()
println(MyCounter.current)
MyCounter.increment()
println(MyCounter.current)
