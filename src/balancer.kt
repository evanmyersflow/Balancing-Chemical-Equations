import java.util.*

val periodicTable = listOf("H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "S", "Cl", "Ar")
val scanner = Scanner(System.`in`)
val inputElement = scanner.nextLine().toUpperCase().trim()

fun main(args: Array<String>) {

    if (periodicTable.contains(inputElement)) {
        val cation: Boolean = when (inputElement) {
            "Na" -> true
            "Cl" -> false

            else -> throw IllegalArgumentException("That's not an Element!")

        }
        if (periodicTable.contains((inputElement))) {
            var charge = when (inputElement) {
                "Na" -> 1
                "Cl" -> 1

                else -> throw IllegalArgumentException("That's not an element!")
            }
            if (cation) {
            } else charge *= -1
        }


    } else {
        println("That's not an Element!")
    }
}
