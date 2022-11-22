//Promedio 

def promedio(lista : List[(String, Int)]) : Double = {
    val sum = lista.map(_._2).sum / lista.size
    return sum
}

//el mayor goleador

def golM(lista : List[(String, Int)]) = {
    lista.maxBy(_._2)._1
}

//Arriba prom

def mayores(lista : List[(String, Int)])  = {
    val x = lista.filter(_._2 > promedio(lista)).map(_._1)
}

//Conjuntos

val conjunto : Set[Int] = Set(1, 2, 3)
val conNuevo = conjunto + 6

val conjunto1 : Set[Int] = Set(1, 2, 3)
val conNuevo1 = conjunto1.concat(List(2, 3, 4, 5))

//Mapas
//Solamente se pueden almacenar dos elementos clave y valor 

Map(("apples", 3), ("oranges", 2), ("pears", 0))

Map("apples" -> 3, "oranges" -> 4, "pears" -> 0)

//toMap para convertir tuplas a mapas

//ToSeq para convertir a secuencias

val fruitBastket = Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)

fruitBastket.map { case (fruit, count) => (fruit, count * 2)}

fruitBastket.map { case (fruit, count) => (fruit, count, count * 2) }.
map { case (fruit, _, count2) => (fruit, count2 / 2) }.toMap

//Funcion Group By
//Su funcion es reorganizar una secuencia en un mapa 

Seq("wombat", "xanthan", "yogurt", "zebra").
groupBy(s => if (s startsWith "y") 1 else 2)

List(1, 2, 3, 4, 5).groupBy( k => k % 3)

