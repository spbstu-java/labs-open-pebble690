public class Horse implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " rides a horse from " + from + " to " + to);
    }
}