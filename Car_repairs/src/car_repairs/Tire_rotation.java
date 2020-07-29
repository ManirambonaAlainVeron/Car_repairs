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
public class Tire_rotation {
    
    private double cost ;
    private String message;

    public Tire_rotation(){
        this.cost = 23.5;
        this.message = ", is interested in carrying out Tire Rotation";
    }
    
    public Tire_rotation(double cost){
        this.cost = cost;
    }
    
    public double getTire_rotation_cost() {
        return cost;
    }

    public void setTire_rotation_cost(double cost) {
        this.cost = cost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String toString() {
        return  this.message+"-"+this.cost;
    }
    
}
