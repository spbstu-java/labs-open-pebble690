public class Hero
{
    private String name;
    private Strategy strategy;

    public Hero(String name)
    {
        this.name = name;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void move(String from, String to)
    {
        if (strategy == null)
        {
            System.out.println("Error: No movement strategy selected!");
            return;
        }
        strategy.move(from, to, name);
    }
}