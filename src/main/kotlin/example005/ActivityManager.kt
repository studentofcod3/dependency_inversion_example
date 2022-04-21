package example005

class ActivityManager(snorlax: Boolean = false, val factory: IFactory) : IActivityManager {
    init {
        if (snorlax){
            sleepAllDay()
        }else{
            whatADay()
        }
    }

    override fun whatADay(){
        val day: IDay = factory.createDay()
        val activities: Array<Array<String>> = arrayOf(
            arrayOf("sleeping", "8"),
            arrayOf("cycling", "2"),
            arrayOf("eating", "1"),
            arrayOf("climbing", "3"),
            arrayOf("battling", "5"),
            arrayOf("chilling", "5"),
        )

        for (activity in activities){
            createAndDoActivity(activity[0], activity[1], day)
        }
    }

    override fun sleepAllDay(){
        val day: IDay = factory.createDay()
        createAndDoActivity("sleeping", "24", day)
    }

    override fun createAndDoActivity(name: String, timeSpent: String, day: IDay){
        val activity: IActivity = factory.createActivity(name)
        activity.doActivity(timeSpent.toInt(), day)
    }
}