/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author COMP
 */
public class Receipt {
    private int ID;
    private Cashier cashier;
    private List<Goods> goods;
    private Date date;
    private static int nextID=1;
    private double total=0.;
  public Receipt(Cashier cashier) {
       
        this.ID=nextID;
        nextID++;
        this.cashier = cashier;
        this.date=new Date();
        this.goods =new ArrayList<Goods>();
        this.total= total;
        
    }

   public void addToReceipt(Goods g){
     this.goods.add(g);
        }

    public double getTotal() {
       double sum=0.;
       for(Goods s:this.goods){
           sum+=s.getPrice();
       }
       return  sum;
    }
    
  public void toFile(){
      try (FileWriter fw=new FileWriter("Receipt No"+this.getID()+".txt",true)){ 
    fw.write(this.toString());
             
  }     catch (IOException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
    public int getID() {
        return ID;
    }
    
    public void readFile(){
        try{
            BufferedReader br=Files.newBufferedReader(Paths.get("Receipt No"+this.getID()+".txt"));
            String txt="";
            String reading=br.readLine();
            while(reading!=null){
                txt+=reading;
                reading=br.readLine();
            }
            System.out.println(txt);
        } 
        catch (IOException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
              @Override
              public String toString() {
                  return "Receipt{" + "ID=" + ID + ", cashier=" + cashier + "," +System.lineSeparator()+ goods.toString() + " date=" + date + System.lineSeparator()+" total=" + this.getTotal() + '}'+System.lineSeparator();
              }
              
              
              
}         
              
              
              
              
              
           