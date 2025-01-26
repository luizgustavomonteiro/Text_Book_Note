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

                System.out.println("T1 - set new Word:");
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

                System.out.println("****************************************");

                System.out.println("T2 - Retrieve Word by ID:");

                System.out.println("Retrieve word by ID");
                int retrievById = scan.nextInt();
                scan.nextLine();
                // Getting word by ID
                System.out.println(englishDictionary.getWordById(retrievById));
                // Getting word by Name

                System.out.println("****************************************");

                System.out.println("T3 - Retrieve Word by name:");
                
                System.out.println("Get word by name:");
                String getWordByName = scan.nextLine();
                System.out.println(englishDictionary.getWordByName(getWordByName));

                System.out.println("****************************************");

                System.out.println("T4 - Update Word by ID:");

                System.out.println("Input word id:");
                int updateID = scan.nextInt();
                scan.nextLine();
                System.out.println("Input new meaning:");
                String newMeaningByID = scan.nextLine();

                englishDictionary.updateWordByID(updateID, newMeaningByID);

                System.out.println("****************************************");

                System.out.println("T5 - Update Word by Name:");

                System.out.println("Input word name:");
                String updateByName = scan.nextLine();
                System.out.println("Input new meaning:");
                String newMeaningByName = scan.nextLine();

                englishDictionary.updateWordByName(updateByName, newMeaningByName);

                System.out.println("****************************************");

                System.out.println("T6 - List Words:");

                englishDictionary.listWords();

                System.out.println("****************************************");

                System.out.println("T7 - Delete word by ID:");

                int deleteWordByID = scan.nextInt();
                scan.nextLine();

                englishDictionary.deleteWordByID(deleteWordByID);

                System.out.println("****************************************");

                System.out.println("T8 - Delete word by Name:");

                String deleteWordByName = scan.nextLine();

                englishDictionary.deleteWordByName(deleteWordByName);

            }

            case 2 -> System.out.println("French Dictionary");
            default -> System.out.println("Invalid option");
        }

        scan.close();



       // AppDictionary dictionary = new AppDictionary();

        
    }
}
