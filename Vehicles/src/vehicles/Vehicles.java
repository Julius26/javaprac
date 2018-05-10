
package vehicles;

import java.util.Scanner;
public class Vehicles {
    public static void main(String[] args) {
        //add scanner method
        Scanner scan =new Scanner(System.in);
        
       String regNo[]={"KBZ 009z","KBX 100x","KAQ 998y"};
       String deptTime[]={"11:00","9:00","8:00"};
       String destName[]={"Machakos","Kisumu","Mombasa"};
       String arriveDate[]={"   12:00","\t   12:00","\t   2:00"};
       String time;
       String destination;
       
       //Creating timetable for the user
       System.out.println("Please input Destination and time depending on our timetable provided");
       System.out.println("RegNo\t DepartureTime\tDestinationName  Arrivaldate");
       for(int i=0;i<=2;i++){
       System.out.println(regNo[i]+"\t"+deptTime[i]+"\t"+destName[i]+"\t"+arriveDate[i]);
       }
       //getting input from user
       System.out.println("Destination: ");
       destination=scan.next();
       System.out.println("Time: ");
       time=scan.next();
       
       if("Machakos".equals(destination)){
            if ("11:00".equals(time)) {
                System.out.println("RegistrationNumber\t"+"ArriveTime\t"+"Destination");
                System.out.println(" "+regNo[0]+"\t    "+arriveDate[0]+"\t    "+destName[0]);
            }
       }
       else if("Kisumu".equals(destination)){
            if("9:00".equals(time)){
                System.out.println("RegistrationNumber\t"+"ArriveTime\t"+"Destination");
            System.out.println(" "+regNo[1]+"\t "+arriveDate[1]+"\t "+destName[1]);
            }
       }
       else if("Mombasa".equals(destination)){
            if("8:00".equals(time)){
                System.out.println("RegistrationNumber\t"+"ArriveTime\t"+"Destination");
            System.out.println(" "+regNo[2]+"\t "+arriveDate[2]+" \t"+destName[2]);
            }
       }
       else{
       System.out.println("Error!!!");
       }
       
            
       
    }
    
}

