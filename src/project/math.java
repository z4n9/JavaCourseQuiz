package project;
import java.util.Scanner;

public class math {
    public static void Math(){
        Scanner input = new Scanner(System.in);

        // то куда ты ответы записываешь
        String answTest = "";
        int points = 0;

        // массив с вопросами по тесту
        String[] questM = {
                "Чему равно значение выражения 2 + 2 * 3?",
                "Какое число является простым?",
                "Чему равно квадратный корень из 64?",
                "Какова площадь прямоугольника со сторонами 5 и 7?",
                "Какова сумма углов треугольника?"
        };

        //варианты ответов
        String[][] answM ={
                {"a) 6", "b) 8", "c) 10", "d) 12"},
                {"a) 12", "b) 17", "c) 24", "d) 28"},
                {"a) 4", "b) 6","c) 8", "d) 10"},
                {"a) 10", "b) 12", "c) 20", "d) 35"},
                {"a) 90 градусов", "b) 180 градусов", "c) 270 градусов", "d) 360 градусов"}
        };

        // правильные ответы по тесту
        String[] RightAnswM = {
            "b  ",
            "b",
            "c",
            "d",
            "b"

        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questM.length; i++) {
            System.out.println(questM[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(answM[i][j]);
            }
            answTest = input.next();

            if(answTest.equals(RightAnswM[i])){
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
