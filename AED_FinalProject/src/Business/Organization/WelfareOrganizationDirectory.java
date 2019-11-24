/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareOrganizationDirectory {
    private ArrayList<WelfareOrganization> welfareOrganizationList;

    public WelfareOrganizationDirectory() {
        welfareOrganizationList = new ArrayList();
    }

    public ArrayList<WelfareOrganization> getWelfareOrganizationList() {
        return welfareOrganizationList;
    }
}
