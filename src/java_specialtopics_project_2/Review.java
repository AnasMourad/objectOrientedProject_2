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
public class Review {
    
    private String reviewId;
    private int rating;
    private String review;

    public Review(String reviewId, int rating, String review) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.review = review;
    }
    
    
    
    /*GETTERS AND SETTERS*/
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
}
