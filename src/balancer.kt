import java.util.*

val periodicTable = listOf("H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "S", "Cl", "Ar")
val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val element = scanner.nextLine().toUpperCase().trim()
    if (periodicTable.contains(element)) {
        when (element) {
            "Na" -> Cation(true)
            "Cl" -> Cation(false)
            else -> throw IllegalArgumentException("That's not an element!")
        }
    } else {
        println("That's not an element!")
    }
    if (element.isCation) {
        when (element) {
            "Na" -> 1
            "Cl" -> 1
        }
    }
    fun chargeMath() {
        if (element.isCation) {
            Int
        } else {

        }
    }

}

interface chargeStrength {
    val isCation: Boolean
    val charge: Int
}

data class Cation(val isCation: Boolean)

