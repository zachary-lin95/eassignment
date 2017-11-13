/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.ProviderInventoryRole.InventoryWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Organization.ProviderInventoryOrganization;
/**
 *
 * @author raunak
 */
public class ProviderInventoryRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InventoryWorkAreaJPanel(userProcessContainer, account, (ProviderInventoryOrganization)organization, business);
    }
    
}
