import java.util.Scanner;

import animalDepartment.animalMain;
import ticketingDepartment.ticketingMain;

public class Zoo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Brevard Zoo!");
        do{
            System.out.println("Press 1 for tickets.\nPress 2 for animal care department.\nPress 3 to exit.");
            choice = scanner.nextInt();

            //Sends Users to the ticketing derpartment
            if(choice == 1 ){
              ticketingMain ticket = new ticketingMain();
              ticket.start();
            } 
            //Sends Users to Animal Department
            else if (choice == 2) {
                animalMain animal = new animalMain();
                animal.start();
            } 
            //Users leave the Zoo
            else if (choice == 3) {
                System.out.println("We hope you enjoyed your visit!");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}
