package example003

class Day : IDay {
    override var hoursRemaining: Int = 24

    override fun spendTime(hoursSpent: Int) {
        hoursRemaining -= hoursSpent
        println("There are $hoursRemaining hours remaining in the day!")
    }
}