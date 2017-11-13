package Business;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine;
import Business.VaccineCatalog;
import Business.Disease;
import Business.DiseaseCatalog;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        /*
        VaccineCatalog vc = system.getVaccinelist();
        DiseaseCatalog dc = system.getDiseaselist();
                
        Vaccine v1 = vc.createVaccine("v1");
        v1.setName("v1");
        Vaccine v2 = vc.createVaccine("v2");
        v2.setName("v2");
        Disease d1 = dc.createDisease("d1");
        d1.setName("d1");
        
        Disease d2 = dc.createDisease("d2");
        d2.setName("d2");
        v1.setDisease(d1);
        v2.setDisease(d2);
        */
        
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Lin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        VaccineCatalog vc = new VaccineCatalog();
        DiseaseCatalog dc = new DiseaseCatalog();
                
        Vaccine v1 = vc.createVaccine("v1");
        
        Vaccine v2 = vc.createVaccine("v2");
        
        Disease d1 = dc.createDisease("d1");
        
        Disease d2 = dc.createDisease("d2");
     
        v1.setDisease(d1);
        v2.setDisease(d2);
        
        system.setVaccinelist(vc);
        system.setDiseaselist(dc);
        return system;
    }
    
}
