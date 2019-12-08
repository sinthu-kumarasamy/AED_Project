/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Health;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.HealthEnterprise;
import Business.Logger;
import Business.Organization.HealthOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageHealthUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
     JPanel userProcessContainer;
    HealthEnterprise enterprise;
    EcoSystem ecosystem;
    public ManageHealthUserAccountJPanel(JPanel userProcessContainer, HealthEnterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem=ecosystem;
        userJTable.getTableHeader().setFont(new Font("TImes New Roman",Font.BOLD,18));
        userJTable.setRowHeight(30);
        userJTable.setRowMargin(10);
        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        try{
            organizationJComboBox.removeAllItems();
            for (HealthOrganization organization : enterprise.getHealthOrganizationDirectory().getHealthOrganizationList()) {
                if(!organization.getName().equals("HealthAdmin Organization"))
                organizationJComboBox.addItem(organization);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    
    public void populateEmployeeComboBox(HealthOrganization organization){
        try{
            employeeJComboBox.removeAllItems();
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
               employeeJComboBox.addItem(employee);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    
    private void populateRoleComboBox(HealthOrganization organization){
         try{
            roleJComboBox.removeAllItems();
            for (Role role : organization.getSupportedRole()){
                roleJComboBox.addItem(role);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    public void popData() {

        try{
            DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

            model.setRowCount(0);

            for (HealthOrganization organization : enterprise.getHealthOrganizationDirectory().getHealthOrganizationList()) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = ua.getRole();
                    ((DefaultTableModel) userJTable.getModel()).addRow(row);
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        availabilityComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        passwordJTextField = new javax.swing.JPasswordField();
        availLabel = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        imgLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(164, 208, 204));
        setLayout(null);

        createUserJButton.setBackground(new java.awt.Color(102, 0, 102));
        createUserJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton);
        createUserJButton.setBounds(790, 720, 90, 40);

        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField);
        nameJTextField.setBounds(750, 550, 146, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("User Name:");
        add(jLabel1);
        jLabel1.setBounds(620, 550, 90, 22);

        userJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        userJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setRowHeight(20);
        jScrollPane1.setViewportView(userJTable);
        if (userJTable.getColumnModel().getColumnCount() > 0) {
            userJTable.getColumnModel().getColumn(0).setResizable(false);
            userJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(590, 180, 420, 179);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        add(jLabel2);
        jLabel2.setBounds(630, 600, 80, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("   Employee:");
        add(jLabel3);
        jLabel3.setBounds(620, 440, 110, 22);

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        add(employeeJComboBox);
        employeeJComboBox.setBounds(750, 440, 146, 30);

        backjButton1.setBackground(new java.awt.Color(153, 102, 0));
        backjButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(120, 740, 100, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Organization:");
        add(jLabel5);
        jLabel5.setBounds(612, 390, 110, 22);

        availabilityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Not Available" }));
        availabilityComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        availabilityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityComboBoxActionPerformed(evt);
            }
        });
        add(availabilityComboBox);
        availabilityComboBox.setBounds(750, 650, 146, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Role:");
        add(jLabel4);
        jLabel4.setBounds(670, 500, 50, 22);

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox);
        roleJComboBox.setBounds(750, 500, 146, 30);

        passwordJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        add(passwordJTextField);
        passwordJTextField.setBounds(750, 600, 146, 30);

        availLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        availLabel.setText("Availability:");
        add(availLabel);
        availLabel.setBounds(620, 650, 110, 22);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(750, 382, 146, 30);

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\health.jpeg")); // NOI18N
        add(imgLabel);
        imgLabel.setBounds(60, 10, 1320, 890);
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
         try{
            HealthOrganization org =(HealthOrganization) organizationJComboBox.getSelectedItem();
            Employee emp = (Employee) employeeJComboBox.getSelectedItem();
            Role role = (Role) roleJComboBox.getSelectedItem();
            String name = nameJTextField.getText();
            String password = String.valueOf(passwordJTextField.getPassword());
            String status = availabilityComboBox.getSelectedItem().toString();
            if(!name.trim().isEmpty() && !password.trim().isEmpty()){
            if(ecosystem.checkIfUserIsUnique(name)){
                org.getUserAccountDirectory().createUserAccount(name, password, emp, role,status);
                Logger.getInstance().writeLogs("Health User created- UserName- "+name);
                JOptionPane.showMessageDialog(null, "Health User created- UserName- "+name);
                nameJTextField.setBorder(BorderFactory.createLineBorder(new Color(153,0,102),3));
                passwordJTextField.setBorder(BorderFactory.createLineBorder(new Color(153,0,102),3));
                 nameJTextField.setText("");
                 passwordJTextField.setText("");
                popData();
            }
            else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
                  nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                  nameJTextField.setText("");
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter username and password","Error",JOptionPane.ERROR_MESSAGE);
                  nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                  passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                 
                  nameJTextField.setText("");
                  passwordJTextField.setText("");
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void availabilityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityComboBoxActionPerformed
        
    }//GEN-LAST:event_availabilityComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
        HealthOrganization organization = (HealthOrganization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
             if(organization.toString().startsWith("ManagePatient")){
            availLabel.setVisible(false);
            availabilityComboBox.setVisible(false);
            }else{
            availLabel.setVisible(true);
            availabilityComboBox.setVisible(true);
            }
        }
       
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availLabel;
    private javax.swing.JComboBox availabilityComboBox;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
