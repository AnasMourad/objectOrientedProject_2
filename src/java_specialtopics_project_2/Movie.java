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
    
    private String id;
    private String year;
    private Genre movieGenre;
    private String name;
    private float rating;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(Genre movieGenre) {
        this.movieGenre = movieGenre;
    }

    
    
    public Movie(String id, String year, Genre movieGenre, String name, float rating) {
        
        this.id = id;
        this.year = year;
        this.movieGenre = movieGenre;
        this.name = name;
        this.rating = rating;
    }
    
    
    
    
    String getYear(){
        return year;
    }
    Genre getGenre(){
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
    void setGenre(Genre movieGenre){
        this.movieGenre = movieGenre;
    }
    void setName(String name){
        this.name = name;
    }
    
}