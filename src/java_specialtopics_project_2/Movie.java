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
public class Movie {
    
    private String year;
    private enum genre {GENRE1, GENRE2, GENRE3};
    genre movieGenre;
    private String name;
    private float rating;
    
    String getYear(){
        return year;
    }
    genre getGenre(){
        return movieGenre;
    }
    float getRating(){
        return rating;
    }
    
    String getName(){
        return name;
    }
    
    void setYear(String year){
        this.year = year;
    }
    void setGenre(genre movieGenre){
        this.movieGenre = movieGenre;
    }
    void setName(String name){
        this.name = name;
    }
    
}