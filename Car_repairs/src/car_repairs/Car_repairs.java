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
public class Car_repairs {

    private List<Services> list_service = new ArrayList <Services>();

    public List<Services> getList_service() {
        return list_service;
    }
    
    public void add_service(Services s)
    {
        if(!this.list_service.contains(s))
        {
           this.list_service.add(s); 
        }
        else
        {
            System.out.println("Le services existe déjà");
        }
    }
    
    public void remove_service(Services s)
    {
        if(this.list_service.contains(s))
        {
            this.list_service.remove(s);
        }
        else
        {
            System.out.println("Le service n'existe pas dans la liste des services");
        }
    }
    
    public void montant_a_payer(String customer_name, List<Services> list_service_consome)
    {
        double somme=0;
        String message ="";
        int i;
        for(i=0; i<list_service_consome.size(); i++)
        {
            if(this.list_service.contains(list_service_consome.get(i)))
            {
                Services s = list_service_consome.get(i);
                somme = somme + s.getPrice();
                message = message+", "+s.getMessage();
            }
        }
        System.out.println(customer_name+" pay "+somme+"$ "+message);
    }  
}
