
/**
 * Write a description of class Program here.
 *
 * @author Alex Clements
 * @version 13/11/2020
 Because this is static you can call it straight from the class w/out having to make an object*/
public class Program
{
    private static StockApp app;

    /**
     * This create a new app called stock and runs it
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
