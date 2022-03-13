package animalDepartment;

import java.util.Scanner;

public class animalMain {
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    public void start(){
        do{
            System.out.println("\nPress 1 to feed the animals.\nPress 2 to do a health check.\nPress 3 to return to menu.");
            choice = scanner.nextInt();
            if(choice == 1) {
                Feeding feeding = new Feeding();
                feeding.start();
            }   else if (choice == 2) {
                healthCheck health = new healthCheck();
                health.start();
            } else if (choice == 3) {
                System.out.println("Going back to the main menu.");
                break;
            } else {
                System.out.println("Invalid Choice. Try Again!");
            }
        } while (choice != 3);
    }   
}
