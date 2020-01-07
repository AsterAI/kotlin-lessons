
/**
 *  Видео на YouTube: https://www.youtube.com/watch?v=62eQrYI86o0
 */

fun main(args: Array<String>) {

    var questions = arrayOf(
        "Знаете ли вы что такое переменная?", // index = 0
        "Знаете ли вы что такое ветвления IF?",  // index = 1
        "Знаете ли вы что такое ветвления WHEN?",  // index = 2
        "Знаете ли вы что такое циклы?",
        "Знаете ли вы что такое массивы?"
    );


    //  indexses =          0,     1,     2,     3,     4,
    var answers = arrayOf(false, false, false, false, false);

    var rightAnswers = 0;
    for (questionIndex in questions.indices) {
        print(questions[questionIndex] + " : ");

        var answer = readLine();

        if (answer == "+") {
            answers[questionIndex] = true
            rightAnswers++
            continue;
        }

        if (answer == "-") {
            continue;
        }

        println("Ошибка! Программа не может обработать эти данные")
        println("Тест провален");
        break;
    } // for


    if (rightAnswers >= 4) {
        println("Прекрасно! Вы прошли тест, теперь вы можете работать программистом")
    } else {
        println("Вам нужно подтянуть следующие вопросы:")

        for (answerIndex in answers.indices) {
            if (answers[answerIndex] == false) {
                println(questions[answerIndex]);
            }
        }
        println("Выучите ответы на вопросы и приходите следующий раз")
    }

    println("Подписуйтесь на канал 'Клевый Айтишник' потому что будет много еще интересного")
}