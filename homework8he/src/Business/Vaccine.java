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
public class Vaccine {
    private String name;
    private Disease disease;
    private int distributorinventory;
    private int providerinventory;
    private int clinicinventory;
    
    public int getDistributorinventory() {
        return distributorinventory;
    }

    public void setDistributorinventory(int distributorinventory) {
        this.distributorinventory = distributorinventory;
    }

    public int getProviderinventory() {
        return providerinventory;
    }

    public void setProviderinventory(int providerinventory) {
        this.providerinventory = providerinventory;
    }

    public int getClinicinventory() {
        return clinicinventory;
    }

    public void setClinicinventory(int clinicinventory) {
        this.clinicinventory = clinicinventory;
    }
    

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    

    @Override
    public String toString(){
        return name;
    }
}
