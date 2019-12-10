/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIComponents;
// Icon taken from https://www.flaticon.com/packs/essential-collection/6

import java.io.Serializable;



/**
 *
 * @author 01048750
 */
public class Task extends javax.swing.JPanel implements Serializable {

    /**
     * Creates new form Task
     */
    public Task() {
        initComponents();
        //btnClose.setImage("Images\\close.png");
    }
    
    public Task(String name){
        this();
        setNameText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskName = new javax.swing.JLabel();
        checkBoxDone = new javax.swing.JCheckBox();

        taskName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        taskName.setText("Task 1");

        checkBoxDone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checkBoxDone.setText("Complete");
        checkBoxDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(checkBoxDone)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskName)
                    .addComponent(checkBoxDone))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxDoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxDone;
    private javax.swing.JLabel taskName;
    // End of variables declaration//GEN-END:variables

    public void setNameText(String name){
        taskName.setText(name);
    }
    
    public void checkBox(boolean check){
        checkBoxDone.setSelected(check);
    }
    
    public boolean boxChecked(){
        return checkBoxDone.isSelected();
    }
    
    @Override
    public String toString(){
        return boxChecked() + taskName.getText();
    }


}
