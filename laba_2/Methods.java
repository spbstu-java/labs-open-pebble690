public class Methods 
{
    @Repeat(2)
    public void publicMethodOne() 
    {
        System.out.println("Вызван publicMethodOne()");
    }

    public void publicMethodTwo(String name) 
    {
        System.out.println("Вызван publicMethodTwo() с параметром: " + name);
    }

    public int publicMethodThree(int a, int b) 
    {
        return a + b;
    }

    //-------------------------------------------------------------------

    @Repeat(3)
    protected void protectedMethodOne(int x) 
    {
        System.out.println("protectedMethodOne() -> x = " + x);
    }

    protected String protectedMethodTwo(String text) 
    {
        return "protectedMethodTwo: " + text;
    }

    @Repeat(1)
    protected void protectedMethodThree() 
    {
        System.out.println("protectedMethodThree() без параметров");
    }

    //-------------------------------------------------------------------

    @Repeat(2)
    private void privateMethodOne(String msg, int count) 
    {
        System.out.println("privateMethodOne() -> msg=" + msg + ", count=" + count);
    }

    private int privateMethodTwo() 
    {
        return 42;
    }

    @Repeat(4)
    private void privateMethodThree() 
    {
        System.out.println("privateMethodThree() выполнен");
    }
}