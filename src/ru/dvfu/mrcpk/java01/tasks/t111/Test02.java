package ru.dvfu.mrcpk.java01.tasks.t111;

public class Test02 {
    public static void main(String[] args) {
        Question question01 = new Question();
        question01.text="Вопрос 2";
        Answer[] answers = new Answer[4];

        Answer[] answers1 = new Answer[]{
                new Answer(), new Answer(), new Answer()
        };

        answers[0].text="Ответ 21";
        answers[1].text="Ответ 21";
        answers[2].text="Ответ 21";
        answers[3].text="Ответ 21";
        answers[1].correct=true;
    }
}
