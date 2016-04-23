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
public class Actor {
    private String name;
    private String id;
    
    private Gender gender;
    
    Actor(String id, String name){
        this.name = name;
        this.id = id;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /*GETTERS*/
    String getName(){
        return name;
    }
    Gender getGender(){
     return gender;
    }
    /*SETTERS*/
    void setName(String name){
        this.name = name;
    }
    void setGender(Gender gender){
        this.gender = gender;
    }
   
    
    
}
