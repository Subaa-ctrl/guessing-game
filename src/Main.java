import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Wonderland!");
        System.out.println("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello " + name + "!");
        System.out.println("Shall we begin the game?");
        System.out.println("\t 1.yes");
        System.out.println("\t 2.no");
        int beginAns = sc.nextInt();
        while (beginAns != 1){
            System.out.println("Shall we begin the game?");
            System.out.println("\t 1.yes");
            System.out.println("\t 2.no");
            beginAns = sc.nextInt();
        }
        int timesTried = 0;
           Random random = new Random();
           int x = random.nextInt(20)+1;
           boolean hasWon = false;
           boolean shouldFinish = false;
        System.out.println("Guess a number");
        int userInput =sc.nextInt();
        while (!shouldFinish) {
            timesTried++;
            if (timesTried < 5) {
                if (userInput == x) {
                    shouldFinish = true;
                    hasWon = true;
                } else if (userInput < x) {
                    System.out.println("guess higher");
                    userInput = sc.nextInt();
                } else {
                    System.out.println("guess lower");
                    userInput = sc.nextInt();
                }
            }else {
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("CONGRATULATIONS! YOU WON BY " + timesTried + "GUESSES");
        }else {
            System.out.println("game over...");
        }




    }

}
