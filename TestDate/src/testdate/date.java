/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdate;

/**
 *
 * @author lifebook
 */
public class date {
      int month;
    int date;
    int year;
    //this is the constructor
 public date(int mnth,int dte,int yr){
     month= mnth;
     date= dte;
     year=yr;
   }
 // this is setting of the month date and years
 public void set(int month1){
     month=month1;
 }
     public void set1(int day1){
     date=day1;
 }
     public void set2(int year1){
     year=year1;
 }
    public int get(){
        return date;
    }
    public int get1(){
        return year;
    }
    public int get2(){
        return month;
    }
 //this is the display section
 public void displayDate(){
      System.out.println(month+"/"+date+"/"+year);
 }
}
