/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author COMP
 */
public interface IGoodsManagement {
    public void addGood(Goods g,int quantity);
    public void sellGood(Goods g,int quantity,Cashier cashier,Receipt receipt)throws Exception;
   public double turnover();
}
