/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Eason
 */
public class VaccineCatalog {
        private ArrayList<Vaccine> Vaccinelist;
    public VaccineCatalog(){
        Vaccinelist = new ArrayList<>();
        
    }

    public ArrayList<Vaccine> getVaccinelist() {
        return Vaccinelist;
    }

    public void setVaccinelist(ArrayList<Vaccine> Vaccinelist) {
        this.Vaccinelist = Vaccinelist;
    }
    
    public Vaccine createVaccine(String name){
        Vaccine vaccine = new Vaccine();
        vaccine.setName(name);
        Vaccinelist.add(vaccine);
        return vaccine;
    }
    public Vaccine searchVaccine(String name){
        for(Vaccine v : Vaccinelist){
            if (v.getName().equals(name)){
                return v;
            }
        }return null;
    }
    
}
