public class Walk implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " is walking from " + from + " to " + to);
    }
}