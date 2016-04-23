package java_specialtopics_project_2;

import java.util.Date;

/**
 *
 * @author Ana-1
 */
public class Request {
    
    private Date requestDate;
    private Date responseDate;
    private String requestId;
    private String customerId, movieId;
    private RequestStatus requestStatus;
    private RequestType requestType;
   
     Request(String requestId, RequestStatus requestStatus, RequestType requestType, Date requestDate, Date responseDate, String customerId, String movieId){
        this.requestId = requestId;
        this.requestDate= requestDate;
        this.requestStatus = requestStatus;
        this.requestType = requestType;
        this.responseDate = responseDate;
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
    Date getRequestDate(){
        return requestDate;
    }
    Date getResponseDate(){
        return responseDate;
    }
    RequestType getRequestType(){
        return requestType;
    }
    
    /*SETTERS*/
    void setStatus(RequestStatus requestStatus){
        this.requestStatus = requestStatus;
    }
    void setRequestDate(Date requestDate){
        this.requestDate = requestDate;
    }
    void setResponseDate(Date responseDate){
        this.responseDate = responseDate;
     }
    void setRequestType(RequestType requestType){
        this.requestType = requestType;
    }
    
    
}