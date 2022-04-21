package example005

class ExamplePrompt(val factory: IFactory) {
    private val text: String = "This is example 003, shall we start the day? [y/n]"

    init {
        prompt()
    }

    private fun prompt(){
        println(text)

        when (readln()) {
            "y" -> proceedWithDay(snorlax = false)
            "n" -> proceedWithDay(snorlax = true)
            else -> println("Sorry, currently supported answers are either 'y' or 'n'").also {
                prompt()
            }
        }
    }

    private fun proceedWithDay(snorlax: Boolean): IActivityManager {
        return factory.createActivityManager(snorlax)
    }
}