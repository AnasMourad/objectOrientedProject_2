package java_specialtopics_project_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class Controller {
    
    
    private enum OperationStatus {OPERATION_SUCCESS, OPERATION_FAILED};
    OperationStatus operationStatus;
    private Gender gender;
    HashMap<String ,Actor> actors= new HashMap<>();
    HashMap<String, Customer> customers = new HashMap<>();
    HashMap<String, Keyword> keywords=new HashMap<>();
    HashMap<String, Movie> movies = new HashMap<>();
    //bug: no duplicates
    HashMap<String, MovieKeyword> movieKeywords = new HashMap<>();
    HashMap<String, Rental> rentals= new HashMap<>();
    HashMap<String, Request>requests = new HashMap<>();
    HashMap<String, DVD> dvds=  new HashMap<>();
    
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
            movies.put(id, movie);
            return operationStatus.OPERATION_SUCCESS;
        }
        
        return operationStatus.OPERATION_FAILED;
    }
    
    OperationStatus linkKeywordToMovie(String movieId, String keyWordId){
        
        
        if(!movieKeywords.containsKey(movieId)){
            MovieKeyword movieKeyWord = new MovieKeyword(movieId, keyWordId);
            movieKeywords.put(movieId, movieKeyWord);
            return operationStatus.OPERATION_SUCCESS;
        }
        return operationStatus.OPERATION_FAILED;
    }
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    OperationStatus addRental(String rentalId, String DVDserialNumber, String reviewId, Calendar returnDate, RentalStatus status){
        
    
        if(!rentals.containsKey(rentalId)){
            
            /** Process rental and expected return date **/
            //WE've 3 dates
            //expected return: computed by system.
            //return date: actual date when user return the dvd 
            //rent date: the time and date the system processed the rental.
            
            
            Calendar rentDate = Calendar.getInstance();
            System.out.println("Your rent started @date: "+dateFormat.format(rentDate.getTime()));    
            Calendar expectedReturn = rentDate;
            expectedReturn.add(Calendar.DAY_OF_MONTH, 7);
            System.out.println("we are expecting you to return the DVD by: "+dateFormat.format(expectedReturn.getTime()));
            
            
            
            /*SETTING DVD TO RENTED*/
            DVD dvd = dvds.get(DVDserialNumber);
            dvd.setDVDstatus(DVDstatus.RENTED);
            /**/
            Rental rental = new Rental(rentalId, DVDserialNumber, reviewId, rentDate, returnDate, status);
            rental.setExpectedReturnDate(expectedReturn);
            
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
        
            Movie movie = movies.get(movieId);
        if(!dvds.containsKey(serialNumber)){
            
            //debug
            //System.out.println("hwllo"+ movie);
            DVD dvd = new DVD(movie, serialNumber);
            dvds.put(serialNumber, dvd);
            return operationStatus.OPERATION_SUCCESS;
        }
        //System.out.println("fail"+ movie.getName());
        return operationStatus.OPERATION_FAILED;
    }
    
    public Movie SearchForMovieByName(String name){
        
      name = name.toLowerCase();
      Iterator it = movies.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Movie movie = (Movie) pair.getValue();
            if(movie.getName().toLowerCase().contains(name)){
                System.out.println("Movie "+movie.getName()+" is found!!");
                return movie;
            }
        }

        return null;
    }
    
    public DVD searchForDvdByName(String name){
        
        name = name.toLowerCase();
        Iterator it = dvds.entrySet().iterator();
        System.out.println("Searching in the shelves..");
       
        while (it.hasNext()) {
        
            Map.Entry pair = (Map.Entry)it.next();
            DVD dvd = (DVD) pair.getValue();
            System.out.println(dvd.getMovie().getName());
            if(dvd.getMovie().getName().toLowerCase().contains(name) && dvd.getDVDstatus()== DVDstatus.AVAILABLE){
                System.out.println("DVD AVAILABLE FOUND:: "+dvd.getMovie().getName());
                return dvd;
            }
        }
        
        System.out.println("Bummber!! I couldn't find your movie...");
        return null;
    }
    
    
    /*function only show list of movies by year*/
    public void searchForDvdByYear(String year){
        
        
        Iterator it = dvds.entrySet().iterator();
        System.out.println("Searching in the shelves..");
       
        while (it.hasNext()) {
        
            Map.Entry pair = (Map.Entry)it.next();
            DVD dvd = (DVD) pair.getValue();
            
            if(dvd.getMovie().getYear().equals(year) && dvd.getDVDstatus()== DVDstatus.AVAILABLE){
                System.out.println(dvd.getMovie().getName()+" "+dvd.getMovie().getYear());
            
            }
        }
        
        
    }
    /*Displaying movies to customer that matches keyword*/
    public void searchByKeyWord(String keyword){
        
        
        Iterator it = dvds.entrySet().iterator();
        System.out.println("Searching in the shelves..");
        while (it.hasNext()) {
        
            Map.Entry pair = (Map.Entry)it.next();
            DVD dvd = (DVD) pair.getValue();
            
            if( movieKeywords.get(dvd.getMovie().getId()).getKeyWordId().toLowerCase().equals(keyword) && dvd.getDVDstatus()== DVDstatus.AVAILABLE){
                System.err.println("found dvd with the same keyword");
            }
        }
        
    }
    
    public void searchByRating(float rating){
        
        
        Iterator it = dvds.entrySet().iterator();
        System.out.println("Searching in the shelves..");
        while (it.hasNext()) {
        
            Map.Entry pair = (Map.Entry)it.next();
            DVD dvd = (DVD) pair.getValue();
            
            if( dvd.getMovie().getRating()==rating && dvd.getDVDstatus()== DVDstatus.AVAILABLE){
                System.out.println("found dvd with the same rating" + dvd.getMovie().getName());
            }
        }
        
    }
    
    
}
