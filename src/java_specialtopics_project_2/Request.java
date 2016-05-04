package java_specialtopics_project_2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana-1
 */
public class Request {
    
    private Calendar requestDate;
    private Calendar responseDate;
    private String requestId;
    private String customerId, movieId;
    private RequestStatus requestStatus;
    private RequestType requestType;
   
     Request(String requestId, RequestType requestType, Calendar requestDate, String customerId, String movieId){
        
        this.requestStatus= RequestStatus.INITIATED;
        this.requestId = requestId;
        this.requestDate= requestDate;
        this.requestStatus = requestStatus;
        this.requestType = requestType;
        
        this.customerId = customerId;
        this.movieId = movieId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
    
    /*GETTERS*/
    RequestStatus getStatus(){
        return requestStatus;
    }
    Calendar getRequestDate(){
        return requestDate;
    }
    Calendar getResponseDate(){
        return responseDate;
    }
    RequestType getRequestType(){
        return requestType;
    }
    
    /*SETTERS*/
    void setStatus(RequestStatus requestStatus){
        this.requestStatus = requestStatus;
    }
    void setRequestDate(Calendar requestDate){
        this.requestDate = requestDate;
    }
    void setResponseDate(Calendar responseDate){
        this.responseDate = responseDate;
     }
    void setRequestType(RequestType requestType){
        this.requestType = requestType;
    }
    
    
}