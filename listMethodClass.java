import java.util.HashSet;

public class listMethodClass {
    public String prompt;
    public String itemType;
    public HashSet<String> listData;

    public listMethodClass(String prompt, String itemType, HashSet<String> listData) {
        this.prompt = prompt;
        this.itemType = itemType;
        this.listData = listData;
    }

    public HashSet<String> getList() {
        //made getter instead of just calling the field in case I decide to manipulate the input list set in between stages later on.
        return listData;
    }


    //helper methods for parameterizing the listMethod using specific data classes

    public static listMethodClass getParameterizedListJP(){
        //should make parent class for hardcoded data classes so that I can run itemsLeft() easier. - save for later
        String parameterizedPrompt = JpackageList.prompt;
        String parameterizedItemType = JpackageList.itemType;
        HashSet<String> parameterizedAnswers = JpackageList.getAnswers();
        listMethodClass parameterizedList = new listMethodClass(parameterizedPrompt, parameterizedItemType, parameterizedAnswers);
        return parameterizedList;
    }
    public static listMethodClass getParameterizedListJL(){
        //should make parent class for hardcoded data classes so that I can run itemsLeft() easier. - save for later
        String parameterizedPrompt = JlinkList.prompt;
        String parameterizedItemType = JlinkList.itemType;
        HashSet<String> parameterizedAnswers = JlinkList.getAnswers();
        listMethodClass parameterizedList = new listMethodClass(parameterizedPrompt, parameterizedItemType, parameterizedAnswers);
        return parameterizedList;
    }
}
