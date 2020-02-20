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
public class Cashier {
    private String ID;
    private String name;
   protected List<Receipt> receiptIssued;
    
    
    
    public Cashier(String ID, String name) {
        this.ID = ID;
        this.name = name;
       this.receiptIssued=new ArrayList<Receipt>();
    }

    @Override
    public String toString() {
        return "Cashier{" + "ID=" + ID + ", name=" + name + '}';
    }

void addToReceiptIssued(Receipt r){
    this.receiptIssued.add(r);
    
}
    
    
}
