/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_specialtopics_project_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Ana-1
 */
public class Java_SpecialTopics_Project_2 {
    
    /**
     * @param args the command line arguments
     */
    OperationStatus operationStatus;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Controller c = new Controller();
        /**ACTORS**/
        c.addActor("ben_actor_id", "Ben aff", Gender.MALE);
        c.addActor("scar_actor_id", "scar", Gender.FEMALE);
        c.addActor("Yuri_boyka_id", "Yuri boyka", Gender.MALE);
        
        /***MOVIES LIBRARY***/
        c.addMovie("PinkPanther_id", "2000", Genre.GENRE1, "Pink Panther", (float) 7.6);
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_1");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_2");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_3");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_4");
        c.bindActorToMovie("PinkPanther_id", "ben_actor_id");
        
        //c.linkKeywordToMovie("PinkPanther_id", "fun");
        //c.linkKeywordToMovie("PinkPanther_id", "childish");
        c.addKeyword("fun_keyword_id", "fun");
        c.addKeyword("family_keyword_id", "family");
        c.addKeyword("action_keyword_id", "action and blades");
        
        c.bindKeywordToMovie("PinkPanther_id", "family_keyword_id");
        c.bindKeywordToMovie("PinkPanther_id", "fun_keyword_id");
        
        
        
        c.addMovie("Ninja_id", "2006", Genre.GENRE2, "Ninja assassin", (float) 9.6);
        c.bindActorToMovie("Ninja_id", "Yuri_boyka_id");
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_1");
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_2");
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_3");
        
        c.bindKeywordToMovie("Ninja_id", "action_keyword_id");
        //c.linkKeywordToMovie("Ninja_id", "martial arts");
        //c.linkKeywordToMovie("Ninja_id", "fighting");
        //c.linkKeywordToMovie("Ninja_id", "blades");
        /***CUSTOMERS INFO***/
        
        //customers' emails are their ID
        //rental id is users' email + Ith movie rented
        //PROCESSING A FULL TRANSACTION
        
        c.addCustomers("anasmouradb2a@gmail.com", "1021 sw", "816618", "123", "Anas");
        String searchFor="PINK";
        DVD dvdSearch = c.searchForDvdByName(searchFor);
        if(dvdSearch!=null){//FOUND THE DVD
            
            System.out.print("You have one week to return the movie. Otherwise, you will be fined 10cents per day");
            dvdSearch.setDVDstatus(DVDstatus.RENTED);
            c.addRental("anasmourabd2a@gmail.com_1", dvdSearch.getSerialNumber(), null, null, RentalStatus.NOTRETURNED);
        
        }else{
            
            System.out.println("::Process a request::");
            //id of the new movie = name of the movie + id
            Movie requestedMovie = new Movie(searchFor+"_id", "2013", Genre.GENRE1, searchFor, 0);
            if(c.addRequest("Request_Id_for_anasmoruadb2a@gmail.com", RequestType.REQUESTTYPE1, "anasmouradb2a@gmail.com", searchFor+"_id") == OperationStatus.OPERATION_SUCCESS ){
                
                System.out.println("your request for movie "+searchFor+" is successfully added to our system");
            }
            
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
   
        c.searchByKeyWord("action");
        c.searchByActor("be");
        c.searchByRating((float)7.6);
        
        Calendar returnDate = Calendar.getInstance();
        //Customer returned the movie after 10 days
        returnDate.add(Calendar.DAY_OF_MONTH, 10);
        c.returnDVD("anasmourabd2a@gmail.com_1", returnDate);
        
    }
    
    
}