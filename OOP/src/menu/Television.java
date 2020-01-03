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
public class Television extends Product{
private String model;
private double price;

    public Television(String company, double price) {
        super(company, price);
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return super.toString() + "model:" +model +"Price"+ price;
    }
    
}
