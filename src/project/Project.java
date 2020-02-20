/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author COMP
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Goods g=new Goods("5656","kiufte",5.00,5);
        Goods s=new Goods("5655","kebabche",3.00,3);
        Goods q=new Goods("5654","hlqb",1.00,7);
        Shop shop=new Shop();
        Cashier cashier=new Cashier("1234","Ivan");
        shop.addtoCashierList(cashier);
         Cashier cashier2=new Cashier("1234","Georgi");
          shop.addtoCashierList(cashier2);
         shop.addGood(q,6);
        shop.addGood(g,10);
        shop.addGood(s,5);
        Receipt r1=new Receipt(cashier);
        Receipt r2=new Receipt(cashier2);
        Receipt r3=new Receipt(cashier);
        try {
            shop.sellGood(g,6,cashier,r1);
            shop.sellGood(q,3,cashier,r1);
           shop.sellGood(q,3,cashier2,r2);
            shop.sellGood(s,4,cashier2,r2);
            shop.sellGood(s, 1, cashier, r3);
            cashier.addToReceiptIssued(r1);
            cashier2.addToReceiptIssued(r2);
            cashier.addToReceiptIssued(r3);
            r1.toFile();
        r1.readFile();
              r2.toFile();
        r2.readFile();
        r3.toFile();
        r3.readFile();
      shop.payDesks();
        } catch (Exception ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }

      System.out.println("Turnover: "+shop.turnover());
     System.out.println("Number of receipts: "+shop.getReceipts());
    }
    
}
