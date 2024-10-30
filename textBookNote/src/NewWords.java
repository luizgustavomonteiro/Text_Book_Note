import java.util.ArrayList;

public class NewWords {

    private final int word_id;
    private final String wordName;
    private final String wordMeaning;

    // Static collection to store all words

    private static final ArrayList<NewWords> wordList = new ArrayList<>();

    public NewWords(int word_id, String wordName, String wordMeaning)
    {
        this.word_id = word_id;
        this.wordName = wordName;
        this.wordMeaning = wordMeaning;
    }

    public static void setNewWord(int word_id, String wordName, String wordMeaning)
    {
        NewWords newWord = new NewWords(word_id, wordName, wordMeaning);
        wordList.add(newWord);
    }

    public static void displayWords()
    {
        if(wordList.isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        for(NewWords word : wordList)
        {
            System.out.println("ID: " + word.word_id + "\n"
                                + "Word: " + word.wordName + "\n"
                                + "Meaning: " + word.wordMeaning);
        }
    }
   
}
