/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WelfareAdmin;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Organization.WelfareOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageWelfareOrganizationJPanel extends javax.swing.JPanel {

   
    private JPanel userProcessContainer;
     private EcoSystem ecosystem;
    private WelfareEnterprise enterprise;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageWelfareOrganizationJPanel(JPanel userProcessContainer, EcoSystem ecosystem,WelfareEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise =  enterprise;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
       try{
            organizationJComboBox.removeAllItems();
            for (WelfareOrganization.Type type : WelfareOrganization.Type.values()){
                if (!type.getValue().equals(WelfareOrganization.Type.WelfareAdmin.getValue()))
                    organizationJComboBox.addItem(type);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    private void populateTable(){
        try{
            DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
            model.setRowCount(0);
            for(WelfareOrganization organization : enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                Object[] row = new Object[2];
                row[0] = organization.getOrganizationID();
                row[1] = organization.getName();
                if(!organization.getName().equals("WelfareAdmin Organization"))
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(193, 161, 171));
        setLayout(null);

        organizationJTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        organizationJTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setRowHeight(23);
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(610, 230, 480, 120);

        addJButton.setBackground(new java.awt.Color(102, 0, 102));
        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton);
        addJButton.setBounds(800, 470, 180, 40);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(97, 17, 73)));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(930, 390, 110, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Organization Type :");
        add(jLabel1);
        jLabel1.setBounds(710, 390, 220, 28);

        backJButton.setBackground(new java.awt.Color(153, 102, 0));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(null);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(250, 700, 110, 40);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\img-4.jpg")); // NOI18N
        add(imageLabel);
        imageLabel.setBounds(290, 150, 1150, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

         boolean flag = true;
        try{
            String type = organizationJComboBox.getSelectedItem().toString().equals("ContributionOrg")?"Contribution Organization":
                    organizationJComboBox.getSelectedItem().toString().equals("EventOrg")?"Event Organization":
                    organizationJComboBox.getSelectedItem().toString().equals("BeneficiaryOrg")?"Beneficiary Organization":"WelfareAdmin";
            for(WelfareOrganization welOrg : enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                if(welOrg.getName().equals(type)){
                    flag = false;
                }
            }
            if(flag){
            WelfareOrganization wel = enterprise.getWelfareOrganizationDirectory().createWelfareOrganization(type);
            wel.setName(type);
            populateTable();
            Logger.getInstance().writeLogs(type+" created");
            JOptionPane.showMessageDialog(null, type+" created");
            }
            else{
                JOptionPane.showMessageDialog(null, "Organization already added. Try adding some other organization","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
