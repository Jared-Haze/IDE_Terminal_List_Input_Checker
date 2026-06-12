import java.util.HashSet;

public class TestListPrompt {
    public String testPrompt = "What are the main 3 flags you'll use when using jlink? : ";

    //answers list
    private HashSet<String> testAnswers = new HashSet<>();

    public HashSet<String> getAnswers() {
        testAnswers.add("--module-path");
        testAnswers.add("--add-modules");
        testAnswers.add("--output");
        return testAnswers;
    }
}
