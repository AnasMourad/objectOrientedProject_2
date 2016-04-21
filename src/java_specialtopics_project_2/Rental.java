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
    
    private Date rentDate;
    private Date returnDate;
    
    private enum Status {RETURNED, NOTRETURNED};
    
    private Status status;

    public Rental(String DVDserialNumber, String reviewId, Date rentDate, Date returnDate, Status status) {
        this.DVDserialNumber = DVDserialNumber;
        this.reviewId = reviewId;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
            
    
}
