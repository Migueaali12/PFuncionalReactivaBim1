//Valores Inmutables

val cedula = "1105652604"

//No se puede cambiar su valor : cedula = "1105652608"

var cedula1 = "11016626067"

cedula1 = "1106754390"

//Funciones de Orden Superior

(x: Double) => -Math.pow(x,2) + 8 * x - 12

val f1 = (x: Double) => -Math.pow(x,2) + 8 * x - 12

f1(12) * 9 / 8 + 3

((x: Double) => -Math.pow(x,2) + 8 * x - 12)(12) * 9 / 8 + 3

def integracion(a: Int, b: Int, f: Double => Double) = {
    val intermedio = ((a+b) / 2.0)
    val fa = f(a)
    val fi = f(intermedio)
    val fb = f(b)
    (b - a) * (fa + 4 * fi + fb) / 6
}

//Funcion que devuelve una funcion

def select(option: Char) : (Int, Int) => Double = {
    option match {
        case '+' => (a: Int, b: Int) => a + b
        case '-' => (a: Int, b: Int) => a - b
        case '*' => (a: Int, b: Int) => a * b
        case '/' => (a: Int, b: Int) => a / b.toDouble
        case _ => (a: Int, b: Int) => 0 / (a+b)
    }
}

select('+')(2,1)

val operation = select('+')
operation(2,1)

//Obtener datos de secuencias

def isEven(k: Int) : Int = ( k % 2) match {
    case 0 => 1
    case 1 => 0
}

List(1,2, 3)
List(1,2, 3).sum

List(1,2,3).map(x => x * x + 100 * x)


def func1( x : Int ) : Int = x * x + 100 * x
List(1,2,3).map(func1)


List(1,2,3)

val nums = List(1,2,3)
nums.map(x => x + 1)

def add1(a : Int) : Int = a + 1
nums.map(add1)
nums.map(x => add1(x))
nums.map(add1(_))

val sumaDos = (a: Int, b:Int) => a + b
nums.map(x => sumaDos(x, x))

nums map add1

def countEven( s : List[Int]) : Int = s.map(isEven).sum

