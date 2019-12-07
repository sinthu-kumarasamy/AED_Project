/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author koppu
 */
public class RoleDir {
    private ArrayList<Role> roleDir;

   
    
   public RoleDir() {
        roleDir = new ArrayList<Role>();;
    }
    public ArrayList<Role> getRoleDir() {
        return roleDir;
    }

    public void setRoleDir(ArrayList<Role> roleDir) {
        this.roleDir = roleDir;
    }
    
    
    
}
