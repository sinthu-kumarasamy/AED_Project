/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sindhu
 */
public class EnterpriseAdminDirectory {
    
    private ArrayList<EnterpriseAdmin> enterpriseAdminDirectory;

    public EnterpriseAdminDirectory() {
        enterpriseAdminDirectory = new ArrayList<EnterpriseAdmin>();
    }

    public ArrayList<EnterpriseAdmin> getEnterpriseAdminDirectory() {
        return enterpriseAdminDirectory;
    }

    public void setEnterpriseAdminDirectory(ArrayList<EnterpriseAdmin> enterpriseAdminDirectory) {
        this.enterpriseAdminDirectory = enterpriseAdminDirectory;
    }
    
     public EnterpriseAdmin addEnterpriseAdmin(){
        EnterpriseAdmin entAdmin = new EnterpriseAdmin();
        enterpriseAdminDirectory.add(entAdmin);
        return entAdmin;
     }
     
     public void deleteEnterpriseAdmin(EnterpriseAdmin entAdmin){
        enterpriseAdminDirectory.remove(entAdmin);
    }
    
}
