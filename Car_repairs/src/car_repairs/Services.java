/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_repairs;

/**
 *
 * @author VERON
 */
public class Services {
    
    private String name;
    private double price;
    private String message;
    
    public Services(String n, double p)
    {
        this.name = n;
        this.price = p;
    }
    
    public Services(String n, double p, String m)
    {
        this.name = n;
        this.price = p;
        this.message = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Services{" + "name=" + name + '}';
    }
    
    
}
