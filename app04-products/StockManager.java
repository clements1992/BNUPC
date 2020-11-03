import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    //An array list of products
    private ArrayList<Product> stock;
    
   /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }
    
   /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if(product !=null)
        {
        product.increaseQuantity(amount);
        System.out.println("Product Delivered " + product);
    }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
                {
                    return product;
                }
        }
        return null;
    }
    
    //THIS DOESN'T WORK RN
   public int numberInStock(int id)
    {
        return 0;
    }
    
   /**
     * Prints all products and heading
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Alex's Stock List");
        System.out.println("#################");
        System.out.println();
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
}
