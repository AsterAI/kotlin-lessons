
/**
 *  Видео урока по инкапсуляции в Kotlin : https://youtu.be/ynIncw91tds
 */

class Question(private val question: String)  {
    private var price: Float = 1.0f // инициализация переменный полей-членов класса
    private val recommendedBonus = 0.2f

    constructor(question: String, price: Float) : this(question) {
        this.price = price
    }

    fun getQuestion(): String {
        return question
    }

    fun getPrice(): Float {
        return price
    }

    fun getPrice(bonus: Boolean): Float {
        if (bonus) {
            return price + recommendedBonus;
        }

        return price
    }

    fun getPrice(bonus: Float): Float {
        return price + bonus
    }

}