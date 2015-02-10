
package addressbook;

import sun.audio.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Help extends javax.swing.JFrame {

    int level = 0;
  
    public Help(int value) {
        level = value;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_m = new javax.swing.JMenu();
        newAddress_mi = new javax.swing.JMenuItem();
        updateaddress_mi = new javax.swing.JMenuItem();
        delete_mi = new javax.swing.JMenuItem();
        newUser_mi = new javax.swing.JMenuItem();
        chanepass_mi = new javax.swing.JMenuItem();
        logout_b = new javax.swing.JMenuItem();
        exit_mi = new javax.swing.JMenuItem();
        display_m = new javax.swing.JMenu();
        displayAll_mi = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        male_mi = new javax.swing.JMenuItem();
        female_mi = new javax.swing.JMenuItem();
        print_mi = new javax.swing.JMenuItem();
        exportE_mi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        search_m = new javax.swing.JMenu();
        user_m = new javax.swing.JMenu();
        about_m = new javax.swing.JMenu();
        aboutAddressBook_mi = new javax.swing.JMenuItem();
        developer_mi = new javax.swing.JMenuItem();
        help_m = new javax.swing.JMenu();
        web_m = new javax.swing.JMenu();
        backtoMain_m = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addressbook/pic/helppage.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 330));

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        file_m.setBackground(new java.awt.Color(0, 153, 153));
        file_m.setForeground(new java.awt.Color(255, 255, 255));
        file_m.setText("File");

        newAddress_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newAddress_mi.setText("New Address");
        newAddress_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAddress_miActionPerformed(evt);
            }
        });
        file_m.add(newAddress_mi);

        updateaddress_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        updateaddress_mi.setText("Update Address");
        updateaddress_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateaddress_miActionPerformed(evt);
            }
        });
        file_m.add(updateaddress_mi);

        delete_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        delete_mi.setText("Delete Address");
        delete_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_miActionPerformed(evt);
            }
        });
        file_m.add(delete_mi);

        newUser_mi.setText("New User");
        newUser_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUser_miActionPerformed(evt);
            }
        });
        file_m.add(newUser_mi);

        chanepass_mi.setText("Change Password");
        chanepass_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanepass_miActionPerformed(evt);
            }
        });
        file_m.add(chanepass_mi);

        logout_b.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout_b.setText("Logout");
        logout_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_bActionPerformed(evt);
            }
        });
        file_m.add(logout_b);

        exit_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exit_mi.setText("Exit");
        exit_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_miActionPerformed(evt);
            }
        });
        file_m.add(exit_mi);

        jMenuBar1.add(file_m);

        display_m.setForeground(new java.awt.Color(255, 255, 255));
        display_m.setText("View");

        displayAll_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        displayAll_mi.setText("Display All Address");
        displayAll_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAll_miActionPerformed(evt);
            }
        });
        display_m.add(displayAll_mi);

        jMenu1.setText("Displaly By Gender");

        male_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        male_mi.setText("All Male");
        male_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_miActionPerformed(evt);
            }
        });
        jMenu1.add(male_mi);

        female_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        female_mi.setText("All Female");
        female_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_miActionPerformed(evt);
            }
        });
        jMenu1.add(female_mi);

        display_m.add(jMenu1);

        print_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print_mi.setText("Print All Address");
        print_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_miActionPerformed(evt);
            }
        });
        display_m.add(print_mi);

        exportE_mi.setText("Export to Excel ");
        exportE_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportE_miActionPerformed(evt);
            }
        });
        display_m.add(exportE_mi);

        jMenuBar1.add(display_m);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Update/Delete");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        search_m.setForeground(new java.awt.Color(255, 255, 255));
        search_m.setText("Advance Search");
        search_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(search_m);

        user_m.setForeground(new java.awt.Color(255, 255, 255));
        user_m.setText("User Info");
        user_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(user_m);

        about_m.setForeground(new java.awt.Color(255, 255, 255));
        about_m.setText("About");
        about_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_mActionPerformed(evt);
            }
        });

        aboutAddressBook_mi.setText("About this Address Book");
        aboutAddressBook_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutAddressBook_miActionPerformed(evt);
            }
        });
        about_m.add(aboutAddressBook_mi);

        developer_mi.setText("Developer Info");
        developer_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developer_miActionPerformed(evt);
            }
        });
        about_m.add(developer_mi);

        jMenuBar1.add(about_m);

        help_m.setForeground(new java.awt.Color(255, 255, 255));
        help_m.setText("Help");
        help_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_mMouseClicked(evt);
            }
        });
        help_m.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                help_mMenuSelected(evt);
            }
        });
        help_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_mActionPerformed(evt);
            }
        });
        jMenuBar1.add(help_m);

        web_m.setForeground(new java.awt.Color(255, 255, 255));
        web_m.setText("Web");
        web_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                web_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(web_m);

        backtoMain_m.setBackground(new java.awt.Color(102, 255, 0));
        backtoMain_m.setForeground(new java.awt.Color(255, 102, 255));
        backtoMain_m.setText("Back to Main");
        backtoMain_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtoMain_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(backtoMain_m);

        setJMenuBar(jMenuBar1);

        setBounds(320, 130, 716, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void newAddress_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAddress_miActionPerformed
        
        if(level == 1){
        AddNewAddress a = new AddNewAddress();
        a.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
        }
        
    }//GEN-LAST:event_newAddress_miActionPerformed

    private void updateaddress_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaddress_miActionPerformed
        if(level == 1){
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
        }
    }//GEN-LAST:event_updateaddress_miActionPerformed

    private void delete_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_miActionPerformed
         if(level == 1){
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
        }
    }//GEN-LAST:event_delete_miActionPerformed

    private void newUser_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUser_miActionPerformed
        user_mMouseClicked(null);
    }//GEN-LAST:event_newUser_miActionPerformed

    private void chanepass_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanepass_miActionPerformed
        user_mMouseClicked(null);
    }//GEN-LAST:event_chanepass_miActionPerformed

    private void logout_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bActionPerformed
        loginPage l  = new loginPage();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logout_bActionPerformed

    private void exit_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_miActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_miActionPerformed

    private void displayAll_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAll_miActionPerformed
         if(level == 1){
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
        }
        
    }//GEN-LAST:event_displayAll_miActionPerformed

    private void male_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_miActionPerformed
         if(level == 1){
        ViewAllAddress va = new ViewAllAddress("All Male Person's Address","select * from person where gender = 'male' ");
        va.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }        
    }//GEN-LAST:event_male_miActionPerformed

    private void female_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_miActionPerformed
         if(level == 1){
        ViewAllAddress va = new ViewAllAddress("All Male Person's Address","select * from person where gender = 'female' ");
        va.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }
    }//GEN-LAST:event_female_miActionPerformed

    private void print_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_miActionPerformed
         if(level == 1){
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.printtable();
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }
        
    }//GEN-LAST:event_print_miActionPerformed

    private void exportE_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportE_miActionPerformed
        if(level == 1){
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.SaveExcel();
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }
        
    }//GEN-LAST:event_exportE_miActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        updateaddress_miActionPerformed(null);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void search_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_mMouseClicked
        if(level == 1){
        AdvanceSearch as = new AdvanceSearch();
        as.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }
    }//GEN-LAST:event_search_mMouseClicked

    private void user_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_mMouseClicked

        if(level == 1){
        UserInfo ui = new UserInfo();
        ui.setVisible(true);
        setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"You don't have permisson, Please Login");
         }
        
    }//GEN-LAST:event_user_mMouseClicked

    private void aboutAddressBook_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutAddressBook_miActionPerformed

         if(level == 1){
         About about = new About(1);
        about.setVisible(true);
        setVisible(false);   
        }else{
        About about = new About(0);
        about.setVisible(true);
        setVisible(false);      
        }
        
        
    }//GEN-LAST:event_aboutAddressBook_miActionPerformed

    private void developer_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developer_miActionPerformed

        if(level == 1){
         DeveloperInfo di = new DeveloperInfo(1);
        di.setVisible(true);
        setVisible(false);   
        }else{
        DeveloperInfo di = new DeveloperInfo(0);
        di.setVisible(true);
        setVisible(false);    
        }
    }//GEN-LAST:event_developer_miActionPerformed

    private void about_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_mActionPerformed

    }//GEN-LAST:event_about_mActionPerformed

    private void help_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_mMouseClicked
        if(level == 1){
         Help h = new Help(1);
        h.setVisible(true);
        setVisible(false);   
        }else{
        Help h = new Help(0);
        h.setVisible(true);
        setVisible(false);   
        }
       
    }//GEN-LAST:event_help_mMouseClicked

    private void help_mMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_help_mMenuSelected

    }//GEN-LAST:event_help_mMenuSelected

    private void help_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_mActionPerformed

    }//GEN-LAST:event_help_mActionPerformed

    private void web_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_web_mMouseClicked
        try {
            String URL = "http://addressbook.abdullahalmizan.tk";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_web_mMouseClicked

    private void backtoMain_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoMain_mMouseClicked
        if(level == 1){
        MainPage mp = new MainPage();
        mp.setVisible(true);
        setVisible(false);
        }else{
            Guest g = new Guest();
       g.setVisible(true);
        setVisible(false);
         }
        
        
        
    }//GEN-LAST:event_backtoMain_mMouseClicked

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutAddressBook_mi;
    private javax.swing.JMenu about_m;
    private javax.swing.JMenu backtoMain_m;
    private javax.swing.JMenuItem chanepass_mi;
    private javax.swing.JMenuItem delete_mi;
    private javax.swing.JMenuItem developer_mi;
    private javax.swing.JMenuItem displayAll_mi;
    private javax.swing.JMenu display_m;
    private javax.swing.JMenuItem exit_mi;
    private javax.swing.JMenuItem exportE_mi;
    private javax.swing.JMenuItem female_mi;
    private javax.swing.JMenu file_m;
    private javax.swing.JMenu help_m;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout_b;
    private javax.swing.JMenuItem male_mi;
    private javax.swing.JMenuItem newAddress_mi;
    private javax.swing.JMenuItem newUser_mi;
    private javax.swing.JMenuItem print_mi;
    private javax.swing.JMenu search_m;
    private javax.swing.JMenuItem updateaddress_mi;
    private javax.swing.JMenu user_m;
    private javax.swing.JMenu web_m;
    // End of variables declaration//GEN-END:variables
}
