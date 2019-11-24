/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Employee.EmployeeDirectory;
//import Business.UserAccount.UserAccountDirectory;
//import Business.WorkQueue.WorkQueue;

/**
 *
 * @author user
 */
public abstract class HospitalOrganization extends Organization {

    private String name;
//    private WorkQueue workQueue;
//    private EmployeeDirectory employeeDirectory;
//    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Nurse("Nurse Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public HospitalOrganization(String name) {
        this.name = name;     
        organizationID = counter;
        ++counter;
    }
    

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
