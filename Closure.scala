object Closure extends App {

    // Variables referenced by closures
    var counter = 0

    def countUpClosure(): Int = {
        counter += 1
        counter
    }

    def countDownClosure(): Int = {
        counter -= 1
        counter
    }

    // The output of countUpClosure method changes
    for (i <- 1 to 10) print(countUpClosure().toString + ", ") // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
    println()

    // The output of countDownClosure method changes
    for (i <- 1 to 10) print(countDownClosure().toString + ", ") // 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 
    println()

}


// =====================================
//         Output Sample
// =====================================
// $ scalac Closure.scala 
// $ scala Closure
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
// 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 