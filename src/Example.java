import java.util.Scanner;

//Creating Class
public class Example {
    private void printCarChoice(int choice) {
        if (choice == 1) {
            System.out.println("You choosed an Electrical car");
        } else System.out.println("You choosed a Gasoline car");
    }

    private void printVanChoice(int choice) {
        if (choice == 1) {
            System.out.println("You choosed an Family Van");
        } else System.out.println("You choosed a Transporter van");
    }

    private void printBikeChoice(int choice) {
        if (choice == 1) {
            System.out.println("You choosed a Tour Motorbike");
        } else if (choice == 2) {
            System.out.println("You choosed a Sport Motorbike");
        } else System.out.println("You choosed a City Motorbike");
    }

    //Creating main method
    public static void main(String[] args) {
        Example menu = new Example();
        //Declaring all variables
        int choice;
        int carChoice;
        int vanChoice;
        int bikeChoice;
        System.out.println("Please enter your username:");
        Scanner n = new Scanner(System.in);
        String name = n.nextLine();
        System.out.println("Welcome " + name + " to your renting account!");

        Scanner scanner = new Scanner(System.in);
        //Creating infinite while loop
        while (true) {

            //Creating menu
            System.out.println("Available vehicles:");
            System.out.println("1-Car");
            System.out.println("2-Van");
            System.out.println("3-Motorbike");
            System.out.println("Press 4 to Quit\n \n ");

            //Asking user to make choice
            System.out.println("Choose vehicle: ");
            choice = scanner.nextInt();

            //Creating switch case branch
            switch (choice) {

                //First case for finding car type
                case 1 -> {
                    System.out.println("1-Electrical");
                    System.out.println("2-Gasoline");
                    System.out.println("Choose your preffered car type: ");
                    carChoice = scanner.nextInt();
                    menu.printCarChoice(carChoice);
                    System.out.println("Don't forget to wear the seat bell!");
                }

                //Second case for finding van type
                case 2 -> {
                    System.out.println("1-Family ");
                    System.out.println("2-Transporter");
                    System.out.println("Choose your preffered van type: ");
                    vanChoice = scanner.nextInt();
                    menu.printVanChoice(vanChoice);
                }

                //Third case for finding bike type
                case 3 -> {
                    System.out.println("1-Tour motorbike");
                    System.out.println("2-Sport motorbike");
                    System.out.println("3-City motorbike");
                    System.out.println("Choose your preffered motorbike type: ");
                    bikeChoice = scanner.nextInt();
                    menu.printBikeChoice(bikeChoice);
                    System.out.println("Drive safely!");
                }

                //Fourth case for exit
                case 4 -> System.exit(0);


                //default case to display the message invalid choice made by the user
                default -> System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
            break;
        }
    }
}