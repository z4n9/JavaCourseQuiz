package project;
import java.util.Scanner;

public class java_lang {
    public static void JVProgramming(){
        Scanner input = new Scanner(System.in);

        // то куда ты ответы записываешь
        String answTest = "";
        int points = 0;

        // массив с вопросами по тесту
        String[] questJ = new String[]{
                "Что выведет следующий код?   int x = 5; System.out.println(x++);",
                "Что делает ключевое слово static в Java?",
                "Какой тип данных используется для хранения дробных чисел в Java?",
                "Какая конструкция используется для обработки исключений в Java?",
                "Что делает оператор break в цикле в Java?"
        };
        // правильные ответы по тесту
        String[] RightAnswJ = new String[]{
                "5",
                "Defines static methods and variables",
                "double",
                "try-catch",
                "Stops executing the loop"
        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questJ.length; i++) {
            System.out.println(questJ[i]);
            answTest = input.next();

            if(answTest.equals(RightAnswJ[i])){
                points += 1;
            }
        }

        System.out.println(points);
    }
}
