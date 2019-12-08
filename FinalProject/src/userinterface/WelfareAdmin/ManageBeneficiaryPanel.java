/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WelfareAdmin;

import Business.Beneficiaries.Beneficiary;
import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.Organization.WelfareOrganization;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sindhu
 */
public class ManageBeneficiaryPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBeneficiaryPanel
     */
    WelfareEnterprise enterprise;
    EcoSystem ecosystem;
    JPanel userProcessContainer;
    WelfareOrganization organization;

    public ManageBeneficiaryPanel(JPanel userProcessContainer, EcoSystem system, WelfareEnterprise enterprise, Organization organization, UserAccount account) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = system;
        this.organization = (WelfareOrganization)organization;
        bentable.getTableHeader().setFont(new Font("TImes New Roman",Font.BOLD,18));
        bentable.setRowHeight(30);
        bentable.setRowMargin(10);
        populateTextField();
        populateTable();
    }
    
      private void populateTextField(){
        EntName.setText(enterprise.toString());
        EntName.setEnabled(false);
        
    }
      
      private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) bentable.getModel(); 
        model.setRowCount(0);
        if(organization!= null && organization.getBeneficiaryDirectory()!= null){
            for (Beneficiary ben:organization.getBeneficiaryDirectory().getBeneficiaryDirectory()){
               if(ben.getBeneficiaryId()!=0){
                    Object[] row = new Object[model.getColumnCount()];
                    row[0] = ben.getBeneficiaryId();
                    row[1] = ben.getBeneficiaryName();
                    row[2] = ben.getBeneficiaryCity();
                    row[3] = ben.getAssistanceType();
                    if(ben.getStatus()==null){
                        row[4] = "NA";
                    }else{      
                        row[4] = ben.getStatus();
                    }
                    row[5] = ben.getEntName();
                    model.addRow(row);
               }
            }

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
        bentable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        beneName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        beneCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        assisTypeItem = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        EntName = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        bentable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bentable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Beneficiary Id", "Beneficiary Name", "City", "Assistance Type", "Status", "Ent name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bentable.setRowHeight(20);
        jScrollPane1.setViewportView(bentable);

        add(jScrollPane1);
        jScrollPane1.setBounds(390, 230, 790, 160);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiary Name:");
        add(jLabel1);
        jLabel1.setBounds(590, 450, 150, 22);

        beneName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        beneName.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        add(beneName);
        beneName.setBounds(760, 450, 150, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("  Beneficiary City :");
        add(jLabel2);
        jLabel2.setBounds(580, 510, 150, 22);

        beneCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        beneCity.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        add(beneCity);
        beneCity.setBounds(760, 510, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Assistance Type:");
        add(jLabel3);
        jLabel3.setBounds(590, 570, 130, 22);

        assisTypeItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        assisTypeItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Fund", "Employment", "HealthCare" }));
        assisTypeItem.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        add(assisTypeItem);
        assisTypeItem.setBounds(760, 570, 150, 30);

        submitBtn.setBackground(new java.awt.Color(102, 0, 102));
        submitBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn);
        submitBtn.setBounds(740, 700, 90, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Enterprise Name:");
        add(jLabel4);
        jLabel4.setBounds(590, 620, 140, 22);

        EntName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EntName.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 102)));
        add(EntName);
        EntName.setBounds(760, 620, 150, 30);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\ben.jpg")); // NOI18N
        add(imageLabel);
        imageLabel.setBounds(90, -60, 1290, 940);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) bentable.getModel();
        int count = model.getRowCount()+1;
        String ben_name = beneName.getText();
        String ben_city = beneCity.getText();
        String ass_type = assisTypeItem.getSelectedItem().toString();
        String entname = EntName.getText();
//         if(beneName.getText().equals("") || !beneName.getText().matches("[a-z A-Z 0-9]+")){
//                JOptionPane.showMessageDialog(null,"Please enter an valid beneficiary name");
////                beneName.setBorder(BorderFactory.createLineBorder(Color.RED,3));
////                jLabel1.setForeground(Color.RED);
////                beneName.setText("");
//            }
//            if(beneCity.getText().equals("") || !beneCity.getText().matches("[a-z A-Z]+") ){
//               JOptionPane.showMessageDialog(null,"Enter Valid City");
////               beneCity.setBorder(BorderFactory.createLineBorder(Color.RED,3));
////               jLabel2.setForeground(Color.red);
////               beneCity.setText("");   
//           }
//            if(EntName.getText().equals("") || !EntName.getText().matches("[a-z A-Z 0-9]+")){
//                JOptionPane.showMessageDialog(null,"Please enter an valid enterprise name");
////                EntName.setBorder(BorderFactory.createLineBorder(Color.RED,3));
////                jLabel4.setForeground(Color.RED);
////                EntName.setText("");
//            }
         if(beneName.getText().equals("") || beneCity.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter all details");
         }
         else {
        organization.getBeneficiaryDirectory().addBeneficiary(count, ben_name, ben_city, ass_type, entname);
        JOptionPane.showMessageDialog(null, "Added event successfully", "Suceess",JOptionPane.PLAIN_MESSAGE);
                                beneName.setText("");
                                beneCity.setText("");
                               
        populateTable();
         }
         
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EntName;
    private javax.swing.JComboBox<String> assisTypeItem;
    private javax.swing.JTextField beneCity;
    private javax.swing.JTextField beneName;
    private javax.swing.JTable bentable;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
