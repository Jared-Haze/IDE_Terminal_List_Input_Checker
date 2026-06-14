import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to List Input Checker");
        System.out.println("what list would you like to practice today?");
        System.out.println("1 : jlink flags");
        System.out.println("2 : jpackage flags");
        System.out.print("(enter # only {+ L to see entire list -Ex. '1L'}): ");
        String choiceList = scanner.nextLine().strip();

        listMethodClass currentList;

        System.out.println();

        if (choiceList.equals("1")) {
            currentList = listMethodClass.getParameterizedListJL();
            listCycle(currentList, scanner);
        } else if (choiceList.equals("2")) {
            currentList = listMethodClass.getParameterizedListJP();
            listCycle(currentList, scanner);
        } else if (choiceList.equals("1L") || choiceList.equals("1l")) {
            currentList = listMethodClass.getParameterizedListJL();
            System.out.println(currentList.getList());
        } else if (choiceList.equals("2L") || choiceList.equals("2l")) {
            currentList = listMethodClass.getParameterizedListJP();
            System.out.println(currentList.getList());
        } else {
            System.out.println("wrong input");
        }
        scanner.close();
        System.out.println("Ending program");
    }   


    public static void earlyQuit(Scanner scanner) {
        System.out.print("continue? (y/n): ");
        String input = scanner.nextLine();
        if (input.equals("n") || input.equals("no")) {
            System.out.println("Ending program");
            scanner.close();
            System.exit(0);
        }
    }

    public static void listCycle(listMethodClass currentList, Scanner scanner) {
        while(!currentList.getList().isEmpty()) {
            System.out.println(currentList.prompt);
            String answer = scanner.nextLine().strip();
            if (currentList.getList().contains(answer)){
                currentList.getList().remove(answer);
                System.out.println("correct!" + itemsLeft(currentList));
                System.out.println("");
            } else {
                System.out.println("wrong answer," + itemsLeft(currentList));
                System.out.println("");
            }
            if(currentList.getList().isEmpty()) {continue;}
            earlyQuit(scanner);
            System.out.println("next guess... ");
        }
        System.out.println("👌 seems like you gottem all. Good job!");
    }
    

    public static String itemsLeft(listMethodClass currentList) {
        int size = currentList.getList().size();
        String currentItemType = currentList.itemType;
        String s;
        if (size == 1) {
            s = "";
        } else {
            s = "s";
        }
        String itemsLeft = " " + size + " " + currentItemType + s + " left.";
        return itemsLeft;
    }
}

