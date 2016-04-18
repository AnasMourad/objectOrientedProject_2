/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_specialtopics_project_2;

/**
 *
 * @author Ana-1
 */
public class Customer {
    
    private String email;
    private String address;
    private String phone;
    private String password;
    private String name;
    
    /*GETTERS*/
    String getEmail(){
        return email;
    }
    String getAddress(){
        return address;
    }
    String getPhone(){
        return phone;
    }
    String getPassword(){
        return password;
    }
    String getName(){
        return name;
    }
    
    /*SETTERS*/
    void setEmail(String email){
        this.email = email;
    }
    void setAddress(String address){
        this.address = address;
    }
    void setPhone(String phone){
        this.phone = phone;
    }
    void setPassword(String password){
        this.password = password;
    }
    void setName(String name){
        this.name = name;
    }
    
}
