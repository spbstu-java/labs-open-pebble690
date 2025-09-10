public class Fly implements Strategy
{
    @Override
    public void move(String from, String to, String name)
    {
        System.out.println(name + " flies from " + from + " to " + to);
    }
}