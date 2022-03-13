package animalDepartment;
import java.util.ArrayList;
import java.util.Scanner;

public class healthCheck {

    Elephant elephant = new Elephant();
    Lion lion = new Lion();
    Giraffe giraffe = new Giraffe();
    Tiger tiger = new Tiger();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0; 
        while(choice != 6) {
            System.out.println("Which animal would you like to check? \n1. Lion\n2. Tiger\n3. Giraffe \n4. Elephant\n5. All of them.\n6. Return");
            choice = scanner.nextInt();
            if (choice == 1) {
                lion.health();
            } 
            else if (choice == 2) {
                tiger.health();
            } 
            else if (choice == 3) {
                giraffe.health();
            } 
            else if (choice == 4) {
            elephant.health(); 
            } 
            else if (choice == 5) {
                ArrayList<Animal> animals = new ArrayList<Animal>();
                animals.add(elephant);
                animals.add(lion);
                animals.add(giraffe);
                animals.add(tiger);
                for(Animal a : animals) {
                    a.health();
                }
            } 
            else if (choice == 6) {
                System.out.println("Returning to previous menu");
            } 
            else {
                System.out.println("Invalid Choice");
            }
        }
    }
}

