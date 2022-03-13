package ticketingDepartment;
import java.util.Scanner;

public class ticketingMain {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    public void start(){
        do{
            System.out.println("Press 1 to purchase tickets.\nPress 2 to check tour times.\nPress 3 to return to menu.");
            choice = scanner.nextInt();
            if(choice == 1) {
                Purchase purchase = new Purchase();
                purchase.start();
            } 
            else if (choice == 2) {
                Tour tour = new Tour();
                tour.times();
            } 
            else if (choice == 3) {
                System.out.println("Going back to the main menu.");
            } 
            else {
                System.out.println("Invalid Choice. Try Again!");
            }
        } while (choice != 3);
    }   
}
