import java.lang.Math;
import java.util.Scanner;


public class rokc_paper_scissor {
    public static void main(String[] args) {
        int computer = (int) (Math.random() * (3 - 1 + 1) + 1);
        Scanner sca = new Scanner(System.in);
        System.out.println("Please Enter your Choise. 1. Rock, 2. Paper, 3. Scissor.");
        int user = sca.nextInt();

        if (computer == 1) {
            System.out.println("Computer choose ROCK");
        } else if (computer == 2) {
            System.out.println("Computer choose PAPER");
        } else
            System.out.println("Computer choose SCISSOR");

        if (user == computer) {
            System.out.println("Its' a Tie");
        }
        else
        switch (user) {
            case 1:
                if (computer == 2) {
                    System.out.println("Computer Wins");
                } else
                    System.out.println("User wins");
                break;
            case 2:
                if (computer == 3) {
                    System.out.println("Computer Wins");
                } else
                    System.out.println("User wins");
                break;
            case 3:
                if (computer == 1) {
                    System.out.println("Computer Wins");
                } else
                    System.out.println("User wins");
                break;

        }
        sca.close();
    }

}
