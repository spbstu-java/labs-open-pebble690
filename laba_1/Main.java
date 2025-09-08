import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Hero hero = new Hero("Artem");

        while (true)
        {
            System.out.println("Select a method of transportation:");
            System.out.println("1 - Walk");
            System.out.println("2 - Horse");
            System.out.println("3 - Fly");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();

            if (choice == 0)
            {
                System.out.println("The end");
                scanner.close();
                return;
            }

            switch (choice)
            {
                case 1:
                    hero.setStrategy(new Walk());
                    break;
                case 2:
                    hero.setStrategy(new Horse());
                    break;
                case 3:
                    hero.setStrategy(new Fly());
                    break;
                default:
                    System.out.println("Wrong choice!");
                    continue;
            }

            System.out.print("Enter your departure point: ");
            String from = scanner.next();

            System.out.print("Enter your destination: ");
            String to = scanner.next();

            hero.move(from, to);
        }
    }
}