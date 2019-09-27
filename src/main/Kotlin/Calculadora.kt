class Calculadora  () {

    fun Suma(s: String = ""): Int {
        if (s.isNullOrEmpty())
            return 0



        val split = s.split(",")
        var total = 0
        for (num in split){
            total =  total +num.toInt()

        }
            return total
    }

    fun SumaDesconocidos(firstNumber: Int, secondNumber: Int): Any {
            return  firstNumber+secondNumber
    }

    fun SumaNumeros(v: String): Int {

        val six = v.split("//")
        var igual = 0
        for (numeros in six){
            igual = igual +numeros.toInt()
        }
        return igual
    }

    fun Multicaracter(t: String): Int {

        val te = t.split("//**")
        var rtotal = 0
        for (nums1 in te){
            rtotal = rtotal +nums1.toInt()
        }
        return rtotal
    }


}
