/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_repairs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VERON
 */
public class Run_App {
    
    public static void main(String[] args) {
        
        //creation des services
        Services s1 = new Services("Basic Inspection", 50, "is interested in Basic Inspection");
        Services s2 = new Services("Oil Change", 85, "is interested in carrying out Oil Change");
        Services s3 = new Services("Tire rotation", 23.5, "is interested in carrying out Tire Rotation");
        
        //ajouter les services sur les services du garage
        Car_repairs list_services = new Car_repairs();
        list_services.add_service(s1);
        list_services.add_service(s2);
        list_services.add_service(s3);
        
        //liste des services consomés par le client
        ArrayList<Services> service_consome = new ArrayList<Services>();
        service_consome.add(s1);
        service_consome.add(s2);
        service_consome.add(s3);
        
        list_services.montant_a_payer("Veron",service_consome);
         
    }
}
