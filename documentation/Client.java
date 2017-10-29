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
public class Client {
    private String username, password, name, surname, email, university;
    int userID;
    
    public Client(){
        username=password=name=surname=email=university = "";
        userID =0;
    }
    public Client(String username,String password,String name, String surname, 
            String email, String university, int id){
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.university = university;
        userID = id;
    }
    
    public String getUsername(){
        return username;
    }
     public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getUniversityName(){
        return university;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public int getUserId(){
        return userID;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setUniversityName(String university){
        this.university = university;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void getUserId(int id){
        userID = id;
    }
}
