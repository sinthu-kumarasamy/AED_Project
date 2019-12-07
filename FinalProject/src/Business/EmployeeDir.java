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
public class EmployeeDir {
    private ArrayList<Employee> employeeDir;

    public void setEmployeeDir(ArrayList<Employee> employeeDir) {
        this.employeeDir = employeeDir;
    }

    public EmployeeDir() {
        employeeDir = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDir() {
        return employeeDir;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeDir.add(employee);
        return employee;
    }
}
