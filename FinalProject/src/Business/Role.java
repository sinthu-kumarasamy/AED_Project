/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author koppu
 */
public class Role {
    private String rname;

  
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
     @Override
    public String toString(){
        return rname;
    }
}
