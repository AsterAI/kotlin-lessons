
/**
 *  Видео урока по инкапсуляции в Kotlin : https://youtu.be/YiTokhGj9YM
 * 
 *  Русскоязычная документацию: https://kotlinlang.ru/docs/reference/visibility-modifiers.html
 */


class InterviewTester {
    private val minAllowedScore: Float = 5.0f

    private val questions: Array<Question> = arrayOf(
        Question("Знаете ли вы что такое переменная?", 0.4f),
        Question("Знаете ли вы что такое ветвления IF?"),
        Question("Знаете ли вы что такое ветвления WHEN?", 1.5f),
        Question("Знаете ли вы что такое циклы?"),
        Question("Знаете ли вы что такое массивы?"),
        Question("Как увеличить массив?", 1.4f),
        Question("Можно ли это сделать без циклов?", 2.0f)
    );


    private fun makeInterView() : Float {

        var score = 0.0f;

        for (question: Question in questions) {
            print(question.getQuestion() + " : ");

            var answer = readLine();

            if (answer == "+") {
                score += question.getPrice();
                continue;
            }

            if (answer == "-") {
                continue;
            }

            println("Ошибка! Программа не может обработать эти данные")
            println("Тест провален");
            break;
        } // for

        return score;
    }

    fun start() {
        var score: Float = makeInterView();

        println("----------------------------------------------------------------")
        println("Количество набранных балов = ${score}")

        if (score >= minAllowedScore) {
            println("Прекрасно! Вы прошли тест, теперь вы можете работать программистом")
        } else {
            println("Выучите ответы на вопросы и приходите следующий раз")
        }

    }
}

