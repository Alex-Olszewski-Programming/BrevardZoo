package ticketingDepartment;

import java.util.Scanner;

public class Purchase {
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int adultTickets = 0, childTickets = 0, seniorTickets = 0;
        double adultPrice = 24.95, childPrice = 15.95, seniorPrice = 22.95, total = 0.00;
        
        while(choice != 6) {
            System.out.println("\nWhat type of tickets would you like to buy?\n1. Adult \n2. Child\n3. Senior\n4. Total Tickets Purchased\n5. Total Cost\n6. Exit");
            choice = scanner.nextInt();
            if(choice == 1) {
                System.out.println("How many adult tickets would you like to purchase?");
                adultTickets = scanner.nextInt();
                System.out.println(adultTickets + " Adult tickets would cost $" + adultTickets*adultPrice + ".");
            } 
            else if (choice == 2) {
                System.out.println("How many children tickets would you like to purchase?");
                childTickets = scanner.nextInt();
                System.out.println(childTickets + " Child tickets would cost $" + childTickets*childPrice + ".");
            } 
            else if (choice == 3) {
                System.out.println("How many senior tickets would you like to purchase?");
                seniorTickets = scanner.nextInt();
                System.out.println(seniorTickets + " Adult Tickets would cost $" + seniorTickets*seniorPrice + ".");
            } 
            else if(choice == 4) {
                System.out.println("Adult Tikets: " + adultTickets + "\nSenior Tickets: "+ seniorTickets + "\nChild Tickets: " +childTickets);
            } 
            else if (choice == 5) {
                total = adultTickets * adultPrice + seniorTickets * adultPrice + childTickets * childPrice;
                System.out.println("Total Cost: $" + total + ".");
            } 
            else if (choice == 6){
              System.out.println("Exiting.");
              break;
            } 
            else {
                System.out.println("Invalid Choice. Try Again.");
            }
        }
    }

}
