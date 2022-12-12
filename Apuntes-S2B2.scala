import rx._

/*  Programación Reactiva 
Ejemplos:
-Recibir un correo electrónico
-El valor de un sensor
-la creación de una carpeta

Enfoques:
-Manejo de datos
-Flujo infinito de datos
-Se reacciona cuando llega un grupo de datos
-Reacciones de manera asíncrona
-Patron observer

Functional Reactive Programming:
-comportamiento o señales
Eventos                     |           Comportamientos
-Pueden variar                        -Suelen ser constantes
(haber o no haber)                    -(como el movimiento de un mouse)
*/

object Main extends App {

  /*val a = Var(1)
  val b = Var(2)
  
  val c = Rx{ a() + b() }
  val d = Rx{ c() * 5 }
  val e = Rx{ c() + 4 }
  val f = Rx{ a() + e() + 4 }

  println(f.now)
  a() = 3
  println(f.now)

  

  val a = Var(1)
  var count = 0
  val o = a.trigger {
    count = a.now + 1
  }

  println(cout)
  a() = 4
  println(count)

  */

  val a = Var(1)
  val b = Rx{ 2 * a() }
  var target = 0
  val a = b.trigger {
    target = b.now
  }

  println(target)
  a() = 2
  println(target)
  a.kill()
  a() = 3
  println(target)

}


