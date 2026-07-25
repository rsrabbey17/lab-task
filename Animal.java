import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {

        // Array of 10 random animals
        String[] animals = {
            "Lion", "Tiger", "Elephant", "Monkey", "Rabbit",
            "Horse", "Dog", "Cat", "Zebra", "Bear"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an animal name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        // Search the animal
        for (String animal : animals) {
            if (animal.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is found in the list.");
        } else {
            System.out.println(search + " is not found in the list.");
        }

        sc.close();
    }
}