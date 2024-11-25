package dictionary;
import java.util.*;

public class AppDictionaryFrench implements DictionaryInterface 
{
    ArrayList<Word> words = new ArrayList<>();
    
    @Override
    public void setWord(int word_id, String wordName, String wordMeaning) {
        Word newWord = new Word(word_id, wordName, wordMeaning);
        words.add(newWord);

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

       }
       return null;

    }
    
    @Override
    public void updateWordByID(int word_id, String newMeaning) {
        for(Word word : words){
            if(word.getWordId()==word_id){
                word.setWordMeaning(newMeaning);
            }
        }
    }

    @Override
    public void updateWordByName(String wordName, String newMeaning) {
       for(Word word : words){
        if(word.getWordName().equalsIgnoreCase(wordName)){
            word.setWordMeaning(newMeaning);
        }
       }
    }

    @Override
    public void listWords() {
        for(Word word : words){
            System.out.println(word);
        }
    }

    @Override
    public boolean deleteWordByID(int word_id) {
        for(Word word : words){
            if(word.getWordId()==word_id){
                words.remove(word);
            }
        }
        return true;
    }

    @Override
    public boolean deleteWordByName(String wordName) {
        for(Word word : words){
            if(word.getWordName().equalsIgnoreCase(wordName)){
                words.remove(word);
            }
        }
        return true;
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

        @Override
        public String toString(){
            return "Word ID: " + wordId + ", Name: '" + wordName + "' Meaning: '" + wordMeaning + "' ";
        }


    }
    
}
