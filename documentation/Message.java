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
public class Message {
    private String message;
    private int fromUserID, toUserID;
    
    public Message(){
        message = "";
        fromUserID = toUserID = 0;
    }
    
    public Message(String message, int fromUserID, int toUserID){
        this.message = message;
        this.fromUserID = fromUserID;
        this.toUserID = toUserID;
    }
    
    public String getMessage(){
        return message;
    }
    
    public int getFromUserID(){
        return fromUserID;
    }
    
    public int getToUserID(){
        return toUserID;
    }

    public void setMessage(String message){
       this.message = message;
    }
    
    public void setFromUserID(int fromID){
        fromUserID = fromID;
    }
    
    public void setToUserID(int toID){
       toUserID = toID;
    }
}