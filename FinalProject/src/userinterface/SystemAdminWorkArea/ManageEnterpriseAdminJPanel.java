/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import Business.Organization.HealthOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.HealthadminRole;
//import Business.Role.AdminRole;
import Business.Role.WelfareadminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        enterpriseJTable.getTableHeader().setFont(new Font("TImes New Roman",Font.BOLD,18));
        enterpriseJTable.setRowHeight(30);
        enterpriseJTable.setRowMargin(10);
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        try{
            model.setRowCount(0);
            for (Network network : system.getNetworkList()) {
                for (WelfareEnterprise enterprise : network.getEnterpriseDirectory().getWelfareEnterpriseList()) {
                    for(WelfareOrganization welOrg : enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                        for (UserAccount userAccount : welOrg.getUserAccountDirectory().getUserAccountList()) {
                            if(welOrg.getName().equals("WelfareAdmin Organization")){
                                Object[] row = new Object[3];
                                row[0] = enterprise.getName();
                                row[1] = network.getName();
                                row[2] = userAccount.getUsername();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
            for (Network network : system.getNetworkList()) {
                for (HealthEnterprise enterprise : network.getEnterpriseDirectory().getHospitalnterpriseList()) {
                    for(HealthOrganization helOrg : enterprise.getHealthOrganizationDirectory().getHealthOrganizationList()){
                        for (UserAccount userAccount : helOrg.getUserAccountDirectory().getUserAccountList()) {
                            if(helOrg.getName().equals("HealthAdmin Organization")){
                                Object[] row = new Object[3];
                                row[0] = enterprise.getName();
                                row[1] = network.getName();
                                row[2] = userAccount.getUsername();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
         catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (WelfareEnterprise enterprise : network.getEnterpriseDirectory().getWelfareEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        for (HealthEnterprise enterprise : network.getEnterpriseDirectory().getHospitalnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        enterpriseJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        enterpriseJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setRowHeight(25);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(470, 310, 730, 190);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Network:");
        add(jLabel1);
        jLabel1.setBounds(670, 530, 80, 22);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 102)));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(790, 520, 140, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Username:");
        add(jLabel2);
        jLabel2.setBounds(670, 620, 90, 22);

        usernameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 102)));
        add(usernameJTextField);
        usernameJTextField.setBounds(790, 610, 140, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Enterprise:");
        add(jLabel3);
        jLabel3.setBounds(660, 570, 90, 22);

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 102)));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(790, 560, 140, 30);

        submitJButton.setBackground(new java.awt.Color(102, 0, 102));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102), new java.awt.Color(102, 0, 102)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(810, 780, 90, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Password:");
        add(jLabel4);
        jLabel4.setBounds(680, 670, 80, 22);

        nameJTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 102)));
        add(nameJTextField);
        nameJTextField.setBounds(790, 710, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Name:");
        add(jLabel5);
        jLabel5.setBounds(710, 720, 50, 22);

        passwordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordJPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 102)));
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(790, 660, 140, 30);

        backJButton.setBackground(new java.awt.Color(153, 102, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0), new java.awt.Color(153, 102, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(240, 810, 90, 40);

        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\net2.jpg")); // NOI18N
        add(imageLabel);
        imageLabel.setBounds(330, -20, 1430, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        try{
            if(enterpriseJComboBox.getSelectedItem() instanceof WelfareEnterprise){
                createWelfareUser((WelfareEnterprise)enterpriseJComboBox.getSelectedItem());
            }
             if(enterpriseJComboBox.getSelectedItem() instanceof HealthEnterprise){
                createHealthUser((HealthEnterprise)enterpriseJComboBox.getSelectedItem());
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
        
    }//GEN-LAST:event_submitJButtonActionPerformed
    
    private void createWelfareUser(WelfareEnterprise enterprise){
        try{
            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            if(!username.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()){
                if(system.checkIfUserIsUnique(username)){
                WelfareOrganization wel = enterprise.getWelfareOrganizationDirectory().createWelfareOrganization("WelfareAdmin Organization");
                Employee employee = wel.getEmployeeDirectory().createEmployee(name);
                UserAccount account = wel.getUserAccountDirectory().createUserAccount(username, password, employee, new WelfareadminRole(),null);
                Logger.getInstance().writeLogs("User Created for"+enterpriseJComboBox.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "User Created for"+enterpriseJComboBox.getSelectedItem().toString());
                populateTable();
                }
                else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter all the values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    
     private void createHealthUser(HealthEnterprise enterprise){
        try{
            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            if(!username.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()){
                if(system.checkIfUserIsUnique(username)){
               HealthOrganization hel = enterprise.getHealthOrganizationDirectory().createHealthOrganization("HealthAdmin Organization");
                Employee employee = hel.getEmployeeDirectory().createEmployee(name);
                UserAccount account = hel.getUserAccountDirectory().createUserAccount(username, password, employee, new HealthadminRole(),null);
                Logger.getInstance().writeLogs("User Created for"+enterpriseJComboBox.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "User Created for"+enterpriseJComboBox.getSelectedItem().toString());
                populateTable();
                }
                else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter all the values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
