/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ContributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ContributionOrganization extends Organization{

    public ContributionOrganization() {
        super(Type.Contributor.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ContributorRole());
        return roles;
    }
    
}