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
public class Book extends Product{
   private String title, author, company;
   private double price;

    public Book(String company, double price, String title, String author) {
        super(company,price);
        this.company = company;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
     public String toString(){
        return super.toString() + " Company: " + company +" Title by: "+ title + " author " + author + " Price: " + price ;
    }

    
}

