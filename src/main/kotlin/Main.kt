import example005.ExamplePrompt
import example005.Factory
import example005.IFactory

fun main(){
    // factory is only used in this file when running example005
    val factory: IFactory = Factory()
    ExamplePrompt(factory)
}
