public class Main 
{
    public static void main(String[] args) 
    {
        Methods obj = new Methods();
        Invoker invoker = new Invoker();

        invoker.invokeAnnotatedMethods(obj);
    }
}