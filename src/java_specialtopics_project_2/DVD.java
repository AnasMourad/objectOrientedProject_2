package java_specialtopics_project_2;

public class DVD {
    
    private String serialNumber;
    private boolean isLost;
     
    DVD(String serialNumber){
        
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
