package java_specialtopics_project_2;

import java.util.Date;
import java.util.Map;

public class Controller {
    
    
    private enum OperationStatus {OPERATION_SUCCESS, OPERATION_FAILED};
    OperationStatus operationStatus;
    private Gender gender;
    Map<String ,Actor> actors;
    Map<String, Customer> customers;
    Map<String, Keyword> keywords;
    Map<String, Movie> movies;
    Map<String, MovieKeyword> movieKeywords;
    Map<String, Rental> rentals;
    Map<String, Request>requests;
    Map<String, DVD> dvds;
    
    OperationStatus addActor(String id, String name,Gender gender ){
        
        if(!actors.containsKey(id)){
            Actor actor = new Actor(id, name);
            actor.setGender(gender);
        
            actors.put(id, actor);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
        
    }
    
    OperationStatus addCustomers(String email, String address, String phone, String password, String name){
        //USING PHONE AS KEY
        
        if(!customers.containsKey(phone)){
            Customer customer = new Customer(email, address, phone, password, name);
            customers.put(phone, customer);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_SUCCESS;
    }
    
    OperationStatus addKeyword(String id, String name){
        
        
        if(!keywords.containsKey(id)){
            Keyword keyword = new Keyword(id, name);
            keywords.put(id, keyword);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
    }
    
    OperationStatus addMovie(String id, String year, Genre movieGenre, String name, float rating){
        if(!movies.containsKey(id)){
            Movie movie = new Movie(id, year, movieGenre, name, rating);
            movies.put(year, movie);
            return operationStatus.OPERATION_SUCCESS;
        }
        
        return operationStatus.OPERATION_FAILED;
    }
    
    OperationStatus linkKeywordToMovie(String movieId, String keyWordId){
        
        
        if(!movieKeywords.containsKey(movieId)){
            MovieKeyword mk = new MovieKeyword(movieId, keyWordId);
            movieKeywords.put(movieId, mk);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
    }
    
    OperationStatus addRental(String rentalId, String DVDserialNumber, String reviewId, Date rentDate, Date returnDate, RentalStatus status){
        
        if(!rentals.containsKey(rentalId)){
            Rental rental = new Rental(rentalId, DVDserialNumber, reviewId, rentDate, returnDate, status);
            rentals.put(rentalId, rental);
            return  operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
    }
    
    OperationStatus addRequest(String requestId, RequestStatus requestStatus, RequestType requestType, Date requestDate, Date responseDate, String customerId, String movieId){
        
        if(!requests.containsKey(requestId)){
            Request request = new Request(requestId, requestStatus, requestType, requestDate, responseDate, customerId, movieId);
            requests.put(requestId, request);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
    }
    
    
    
    OperationStatus addDvd(String movieId, String serialNumber){
        if(!dvds.containsKey(serialNumber)){
            
            Movie movie = movies.get(movieId);
            DVD dvd = new DVD(movie, serialNumber);
            dvds.put(serialNumber, dvd);
        }
        return operationStatus.OPERATION_FAILED;
    }
    
}
