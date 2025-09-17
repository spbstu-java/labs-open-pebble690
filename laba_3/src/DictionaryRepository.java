import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DictionaryRepository
{
    public List<DictionaryEntry> loadDictionary(String filePath) throws FileReadException, InvalidFileFormatException
    {
        List<DictionaryEntry> entries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;

            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split("\\|");

                if (parts.length != 2)
                {
                    throw new InvalidFileFormatException("Invalid dictionary line: " + line);
                }

                String source = parts[0].trim();
                String translation = parts[1].trim();
                
                entries.add(new DictionaryEntry(source, translation));
            }
        }
        catch (IOException e)
        {
            throw new FileReadException("Failed to read dictionary file", e);
        }

        entries.sort(Comparator.comparingInt((DictionaryEntry e) -> e.getSource().length()).reversed());

        return entries;
    }
}