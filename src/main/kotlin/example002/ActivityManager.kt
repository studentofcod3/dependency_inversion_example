package example002

class ActivityManager(snorlax: Boolean = false) : IActivityManager {
    init {
        if (snorlax){
            sleepAllDay()
        }else{
            whatADay()
        }
    }

    override fun whatADay(){
        val day: IDay = Day()

        val activitySleep: IActivity = Activity(name="sleeping")
        activitySleep.doActivity(8, day)

        val activityCycle: IActivity = Activity(name="cycling")
        activityCycle.doActivity(2, day)

        val activityEating: IActivity = Activity(name="eating")
        activityEating.doActivity(1, day)

        val activityClimbing: IActivity = Activity(name="climbing")
        activityClimbing.doActivity(3, day)

        val activityBattling: IActivity = Activity(name="battling")
        activityBattling.doActivity(5, day)

        val activityChilling: IActivity = Activity(name="chilling")
        activityChilling.doActivity(5, day)
    }

    override fun sleepAllDay(){
        val day: IDay = Day()
        val activitySleep: IActivity = Activity(name="sleeping")
        activitySleep.doActivity(24, day)
    }
}