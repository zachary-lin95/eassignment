/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    
    public WorkRequest searchRequest(Vaccine vaccine){
        for(WorkRequest wr : workRequestList){
            if (wr.getVaccine().equals(vaccine)){
                return wr;
            }
        }return null;
    }
    
}