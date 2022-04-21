package example005

class Activity(private val name: String) : IActivity {
    override fun doActivity(hoursSpent: Int, day: IDay){
        println("You engaged in $name")
        day.spendTime(hoursSpent)
    }
}