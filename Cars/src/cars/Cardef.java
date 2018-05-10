/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;


public class Cardef {
    private String brand;
    private String model;
    private int noofDoors;
    //constructor
    public Cardef(){
    
    }
    //another method
    public Cardef(String carbrand,String carmodel,int doors){
    brand=carbrand;
    model=carmodel;
    noofDoors=doors;
    }
    
    public String tostring(){
    return "Brand: "+brand+"Model: "+model+"Number of Doors: "+noofDoors;
            }
}
