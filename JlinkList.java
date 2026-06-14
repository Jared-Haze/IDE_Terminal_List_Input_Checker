import java.util.HashSet;

public class JlinkList {
    public static String prompt = "What are the main 3 flags you'll use when using jlink? : ";
    public static String itemType = "flag";

    //answers list
    private static HashSet<String> answers = new HashSet<>();

    public static HashSet<String> getAnswers() {
        answers.add("--module-path");
        answers.add("--add-modules");
        answers.add("--output");
        return answers;
    }
}
