/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ContributorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ContributionOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Sindhu
 */
public class ContributorWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContributorWorkAreaPanel
     */
   public ContributorWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise) {
       initComponents();
    }

    public ContributorWorkAreaPanel(JPanel userProcessContainer, UserAccount account, ContributionOrganization contributionOrganization, Enterprise enterprise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
