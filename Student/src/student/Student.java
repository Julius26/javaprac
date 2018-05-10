
package student;

import java.util.Scanner;
public class Student {

    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
      int regNo;
      String name;
      String gender;
      String unitName;
      int unitCode;
      int marks;
      
      System.out.println("Please enter your reg number: ");
      regNo=scan.nextInt();
      System.out.println("Please enter your Name: ");
      name=scan.next();
      System.out.println("Please enter your Gender \t M for male and N for female: ");
      gender=scan.next();
      System.out.println("Please enter your unit Name: ");
      unitName=scan.next();
      System.out.println("Please enter your unit code: ");
      unitCode=scan.nextInt();
      System.out.println("Please enter your Marks");
      marks=scan.nextInt();
      
      
      
      
      System.out.println("Registration number: "+regNo);
      System.out.println("The name is: "+name);
      System.out.println("Gender: "+gender);
      System.out.println("UnitName: "+unitName);
      System.out.println("Unit Code: "+unitCode);
      System.out.println("Marks: "+marks);
      if(marks>=70 && marks<=100){
      System.out.println("Excellent");
      }
      else if(marks>=60 && marks<=69){
      System.out.println("Good");
      }
      
      else if(marks>=50 && marks<=59){
      System.out.println("Good");
      }
      else if(marks>=40 && marks<=49){
      System.out.println("Good");
      }
      else if(marks>=0 && marks<=39){
      System.out.println("Good");
      }
      else{
      System.out.println("Error!!");
      }
    }
    
}
