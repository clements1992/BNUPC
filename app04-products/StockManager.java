import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Alex Clements
 * @version 03/11/2020
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
    public void deliver(int id, int amount)
    {
        Product product = findProduct(id);

        if(product !=null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered " + product);
        }
        else
        {
            System.out.println("Cannot find product ID" + id );
        }
    }

    public void searchByName(String name)
    {
        for(Product product : stock)
        {
            name = name.toLowerCase();
            String productName = product.getName().toLowerCase();
            if(productName.startsWith(name))
            {
                System.out.println(product);
            }
        }
    }

    /**
     * Find a product in the stock with the given id */

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

    /* Renames product */
    public void renameProduct(int id,String newProductName)
    {
        Product product = findProduct(id);
        {
            String oldName = product.getName();
            product.changeName(newProductName);

            if(oldName != product.getName())
            {
                System.out.println("You have successfully renamed "+ oldName+ " to " + product.getName());
            }

        }
    }

    /* Deletes a product based on the findProduct method in the Product class */
    public void deleteProduct(int id)
    {
        Product product = findProduct(id);
        {
            if(product != null)
            {
                this.stock.remove(product);
                System.out.print("You have deleted " + product);
            }
        }
    }

    /* Uses the array list to find products with less than 3 in stock */
    public ArrayList<Product> getLowStockLevel() 
    {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : stock) {
            if(product.getQuantity() <= 3)
            {
                System.out.println("The following products are low in stock " + product);
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
