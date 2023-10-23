// Generate a random number 

//take input Guessing number

// Task 1st of Codsoft
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class GuessNumber {
        public void Repeat(){
        Random r =new Random();
        int num = r.nextInt(100);
        
        Scanner s = new Scanner  (System.in);
        System.out.println("Welcome to Game Zone !!!!!");
        System.out.println("Number Range is 1 to 100 Guess In between them ");
        System.out.println("You Have 8 chances to Guess the number.");
        for (int i=1 ; i<=8; i++) {
            System.out.println("Enter Number :: ");
            int input = s.nextInt();
            if (input > 100){
                System.out.println("Invalid Input");
                System.out.println("Please Enter Valid input");
                break;
            }
                else if (num > input) {
                    System.out.println("Entered Number is small");
                }
                else if(num<input) {
                    System.out.println("Entered number is large");
                } 
                else if(num == input)  {
                    System.out.println("WOW ! You Won !!!!! You Guessed number in"+"  "+i+" "+"Attemp");
                    break;
                }
        }
            
        }
        
        public void Again(){
           System.out.println("Do you want to Continue ? (1/0)");
           Scanner s1 = new Scanner(System.in);
           int c = s1.nextInt();
           
           if (c == 1){
               
                 GuessNumber g = new GuessNumber();
                g.Repeat();
           }
           else if (c != 1) {
                System.out.println("Thank you");
                
           }
          
            while (c == 1){
            Again();
            break;}
        
        }
        
    public static void main(String []args) {
        GuessNumber g = new GuessNumber();
        g.Repeat();
        g.Again();
    }

    
}
