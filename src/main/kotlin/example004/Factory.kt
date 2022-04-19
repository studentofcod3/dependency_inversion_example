package example004

class Factory {
    companion object {
        fun createDay(): IDay {
            return Day()
        }

        fun createActivity(name: String): IActivity {
            return Activity(name)
        }

        fun createActivityManager(snorlax: Boolean): IActivityManager {
            return ActivityManager(snorlax)
        }
    }
}