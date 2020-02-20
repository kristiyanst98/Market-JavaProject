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
public class Goods {
    private String ID;
    private String name;
    private double price;
    private int expirationPeriod;
   

    public Goods(String ID, String name, double price, int expirationPeriod) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.expirationPeriod = expirationPeriod;
    }

    @Override
    public String toString() {
        return "Goods{" + "ID=" + ID + ", name=" + name + ", price=" + price  + '}'+System.lineSeparator();
    }

    public double getPrice() {
        return price;
    }

    public int getExpirationPeriod() {
        return expirationPeriod;
    }
    
    
}
