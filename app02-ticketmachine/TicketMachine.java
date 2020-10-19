/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author Alex Clements
 * @version 2016.02.29
 * 
 * Modified by Alex Clements
 */
import java.util.Date;
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private Ticket aylesburyTicket;
    private Ticket highwycombeTicket;
    private Ticket amershamTicket;
    
    //private Coin Coins;


    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)

    {
        balance = 0;
        total = 0;
        
        aylesburyTicket = new Ticket("Aylesbury", 220);
        highwycombeTicket = new Ticket ("HighWycombe", 330);
        amershamTicket = new Ticket ("Amersham", 300);
        
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public void insertcoin(Coin coin)
    {
        
    }     
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertCoin(Coin coin) {
        if (coin.getPrice() == 10){
            System.out.println("you just inserted 10p");
            balance = balance + coin.getPrice();
        }
    }
}

    
    
