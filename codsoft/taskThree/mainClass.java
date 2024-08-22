package codSoft.taskThree;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args){
        atmOperationInter op = new atmoperationImpl();
        int atmNumber = 549061;
        int atmPin = 2730;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our ATM Machine !!!");
        System.out.print("Enter the ATM Number :  ");
        int num = s.nextInt();
        System.out.print("Enter the ATM pin : ");
        int pin = s.nextInt();
        if(atmNumber == num && atmPin == pin){
            while(true){
                System.out.println("                               ");
                System.out.println("1.View Account balance\n2.Withdrawl Money\n3.Deposit Money\n4.Mini Statement\n5.Exit");
                System.out.print("Enter Your Choice :  ");
                int choice = s.nextInt();
                 
                if(choice == 1){
                    System.out.println("                               ");
                    op.viewBalance();

                }
                else if(choice==2){
                    System.out.print("Enter Amount to withdrawl amount : ");
                    double withdrawl = s.nextDouble();
                    System.out.println("                               ");
                    op.withdrawAmount(withdrawl);

                }
                else if(choice ==3){
                    System.out.print("Enter Money to Deposit :  ");
                    double depositAmount = s.nextDouble();
                    System.out.println("                               ");
                    op.depositAmount(depositAmount);

                }
                else if(choice == 4){
                    System.out.println("                               ");
                    op.miniStatement();

                }
                else if(choice ==5){
                    System.out.println("Please Collect your ATM Card\n Thanks! For using this ATM Machine");
                    System.exit(0);

                }
                else{
                    System.out.println("Enter The Correct Choice");
                }
            }
            
        }
        else{
            System.out.println("Invalid Credintals.");
        }
        s.close();


    }
    
}
