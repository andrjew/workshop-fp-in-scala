package workshop.p3.laziness.example

object LazyParam extends App {

  println("START")

  // call by value - eager evaluation of param
  def strictFun(param: String): String = {
    println("strict body")
    param
  }

  // call by name - lazy evaluation of param
  def lazyFun(param: => String): String = {
    println("lazy body")
    param // param initialization
  }

  strictFun {
    println("strict eval")
    "strict value"
  }

  lazyFun {
    println("lazy eval")
    "lazy value"
  }

  println("END")
}
