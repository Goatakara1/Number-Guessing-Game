import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int answer = (int) (Math.random()* 100) +1;
        
        int trialnumber = 5;
        
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        
        while (trialnumber > 0) {
            
            System.out.println("Enter your guess : ");
            int guess = scanner.nextInt();
            
            
            
            
            
            if (guess == answer) {
             
                System.out.println("Congratulations. You found the right number :)");
                break;  
            }
            else if (answer > guess){
                
                System.out.println("Your guess is too low.\nYou have " + (trialnumber - 1) + " tries left.");
                trialnumber--;
                
            }
            else if (answer < guess){
                
                System.out.println("Your guess is too high.\nYou have " + (trialnumber - 1) + " tries left.");
                trialnumber--;
                
            }
            
            if (trialnumber == 0) {
                
                System.out.println("You ran out of tries.\nYou lose!");
                
            }
            
        }
        
    }
}
