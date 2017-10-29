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
public class Item {
    private String category, description, condition;
    private ImageIcon photo;
    private int itemID, price;
    
    public Item(){
        category = description = condition = "";
        photo = null;
        itemID=price=0;
    }
    public Item(String category, String description, String condition, 
                 ImageIcon photo, int itemID, int price){
        this.category =category;
        this.condition = condition;
        this.description = description;
        this.itemID = itemID;
        this.price = price;
        this.photo = photo;
        
    }
    public String getCategory(){
        return category;
    }
    public String getDescription(){
        return description;
    }
    public String getCondition(){
        return condition;
    }
    public int getItemID(){
        return itemID;
    }
    public int getPrice(){
        return price;
    }
    public ImageIcon getPhoto(){
        return photo;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public void setItemID(int id){
        itemID = id;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setPhoto(ImageIcon photo){
        this.photo = photo;
    }

   
    
}
