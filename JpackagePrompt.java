import java.util.HashSet;

public class JpackagePrompt {
    public String JpackagePrompt = "What are the common flags you use in your default/most common jpackage command? : ";

    //answers list
    private HashSet<String> answers = new HashSet<>();

    public HashSet<String> getAnswers() {
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
