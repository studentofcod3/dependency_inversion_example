package example004

interface IActivityManager {
    fun whatADay()
    fun sleepAllDay()
    fun createAndDoActivity(name: String, timeSpent: String, day: IDay)
}