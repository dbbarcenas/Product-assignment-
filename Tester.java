import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
   public static void main(String[] args)throws IllegalArgumentException{
        ArrayList<Product> products;
        
        Product pen = new Product(1,"pen");
        Product ice = new Product(2,"ice");
        Product breaker = new Product(3,"breaker");
        
        StockManager item = new StockManager(); 
        item.addProduct(pen);
        item.addProduct(ice); 
        item.addProduct(breaker); 
        
        item.delivery(1,5);
        item.delivery(2,2);
        item.delivery(3,4);
        
        
        
    }
}
