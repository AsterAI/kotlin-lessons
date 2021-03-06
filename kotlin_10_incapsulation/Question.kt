

/**
 *  Видео урока по инкапсуляции в Kotlin : https://youtu.be/YiTokhGj9YM
 * 
 *  Русскоязычная документацию: https://kotlinlang.ru/docs/reference/visibility-modifiers.html
 */


class Question(private val question: String)  {
    private var price: Float = 1.0f // инициализация переменный полей-членов класса

    constructor(question: String, price: Float) : this(question) {
        this.price = price
    }

    fun getQuestion(): String {
        return question
    }

    fun getPrice(): Float {
        return price
    }
}