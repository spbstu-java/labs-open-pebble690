import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter dictionary file path (../dictionary.txt):");
            String filePath = scanner.nextLine();

            DictionaryRepository repo = new DictionaryRepository();
            List<DictionaryEntry> dictionary = repo.loadDictionary(filePath);

            TranslatorService translator = new TranslatorService(dictionary);

            System.out.println("Dictionary loaded. Enter text to translate (or type 'exit' to quit):");

            while (true)
            {
                System.out.println("\nEnter text:");
                String inputText = scanner.nextLine();

                if (inputText.equalsIgnoreCase("exit"))
                {
                    System.out.println("Exiting program.");
                    break;
                }

                String translated = translator.translate(inputText);
                System.out.println("Translation result:");
                System.out.println(translated);
            }
        }
        catch (InvalidFileFormatException e)
        {
            System.out.println("Dictionary format error: " + e.getMessage());
        }
        catch (FileReadException e)
        {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}