package example001

class Activity(private val name: String) {
    fun doActivity(hoursSpent: Int, day: Day){
        println("You engaged in $name")
        day.spendTime(hoursSpent)
    }
}