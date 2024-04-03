package project;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Welcome to QUIZ");
        System.out.println("Choose your subject: ");
        System.out.println("History(1), Geography(2), Math(3), Java Lang(4)");

        int subject = input.nextInt();


        switch (subject){
            case 1:
                System.out.println("You choose History! Good Luck!");
                history.KZHistory();
                break;
            case 2:
                System.out.println("You choose Geography! Good Luck!");
                geo.Geography();
                break;
            case 3:
                System.out.println("You choose Math! Good Luck!");
                math.Math();
                break;
            case 4:
                System.out.println("You choose Java Lang! Good Luck!");
                java_lang.JVProgramming();
                break;
        }








    }
}