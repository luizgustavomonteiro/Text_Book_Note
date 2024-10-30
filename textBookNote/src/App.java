import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        try (Scanner input = new Scanner(System.in)) {
            int word_id = input.nextInt();
            input.nextLine();  // Consume the leftover newline character
            String wordName = input.nextLine();
            String wordMeaning = input.nextLine();

            NewWords.setNewWord(word_id, wordName, wordMeaning);
            NewWords.displayWords();

            input.close();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        
    }
}
