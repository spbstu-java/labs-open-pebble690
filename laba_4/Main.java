import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------------------------------\n");

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 2, 4, 9);
        List<Integer> numbersEmpty = new ArrayList<>();
        System.out.println("Average (normal list): " + StreamTasks.getAverage(numbers1));
        System.out.println("Average (empty list): " + StreamTasks.getAverage(numbersEmpty));

        System.out.println("\n---------------------------------------\n");

        List<String> strings = Arrays.asList("key", "iphone", "csgo");
        List<String> stringsEmpty = new ArrayList<>();
        System.out.println("Prefixed strings (normal list): " + StreamTasks.addPrefixAndUpperCase(strings));
        System.out.println("Prefixed strings (empty list): " + StreamTasks.addPrefixAndUpperCase(stringsEmpty));

        System.out.println("\n---------------------------------------\n");

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 1, 4, 5);
        System.out.println("Unique squares (some repeats): " + StreamTasks.getUniqueSquares(numbers2));
        List<Integer> numbersAllRepeats = Arrays.asList(1, 1, 4, 4);
        System.out.println("Unique squares (all repeated): " + StreamTasks.getUniqueSquares(numbersAllRepeats));

        System.out.println("\n---------------------------------------\n");

        try
        {
            System.out.println("Last element (normal list): " + StreamTasks.getLastElement(numbers1));
            System.out.println("Last element (empty list): " + StreamTasks.getLastElement(numbersEmpty));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\n---------------------------------------\n");

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] arrayNoEven = {1, 3, 5};
        System.out.println("Sum of even numbers (normal array): " + StreamTasks.sumEvenNumbers(array1));
        System.out.println("Sum of even numbers (no even numbers): " + StreamTasks.sumEvenNumbers(arrayNoEven));

        System.out.println("\n---------------------------------------\n");

        List<String> strings2 = Arrays.asList("keyboard", "first", "phone", "note");
        List<String> stringsEmpty2 = new ArrayList<>();
        System.out.println("List to map (normal list): " + StreamTasks.listToMap(strings2));
        System.out.println("List to map (empty list): " + StreamTasks.listToMap(stringsEmpty2));

        System.out.println("\n---------------------------------------\n");
    }
}
