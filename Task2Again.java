import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Task2Again {

    public static void main(String []args){
    int Total = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("How Many Subject You Have? : ");
    int t = s.nextInt();
    for (int i = 1 ; i<=t; i++){
        System.out.print("Enter Marks of Subject "+i+" : ");
        int a = s.nextInt();
        Total = a + Total ;
    }
    System.out.println("Total of All subject is :: "+ Total);
    int Avg = (Total / t);
    System.out.println("Average of Total is :: " +Avg);
    int per = ((Total)/t);
    System.out.println("You got "+per+"%"+" percentage.");
    if (per>=90){
        System.out.println("You Got Grade : A+");
    }
        else if (per>=80){
        System.out.println("You Got Grade : A");
        }
        else if (per>=70){
        System.out.println("You Got Grade : B+");
        }
        else if (per>=60){
        System.out.println("You Got Grade : B");
        }
        else if (per>=50){
        System.out.println("You Got Grade : C+");
        }
        else if (per>=45){
        System.out.println("You Got Grade : C");
        }
        else if (per>=35){
        System.out.println("You Got Grade :E (Pass but not Good Performance)");
        }
    else {
        System.out.println("Fail");
    }
}
    
}
