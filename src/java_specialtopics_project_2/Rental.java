/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_specialtopics_project_2;

import java.util.Date;

/**
 *
 * @author Ana-1
 */
public class Rental {
    
    private String DVDserialNumber;
    private String reviewId;
    private String rentalId;
    private Date rentDate;
    private Date returnDate;
    private int rating;
    private String rentalReview;

    
    
    public boolean hasRentalRating(){
        if(!rentalReview.equals("")){
            return true;
        }
        return  false;
    }
    
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRentalReview() {
        return rentalReview;
    }

    public void setRentalReview(String RentalReview) {
        this.rentalReview = RentalReview;
    }

    
    public Rental(String rentalId, String DVDserialNumber, String reviewId, Date rentDate, Date returnDate, RentalStatus status) {
        
        this.rentalId = rentalId;
        this.DVDserialNumber = DVDserialNumber;
        this.reviewId = reviewId;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }
    
    
    private RentalStatus status;
    
    
    
    public String getDVDserialNumber() {
        return DVDserialNumber;
    }

    public void setDVDserialNumber(String DVDserialNumber) {
        this.DVDserialNumber = DVDserialNumber;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public void setStatus(RentalStatus status) {
        this.status = status;
    }
    
    
}
