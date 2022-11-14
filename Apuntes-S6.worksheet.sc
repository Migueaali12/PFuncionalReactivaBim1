// Calcular Desviacion Estandar

val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490,5, 1956.1)

def promedio(valores : List[Double]) : Double = valores.sum / valores.size

def desviacion(valores : List[Double]) : Double = {
    val avg = promedio(valores)
    def varianza(valores : List[Double]) : Double = {
        valores.map(x => Math.pow(x - avg, 2)).sum * (1.0 / (valores.size - 1))
    }
    Math.sqrt(varianza(valores))
}

//Contar

def clasifica(valores : List[Double]) : Unit = {
    val s = desviacion(valores)
    val avg = promedio(valores)

    (1 to 3).foreach( i =>
        println(valores.filter(x =>
            x <= (avg - i * s) && x <= (avg + i * s)).size))
}

//Tuplas

//Es un contenedor de datos en donde cada elemento puede tener un tipo de dato dsitinto

val par = (1, "Abad Ana")

par._1
par._2

val datos = ("jorgaf", 'M', 45, 95.2, true)

val student : Tuple2[Int, String]

val datos1 : Tuple5[String, Char, Int, Double, Boolean]

val student1 = (1, "Abad Ana")
val(edad, nombre) = student1
print(edad)
print(nombre)

student1.canEqual(1, "Abad Ana")

//Cambiar el orden

student1.swap

//Listas

val values = List(42, 31, 36, 40, 43)

val names = ("Miguel", "Antonio", "Pedro")

//dentro de las listas se puede utilizar max, maxby, cout, exist, filter, ForAll, Length, Map, Max, Product, size

//funcion fold left aplica un operador binario a un valor inicial y a todos los elementod de esta secuencia de izquierda a derecha

//Uso del foldLeft

def average(valores : Seq[Double]) : Double = {
    val t = valores.foldLeft(0.0, 0)((acc, curVal) => ((acc._1 + curVal, acc._2 + 1)))
    t._1 / t._2
}

def average1(valores : Seq[Double]) : Double = {
    val t = valores.foldLeft(0.0, 0) { (acc, currVal) =>
        val sum = acc._1 + currVal
        val cont = acc._2 + 1
        print("Suma: %f - contador: %d\n", sum, cont)
        (sum, cont)
    }
    t._1 / t._2
}

