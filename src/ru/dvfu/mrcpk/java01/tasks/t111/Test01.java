package ru.dvfu.mrcpk.java01.tasks.t111;

public class Test01 {
    public static void main(String[] args) {
        QuestionAnswers qa01 = new QuestionAnswers();
        qa01.questions = "Вопрос 1";
        qa01.answers = new String[4];
        qa01.answers[0]="Ответ 1";
        qa01.answers[1]="Ответ 2";
        qa01.answers[2]="Ответ 3";
        qa01.answers[3]="Ответ 4";
        qa01.correct = 1;
    }
}
