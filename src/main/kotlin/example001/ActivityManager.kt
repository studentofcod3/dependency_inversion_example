package example001

class ActivityManager(snorlax: Boolean = false) {
    init {
        if (snorlax){
            sleepAllDay()
        }else{
            whatADay()
        }
    }

    private fun whatADay(){
        val day = Day()

        val activitySleep = Activity(name="sleeping")
        activitySleep.doActivity(8, day)

        val activityCycle = Activity(name="cycling")
        activityCycle.doActivity(2, day)

        val activityEating = Activity(name="eating")
        activityEating.doActivity(1, day)

        val activityClimbing = Activity(name="climbing")
        activityClimbing.doActivity(3, day)

        val activityBattling = Activity(name="battling")
        activityBattling.doActivity(5, day)

        val activityChilling = Activity(name="chilling")
        activityChilling.doActivity(5, day)
    }

    private fun sleepAllDay(){
        val day = Day()
        val activitySleep = Activity(name="sleeping")
        activitySleep.doActivity(24, day)
    }
}