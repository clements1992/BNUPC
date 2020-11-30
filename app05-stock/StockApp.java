
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Alex Clements
 * @version 13/11/2020
 */
public class StockApp
{   
    public final String ADD = "add";
    
    public final int FIRST_ID = 200;
    // Use to get user input
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    private int nextID = FIRST_ID;

    private Product product;
    
    

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * runs program
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase(); //converts to lower case//

            executeMenuChoice(choice);

            if(choice.equals("quit"))
                finished = true;
        }
    }

    /** Executes menu choices **/
    public void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {   
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }

        else if(choice.equals("printall"))
        {
            printAllProducts();
        }

        else if(choice.equals("rename"))
        {
            //renameProduct();
        }

        else if(choice.equals("deliver"))
        {
            deliverProduct();
        }

        else if(choice.equals("search"))
        {
            searchProduct();
        }

        else if(choice.equals("low-stock"))
        {
            lowStock();
        }

        else if(choice.equals("restock"))
        {
            restock();
        }

        else if(choice.equals("sell"))
        {
            sellProduct();
        }
    }
    
    /** Search for a product **/
    public void searchProduct()
    {
        System.out.println("Enter the word that you want to search for : ");
        String word = input.getInput();
        
        manager.searchByName(word);
    }

    /** Delivers a product **/
    public void deliverProduct()
    {
        System.out.println("Deliver a Product: ");
        System.out.println();

        int id = input.getInt("Please enter the product ID: \n");
        
        int amount = input.getInt("Please enter the amount: \n");
        
        manager.deliver(id, amount);
        
        System.out.println("This product has been delivered: " + id);
    }
    
    /** Sells a product **/
    public void sellProduct()
    {
        System.out.println("Sell a Product");
        System.out.println();

        int id = input.getInt("Please enter the product ID \n");
        
        int amount = input.getInt("Please enter the amount \n");
        
        demo.sellProduct(id, amount);
        
        System.out.println("This product has been sold: " + id);
    }
    
    /**
    public void renameProduct()
    {   
        manager.renameProduct(id);
    }
    
    **/
    
    /** This works. Gets any items with less than 3 in stock **/
    public void lowStock()
    {
        System.out.println("All stock below have 3 or less in stock");
        manager.getLowStockLevel(0);
    }

    /** Restocks amount **/
    public void restock()
    {
        System.out.println("All products less than 3 will been restocked");
        int restock = input.getInt("Please enter the restock amount");
        manager.getLowStockLevel(restock);
    }
    
    /** Add a product **/
    
    
    public void addProduct()
    {   
        System.out.println("Add a new Product");
        System.out.println();

        System.out.println("Please enter the ID of the product");
        String value = input.getInput();
        int id = Integer.parseInt(value);

        System.out.println("Please enter the name of the product:");
        String name = input.getInput();
        
        if (input==null)
        {   
            System.out.println("Please enter a name");
        }
        
        else{
        Product product = new Product(id, name);
        manager.addProduct(product);
    }
    }

    /** Removes a product **/
    public void removeProduct()
    {   
        System.out.println("Remove a Product: ");
        System.out.println();

        System.out.println("Please enter the ID: ");
        String number = input.getInput();

        int id = Integer.parseInt(number);

        manager.removeProduct(id);

        System.out.println("This product has been deleted: " + id);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Deliver:    Accept a delivery");
        System.out.println("    Search:     Search for a product");
        System.out.println("    Low-Stock:  Print products with low stock");
        System.out.println("    Re-Stock:   Re-stock all low stock items to a minimum level");
        System.out.println("    Rename:     Change a products name");
        System.out.println();        
    }

    /** Prints all products **/
    public void printAllProducts()
    {
        manager.printAllProducts();
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Alex Clements");
        System.out.println("******************************");
    }
}
