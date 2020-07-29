/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_repairs;

import java.util.*;
import car_repairs.Car_repairs;
/**
 *
 * @author VERON
 */
public class Run_App {
    
    public static void main(String[] args) {
        
        Inspection i = new Inspection();
        Oil_Change o = new Oil_Change();
        Tire_rotation t = new Tire_rotation();
        
        System.out.println("----------------Basic Inspection-----------------------------");
        //for Basic Inspection only
        Car_repairs c1 = new Car_repairs("Veron");
        c1.Montant_a_payer();
        
        System.out.println("----------------Oil_change-----------------------------");
        //for  Oil_Change
        List<Object> List_services_un = new ArrayList<>();
        List_services_un.add(o);
        Car_repairs c2 = new Car_repairs("Chris", List_services_un);
        c2.Montant_a_payer();
        
        System.out.println("----------------Tire rotation-----------------------------");
        //for  Tire rotation
        List<Object> List_services_deux = new ArrayList<>();
        List_services_deux.add(t);
        Car_repairs c3 = new Car_repairs("Claude", List_services_deux);
        c3.Montant_a_payer();
        
        System.out.println("-----------------Oil_change and Tire rotation----------------------------");
        //for Basic Inspection, Tire_rotation and Oil Change
        List<Object> List_services_trois = new ArrayList<>();
        List_services_trois.add(o);
        List_services_trois.add(t);
        Car_repairs c4 = new Car_repairs("Eloge", List_services_trois);
        c4.Montant_a_payer();
        
    }
}
