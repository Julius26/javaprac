/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puppy;

/**
 *
 * @author lifebook
 */
public class Puppy {

    private int puppyAge;
    private int puppyTime;
    private String puppyColor;
    //constructor
    public Puppy(String name){
    System.out.println("Name choosen is "+name );

     
    }
    public void setAge(int age){
    puppyAge =age;
    
    }
    public void setTime(int time){
    puppyTime=time;
    }
    public void setColor(String color){
    puppyColor=color;
    }
    public int getAge(){
    return puppyAge;
    }
    public int getTime(){
    return puppyTime;
    }
    public String getColor(){
    return puppyColor;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Puppy myPuppy=new Puppy("Tommy");
        myPuppy.setAge(2);
        myPuppy.setTime(4);
        myPuppy.setColor("Red");
        System.out.println("Puppy's age is :" + myPuppy.puppyAge );
        
        System.out.println("Puppy's Eating time  is :" + myPuppy.puppyTime );
        System.out.println("Puppy's Color time  is :" + myPuppy.puppyColor );


    }
    
}
