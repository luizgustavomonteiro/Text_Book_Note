package dictionary;
import java.util.*;

public class AppDictionaryFrench implements DictionaryInterface 
{
    ArrayList<Word> words;

    @Override
    public void setWord(int word_id, String wordName, String wordMeaning) {

    }

    @Override
    public String getWordById(int word_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWordById'");
    }

    @Override
    public String getWordByName(String wordName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWordByName'");
    }

    @Override
    public void updateWordByID(int word_id, String newMeaning) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateWordByID'");
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
