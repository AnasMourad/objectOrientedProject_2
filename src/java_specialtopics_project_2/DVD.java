package java_specialtopics_project_2;

public class DVD {
    
    private String serialNumber;
    private boolean isLost;
    private Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    
    
    DVD(Movie movie, String serialNumber){
        
        this.movie = movie;
        this.isLost=false;
        this.serialNumber = serialNumber;
     
    }
    
    /*SETTERS*/
    void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    void setIsLost(boolean isLost){
        this.isLost = isLost;
    }
    /*GETTERS*/
   
    String getSerialNumber(){
       return serialNumber;
   }
   boolean getIsLost(){
    return isLost;
   }
    
}
