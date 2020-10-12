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
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;


    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)

    {
        price = cost;
        balance = 0;
        total = 0;
        
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
        balance = coin.pence;
    }     
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# Bluej line");
            System.out.println("# Ticket");
            
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                (price - balance) + " more cents.");

        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void insertCoin(Coin coin){
        if (coin.getPrice() == 10){
            System.out.println("You just inserted 10p");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 20){
            System.out.println("You just inserted 20p");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 50){
            System.out.println("You just inserted 50p");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 100){
            System.out.println("You just inserted 100p");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 200){
            System.out.println("You just inserted 200p");
            balance = balance + coin.getPrice();
        }
        else{
            System.out.println("Please enter 10p, 20p, 50p, £1.00 or £2.00");
        
        }
        System.out.println("Your balance is " + balance);
    }  
}
    
    
