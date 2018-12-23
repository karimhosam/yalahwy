/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Chaos
 */
public class IModify extends javax.swing.JFrame implements ActionListener{
    ArrayList <JButton> buttons = new ArrayList<>();
    /**
     * Creates new form IModify
     */
    public IModify() {
        
        initComponents();
        resultpane.setLayout(new BoxLayout(resultpane, BoxLayout.Y_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultpane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YALAHWY.exe");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("My Posts");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 28, 228, -1));

        show.setBackground(new java.awt.Color(255, 153, 0));
        show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show.setText("Show My Posts");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 28, -1, -1));

        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 68, 138, -1));

        resultpane.setBackground(new java.awt.Color(51, 51, 51));
        resultpane.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 2, 5, 2, new java.awt.Color(0, 0, 0)));
        resultpane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultpane.setMaximumSize(new java.awt.Dimension(700, 400));
        resultpane.setMinimumSize(new java.awt.Dimension(700, 400));
        resultpane.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout resultpaneLayout = new javax.swing.GroupLayout(resultpane);
        resultpane.setLayout(resultpaneLayout);
        resultpaneLayout.setHorizontalGroup(
            resultpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        resultpaneLayout.setVerticalGroup(
            resultpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(resultpane);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 760, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/signupbackground.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        resultpane.removeAll();
        resultpane.revalidate();
        resultpane.repaint();
        buttons.clear();
        for (Integer i=0;i<SWE.posts.size();i++){
            if (SWE.posts.get(i).founder.equals(SWE.logedin.getemail())){
                JButton x = new JButton();
                JTextArea l= new JTextArea();
                l.setText(("Name: " + SWE.posts.get(i).post_details.getname()+"\n"
                + "Found Date: " + SWE.posts.get(i).post_details.getdate().getDate()+"/"+
                (SWE.posts.get(i).post_details.getdate().getMonth()+1)+"/"+
                (SWE.posts.get(i).post_details.getdate().getYear()+1900)+"\n"
                + "Catergory : " + SWE.posts.get(i).post_details.getcategory()));
                l.setEditable(false);
                x.setText("Modifiy");
                x.setActionCommand(i.toString());
                x.addActionListener(this);
                x.setBackground(Color.orange);
                resultpane.add(l);
                resultpane.add(x);
                buttons.add(x);
                resultpane.revalidate();
                resultpane.repaint();
            }
        }
        if (buttons.isEmpty()){
            JOptionPane.showMessageDialog(this, "Sorry But No Resutls Were Found", "Sorry", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_showActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       chooserfram back= new chooserfram();
       back.show();
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(IModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel resultpane;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        for (int i=0;i<buttons.size();i++){
            if (action.equals(buttons.get(i).getActionCommand())){
                ToModify newitem = new ToModify(Integer.parseInt(buttons.get(i).getActionCommand()));
                newitem.show();
                this.dispose();
                break;
            }
        }
    }
}
