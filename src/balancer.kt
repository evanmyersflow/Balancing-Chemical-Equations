import java.util.*

val ionicPeriodicTable = listOf("H", "Li", "Be", "B", "N", "O", "F", "Na", "Mg", "Al", "P", "S", "Cl")
val scanner = Scanner(System.`in`)
val inputElement = scanner.nextLine().toUpperCase().trim()

fun main(args: Array<String>) {

    if (ionicPeriodicTable.contains(inputElement)) {
        val cation: Boolean = when (inputElement) {
            "H" -> true
            "Li" -> true
            "Be" -> true
            "B" -> true
            "N" -> false
            "O" -> false
            "F" -> false
            "Na" -> true
            "Mg" -> true
            "Al" -> true
            "P" -> false
            "S" -> false
            "Cl" -> false

            else -> throw IllegalArgumentException("That's not an Element!")

        }
        if (ionicPeriodicTable.contains((inputElement))) {
            var charge = when (inputElement) {
                "H" -> 1
                "Li" -> 1
                "Be" -> 2
                "B" -> 3
                "N" -> 3
                "O" -> 2
                "F" -> 1
                "Na" -> 1
                "Mg" -> 2
                "Al" -> 3
                "P" -> 3
                "S" -> 2
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
