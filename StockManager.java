import java.util.ArrayList;
import java.util.Iterator;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Durwin Barcenas
 * @version July 24, 2013
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
     
 
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
        
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
     * Receive a delivery of a particular product, if it exists.
     * Increase the quantity of the p++roduct by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        
        for (Product s: stock){
                if (id == s.getID()){
                    s.increaseQuantity(amount); 
                }
                System.out.println("ID: " + s.getID());
                System.out.println("Quantity: " + s.getQuantity());
        }
    
        
        /* Iterator<Product> it = this.stock.iterator();
      
           while (it.hasNext()){
               Product item = it.next(); 
               if (item.getID() == id){
                   amount += amount; 
                   item.increaseQuantity(amount); 
                }
            }
          */  
    }

    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(String name)
    {
       Iterator<Product> it = stock.iterator(); 
       if (name != null){     
       while (it.hasNext()){
           Product item = it.next();
           if (item.getName().equals(name)){
              return item; 
              }
            }
        }
        return null; 
    }

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.; 0 if no product with matching id is found
     */
    public int numberInStock(int id)
    {
       
        if ( id != 0) {
        
        for (Product s: stock){
            if (s.getID() == id){
              return stock.size(); 
            }
        }
        }
        return 0;
    }

    /**
     * Print details of all the products. Use the toString method of the Product calss
     */
    public void printProductDetails()
    {
        for (Product product: stock){
            System.out.println(product.toString()); 
        }
        
        
    }
}
