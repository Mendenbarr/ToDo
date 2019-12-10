/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUIComponents.Task;
import GUIComponents.TaskListControl;
import GUIComponents.TaskListModel;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author 01048750
 */
public class List extends javax.swing.JFrame {
    JFileChooser chooser = new JFileChooser();
    /**
     * Creates new form MainGUI
     */
    public List() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jTabbedPane = new javax.swing.JTabbedPane();
        taskListControl1 = new GUIComponents.TaskListControl();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        newList = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        load = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To Do List");

        jTabbedPane.addTab("1", taskListControl1);

        getContentPane().add(jTabbedPane, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");

        newList.setText("New Task List");
        newList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newListActionPerformed(evt);
            }
        });
        menuFile.add(newList);

        save.setText("Save List to Data Store");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        menuFile.add(save);

        load.setText("Load List From Data Store");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        menuFile.add(load);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuFile.add(exit);

        jMenuBar1.add(menuFile);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1018, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void newListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newListActionPerformed
        jTabbedPane.addTab(Integer.toString(jTabbedPane.getTabCount()+1), null, new TaskListControl());
    }//GEN-LAST:event_newListActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        load();
    }//GEN-LAST:event_loadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }
    

    public void save() {
        int retValue = chooser.showSaveDialog(this);
        if (retValue == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            writeListToFile(f);
        }
    }

    public void load() {
        int retValue = chooser.showOpenDialog(this);
        if (retValue == JFileChooser.APPROVE_OPTION) {

            File f = chooser.getSelectedFile();
            readFileToList(f);

        }
    }
    // From https://coderanch.com/t/344337/java/Loading-Saving-Listbox
    private void readFileToList(File file) {
        try {
            jTabbedPane.addTab(Integer.toString(jTabbedPane.getTabCount()+1), null, new TaskListControl());
            TaskListControl tab = (TaskListControl) jTabbedPane.getComponentAt(jTabbedPane.getTabCount()-1);
            TaskListModel model = tab.getModel();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file)));
            String line;
            while ((line = br.readLine()) != null) {
                boolean checked;
                if (line.contains("true")) {
                    line = line.replaceFirst("true", "");
                    checked = true;

                } else {
                    line = line.replaceFirst("false", "");
                    checked = false;
                }
                model.addElement(new Task(line));
                Task task = (Task) model.getElementAt(model.size()-1);
                task.checkBox(checked);

            }
            jTabbedPane.setSelectedComponent(tab);
            br.close();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }

    private void writeListToFile(File file) {
        if (file.exists()) {
            // TODO check with user via JOptionPane.showConfirmDialog
            // before overwriting the file.
            System.out.println("File " + file.getPath() + " exists");
        }
        TaskListControl tab = (TaskListControl) jTabbedPane.getSelectedComponent();
        TaskListModel model = tab.getModel();

        try {
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(file)));
            for (int j = 0; j < model.getSize(); j++) {
                String line = model.getElementAt(j).toString();
                bw.write(line, 0, line.length());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JMenuItem load;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem newList;
    private javax.swing.JMenuItem save;
    private GUIComponents.TaskListControl taskListControl1;
    // End of variables declaration//GEN-END:variables
}
