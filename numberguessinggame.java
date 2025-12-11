import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {
    public static void main(String[] args) {
       Random rc = new Random();
       Scanner sc = new Scanner(System.in);
         int number=rc.nextInt(100);
         int guess=0;
         while(guess!=number){
            System.out.println("guess the number from 1 to 100: ");
            guess=sc.nextInt();
            if(guess<number){
                System.out.println("your guess is lower that actual number");
            }
            else if (guess>number){
                System.out.println("guessed number is higher than actual number");
            }
            else {
                System.out.println("yor guessed number is correct");

            }

            }
            }
        }

