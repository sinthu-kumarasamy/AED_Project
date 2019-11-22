/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class EnterpriseDirectory {
   
   private ArrayList<Enterprise> enterpriseDirectory;

    public EnterpriseDirectory() {
        enterpriseDirectory = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

  
    
     public Enterprise addEnterprise(){
        Enterprise enterprise = new Enterprise();
        enterpriseDirectory.add(enterprise);
        return enterprise;
     }
     
     public void deleteEnterpriseAdmin(Enterprise enterprise){
        enterpriseDirectory.remove(enterprise);
    }
    
}
