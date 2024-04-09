package project;
import java.util.Scanner;

public class geo {
    public static void Geography(){
        Scanner input = new Scanner(System.in);

        // то куда ты ответы записываешь
        String answTest = "";
        int points = 0;

        // массив с вопросами по тесту
        String questG[] = { "Какая страна является крупнейшим по территории?",
                "Какой из перечисленных городов является столицей Италии?",
                "Какой материк является самым малонаселённым?",
                "Какое озеро считается самым глубоким в мире?",
                "Какая страна расположена на архипелаге, состоящем из более чем 17 тысяч островов?"
        };

        //варианты ответов
        String[][] answG ={
                {"a) Китай", "b) США", "c) Россия", "d) Канада"},
                {"a) Париж", "b) Мадрид", "c) Рим", "d) Берлин"},
                {"a) Африка", "b) Европа", "c) Австралия", "d) Антарктида"},
                {"a) Байкал", "b) Каспийское море", "c) Виктория", "d) Титикака"},
                {"a) Япония", "b) Филиппины", "c) Индонезия", "d) Новая Зеландия"}
        };

        // правильные ответы по тесту
        String RightAnswG[] = {
                "a",
                "c",
                "d",
                "a",
                "Индонезия"
        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questG.length; i++) {
            System.out.println(questG[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(answG[i][j]);
            }
            answTest = input.next();

            if(answTest.equals(RightAnswG[i])){
                points += 1;
            }
        }
        switch (points){
            case 1:
                System.out.println("Very bad :(. You got " + points + " points");
                break;
            case 2:
                System.out.println("Bad :(. You got " + points + " points");
                break;
            case 3:
                System.out.println("Not bad. You got " + points + " points");
                break;
            case 4:
                System.out.println("Good! You got " + points + " points");
                break;
            case 5:
                System.out.println("Great! :) You got " + points + " points");
                break;
        }

    }
}
