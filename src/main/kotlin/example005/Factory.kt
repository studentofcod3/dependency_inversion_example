package example005

class Factory : IFactory {
    override fun createDay(): IDay {
        return Day()
    }

    override fun createActivity(name: String): IActivity {
        return Activity(name)
    }

    override fun createActivityManager(snorlax: Boolean): IActivityManager {
        return ActivityManager(snorlax, this)
    }
}