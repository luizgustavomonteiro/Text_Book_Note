import dictionary.AppDictionaryEnglish;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Welcome to TextBook Notes application");
        System.out.println("Choose your option:");
        System.out.println("1 - English Dictionary");
        System.out.println("2 - French Dictionary");

        Scanner scan = new Scanner(System.in);

        int options = scan.nextInt(); 

        switch (options) {
            case 1 -> {
                
                AppDictionaryEnglish englishDictionary = new AppDictionaryEnglish();

                // input word data
                System.out.print("ID: ");
                int word_Id = scan.nextInt();
                scan.nextLine();
                System.out.print("Word Name: ");
                String wordName = scan.nextLine();
                System.out.print("Word Meaning: ");
                String wordMeaning = scan.nextLine();

                // Set word 
                englishDictionary.setWord(word_Id, wordName, wordMeaning);
                System.out.println("Retriev word by ID");
                int retrievById = scan.nextInt();
                scan.nextLine();
                // Getting word by ID
                System.out.println(englishDictionary.getWordById(retrievById));
                // Getting word by Name

                System.out.println("Get word by name:");
                String getWordByName = scan.nextLine();
                System.out.println(englishDictionary.getWordByName(getWordByName));
            }

            case 2 -> System.out.println("French Dictionary");
            default -> System.out.println("Invalid option");
        }

        scan.close();



       // AppDictionary dictionary = new AppDictionary();

        
    }
}
