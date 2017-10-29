/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs319project.trade;

import javax.swing.ImageIcon;

/**
 *
 * @author ezgicakir
 */
public class Book extends Item{
    
    public Book(){
        super();
    }
    public Book(String category, String description, String condition, 
                 ImageIcon photo, int itemID, int price){
        super(category, description, condition, photo, itemID, price);
    }
}
