/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Role.DistributorInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DistributorInventoryOrganization extends Organization{

    
    
    public DistributorInventoryOrganization() {
        super(Organization.Type.DistributorInventory.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorInventoryRole());
        return roles;
    }
     
}