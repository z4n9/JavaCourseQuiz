package project;

import java.util.Arrays;
import java.util.Scanner;

public class history {
    public static void KZHistory(){
        Scanner input = new Scanner(System.in);

        // то куда ты ответы записываешь
        String answTest = "";
        int points = 0;

        // массив с вопросами по тесту
        String questH[] = {
                "Кто был первым президентом США?",
                "В каком году началась Первая мировая война?",
                "Кто был правителем Древнего Рима, известным как первый император?",
                "Какая страна была первой, кто использовал атомное оружие в военных действиях?",
                "В каком году состоялась Великая французская революция?"};

        //варианты ответов
        String[][] answH ={
                {"a) Джордж Вашингтон","b) Авраам Линкольн","c) Томас Джефферсон","d) Джон Адамс"},
                {"a) 1914", "b) 1917", "c) 1918", "d) 1920"},
                {"a) Юлий Цезарь", "b) Август", "c) Нерон", "d) Константин"},
                {"a) СССР", "b) США", "c) Германия", "d) Япония"},
                {"a) 1789", "b) 1804", "c) 1830", "d) 1848"}
        };

        // правильные ответы по тесту
        String[] RightAnswH ={
                "a",
                "a",
                "b",
                "b",
                "a"
        };

        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questH.length; i++) {
            System.out.println(questH[i]);
            System.out.println(Arrays.toString(answH[i]));
            answTest = input.next();

            if(answTest.equals(RightAnswH[i])){
                points += 1;
            }
        }

        switch (points){
            case 1:
                System.out.println("Very bad :(. You got " + points + " points");
            case 2:
                System.out.println("Bad :(. You got " + points + " points");
            case 3:
                System.out.println("Not bad. You got " + points + " points");
            case 4:
                System.out.println("Good! You got " + points + " points");
            case 5:
                System.out.println("Great! :) You got " + points + " points");
        }

    }
}
