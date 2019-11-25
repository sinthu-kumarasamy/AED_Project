/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.WelfareAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WelfareAdmin.WelfareAdminWorkAreaPanel;

/**
 *
 * @author Sindhu
 */
public class WelfareAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WelfareAdminWorkAreaPanel(userProcessContainer,account, (WelfareAdminOrganization)organization,enterprise);
    }
    
}
