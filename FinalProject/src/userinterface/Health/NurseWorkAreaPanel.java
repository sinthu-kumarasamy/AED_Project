/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Health;

import Business.Beneficiaries.Beneficiary;
import Business.EcoSystem;
import Business.Enterprise.HealthEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WelfareOrganization;
import Business.UserAccount.UserAccount;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sindhu
 */
public class NurseWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaPanel
     */
    JPanel userProcessContainer;
    HealthEnterprise enterprise;
    EcoSystem ecosystem;
     UserAccount account;
   

    public NurseWorkAreaPanel(JPanel userProcessContainer, EcoSystem business, HealthEnterprise enterprise, Organization organization, UserAccount account) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem=business;
        bentable.getTableHeader().setFont(new Font("TImes New Roman",Font.BOLD,18));
        bentable.setRowHeight(30);
       bentable.setRowMargin(10);
        populateTable();
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)bentable.getModel();
        dtm.setRowCount(0);
        for(Network net:ecosystem.getNetworkList()){
            for(WelfareEnterprise ent:net.getEnterpriseDirectory().getWelfareEnterpriseList()){
              for(WelfareOrganization org:ent.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                  if(org.getName().equals("Beneficiary Organization")){
                    for(Beneficiary ben:org.getBeneficiaryDirectory().getBeneficiaryDirectory()){
                     if(ben.getAssistanceType().equals("HealthCare") && ben.getAssistantName()!=null){
                        if(ben.getAssistantName().equals(account.getEmployee().getName())){
                             Object[] row = new Object[dtm.getColumnCount()];
                              row[0] = ben.getBeneficiaryId();
                              row[1] = ben.getBeneficiaryName();
                              row[2]=ben.getDocStatus();
                              dtm.addRow(row);
                        }
                     }
                    }
                  }
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
        patientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bpField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tempField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        heartrateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pulseField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(179, 233, 228));
        setLayout(null);

        bentable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bentable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bentable.setRowHeight(20);
        bentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bentableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bentable);

        add(jScrollPane1);
        jScrollPane1.setBounds(500, 80, 452, 170);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Patient Name:");
        add(jLabel1);
        jLabel1.setBounds(630, 290, 120, 22);

        patientName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 88, 20), 3));
        add(patientName);
        patientName.setBounds(760, 290, 150, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Blood Pressure:");
        add(jLabel2);
        jLabel2.setBounds(620, 350, 130, 22);

        bpField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 88, 20), 3));
        add(bpField);
        bpField.setBounds(760, 350, 150, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Temperature:");
        add(jLabel3);
        jLabel3.setBounds(640, 410, 110, 22);

        tempField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 88, 20), 3));
        add(tempField);
        tempField.setBounds(760, 410, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("HeartBeat rate:");
        add(jLabel4);
        jLabel4.setBounds(630, 470, 140, 22);

        heartrateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 88, 20), 3));
        add(heartrateField);
        heartrateField.setBounds(760, 470, 150, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Pulse:");
        add(jLabel5);
        jLabel5.setBounds(700, 540, 50, 22);

        pulseField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(113, 88, 20), 3));
        add(pulseField);
        pulseField.setBounds(760, 540, 150, 30);

        addBtn.setBackground(new java.awt.Color(204, 102, 0));
        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addBtn.setText("Add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn);
        addBtn.setBounds(750, 630, 71, 30);

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sindhu\\Documents\\AED\\finalproject\\EcoSystem (1)\\EcoSystem\\src\\nurse.jpg")); // NOI18N
        add(imgLabel);
        imgLabel.setBounds(50, 0, 1390, 1060);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)bentable.getModel();
        int selectedRow = bentable.getSelectedRow();
        if(selectedRow <0 ){
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning!",JOptionPane.WARNING_MESSAGE);
        }else{
            String patient_name = patientName.getText();
            int temp = Integer.parseInt(tempField.getText());
            int bp = Integer.parseInt(bpField.getText());
            int heartRate = Integer.parseInt(heartrateField.getText());
            int pulse = Integer.parseInt(pulseField.getText());
            for(Network net:ecosystem.getNetworkList()){
                for(WelfareEnterprise ent:net.getEnterpriseDirectory().getWelfareEnterpriseList()){
                  for(WelfareOrganization org:ent.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                      if(org.getName().equals("Beneficiary Organization")){
                        for(Beneficiary ben:org.getBeneficiaryDirectory().getBeneficiaryDirectory()){
                           if(ben.getBeneficiaryName().equals(patient_name)){
                               ben.setTemp(temp);
                               ben.setBp(bp);
                               ben.setHeartrate(heartRate);
                               ben.setPulse(pulse);
                              ben.setDocStatus("Test Completed");
                               populateTable();
                                JOptionPane.showMessageDialog(null, "Necessary test taken for this patient", "Suceess",JOptionPane.PLAIN_MESSAGE);
                                // JOptionPane.showMessageDialog(null, "Necessary test taken for this user", "Suceess",JOptionPane.PLAIN_MESSAGE);
                                patientName.setText("");
                                bpField.setText("");
                                tempField.setText("");
                                heartrateField.setText("");
                                pulseField.setText("");
                           }
                        }
                      }
                  }
                }
            }
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void bentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bentableMouseClicked
        // TODO add your handling code here:
        int selectedRow = bentable.getSelectedRow();
        String patient_name = (String) bentable.getValueAt(selectedRow,1);
        String availability = (String)bentable.getValueAt(selectedRow,2);
        if(availability.endsWith("Completed")){
            JOptionPane.showMessageDialog(null,"Necessary test taken for this patient already", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            patientName.setText(patient_name);
            patientName.setEditable(false);
        }
        
    }//GEN-LAST:event_bentableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable bentable;
    private javax.swing.JTextField bpField;
    private javax.swing.JTextField heartrateField;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField pulseField;
    private javax.swing.JTextField tempField;
    // End of variables declaration//GEN-END:variables
}
