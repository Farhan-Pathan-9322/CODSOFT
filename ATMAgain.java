import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ATMAgain {

    Scanner s = new Scanner(System.in);
    float Balanced = 1500;
    int w;
    
   
    public void Widhraw() {
        
        System.out.print("Enter a Withdraw Amount :: ");
        w = s.nextInt();
        if (w > Balanced) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } 
        else if( w < 1 ){
                System.out.println("Entered Amount is invalid");
        }
        else {
            Balanced = Balanced - w;
            System.out.println("Withdrawal Successful");
        }
        
}

    public void Deposite() {
        System.out.print("Enter a deposit Amount :: ");
        int d = s.nextInt();
        if(w > (-1) ){
            System.out.println("Entered Amount is invalid");
        }
        Balanced = d + Balanced;
        System.out.println("Amount is deposited Successfully");
        
    }

    public void CheckBalance() {
        System.out.println("Balance is :: " + Balanced);
    }

    public static void main(String[] args) {

        ATMAgain a = new ATMAgain();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank Name :: ");
        String S = sc.nextLine();
        System.out.println("Wel-com to "+S+" bank Service Zone");
        int choice;
        System.out.print("Set a password :: ");
        int pass = sc.nextInt();
        System.out.print("Enter a password :: ");
        int pass1 = sc.nextInt();
        if (pass == pass1){
            System.out.println("Password Correct !!");
        }
        else {
            System.out.println("Password Cannot mathched.");
            System.exit(0);
        }
        

       
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.Widhraw();
                   
                    break;
                case 2:
                    a.Deposite();
                    break;
                case 3:
                    a.CheckBalance();
                    break;
                case 4:
                    System.out.println("Thank You For Using our ATM");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter valid choice.");
            }
        } while (choice != 4);

        
    }
}















