/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Enterprise;
import Business.EnterpriseAdmin;
import Business.EnterpriseAdminDirectory;
import Business.EnterpriseDirectory;
import Business.Network;
import Business.NetworkDir;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sindhu
 */
public class ConfigureEnterpriseAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConfigureOrganizationPanel
     */
   private EnterpriseAdminDirectory enterpriseAdminDirectory;
    private NetworkDir netDir;
   private JPanel userInteractionPanel;
   private EnterpriseDirectory enterpriseDirectory;
    ConfigureEnterpriseAdminPanel(EnterpriseAdminDirectory enterpriseAdminDirectory,NetworkDir netDir,JPanel userInteractionPanel,EnterpriseDirectory enterpriseDirectory) {
        initComponents();
        this.enterpriseAdminDirectory = enterpriseAdminDirectory;
        this.userInteractionPanel = userInteractionPanel;
        this.netDir = netDir;
        this.enterpriseDirectory = enterpriseDirectory;
        populateTable();
        populateEntComboBox();
        populateNetworkComboBox();
        entType.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        networkItem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        enterpriseItem = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        pwdField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        entType = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Enterprise Admin");

        entTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Network", "User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        entTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(entTable);

        jLabel2.setText("Network :");

        jLabel3.setText("EnterpriseType :");

        enterpriseItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                enterpriseItemItemStateChanged(evt);
            }
        });
        enterpriseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseItemActionPerformed(evt);
            }
        });

        jLabel4.setText("Username:");

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Password:");

        submitBtn.setText("Create");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Enterprise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(backBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32)))
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitBtn)
                                .addGap(39, 39, 39)
                                .addComponent(updateBtn)
                                .addGap(34, 34, 34)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(networkItem, 0, 132, Short.MAX_VALUE)
                                        .addComponent(entType)
                                        .addComponent(userField)
                                        .addComponent(pwdField))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(295, 295, 295))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterpriseItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(entType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(submitBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void enterpriseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseItemActionPerformed
        
        
    }//GEN-LAST:event_enterpriseItemActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String network = networkItem.getSelectedItem().toString();
        String enterprise = enterpriseItem.getSelectedItem().toString();
        String uname = userField.getText();
        String pwd = pwdField.getText();
        EnterpriseAdmin entAdmin = enterpriseAdminDirectory.addEnterpriseAdmin();
        entAdmin.setEnterprise(enterprise);
        entAdmin.setNetwork(network);
        entAdmin.setUsername(uname);
        entAdmin.setPassword(pwd);
        JOptionPane.showMessageDialog(null, "Configured an enterprise successfully");
        userField.setText("");
        pwdField.setText("");
        populateTable();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = entTable.getSelectedRow();
        if(selectedRow>=0){
            String network = networkItem.getSelectedItem().toString();
            String enterprise = enterpriseItem.getSelectedItem().toString();
            String uname = userField.getText();
            String pwd = pwdField.getText();
            EnterpriseAdmin entAdmin = (EnterpriseAdmin)entTable.getValueAt(selectedRow, 0);
            entAdmin.setEnterprise(enterprise);
            entAdmin.setNetwork(network);
            entAdmin.setUsername(uname);
            entAdmin.setPassword(pwd);
            JOptionPane.showMessageDialog(null, "Updated an enterprise successfully");
            userField.setText("");
            pwdField.setText("");
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = entTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                EnterpriseAdmin entAdmin = (EnterpriseAdmin)entTable.getValueAt(selectedRow, 0);
                enterpriseAdminDirectory.deleteEnterpriseAdmin(entAdmin);
                JOptionPane.showMessageDialog(null, "Deleted an enterprise successfully");
                userField.setText("");
                pwdField.setText("");
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void entTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = entTable.getSelectedRow();
         EnterpriseAdmin entAdmin = (EnterpriseAdmin)entTable.getValueAt(selectedRow, 0);
           for (EnterpriseAdmin entAd : enterpriseAdminDirectory.getEnterpriseAdminDirectory()) {
               if(entAd==entAdmin){
                   networkItem.setSelectedItem(entAd.getNetwork());
                   enterpriseItem.setSelectedItem(entAd.getEnterprise());
                   userField.setText(entAd.getUsername());
                   pwdField.setText(entAd.getPassword());
               }
           } 
           updateBtn.setEnabled(true);
           deleteBtn.setEnabled(true);
    }//GEN-LAST:event_entTableMouseClicked

    private void enterpriseItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_enterpriseItemItemStateChanged
        // TODO add your handling code here:
        String selectedItem = enterpriseItem.getSelectedItem().toString();
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseDirectory()){
            if(selectedItem.equals(enterprise.getEntName())){
                entType.setText(enterprise.getEntType());
            }
         }
    }//GEN-LAST:event_enterpriseItemItemStateChanged

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userInteractionPanel.remove(this);
        CardLayout layout = (CardLayout) userInteractionPanel.getLayout();
        layout.previous(userInteractionPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable entTable;
    private javax.swing.JTextField entType;
    private javax.swing.JComboBox<String> enterpriseItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> networkItem;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
     private void populateTable() {
         updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
         DefaultTableModel dtm = (DefaultTableModel) entTable.getModel();
         dtm.setRowCount(0);
        for (EnterpriseAdmin entAdmin : enterpriseAdminDirectory.getEnterpriseAdminDirectory()) {
           Object[] row = new Object[dtm.getColumnCount()];
           row[0] = entAdmin;
           row[1] = entAdmin.getNetwork();
           row[2] = entAdmin.getUsername();
           dtm.addRow(row);
        }
    }
     
     private void populateNetworkComboBox(){
         for(Network n:netDir.getNetworkDir()){
             networkItem.addItem(n.getName());
         }
     }
     
     private void populateEntComboBox(){
         for(Enterprise enterprise:enterpriseDirectory.getEnterpriseDirectory()){
             enterpriseItem.addItem(enterprise.getEntName());
         }
        String selectedItem = enterpriseItem.getSelectedItem().toString();
        for(Enterprise enterprise:enterpriseDirectory.getEnterpriseDirectory()){
            if(selectedItem.equals(enterprise.getEntName())){
                entType.setText(enterprise.getEntType());
            }
         }
     }


}
