import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number between 1 and 100: ");

        int randNum = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int guessNum = Integer.parseInt(sc.nextLine());
        int guessesLeft = 4;

        while(guessNum != randNum && guessesLeft > 0){
            if(guessNum > 100 || guessNum < 1){
                System.out.println("Your guess is not between 1 and 100, please try again");
                guessNum = Integer.parseInt(sc.nextLine());
            }
            else {
                if (guessNum < randNum) {
                    System.out.println("Please pick a higher number");
                }
                if (guessNum > randNum){
                    System.out.println("Please pick a lower number");
                }
                guessNum = Integer.parseInt(sc.nextLine());
                guessesLeft--;
                if(guessesLeft == 0){
                    System.out.println("You lose! The number was " + randNum);
                }
            }
        }
        if (guessNum == randNum){
            System.out.println("You win!");
        }
    }
}