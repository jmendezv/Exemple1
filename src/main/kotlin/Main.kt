fun maxim(a: Int, b: Int): Int {
    if (a > b) return a
    return b
}

// 
fun maxim(a: Int, b: Int, c: Int) = maxim(maxim(a, b), c)


// pes és en Kgs. i altura en metres
fun imc(pes: Double, altura: Double): Double = pes / (altura * altura)

// funció que retorni la suma dels senars
fun sumSenars(a: Int, b: Int, c: Int): Int {
    var suma: Int = 0

    if (a % 2 == 1) suma += a

    if (b % 2 == 1) suma += b

    if (c % 2 == 1) suma += c

    return suma
}


fun main() {
    println(maxim(1, 2, 3))
    println(imc(90.0, 1.81))
}
