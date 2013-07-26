/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 * Modified by: Anju Chawla
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +
               name +
               " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     * @return true if restocking is successful, false if unsuccessful since amount supplied is negative              
     */
    public boolean increaseQuantity(int amount)
    {
        if(amount > 0) {
            quantity += amount;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     * @return true if product is in stock and sold, false if not in stock and cannot be sold
     */
    public boolean sellOne()
    {
        if(quantity > 0) {
            quantity--;
            return true;
        }
        else {
            return false;
        }
    }
}
