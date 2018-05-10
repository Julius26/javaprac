package setget;

public class Declare {

//    a constructor
    Declare(){

    }
//    private String fname;
    private String coursename;
      
    

    
    public void setcoursename(String name){
    coursename=name;
    }
    
    public String getcoursename(){
    
    return coursename;
            
    }
    
    public void displayMessage(){
     System.out.println("The course name is "+getcoursename());
    }
}
