package Business;

import Business.Beneficiaries.Beneficiary;
import Business.Employee.Employee;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Event.Event;
import Business.Network.Network;
import Business.Organization.HealthOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Network network= system.createAndAddNetwork();
        network.setName("System Administrator");
        WelfareEnterprise ent = network.getEnterpriseDirectory().createAndAddWelfareEnterprise("Admin", "Welfare");
        WelfareOrganization welfare = ent.getWelfareOrganizationDirectory().createWelfareOrganization("WelfareAdmin Organization");
        HealthEnterprise ent1 = network.getEnterpriseDirectory().createAndAddHealthEnterprise("Admin", "Health");
        HealthOrganization health = ent1.getHealthOrganizationDirectory().createHealthOrganization("HealthAdmin Organization");
        Employee employee = welfare.getEmployeeDirectory().createEmployee("SystemAdmin");
        Employee healthEmployee = health.getEmployeeDirectory().createEmployee("SysAdmin");
        UserAccount healthUser = health.getUserAccountDirectory().createUserAccount("Admin", "Admin", healthEmployee, new SystemAdminRole(),null);
        UserAccount ua= welfare.getUserAccountDirectory().createUserAccount("Admin", "Admin", employee, new SystemAdminRole(),null);
        Beneficiary benDetails = welfare.getBeneficiaryDirectory().addBeneficiary(0, "test","test","test","test");
        Event evtDetails = welfare.getEventDirectory().addEvent(0,"test","test","test","test",null);
        return system;
    }
    
}
