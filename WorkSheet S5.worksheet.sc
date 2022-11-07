//Mapeo

def countEven( s : List[Int] ) : Int = {
    def isEven (k : Int) : Int = (k % 2) match {
        case 0 => 1
        case _ => 0
    }
    s.map(isEven).sum
}

def countEven1( s : List[Int] ) : Int = {
    val isEven1 = (k : Int) => k % 2 match {
        case 0 => 1
        case _ => 0
    }
    s.map(isEven1).sum
}

//Cadenas de texto 

val names : List[String] = List( "Leo", "Cristiano", "Enner", "Felipe")
names.map(_.length())

//Lista enteros

val numbers = List(3, 4, 7, 11, 12)
val isPrime = (nro : Int) => (2 to nro -1).forall(nro % _ != 0)
numbers.map(isPrime(_) match {
    case true => 1
    case false => 0
}).sum

//filtrar secuencias

val numbers1 = List (6, 28, 15, 12, 11, 24)

numbers1.max

numbers1.min

numbers1.size

//for all y exist

def isPrime1(nro : Int) : Boolean = (2 until nro).forall(nro %_ != 0)

def isPrime2(nro : Int) : Boolean = !(2 until nro).exists(nro %_ == 0)

//filtrar y truncar secuencias

List(1, 2, 3, 4, 5).filter( k => k % 3 != 0)

//TakeWhile

List(1, 2, 3, 4, 5).takeWhile( k => k % 3 != 0)

//Map/reduce

//Transforma una funcion toma una lista y devuelve otra ejmp: map, filter, etc.

//Agregar toma una lista y devuelve un unico valor ejmp: max, sum, etc

val numbers3 = List(6, 28, 15, 12, 24)

val sumDiv = (nro : Int) => (1 until nro).filter(div => nro % div == 0).sum

numbers.filter(nro => nro == sumDiv(nro)).size

//factorial escalonado

def FactorialEscalonado( n : Int ) : Int = {
    n % 2 match {
        case 0 => (2 to n by 2).product
        case _ => (1 to n by 2).product
    }
} 

val numbers4 = (1 to 20).toList

//Contar Pares

numbers4.filter( nro => nro % 2 == 0).size

//contar Impares

numbers4.filter( nro => nro % 2 != 0).size
numbers4.count( nro => nro % 2 != 0)

//Contar primos

def contarPrimos(nros : List[Int]) : Int = {
    val isPrime3 = (n : Int) => (2 until n).forall(n % _ != 0)
    nros.filter(isPrime3).size
}

contarPrimos(numbers4)

//Presentar 3 factores

def tresFactores(nros : List[Int]) : List[Int] = {
    val factores = (n : Int) => (2 until n).filter(n % _ == 0)

    nros.filter(nro => factores(nro).size == 3)
}

tresFactores((1 to 1000).toList)
