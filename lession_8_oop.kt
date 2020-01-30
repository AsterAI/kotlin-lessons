
/**
 *  Видео на YouTube: https://youtu.be/5ehZ36cnFmY
 */
 
 class InterviewTester {
    var questions: Array<String>  =  arrayOf(
            "Знаете ли вы что такое переменная?", // index = 0
            "Знаете ли вы что такое ветвления IF?",  // index = 1
            "Знаете ли вы что такое ветвления WHEN?",  // index = 2
            "Знаете ли вы что такое циклы?",
            "Знаете ли вы что такое массивы?",
            "Как увеличить массив?",
            "Можно ли это сделать без циклов?"
        );


    fun makeInterView() : BooleanArray {
        var answers = BooleanArray(questions.size) {false};

        for (questionIndex in questions.indices) {
            print(questions[questionIndex] + " : ");

            var answer = readLine();

            if (answer == "+") {
                answers[questionIndex] = true
                continue;
            }

            if (answer == "-") {
                continue;
            }

            println("Ошибка! Программа не может обработать эти данные")
            println("Тест провален");
            break;
        } // for

        return answers;
    }

    fun start() {
        var answers = makeInterView();
        var rightAnswers = answers.count { answer -> answer }

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

    }
}


fun main(args: Array<String>) {

    var interviewer = InterviewTester();
    interviewer.start();

    println("Подписуйтесь на канал 'Клевый Айтишник' потому что будет много еще интересного")
}