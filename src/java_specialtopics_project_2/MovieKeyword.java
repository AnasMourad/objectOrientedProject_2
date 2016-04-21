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
public class MovieKeyword {
    
    private String movieId;
    private String keyWordId;

    public MovieKeyword(String movieId, String keyWordId) {
        this.movieId = movieId;
        this.keyWordId = keyWordId;
    }

    /*GETTERS AND SETTERS*/
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getKeyWordId() {
        return keyWordId;
    }

    public void setKeyWordId(String keyWordId) {
        this.keyWordId = keyWordId;
    }
    
    
    
}
