package authentication;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    Database dbb=new Database();
   public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextRef = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAct = new javax.swing.JTextArea();
        jButtonNext = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelInfo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabelInfo.setForeground(new java.awt.Color(0, 51, 102));
        jLabelInfo.setText("Registration Form");

        jTextRef.setEditable(false);
        jTextRef.setColumns(20);
        jTextRef.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTextRef.setLineWrap(true);
        jTextRef.setRows(5);
        jTextRef.setText("hello user please enter this text in the field below to measure your keystroke average");
        jTextRef.setWrapStyleWord(true);
        jTextRef.setBorder(null);
        jTextRef.setEnabled(false);
        jScrollPane1.setViewportView(jTextRef);

        jTextAct.setColumns(20);
        jTextAct.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextAct.setLineWrap(true);
        jTextAct.setRows(5);
        jTextAct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextActKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextActKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAct);

        jButtonNext.setText("Register");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Username : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabelInfo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNext))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    authentication.KeyStroke collector = new KeyStroke();

    private void jTextActKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextActKeyPressed
        collector.press(evt);
    }//GEN-LAST:event_jTextActKeyPressed

    private void jTextActKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextActKeyReleased
        collector.release(evt);
        
    }//GEN-LAST:event_jTextActKeyReleased

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextAct.setText("");
        collector = new KeyStroke();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if (jTextRef.getText().equals(jTextAct.getText())) {
            
            
            //try {
                String uname=jTextField1.getText();
                if(uname.isEmpty()){//check username is empty
                
                JOptionPane.showMessageDialog(this, "Please Enter the User name! ", "Error", JOptionPane.ERROR_MESSAGE);
            
                }
                
                else{
                System.out.println(uname);
                System.out.println("Durations "+collector.dur.toString());
                System.out.println("Mean Duration: "+collector.mean(collector.dur));
                System.out.println("Mean Fly time: "+collector.mean(collector.fly_times));
                boolean not_exist=dbb.insert(uname, collector.mean(collector.dur), collector.mean(collector.fly_times));
            if(!not_exist){
            
            JOptionPane.showMessageDialog(this, "This user name is already exists! ", "Error", JOptionPane.ERROR_MESSAGE);
            
            }     
            else{
            new Login().setVisible(true);

            this.dispose();}
                }
                
        } else {
            JOptionPane.showMessageDialog(this, "Please enter the correct text. ");
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAct;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTextRef;
    // End of variables declaration//GEN-END:variables
}
