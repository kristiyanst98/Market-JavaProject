/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author COMP
 */
public class CashDesk implements Runnable {
    private Cashier cashier;

    private List<Receipt>list;
    private int ID;
    private static int nextID=1;



    public CashDesk(Cashier cashier, List<Receipt> list) {
        this.ID=nextID;
        nextID++;
        this.cashier = cashier;
        this.list = list;
    }
      
    

 public void run(){
     
    for(Receipt r:list){
     System.out.println("CashDesk{" +"ID="+this.ID+ ", cashier=" + cashier +", Total is: "+r.getTotal());
 }
    
 }
}
    

