/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<WelfareEnterprise> welfareEnterpriseList;
    //private ArrayList<HospitalEnterprise> hospitalEnterpriseList;
    private ArrayList<Object> combineEnterprises;
    public EnterpriseDirectory(){
        welfareEnterpriseList=new ArrayList<WelfareEnterprise>();
        //hospitalEnterpriseList=new ArrayList<HospitalEnterprise>();
    }

    public ArrayList<WelfareEnterprise> getWelfareEnterpriseList() {
        return welfareEnterpriseList;
    }

    public void setWelfareEnterpriseList(ArrayList<WelfareEnterprise> welfareEnterpriseList) {
        this.welfareEnterpriseList = welfareEnterpriseList;
    }


//    public ArrayList<HospitalEnterprise> getHospitalnterpriseList() {
//        return hospitalEnterpriseList;
//    }
//
//    public void setHospitalnterpriseList(ArrayList<HospitalEnterprise> hospitalnterpriseList) {
//        this.hospitalEnterpriseList = hospitalnterpriseList;
//    }
    
    //Create enterprises
    public WelfareEnterprise createAndAddWelfareEnterprise(String name,String type){
        WelfareEnterprise enterpriseW=null;
        if(type.equals(WelfareEnterprise.EnterpriseType.Welfare.getValue())){
            enterpriseW = new WelfareEnterprise(name, WelfareEnterprise.EnterpriseType.valueOf(type));
            welfareEnterpriseList.add(enterpriseW);
        }
        return enterpriseW;
    }
    
    public ArrayList<Object> GetAllEnterprise(){
        //combineEnterprises.add(hospitalEnterpriseList);
        combineEnterprises.add(welfareEnterpriseList);
        return combineEnterprises;
    }
}

