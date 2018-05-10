/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author lifebook
 */
public class Employee {

    //instance variables
    private String firstname;
//    private String secondName;
//    private double salary;
    
    public void setFname(String name){
    firstname=name;
    }
    
    public String getName(){
    return firstname;
    }
    public static void main(String[] args) {

        Employee emp1=new Employee();
        emp1.firstname="Mutunga0";
        
        System.out.println("The first name is "+emp1.firstname);
        
        Employee emp2=new Employee();
        emp2.setFname("Mulinge");
        System.out.println("The first name is "+emp1.firstname);

    }
    
}
