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
                "Какова сумма углов треугольника?"};
        // правильные ответы по тесту
        String[] RightAnswM = {
            "8",
            "17",
            "8",
            "35",
            "180d"

        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questM.length; i++) {
            System.out.println(questM[i]);
            answTest = input.next();

            if(answTest.equals(RightAnswM[i])){
                points += 1;
            }
        }

        System.out.println(points);
    }
}
