package java_specialtopics_project_2;

import java.util.Date;

/**
 *
 * @author Ana-1
 */
public class Request {
    private enum status {PROCESSED, SOMETHINGELSE };
    private Date requestDate;
    private Date responseDate;
    private enum type{TYPE1, TYPE2};
    private String customerId, movieId;
    private status requestStatus;
    private type requestType;
   
    public void Request(status requestStatus, type requestType, Date requestDate, Date responseDate, String customerId, String movieId){
        this.requestDate= requestDate;
        this.requestStatus = requestStatus;
        this.requestType = requestType;
        this.responseDate = responseDate;
        this.customerId = customerId;
        this.movieId = movieId;
    }
    
    /*GETTERS*/
    status getStatus(){
        return requestStatus;
    }
    Date getRequestDate(){
        return requestDate;
    }
    Date getResponseDate(){
        return responseDate;
    }
    type getRequestType(){
        return requestType;
    }
    
    /*SETTERS*/
    void setStatus(status requestStatus){
        this.requestStatus = requestStatus;
    }
    void setRequestDate(Date requestDate){
        this.requestDate = requestDate;
    }
    void setResponseDate(Date responseDate){
        this.responseDate = responseDate;
     }
    void setRequestType(type requestType){
        this.requestType = requestType;
    }
    
    
}