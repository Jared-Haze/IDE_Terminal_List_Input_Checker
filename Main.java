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

        TestListPrompt jlinkList = new TestListPrompt();
        JpackagePrompt jpList = new JpackagePrompt();

        if (choiceList.equals("1")) {
            HashSet<String> list = jlinkList.getAnswers();
            while (!list.isEmpty()) {
                System.out.println(jlinkList.testPrompt);
                String answer = scanner.nextLine().strip();
                if (list.contains(answer)){
                    System.out.println("correct!");
                    System.out.println("");
                    list.remove(answer);
                } else {
                    System.out.println("wrong answer");
                    System.out.println("");
                }
                earlyQuit(scanner);
                System.out.println("next guess... ");
            }
            System.out.println("wait, seems like you gottem all. Good job!");
        } else if (choiceList.equals("2")) {
            HashSet<String> list = jpList.getAnswers();
            while (!list.isEmpty()) {
                System.out.println(jpList.JpackagePrompt);
                String answer = scanner.nextLine().strip();
                if (list.contains(answer)) {
                    System.out.println("correct!");
                    System.out.println("");
                    list.remove(answer);
                } else {
                    System.out.println("wrong answer");
                    System.out.println("");
                }
                earlyQuit(scanner);
                System.out.println("next guess... ");
            }
            System.out.println("wait, seems like you gottem all. Good job!");
        } else if (choiceList.equals("1L") || choiceList.equals("1l")) {
            System.out.println(jlinkList.getAnswers());
        } else if (choiceList.equals("2L") || choiceList.equals("2l")) {
            System.out.println(jpList.getAnswers());
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
}

