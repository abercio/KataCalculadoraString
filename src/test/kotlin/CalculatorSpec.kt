import io.kotlintest.matchers.numerics.shouldBeLessThanOrEqual
import io.kotlintest.matchers.numerics.shouldNotBeBetween
import io.kotlintest.runner.jvm.instantiateSpec
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

class CalculatorSpec : WordSpec(){
    init {

        "si la entrada es vacia" should {
             "deberia regresar 0"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.Suma()
                 //prueba
                 resultado.shouldBe(0)
             }
         }

        "Si la entrada es un solo numero" should {
             "deberia regresar el mismo numero  1"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.Suma("1")
                 //prueba
                 resultado.shouldBe(1)
             }
         }

        "Si la entrada son dos numeros separados por coma" should {
             "deberia la suma de los dos numeros"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.Suma("1,2")
                 //prueba
                 resultado.shouldBe(3)
             }
         }

        "si la entrada son dos numeros desconocidos separados por coma" should {
             "el rsultado deberia ser la suma de los dos"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.SumaDesconocidos(10,40)
                 //prueba
                 resultado.shouldBe(50)
             }
         }

        "la entrada son numeros multiples que usan coma" should {
             "deberia regresar la suma de dichos numeros"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.Suma(s = "1,2,3,4")
                 //prueba
                 resultado.shouldBe(10)
             }
         }
        
        "si la entrada de ususario son varios numeros separados por un delimitador" should {
             "deberia regresar la suma de los numeros"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.SumaNumeros("1//2")
                 //prueba 
                 resultado.shouldBe(3)
             }
         }

        "si la entrada son multiples numeros por un multicaracter personalizado" should {
             "deberia regresar la suma de los numeros"{
                 var sistemaBajoPrueba = Calculadora()
                 var resultado = sistemaBajoPrueba.Multicaracter("5//**1")
                 //prueba
                 resultado.shouldBe(6)
             }
         }
    }

}




//    7. Si la entrada del usuario contiene un numero negativo debe retornar una excepcion con el mensaje "negativos no permitidos: x" donde x es el negativo
//    8. Si la entrada del usuario contiene multiples negativos debe regresar una excepcion con el mensaje "negativos no permitidos: -x, -y, -z  donde x,y,z son negativos
//    9. Si la entrada del usuario contiene numeros mayores a 1000 debe regresar la suma de los numeros menores a 1001
//    11. Si la entrada del usaurio son multiples delimitadores personalizados debe retornar la suma de los numeros (ejemplo “//[*][%]\n1*2%3” debe retornar 6)