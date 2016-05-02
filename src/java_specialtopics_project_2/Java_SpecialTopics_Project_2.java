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
public class Java_SpecialTopics_Project_2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller c = new Controller();
        /***MOVIES LIBRARY***/
        c.addMovie("PinkPanther_id", "2000", Genre.GENRE1, "Pink Panther", (float) 7.6);
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_1");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_2");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_3");
        c.addDvd("PinkPanther_id", "dvd_serial_for_pinkPanther_4");
        
        c.linkKeywordToMovie("PinkPanther_id", "fun");
        c.linkKeywordToMovie("PinkPanther_id", "childish");
        
        
        c.addMovie("Ninja_id", "2006", Genre.GENRE2, "Ninja assassin", (float) 9.6);
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_1");
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_2");
        c.addDvd("Ninja_id", "dvd_serial_for_ninja_3");
        
        c.linkKeywordToMovie("Ninja_id", "martial arts");
        c.linkKeywordToMovie("Ninja_id", "fighting");
        c.linkKeywordToMovie("Ninja_id", "blades");
        /***CUSTOMERS INFO***/
        c.addCustomers("anasmouradb2a@gmail.com", "1021 sw", "816618", "123", "Anas");
       // DVD dvdSearch = c.searchForDvdByName("ninja");
        if(true){
       //     System.out.print("You have one week to return the movie. Otherwise, you will be fined 10cents per day");
         //   dvdSearch.setDVDstatus(DVDstatus.RENTED);
          //  c.addRental("anasmourabd2a@gmail.com,ninja", dvdSearch.getSerialNumber(), null, null, RentalStatus.NOTRETURNED);
        
        }else{
            
            //System.out.println("Would you like to request it?");
        }
       
        //c.SearchForMovieByName("piNk");
       // c.searchForDvdByYear("2006");
        c.searchByKeyWord("fighting");
        c.searchByRating((float)7.6);
    }
    
}