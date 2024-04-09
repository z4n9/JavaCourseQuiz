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

        //варианты ответов
        String[][] answJ ={
                {"a) 5", "b) 6", "c) 4", "d) Ошибка компиляции"},
                {"a) Определяет константы", "b) Определяет статические методы и переменные", "c) Определяет динамические методы и переменные", "d) Определяет конструкторы"},
                {"a) int", "b) float", "c) double", "d) char"},
                {"a) try-catch", "b) if-else", "c) for-loop", "d) switch-case"},
                {"a) Прекращает выполнение цикла", "b) Пропускает текущую итерацию цикла", "c) Выводит сообщение об ошибке", "d) Удаляет последний элемент из коллекции"}
        };

        // правильные ответы по тесту
        String[] RightAnswJ = new String[]{
                "a",
                "b",
                "c",
                "a",
                "a"
        };
        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questJ.length; i++) {
            System.out.println(questJ[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(answJ[i][j]);
            }
            answTest = input.next();

            if(answTest.equals(RightAnswJ[i])){
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
