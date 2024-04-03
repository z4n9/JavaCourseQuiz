package project;

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

        // правильные ответы по тесту
        String[] RightAnswH ={
                "Джордж Вашингтон",
                "1914",
                "Август",
                "США",
                "1789"
        };

        //цикл задающий вопрос, принимающий ответ и сравнивающий с правильным ответом, добовляет очки
        for (int i = 0; i < questH.length; i++) {
            System.out.println(questH[i]);
            answTest = input.next();

            if(answTest.equals(RightAnswH[i])){
                points += 1;
            }
        }

        System.out.println(points);
    }
}
