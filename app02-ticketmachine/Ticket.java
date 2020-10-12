
/**
 * Write a description of class Ticket here.
 *
 * @author Alex Clements
 * @version 09/10/2020
 */
import java.util.Date;

public class Ticket
{
    // instance variables - replace the example below with your own
    private String destination;
    private int cost;
    private String datePurchased;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        // initialise instance variables
        this.destination=destination;
        this.cost=cost;
        this.datePurchased=datePurchased;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //public String main()
    {   //System.out.println(destination);
    }
    
    
    
    public static void PrintDate() {
        Date now = new Date();
        now.getTime();
        System.out.println(now);
    }
}
