/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;

import communitylookuptool.Person;
import java.util.Set;
import mvc.cntl.PersonCntl;
import mvc.cntl.ResultTableCntl;

/**
 *
 * @author bzc5373
 */
public class PersonView extends javax.swing.JFrame {
    private int selectedRow;
    private Person currentPerson;
    private PersonCntl personCntl;
    /**
     * Creates new form PersonView
     */
    public PersonView(PersonCntl personCntl) {
	this.personCntl = personCntl;
	initComponents();
    }
    public PersonView(PersonCntl personCntl, int selectedRow) {
        this.personCntl = personCntl;
        this.selectedRow = selectedRow;
        currentPerson = personCntl.getPerson(selectedRow);
        initComponents();
        parsePerson();
    }
    
        //populate the UI fields with data from the current instrument
    public void parsePerson() {
        if (!(currentPerson.getFirstName().equals(""))){
            fieldFirstName.setText(currentPerson.getFirstName());
        } else {
            fieldFirstName.setText("");
        }
        
        if (!(currentPerson.getLastName().equals(""))){
            fieldLastName.setText(currentPerson.getLastName());
        } else {
            fieldLastName.setText("");
        }
        
        if (!(currentPerson.getCampus().equals(""))){
            fieldCampus.setText(currentPerson.getCampus());
        } else {
            fieldCampus.setText("");
        }
    }
    
    public void showNewPersonUI() {
        fieldFirstName.setText("");
        fieldLastName.setText("");
        fieldCampus.setText("");
	labelFirstName.setVisible(true);
        labelLastName.setVisible(true);
        labelCampus.setVisible(true);
        btnBack.setVisible(true);
        btnCreate.setVisible(false);
	btnSave.setVisible(true);
	btnPrev.setVisible(false);
	btnNext.setVisible(false);    
    }
    
    public int getCurrentPerson() {
        return selectedRow;
    }
    
    public void setCurrentPerson() {
	currentPerson = personCntl.getCurrentPerson();
    }
    
    public String getFirstName() {
	    return fieldFirstName.getText();
    }
    
    public String getLastName() {
	    return fieldLastName.getText();
    }
	    
    public String getCampus() {
	    return fieldCampus.getText();
    }
    
   public void showPersonUI(){
        fieldFirstName.setText("");
        fieldLastName.setText("");
        fieldCampus.setText("");
	if (!(btnPrev.isVisible()))
		btnPrev.setVisible(true);
        if (!(btnNext.isVisible()))
		btnNext.setVisible(true);
        if (!(btnCreate.isVisible()))
		btnCreate.setVisible(true);
        if (!(btnSave.isVisible()))
		btnSave.setVisible(true);
	if (!(btnBack.isVisible()))
		btnBack.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                btnCreate = new javax.swing.JButton();
                fieldFirstName = new javax.swing.JTextField();
                fieldLastName = new javax.swing.JTextField();
                fieldCampus = new javax.swing.JTextField();
                labelFirstName = new javax.swing.JLabel();
                labelLastName = new javax.swing.JLabel();
                labelCampus = new javax.swing.JLabel();
                btnBack = new javax.swing.JButton();
                btnNext = new javax.swing.JButton();
                btnSave = new javax.swing.JButton();
                btnPrev = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                btnCreate.setText("New Person");
                btnCreate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCreateActionPerformed(evt);
                        }
                });

                labelFirstName.setText("First Name:");

                labelLastName.setText("Last Name:");

                labelCampus.setText("Campus:");

                btnBack.setText("Return to List View");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                btnNext.setText("Next");
                btnNext.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNextActionPerformed(evt);
                        }
                });

                btnSave.setText("Save");
                btnSave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSaveActionPerformed(evt);
                        }
                });

                btnPrev.setText("Previous");
                btnPrev.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPrevActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(labelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelCampus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnPrev)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnNext)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(fieldFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fieldLastName)
                                                        .addComponent(fieldCampus))
                                                .addGap(343, 343, 343))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCreate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSave)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBack)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelFirstName))
                                                .addGap(51, 51, 51))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(labelLastName)
                                                .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fieldCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelCampus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCreate)
                                        .addComponent(btnBack)
                                        .addComponent(btnNext)
                                        .addComponent(btnSave)
                                        .addComponent(btnPrev))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
//        personCntl.showResultTableUI();
	dispose();
        personCntl.getResultTableCntl().getResultTable().fireTableDataChanged();
        personCntl.getResultTableCntl().getResultTableUI().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
	    currentPerson = null;
	    showNewPersonUI();
    }//GEN-LAST:event_btnCreateActionPerformed

        private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
                personCntl.setCurentPerson(1);
		setCurrentPerson();
		parsePerson();
        }//GEN-LAST:event_btnNextActionPerformed

        private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
                personCntl.setCurentPerson(-1);
		setCurrentPerson();
		parsePerson();
        }//GEN-LAST:event_btnPrevActionPerformed

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                if (currentPerson != null) {
			personCntl.updatePerson(getFirstName(), getLastName(), getCampus());
		} else {
			personCntl.addPerson(getFirstName(), getLastName(), getCampus());
//			dispose();
//			personCntl.getResultTableCntl().getResultTable().fireTableDataChanged();
//			personCntl.getResultTableCntl().getResultTableUI().setVisible(true);
			showPersonUI();
			currentPerson = personCntl.getPersonList().getListOfPeople().get(personCntl.getPersonList().getListOfPeople().size() - 1);
			parsePerson();
		}
        }//GEN-LAST:event_btnSaveActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnCreate;
        private javax.swing.JButton btnNext;
        private javax.swing.JButton btnPrev;
        private javax.swing.JButton btnSave;
        private javax.swing.JTextField fieldCampus;
        private javax.swing.JTextField fieldFirstName;
        private javax.swing.JTextField fieldLastName;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel labelCampus;
        private javax.swing.JLabel labelFirstName;
        private javax.swing.JLabel labelLastName;
        // End of variables declaration//GEN-END:variables
}
