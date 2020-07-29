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
public class Inspection {
    
    private double cost;
    private String message;
    
    public  Inspection()
    {
        this.cost = 50;
        this.message = "is interested in Basic Inspection";
    }

    public double getCost() 
    {
        return cost;
    }

    public void setCost(double cost) 
    {
        this.cost = cost;
    }

    public String getMessage() 
    {
        return message;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    public String toString() {
        return  this.message+"-"+this.cost;
    }
    
    
    

    
    
    
    
}
