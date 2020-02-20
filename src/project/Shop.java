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
public class Shop implements IGoodsManagement{
    protected List<Goods> goodsAvailable;
    private List<Goods> soldGoods;
    private List<Cashier> cashiers;
    private int receipts;

    public Shop() {
        this.receipts = 0;
        this.goodsAvailable=new ArrayList<Goods>();
        this.cashiers=new ArrayList<Cashier>();
        this.soldGoods=new ArrayList<Goods>();
    }
   
    public void addGood(Goods g,int quantity){
        for(int i=0;i<quantity;i++){
        this.goodsAvailable.add(g);
        }
        System.out.println(g+"added "+quantity+" times");
    }
    public void sellGood(Goods g,int quantity,Cashier cashier,Receipt receipt)throws Exception{
        int quantityAvailable=0;
        for(Goods good: this.goodsAvailable){
            if(good==g){
                quantityAvailable++;
            }
        }
        if(quantityAvailable>=quantity){
            
        for(int i=0;i<quantity;i++){
            this.goodsAvailable.remove(g);
            this.soldGoods.add(g);
           receipt.addToReceipt(g);
        }
        receipt.getTotal();
        
        
        }
        else{
          throw new Exception("Not enough quantity of "+g);
        }
        
    }
   public double turnover(){
       double sum=0.;
       for(Goods s:this.soldGoods){
           sum+=s.getPrice();
       }
       return  sum;
   }

    public int getReceipts() {
        return receipts;
    }
    void addtoCashierList(Cashier c){
        cashiers.add(c);
    }
   void payDesks(){
       for(Cashier c:cashiers){

               
           Thread cashdesk=new Thread(new CashDesk(c,c.receiptIssued));
                   cashdesk.start();
       for(Receipt r:c.receiptIssued){
           this.receipts++;
       }
       }
       }
   }
   

