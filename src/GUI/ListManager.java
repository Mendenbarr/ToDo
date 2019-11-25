/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author 01048750
 */
public class ListManager extends javax.swing.JFrame {

    /**
     * Creates new form ListManager
     */
    public ListManager() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        listMini3 = new GUIComponents.ListMini();
        listMini4 = new GUIComponents.ListMini();
        listMini2 = new GUIComponents.ListMini();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        newList = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        load = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        listManager = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(15, 0));
        jPanel1.add(listMini3);
        jPanel1.add(listMini4);
        jPanel1.add(listMini2);

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        menuFile.setText("File");

        newList.setText("New Task List");
        menuFile.add(newList);

        save.setText("Save List to Data Store");
        menuFile.add(save);

        load.setText("Load List From Data Store");
        menuFile.add(load);

        exit.setText("Exit");
        menuFile.add(exit);

        jMenuBar1.add(menuFile);

        menuView.setText("View");

        listManager.setText("List Manager");
        menuView.add(listManager);

        jMenuBar1.add(menuView);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 560, 578);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem listManager;
    private GUIComponents.ListMini listMini2;
    private GUIComponents.ListMini listMini3;
    private GUIComponents.ListMini listMini4;
    private javax.swing.JMenuItem load;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem newList;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables
}
