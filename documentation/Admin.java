/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs319project.trade;

/**
 *
 * @author ezgicakir
 */
public class Admin extends Client{
    
    public Admin(){
        super();
    }
    public Admin(String username,String password,String name, String surname, 
            String email, String university, int id){
        super(username, password, name, surname,email,university,id);
    }
    
    public void deleteItem(int itemID){
        
    }
}
