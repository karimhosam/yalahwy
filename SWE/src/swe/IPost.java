/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import com.toedter.calendar.JTextFieldDateEditor;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author karim
 */
public class IPost extends javax.swing.JFrame {

    /**
     * Creates new form IPost
     */
    SWE main=new SWE();
    File f=null;
    public IPost() {
        initComponents();
        finddate.setDateFormatString("dd/MM/yy");
        name_label.setVisible(false);
        pic_label.setVisible(false);
        date_label.setVisible(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) finddate.getDateEditor();
        editor.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        picdic = new javax.swing.JButton();
        photodic = new javax.swing.JTextField();
        finddate = new com.toedter.calendar.JDateChooser();
        submit = new javax.swing.JButton();
        name_label = new javax.swing.JLabel();
        pic_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobiles", "Keys", "Wallets", "Accsesories", "Others" }));

        picdic.setText("browse");
        picdic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picdicActionPerformed(evt);
            }
        });

        photodic.setEditable(false);
        photodic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photodicActionPerformed(evt);
            }
        });

        finddate.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                finddateComponentAdded(evt);
            }
        });
        finddate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                finddateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                finddateFocusLost(evt);
            }
        });
        finddate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finddateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finddateMouseEntered(evt);
            }
        });

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        name_label.setForeground(new java.awt.Color(255, 51, 51));
        name_label.setText("please enter a name");

        pic_label.setForeground(new java.awt.Color(255, 51, 51));
        pic_label.setText("please enter a photo");

        date_label.setForeground(new java.awt.Color(255, 51, 51));
        date_label.setText("please pick a date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(finddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(photodic, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name)
                                .addComponent(picdic, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(pic_label)
                    .addComponent(date_label))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(picdic)
                            .addComponent(photodic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic_label))
                        .addGap(18, 18, 18)
                        .addComponent(finddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date_label))
                .addGap(31, 31, 31)
                .addComponent(submit)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void picdicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picdicActionPerformed
        JFileChooser pic=new JFileChooser();
        
        if(pic.showOpenDialog(null)==0)
        {
            f=pic.getSelectedFile();
            photodic.setText(f.toString());
        }
    }//GEN-LAST:event_picdicActionPerformed

    private void photodicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photodicActionPerformed
        
    }//GEN-LAST:event_photodicActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(finddate.getDate()==null)
            date_label.setVisible(true);
        else
            date_label.setVisible(false);
        if(name_label.isVisible()||pic_label.isVisible()||date_label.isVisible())
        {
            JOptionPane.showMessageDialog(null, "there is somthing wrong", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Post post=new Post();
            post.post_details.setname(name.getText());
            post.post_details.setdate(finddate.getDate());
            post.post_details.setcategory((String) cat.getSelectedItem());
            post.post_details.setphoto(f.toString());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if(name.getText().equals(""))
            name_label.setVisible(true);        
    }//GEN-LAST:event_nameFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        name_label.setVisible(false);       
    }//GEN-LAST:event_nameFocusGained

    private void finddateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finddateFocusGained
       
    }//GEN-LAST:event_finddateFocusGained

    private void finddateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finddateFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_finddateFocusLost

    private void finddateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finddateMouseClicked

    }//GEN-LAST:event_finddateMouseClicked

    private void finddateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finddateMouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_finddateMouseEntered

    private void finddateComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_finddateComponentAdded

    }//GEN-LAST:event_finddateComponentAdded

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
            java.util.logging.Logger.getLogger(IPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JLabel date_label;
    private com.toedter.calendar.JDateChooser finddate;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField photodic;
    private javax.swing.JLabel pic_label;
    private javax.swing.JButton picdic;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}