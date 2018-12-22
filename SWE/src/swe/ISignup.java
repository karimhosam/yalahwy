/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author karim
 */
public class ISignup extends javax.swing.JFrame {

    /**
     * Creates new form ISignup
     */SWE main=new SWE();
    public ISignup() {
        initComponents();
        name.setBackground(new Color(0,0,0,80));
        email.setBackground(new Color(0,0,0,80));
        pass.setBackground(new Color(0,0,0,80));
        pass2.setBackground(new Color(0,0,0,80));
        num.setBackground(new Color(0,0,0,80));
        email_label.setVisible(false);
        phone_label.setVisible(false);
        pass_label.setVisible(false); 
        name_label.setVisible(false);
        pass.setEchoChar((char)0);
        pass2.setEchoChar((char)0);     
        check.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        pass_label = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        name_label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YALAHWY.exe");
        setPreferredSize(new java.awt.Dimension(810, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setBackground(new java.awt.Color(255, 153, 51));
        submit.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        submit.setText("Sign Up");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 240, 40));

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setText("Enter Name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 340, 40));

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Example@example.com");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 340, 40));

        num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num.setForeground(new java.awt.Color(153, 153, 153));
        num.setText("Enter Your Phone Number");
        num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numFocusLost(evt);
            }
        });
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        getContentPane().add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 340, 40));

        phone_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone_label.setForeground(new java.awt.Color(255, 51, 51));
        phone_label.setText("wrong number");
        getContentPane().add(phone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 100, 30));

        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 51, 51));
        name_label.setText("Enter a Name");
        getContentPane().add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 100, 40));

        check.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 153, 0));
        check.setText("show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 130, 40));

        pass_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(255, 0, 51));
        pass_label.setText("password does not match");
        getContentPane().add(pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 170, 30));

        pass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass2.setForeground(new java.awt.Color(153, 153, 153));
        pass2.setText("Confirm Password");
        pass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass2FocusLost(evt);
            }
        });
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        getContentPane().add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 340, 40));

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setText("Enter Password");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 340, 40));

        name_label1.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        name_label1.setForeground(new java.awt.Color(255, 153, 0));
        name_label1.setText("Name :");
        getContentPane().add(name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 110, 20));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Create Account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 560, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_1rsz_orangprofile.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_orangemail.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_orangepass.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_orangepass.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 50, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_orangetelephone.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 50, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Password :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 100, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Confirmation :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 50, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Number :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Please Fill in this Form to Create an Account !");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 450, -1));

        email_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 51, 51));
        email_label.setText("wrong email");
        getContentPane().add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, 40));

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        back.setText("Back !");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 240, 40));

        background.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        background.setForeground(new java.awt.Color(204, 204, 204));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/signupbackground.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(pass.getText().equals("Enter Password")||pass2.getText().equals("Confirm Password")||name_label.isVisible()||num.getText().equals("Enter Your Phone Number")||email.getText().equals("Example@example.com"))
        {
            JOptionPane.showMessageDialog(null, "there is somthing wrong", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Signup sign=new Signup();
            sign.user.setname(name.getText());
            sign.user.setemail(email.getText());
            sign.user.setpass(pass.getText());
            sign.user.setphone(Integer.parseInt(num.getText()));
         
            if(sign.checkvalid())
            {
                try {
                    sign.setdata();
                } catch (IOException ex) {
                    Logger.getLogger(ISignup.class.getName()).log(Level.SEVERE, null, ex);
                }
                mainfram next=new mainfram();
                next.show();
                this.dispose();
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().equals("")){
            email.setText("Example@example.com");
            email_label.setVisible(true);
            email.setForeground(new Color(153,153,153));
        }
        else {
            int cnt=0;
            int idxdot=0;
            int idxat=0;
            for(int i=0;i< email.getText().length();i++)
            {
                if(email.getText().charAt(i)=='@')
                {    
                    idxat=i;
                    cnt++;
                }
                if(email.getText().charAt(i)=='.')
                    idxdot=i;
            }

            if(cnt!=1||idxat>=idxdot-1||idxdot==email.getText().length()-1)
            {
               email_label.setVisible(true);
            }
            else
               email_label.setVisible(false);
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_emailActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email_label.setVisible(false);
        if (email.getText().equals("Example@example.com")){
            email.setText("");
            email.setForeground(Color.white);
        }
    }//GEN-LAST:event_emailFocusGained

    private void numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusLost
        if (num.getText().equals("")){
            num.setText("Enter Your Phone Number");
            num.setForeground(new Color(153,153,153));
            phone_label.setVisible(true);
        }
        if(num.getText().length()!=11)
        {
            phone_label.setVisible(true);
        }
    }//GEN-LAST:event_numFocusLost

    private void numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusGained
        phone_label.setVisible(false);
        if (num.getText().equals("Enter Your Phone Number")){
            num.setText("");
            num.setForeground(Color.white);
        }
    }//GEN-LAST:event_numFocusGained

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
        char c=evt.getKeyChar();
        if((!(Character.isDigit(c)))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
          evt.consume();
    }//GEN-LAST:event_numKeyTyped

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if (check.isSelected())
        {
            pass.setEchoChar((char)0);
            pass2.setEchoChar((char)0);
        }
        else
        {
            if (!pass.getText().equals("Enter Password"))
                pass.setEchoChar('*');
            if (!pass2.getText().equals("Confirm Password"))
                pass2.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void pass2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusLost
        if(!pass2.getText().equals(pass.getText()))
            pass_label.setVisible(true);
        if (pass2.getText().equals("")){
            pass2.setEchoChar((char)0);
            pass2.setText("Confirm Password");
            pass2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_pass2FocusLost

    private void pass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass2FocusGained
         pass_label.setVisible(false);
         if (pass2.getText().equals("Confirm Password")){
             pass2.setText("");
             pass2.setEchoChar('*');
             pass2.setForeground(Color.white);
         }
    }//GEN-LAST:event_pass2FocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if(name.getText().equals("")){
            name_label.setVisible(true);
            name.setForeground(new Color(153,153,153));
            name.setText("Enter Name");
        }
    }//GEN-LAST:event_nameFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        name_label.setVisible(false);
        if (name.getText().equals("Enter Name")){
            name.setText("");
            name.setForeground(Color.white);
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        pass_label.setVisible(false);
        if (pass.getText().equals("Enter Password")){
            pass.setText("");
            pass.setEchoChar('*');
            pass.setForeground(Color.white);
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        if (pass.getText().equals("")){
            pass.setEchoChar((char)0);
            pass.setText("Enter Password");
            pass_label.setVisible(true);
            pass.setForeground(new Color(153,153,153));
        }
        if (!pass.getText().equals(pass2.getText()))
            pass_label.setVisible(true);
    }//GEN-LAST:event_passFocusLost

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        mainfram next = new mainfram();
        next.show();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ISignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISignup().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JCheckBox check;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_label1;
    private javax.swing.JTextField num;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel pass_label;
    private javax.swing.JLabel phone_label;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
