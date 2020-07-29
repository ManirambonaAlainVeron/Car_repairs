/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_repairs;

import java.util.ArrayList;
import java.util.List;
import car_repairs.Inspection;
/**
 *
 * @author VERON
 */
public class Car_repairs {

    private String client_name;
    private List<Object> service = new ArrayList <Object>();
    
    public Car_repairs(String name)
    {
        this.client_name = name;

    }

    public Car_repairs(String name, List<Object> services)
    {
        this.client_name = name;
        this.service.addAll(services);
    }
    
    public String getName() {
        return client_name;
    }

    public void setName(String name) {
        this.client_name = name;
    }
    
    public List<Object> getService() {
        return service;
    }

    public void setService(List<Object> service) {
        this.service = service;
    }
    
    public void Montant_a_payer(){
        int i;
        double somme;
        String message;
        
        if(!this.service.contains(Inspection.class) || this.service.isEmpty())
        {
            Inspection ins = new Inspection();
            somme = ins.getCost();
            message = "is interested in Basic Inspection";
        }
        else
        {  
            somme = 0;
            message = ""; 
        }
        for(i = 0; i<this.service.size(); i++)
        {
            if(this.service.get(i).getClass() != Inspection.class)
            {
                String service_attribute = this.service.get(i).toString();
                String[] tab = service_attribute.split("-");
                message = message +" "+tab[0];
                somme = somme + Double.parseDouble(tab[1]);
            }
        }
        System.out.println(this.client_name+" will pay "+somme+"$ "+message);
    }
    
    
    
}
