/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemethod;

/**
 *
 * @author lifebook
 */
public class MethodsDate {
    private int day;
    private int month;
    private int year;
    
    //constructor
    public MethodsDate(int d,int m,int y){
    this.day=d;
    this.month=m;
    this.year=y;
    }
    
    public void setDate(int d){
    day=d;
    }
    public void setDate1(int m){
    month=m;
    }
    public void setDate2(int y){
    year=y;
    }
    
    public int getDate(){
    return day;
    }
    public int getDate1(){
    return month;
    }
    public int getDate2(){
    return year;
    }
    public void displayDate(){
    System.out.println("The date is "+getDate()+"/"+getDate1()+"/"+getDate2());
    
    }
}
