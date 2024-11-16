package dictionary;
import java.util.*;

public class AppDictionaryFrench implements DictionaryInterface 
{
    ArrayList<Word> words = new ArrayList<>();
    
    @Override
    public void setWord(int word_id, String wordName, String wordMeaning) {
        Word newWord = new Word(word_id, wordName, wordMeaning);
        words.add(word_id, newWord);

    }

    @Override
    public String getWordById(int word_id) {
        for(Word word : words)
        {
            if(word.getWordId()== word_id)
            {
                return word.getWordMeaning();
            }

        }
        return null;
    }

    @Override
    public String getWordByName(String wordName) {
       for(Word word : words)
       {
            if(word.getWordName().equalsIgnoreCase(wordName))
            {
                return word.getWordMeaning();
            }
       }return null;
    }

    @Override
    public void updateWordByID(int word_id, String newMeaning) {
        
    }

    @Override
    public void updateWordByName(String wordName, String newMeaning) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateWordByName'");
    }

    @Override
    public void listWords() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listWords'");
    }

    @Override
    public boolean deleteWordByID(int word_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteWordByID'");
    }

    @Override
    public boolean deleteWordByName(String wordName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteWordByName'");
    }

    public class Word
    {
        int wordId;
        String wordName;
        String wordMeaning;

        public Word(int wordId, String wordName, String wordMeaning)
        {
            this.wordId = wordId;
            this.wordName = wordName;
            this.wordMeaning = wordMeaning;
        }

        public int getWordId()
        {
            return wordId;
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
