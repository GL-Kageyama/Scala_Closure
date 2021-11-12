# Scala Closure

## Closure
A function that holds its state internally is called a closure.  
The state to be held is the state after function declaration and function execution.  

## Sample
```Scala
    var counter = 0

    def countUpClosure(): Int = {
        counter += 1
        counter
    }
    
    // The output of countUpClosure method changes
    for (i <- 1 to 10) print(countUpClosure().toString + ", ") // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
```
