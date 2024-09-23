fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 2, 3, 4, 5)
    if (array1.size != array2.size) {
        println("os arrays não são iguais.")
        return
    }
    var saoIguais = true
    for (i in array1.indices) {
        if (array1[i] != array2[i]) {
            saoIguais = false
            break
        }
    }
    if (saoIguais) {
        println("os arrays são iguais.")
    } else {
        println("os arrays não são iguais.")
    }
}