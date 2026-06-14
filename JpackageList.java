import java.util.HashSet;

public class JpackageList {
    public static String prompt = "What are the common flags you use in your default/most common jpackage command? : ";
    public static String itemType = "flag";

    //answers list
    private static HashSet<String> answers = new HashSet<>();

    public static HashSet<String> getAnswers() {
        answers.add("--type");
        answers.add("--name");
        answers.add("--app-version");
        answers.add("--input");
        answers.add("--main-jar");
        answers.add("--runtime-image");
        answers.add("--icon");
        answers.add("--win-dir-chooser");
        answers.add("--win-shortcut");
        answers.add("--win-menu");
        answers.add("--java-options");
        answers.add("--dest");
        return answers;
    }
}
