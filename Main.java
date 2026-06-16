import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        } else if (choiceList.toUpperCase().equals("1L")) {
            currentList = listMethodClass.getParameterizedListJL();
            System.out.println(currentList.getList());
            System.out.println();
        } else if (choiceList.toUpperCase().equals("2L")) {
            currentList = listMethodClass.getParameterizedListJP();
            System.out.println(currentList.getList());
            System.out.println();
        } else {
            System.out.println("wrong input");
        }
        scanner.close();
        System.out.println("Ending program");
    }   


    public static void earlyQuit(HashSet<String> answeredList, listMethodClass currentList ,Scanner scanner) {
        System.out.print("continue: (y/enter/etc.)\nquit: (q)\nsee answered items: (i)\nsee unanswered items(ends practice early): (L)\n");
        String input = scanner.nextLine();
        if (input.equals("q")) {
            System.out.println("Ending program");
            scanner.close();
            System.exit(0);
        } else if (input.equals("i")) {
            System.out.println("showing answered items: ");
            System.out.println(answeredList + "\n");
        } else if (Set.of("l", "L").contains(input)) {
            System.out.println("seems like you struggle with these terms: \n" + currentList.getList());
            System.out.println("better keep practicing");
            System.out.println("Ending program");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println();
        }
    }

    public static void listCycle(listMethodClass currentList, Scanner scanner) {
        HashSet<String> answeredList = new HashSet<>();
        while(!currentList.getList().isEmpty()) {
            System.out.println(currentList.prompt);
            String answer = scanner.nextLine().strip();
            if (currentList.getList().contains(answer)){
                currentList.getList().remove(answer);
                answeredList.add(answer);
                System.out.println("correct!" + itemsLeft(currentList) + "\n");
            } else if (answeredList.contains(answer)) {
                System.out.println("you already got that one." + itemsLeft(currentList) + "\n");
            } else {
                System.out.println("wrong answer," + itemsLeft(currentList));
                System.out.println("");
            }
            if(currentList.getList().isEmpty()) {continue;}
            earlyQuit(answeredList, currentList, scanner);
            System.out.println("next guess... ");
        }
        System.out.println("👌 seems like you gottem all. Good job!🥳");
    }
    

    public static String itemsLeft(listMethodClass currentList) {
        int size = currentList.getList().size();
        String currentItemType = currentList.itemType;
        String s = (size == 1) ? "" : "s";
        String itemsLeft = " " + size + " " + currentItemType + s + " left.";
        return itemsLeft;
    }
}

