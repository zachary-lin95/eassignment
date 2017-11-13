/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProviderInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ProviderInventoryOrganization extends Organization{

    public ProviderInventoryOrganization() {
        super(Organization.Type.ProviderInventory.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderInventoryRole());
        return roles;
    }
     
   
    
    
}
