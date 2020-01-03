/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import menu.Book;
import menu.Television;

/**
 *
 * @author Edo
 */


public class OOP {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        Television tv = new Television("Samsung", 1000000);
        tv.sell();
        System.out.println(tv);
       
        Book book = new Book("TokoAgus", 20000, "masak", "Sarah");
        book.sell();
        System.out.println(book);
        System.out.println(book.toString());
        
        
    }
    
}
