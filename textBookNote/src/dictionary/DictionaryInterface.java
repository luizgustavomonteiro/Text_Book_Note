package dictionary;

public interface DictionaryInterface {
    
    // Method to create a new word.
    void setWord(int word_id, String wordName, String wordMeaning);
    // Method to view a meaning of word by ID.
    String getWordById(int word_id);
    // Method to view a meaning of word by Name.
    String getWordByName(String wordName);
    // Method to update the meaning of a word by its ID.
    void updateWordByID(int word_id, String newMeaning);
    // Method to update the meaning of a word by its Name.
    void updateWordByName(String wordName, String newMeaning);
    // Method to list all the words. 
    void listWords();
    // Methods to delete words by Id or name and return a true/false.
    boolean deleteWordByID(int word_id);
    
    boolean deleteWordByName(String wordName);
    
}

//EXPLANATION

/*An interface specifies which methods you need to implement inside a class. 
This shows the design, and the developer needs to follow it. 
This practice is good for generalizing things or characteristics. 
When creating the class, it is necessary to define all the methods specified in the interface. 
If you want to create another class, this practice is good for scalability. 
Every method in an interface is abstract; it’s similar to a class, but all the methods are abstract by default.
*/

