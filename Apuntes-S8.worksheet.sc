//Efectos Colaterales

/*int cont = 0;
void addOne() {
    cont = cont + 1
}
*/

def division(n1 : Double, n2 : Double) = {
    if(n2 == 0) throw new RuntimeException("División por 0")
    else n1 / n2
}

//Try para que siempre devuelva el mismo tipo de datos (Try)

import scala.util.Try

def pureDivision(n1 : Double, n2 : Double) : Try[Double] = {
    Try{ division(n1, n2) }
}

pureDivision(1,0)

val result = pureDivision(1, 3)

//Para hacer el manejo de excepciones es importante hacer el import del Try,Success,Failure

import scala.util.{Success, Failure}

result match {
    case Success(v) => println(v)
    case Failure(e) => println(e.getMessage())  
}

//No todo son excepciones como por ejemplo cuando un dato no existe

def toInt(s : String) : Option[Int] = {
    try {
        Some(Integer.parseInt(s))
    } catch {
        case e : Exception => None
    }
}
toInt("1")
toInt("Uno")

val txNumbers = List("1", "2", "foo", "3", "bar")
txNumbers.map(toInt)
txNumbers.map(toInt).flatten

val x = toInt("1").getOrElse(0)
toInt("1").foreach { i => printf("Obtner un Int: %d", i) }
toInt("1") match {
    case Some(i) => println(i)
    case None => println("That didn't work.")
}

// Either, Left, Rigth como el None pero describe el error

def divideXByY(x : Int, y : Int) : Either[String, Int] = {
    if(y == 0) Left("No se puede dividir por 0")
    else Right( x / y )
}

val x1 = divideXByY(1, 0).right.getOrElse(0)
val x2 = divideXByY(1, 0).right.getOrElse(0)

divideXByY(1, 0) match {
    case Left(s) => println("Answer: " + s)
    case Right(i) => println("Answer: " + i)
}

//Conclusión mejor usar: Try, Success, Failure





