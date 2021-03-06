/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Chaos
 */
public class Isearch extends javax.swing.JFrame implements ActionListener{

    Search newSearch = new Search();
    ArrayList<JButton> buttons = new ArrayList<>();
    

    /**
     * Creates new form Isearch
     */
    public Isearch() {
        initComponents();
        resultpane.setLayout(new BoxLayout(resultpane, BoxLayout.Y_AXIS));
        JTextFieldDateEditor editor = (JTextFieldDateEditor) finddate.getDateEditor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cat = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        finddate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultpane = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YALAHWY.exe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobiles", "Keys", "Wallets", "Accsesories", "Others" }));
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 570, 40));

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 106, 40));

        finddate.setDateFormatString("dd/MM/yyyy");
        finddate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        getContentPane().add(finddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 70, 570, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_open-in-browser-icon-11-256.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        resultpane.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout resultpaneLayout = new javax.swing.GroupLayout(resultpane);
        resultpane.setLayout(resultpaneLayout);
        resultpaneLayout.setHorizontalGroup(
            resultpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        resultpaneLayout.setVerticalGroup(
            resultpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(resultpane);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 155, 750, 350));

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 106, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/rsz_7_calendar_date_year_event_schedule_link_holiday-512.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swe/pics/mainframbackground.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 810, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finddateComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_finddateComponentAdded

    }//GEN-LAST:event_finddateComponentAdded

    private void finddateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finddateFocusGained

    }//GEN-LAST:event_finddateFocusGained

    private void finddateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_finddateFocusLost

    }//GEN-LAST:event_finddateFocusLost

    private void finddateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finddateMouseClicked

    }//GEN-LAST:event_finddateMouseClicked

    private void finddateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finddateMouseEntered

    }//GEN-LAST:event_finddateMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resultpane.removeAll();
        resultpane.revalidate();
        resultpane.repaint();
        buttons.clear();
        
        if (finddate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "there is somthing wrong", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < SWE.posts.size(); i++) { 
                int lock = 0;
                if (((String) cat.getSelectedItem()).equals(SWE.posts.get(i).post_details.getcategory())) {
                    if (finddate.getDate().getYear() <= SWE.posts.get(i).post_details.getdate().getYear()) {
                        if (finddate.getDate().getYear() == SWE.posts.get(i).post_details.getdate().getYear()) {
                            if (finddate.getDate().getMonth() <= SWE.posts.get(i).post_details.getdate().getMonth()) {
                                if (finddate.getDate().getMonth() == SWE.posts.get(i).post_details.getdate().getMonth()) {
                                    if (finddate.getDate().getDate() <= SWE.posts.get(i).post_details.getdate().getDate()) {
                                        lock = 1;
                                    }
                                } else {
                                    lock = 1;
                                }
                            }
                        } else {
                            lock = 1;
                        }
                    }
                    if (lock == 1) {
                        JButton x = new JButton();
                        JTextArea l= new JTextArea();
                        l.setText(("Name: " + SWE.posts.get(i).post_details.getname()+"\n"
                                + "Found Date: " + SWE.posts.get(i).post_details.getdate().getDate()+"/"+
                                (SWE.posts.get(i).post_details.getdate().getMonth()+1)+"/"+
                                (SWE.posts.get(i).post_details.getdate().getYear()+1900)+"\n"
                                + "Catergory : " + SWE.posts.get(i).post_details.getcategory()));
                        l.setEditable(false);
                        x.setText("More Details");
                        Integer xx=SWE.posts.get(i).getid();
                        x.setActionCommand(xx.toString());
                        x.addActionListener(this);
                        x.setBackground(Color.orange);
                        resultpane.add(l);
                        resultpane.add(x);
                        buttons.add(x);
                        resultpane.revalidate();
                        resultpane.repaint();
                    }
                }
            }
            if (buttons.isEmpty()){
                JOptionPane.showMessageDialog(this, "Sorry But No Resutls Were Found", "Sorry", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        chooserfram next= new chooserfram();
        next.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Isearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Isearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Isearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Isearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Isearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private com.toedter.calendar.JDateChooser finddate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel resultpane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        for (int i=0;i<buttons.size();i++){
            if (action.equals(buttons.get(i).getActionCommand())){
                Iitem newitem = new Iitem(Integer.parseInt(buttons.get(i).getActionCommand()));
                newitem.show();
                this.dispose();
                break;
            }
        }
    }

}
