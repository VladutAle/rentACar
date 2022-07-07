package the_thing;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private static Date lastEditDate;
    private static ArrayList<MenuItem> theMenu = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void makeNewMenuItem(){
        System.out.println("Making a new item...");

        System.out.println("Enter the item's name:");
        String aName = in.nextLine();
        System.out.println("Enter the item's price:");
        int aPrice = in.nextInt();
        in.nextLine();
        System.out.println("Enter the item's description:");
        String aDescription = in.nextLine();
        //in.nextLine();
        System.out.println("Enter the item's category:");
        String aCategory = in.nextLine();

        MenuItem newMenuItem = new MenuItem(aName, aPrice, aDescription, aCategory);
        theMenu.add(newMenuItem);

    }



    public static void main (String args[]){
        MenuItem car = new MenuItem("Car", 70,
                "It is an average car.","car");
        MenuItem van = new MenuItem("Van", 120,
                "It is a family van.","van");
        MenuItem motorbike = new MenuItem("Motorbike", 100,
                "It is a motorbike","motorbike");
        theMenu.add(car);
        theMenu.add(van);
        theMenu.add(motorbike);

        ArrayList<String> topChoices = new ArrayList<>();
        topChoices.add("0:\tQuit");
        topChoices.add("1:\tPick from the menu");
        topChoices.add("2:\tAdd a new item to the menu");

        ArrayList<String> getOrSet = new ArrayList<>();
        getOrSet.add("0:\tQuit");
        getOrSet.add("1:\tGet a field");
        getOrSet.add("2:\tSet a field");
        getOrSet.add("3:\tRent it");

        ArrayList<String> getterSelection = new ArrayList<>();
        getterSelection.add("0:\nQuit");
        getterSelection.add("1:\tGet name");
        getterSelection.add("2:\tGet price");
        getterSelection.add("3:\tGet description");
        getterSelection.add("4:\tGet category");


        ArrayList<String> setterSelection = new ArrayList<>();
        getterSelection.add("0:\nQuit");
        getterSelection.add("1:\tSet name");
        getterSelection.add("2:\tSet price");
        getterSelection.add("3:\tSet description");
        getterSelection.add("4:\tSet category");

        ArrayList<String> nameChoices = new ArrayList<>();
        for (int i = 0; i < theMenu.size(); i++) {
            nameChoices.add(i+":\t"+theMenu.get(i).getName());
        }

        Boolean keepGoing = true;
        while (keepGoing) {
            if (theMenu.size() < 1) {
                System.out.println("Nothing on the menu yet.");
                makeNewMenuItem();
            }
            System.out.println("\nHere is the menu:");

            for (int i = 0; i < theMenu.size(); i++) {
                System.out.println((i+1)+": "+"\t"+theMenu.get(i).getName()+"\t"+
                        "$"+theMenu.get(i).getPrice()+"\t"+
                        theMenu.get(i).getDescription()+"\t");
                if (theMenu.get(i).getCategory().equalsIgnoreCase("bestsellers")){
                    System.out.println("One of our bestsellers!");
                }
            }

            String input = userInterface(topChoices);
            if (input.equalsIgnoreCase(topChoices.get(0))){
                System.out.println("Goodbye, good riddance.");
                keepGoing = false;
            }else if (input.equalsIgnoreCase(topChoices.get(1))){
                String itemPicked = userInterface(nameChoices);

                System.out.println("Now for "+itemPicked.substring(3)+":");
                String whatToDo = userInterface(getOrSet);
                if (whatToDo.equalsIgnoreCase(getOrSet.get(0))){
                    System.out.println("Goodbye, good riddance.");
                    keepGoing = false;
                }else if (whatToDo.equalsIgnoreCase(getOrSet.get(1))) {
                    //todo
                    String getterPick = userInterface(getterSelection);

                }else if (whatToDo.equalsIgnoreCase(getOrSet.get(2))){
                    //todo
                    String setterPick = userInterface(setterSelection);

                }else if (whatToDo.equalsIgnoreCase(getOrSet.get(3))){
                    System.out.println("That will be $"+theMenu.get(
                            Integer.parseInt(itemPicked.substring(0,1))
                    ).getPrice());
                    System.out.println("Thanks and GOODBYE");
                    keepGoing = false;
                }
            }else if (input.equalsIgnoreCase(topChoices.get(2))){
                makeNewMenuItem();
            }
        }
    }
    public static String userInterface(ArrayList<String> choices){
        Boolean validChoice = false;

        Integer userChoice;

        do {
            System.out.println("\nHere are the choices:");

            for (Integer i = 0; i < choices.size(); i++) {
                System.out.println(choices.get(i));
            }
            userChoice = in.nextInt();
            in.nextLine();
            if (userChoice < 0 || userChoice >= choices.size()) {
                System.out.println("Invalid choice. Try again.");
            } else {
                validChoice = true;
            }
        } while (!validChoice);
        return choices.get(userChoice);
    }

}