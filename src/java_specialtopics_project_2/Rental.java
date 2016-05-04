/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_specialtopics_project_2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana-1
 */
public class Rental {
    
    private String DVDserialNumber;
    private String reviewId;
    private String rentalId;
    private Calendar rentDate;
    private Calendar returnDate;
    private Calendar expectedReturnDate;
    
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

    public Calendar getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public void setExpectedReturnDate(Calendar expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    
    public Rental(String rentalId, String DVDserialNumber, String reviewId, Calendar rentDate, Calendar returnDate, RentalStatus status) {
        
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

    public Calendar getRentDate() {
        return rentDate;
    }

    public void setRentDate(Calendar rentDate) {
        this.rentDate = rentDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public void setStatus(RentalStatus status) {
        this.status = status;
    }
    
    public float computeFine(){
        
        System.out.println("Rental Date: " + rentDate.getTime());
        System.out.println("Return Date: " + returnDate.getTime());
        Date returnDay = returnDate.getTime();
        Date rentDay = rentDate.getTime();
        
        return (float)((((returnDay.getTime()-rentDay.getTime())/ 1000 / 60 / 60 / 24 )-7) * 0.10);
        

    }
    
    
}
