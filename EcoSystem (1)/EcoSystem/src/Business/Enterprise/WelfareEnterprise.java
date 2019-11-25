/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.WelfareAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Sindhu
 */
public class WelfareEnterprise extends Enterprise {
    
     public WelfareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Welfare);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new WelfareAdminRole());
        return roleList;
    }
    
}
