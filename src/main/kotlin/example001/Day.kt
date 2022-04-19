package example001

class Day {
    private var hoursRemaining: Int = 24

    fun spendTime(hoursSpent: Int) {
        hoursRemaining -= hoursSpent
        println("There are $hoursRemaining hours remaining in the day!")
    }
}