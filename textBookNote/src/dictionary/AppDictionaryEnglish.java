package dictionary;
import java.util.*;

public class AppDictionaryEnglish implements DictionaryInterface
{
    private final HashMap<Integer, Word> words;
    //Post link that containt about HashMap and these attributes. 

    public AppDictionaryEnglish()
    {
        words = new HashMap<>();
    }
    /*  Void method that receives three parameters, initializes a new object using these parameters,
    and inserts it into the 'word' map with the key (the appropriate word_id) and an object that
    contains the required attributes.
*/

    @Override
    public void setWord(int word_id, String wordName, String wordMeaning) {
        Word newWord = new Word(word_id, wordName, wordMeaning);
        words.put(word_id, newWord);
    }

    @Override
    public String getWordById(int word_id) {
        Word word = words.get(word_id);
        return (word != null) ? word.getWordMeaning(): "Word not found";
    }

    @Override
    public String getWordByName(String wordName) {
        for(Word word : words.values())
        {
            if(word.getWordName().equalsIgnoreCase(wordName))
            {
                return word.getWordMeaning();
            }
        }
        return "Word not found";
    }

    @Override
    public void updateWordByID(int word_id, String newMeaning) {
        Word word = words.get(word_id);
        if(word != null)
        {
            word.setWordMeaning(newMeaning);
            System.out.println("Word updated successfully");
        }
        else{
            System.out.println("Word not found");
        }
    }

    @Override
    public void updateWordByName(String wordName, String newMeaning) {
        boolean found = false;
        for(Word word : words.values()){
            if(word.getWordName().equalsIgnoreCase(wordName))
            {
                word.setWordMeaning(newMeaning);
                found = true;
                System.out.println("Word updated succesfully");
                break;
            }
            if(!found)
            {
                System.out.println("Word not found");
            }
        }
    }

    @Override
    public void listWords() {
        for(Word word : words.values())
        {
            System.out.println("ID: " + 
            word.getWordId() + 
            "Name: " + word.getWordName() + 
            "Meaning: " + word.getWordMeaning());
        }
    }

    @Override
    public boolean deleteWordByID(int word_id) {
        return words.remove(word_id) != null;
    }

    @Override
    public boolean deleteWordByName(String wordName) {
        for(Word word : words.values())
        {
            if(word.getWordName().equalsIgnoreCase(wordName))
            {
                words.remove(word.getWordId());
                return true;
            }
        }
        return false;
    }

    public class Word
    {
        int word_id;
        String wordName;
        String wordMeaning;

        public Word(int word_id, String wordName, String wordMeaning)
        {
            this.word_id = word_id;
            this.wordName = wordName;
            this.wordMeaning = wordMeaning;
        }

        public int getWordId()
        {
            return word_id;
        }

        public String getWordName()
        {
            return wordName;
        }

        public String getWordMeaning()
        {
            return wordMeaning;
        }

        public void setWordMeaning(String wordMeaning)
        {
            this.wordMeaning=wordMeaning;
        } 
    
    }

}

