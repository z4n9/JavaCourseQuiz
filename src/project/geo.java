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
        // правильные ответы по тесту
        String RightAnswG[] = {
                "Russia",
                "Rome",
                "Антарктида",
                "Байкал",
                "Индонезия"
        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questG.length; i++) {
            System.out.println(questG[i]);
            answTest = input.next();

            if(answTest.equals(RightAnswG[i])){
                points += 1;
            }
        }
        System.out.println(points);

    }
}
