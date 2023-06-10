
package EventManagementSystem;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Eventsection extends javax.swing.JFrame {

    /**
     * Creates new form Eventsection
     */
    public Eventsection() {
        super("Event Section");
        initComponents();
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createbt = new javax.swing.JButton();
        delbt = new javax.swing.JButton();
        opbt = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setMaximumSize(new java.awt.Dimension(700, 435));
        setMinimumSize(new java.awt.Dimension(700, 435));
        setPreferredSize(new java.awt.Dimension(700, 435));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createbt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createbt.setText("Create Event");
        createbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtActionPerformed(evt);
            }
        });
        getContentPane().add(createbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 243, 42));

        delbt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        delbt.setText("List of Events");
        delbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtActionPerformed(evt);
            }
        });
        getContentPane().add(delbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 321, 42));

        opbt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        opbt.setText("List of Participants");
        opbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opbtActionPerformed(evt);
            }
        });
        getContentPane().add(opbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 42));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 600, -1));

        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addbtn.setText("Add Participants to Event");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 42));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 600, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagementSystem/images/Incredible 5 Free Wallpaper Apps for Android to Refresh.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 435));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 435));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 435));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtActionPerformed
        // TODO add your handling code here:
        new CreateEvent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createbtActionPerformed

    private void delbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtActionPerformed
        // TODO add your handling code here:
        new ListofEvents().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_delbtActionPerformed

    private void opbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opbtActionPerformed
        new ListofParticipants().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opbtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        new AddParticipants().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addbtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new EventManagementSystem().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eventsection().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton createbt;
    private javax.swing.JButton delbt;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton opbt;
    // End of variables declaration//GEN-END:variables
}
