/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lifebook
 */
public class AgeMethods {
    
    //instancevariable
    private int  age;
    
    public void setAge(int a){
    age =a;
    }
    public int getAge(){
    return age;
    }
    
    public void displayAge(){
    System.out.println("your age is"+getAge());
    }
}
