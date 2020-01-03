/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Edo
 */
public class Product {
    private double Price;
    private String Company;
    private int QtySold;
    
    public Product(String company, double price){
        this.Company = company;
        this.Price = price;
    }
    public void sell(){
        QtySold++;
    }
    public void setPrice(double newPrice){
        Price = newPrice;
    }
    public String toString(){
        return 
            "Company:" + Company + "Price:" + Price + "Quantity Sold" + QtySold;
    }
}
