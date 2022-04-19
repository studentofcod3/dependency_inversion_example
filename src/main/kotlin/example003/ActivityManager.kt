package example003

class ActivityManager(snorlax: Boolean = false) : IActivityManager {
    init {
        if (snorlax){
            sleepAllDay()
        }else{
            whatADay()
        }
    }

    override fun whatADay(){
        val day: IDay = Factory.createDay()

        val activitySleep: IActivity = Factory.createActivity(name="sleeping")
        activitySleep.doActivity(8, day)

        val activityCycle: IActivity = Factory.createActivity(name="cycling")
        activityCycle.doActivity(2, day)

        val activityEating: IActivity = Factory.createActivity(name="eating")
        activityEating.doActivity(1, day)

        val activityClimbing: IActivity = Factory.createActivity(name="climbing")
        activityClimbing.doActivity(3, day)

        val activityBattling: IActivity = Factory.createActivity(name="battling")
        activityBattling.doActivity(5, day)

        val activityChilling: IActivity = Factory.createActivity(name="chilling")
        activityChilling.doActivity(5, day)
    }

    override fun sleepAllDay(){
        val day: IDay = Factory.createDay()
        val activitySleep: IActivity = Factory.createActivity(name="sleeping")
        activitySleep.doActivity(24, day)
    }
}