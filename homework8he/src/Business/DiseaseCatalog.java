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
public class DiseaseCatalog {
        private ArrayList<Disease> DiseaseList;
    
    public DiseaseCatalog(){
        DiseaseList = new ArrayList<>();
        
    }
    public ArrayList<Disease> getDiseaseList() {
        return DiseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> DiseaseList) {
        this.DiseaseList = DiseaseList;
    }
    
    public Disease createDisease(String name){
        Disease disease = new Disease();
        disease.setName(name);
        DiseaseList.add(disease);
        return disease;
    }
}
