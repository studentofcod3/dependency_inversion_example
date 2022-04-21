package example005

interface IFactory {
    fun createDay(): IDay
    fun createActivity(name: String): IActivity
    fun createActivityManager(snorlax: Boolean): IActivityManager
}