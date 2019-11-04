import model.Population

fun main(args: Array<String>) {

    val population : List<Population> = emptyList()

    population.toMutableList().add(Population("2000", 2800000))
    val rate = 48630.0
    val k = 2.0
    var grandPop = 2681734
    for (index in (1..10)) {
        grandPop -= (rate + (grandPop * (k/100.0))).toInt()
        println("(year -> population): ${2019 + index} -> $grandPop")
    }

}
