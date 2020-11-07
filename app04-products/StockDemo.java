/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Alex Clements
 * @version 03/11/2020
 */
public class StockDemo
{
    // The stock manager
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101,  "Nike F40 Trainers"));
        manager.addProduct(new Product(102,  "Nike XTRA Trainers"));
        manager.addProduct(new Product(103,  "Ellesse YK Trainers"));
        manager.addProduct(new Product(104,  "Nike Trainer"));
        manager.addProduct(new Product(105,  "Adidas Trainers"));
        manager.addProduct(new Product(106,  "Puma Trainers"));
        manager.addProduct(new Product(107,  "Converse Trainers"));
        manager.addProduct(new Product(108,  "Vans Trainer"));
        manager.addProduct(new Product(109,  "Dickies Trainers"));
        manager.addProduct(new Product(110,  "Asics Trainer"));
    }
    
    /* will do all the testing for me */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        manager.getLowStockLevel();
    }
    
    /**
     * Adds one to the quantity each time
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;
        for(int id = 101; id <= 110; id++)
        {
           quantity++;
           manager.deliver(id, quantity); 
        }  
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}