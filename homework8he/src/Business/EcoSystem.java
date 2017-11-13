package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DiseaseCatalog diseaselist;
    private VaccineCatalog vaccinelist;
    
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public DiseaseCatalog getDiseaselist() {
        return diseaselist;
    }

    public void setDiseaselist(DiseaseCatalog diseaselist) {
        this.diseaselist = diseaselist;
    }

    public VaccineCatalog getVaccinelist() {
        return vaccinelist;
    }

    public void setVaccinelist(VaccineCatalog vaccinelist) {
        this.vaccinelist = vaccinelist;
    }
    

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}