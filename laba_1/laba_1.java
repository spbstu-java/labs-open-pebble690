public class laba_1
{
    public static void main(String[] args)
    {
        Hero hero = new Hero("Артем", new Walk());

        hero.move("города", "парк");

        hero.setStrategy(new Horse());
        hero.move("парка", "аэропорт");

        hero.setStrategy(new Fly());
        hero.move("аэропорта", "Китай");

        hero.setStrategy(new Walk());
        hero.move("аэропорта", "город");
    }
}

interface Strategy
{
    void move(String from, String to, String name);
}

class Walk implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " идет пешком из " + from + " в " + to);
    }
}

class Horse implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " едет на лошади из " + from + " в " + to);
    }
}

class Fly implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " летит из " + from + " в " + to);
    }
}

class Hero
{
    private String name;
    private Strategy strategy;

    public Hero(String name, Strategy strategy)
    {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void move(String from, String to)
    {
        strategy.move(from, to, name);
    }
}
