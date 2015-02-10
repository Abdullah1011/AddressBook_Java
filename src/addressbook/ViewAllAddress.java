/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package addressbook;

import javax.swing.JOptionPane;
import java.text.*;
import java.awt.print.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class ViewAllAddress extends javax.swing.JFrame {
        Connection conn = null;
        String url = "Jdbc:mysql://localhost:3306/";
        String dbName = "AddressBook";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "";
        
        ResultSet rs = null;
        PreparedStatement pst = null;
        
        String title, query;
    
    
    public ViewAllAddress(String title, String qurey) {
        this.title = title;
        this.query = qurey;
        initComponents();
        try{
            
        //Create Driver object
            Class.forName(driver).newInstance();
            //connection
            conn = DriverManager.getConnection(url+dbName,username,password);
            
            //statement
            Statement statement = conn.createStatement();
            //Create Driver object
            Class.forName(driver).newInstance();

            //connection
            conn = DriverManager.getConnection(url+dbName,username,password);

            
        }catch(Exception e){
            
        }
        
        update_table();
    }

    
    private void update_table(){
        try{

            String sql = query;
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            all_t.setModel(DbUtils.resultSetToTableModel(rs));


        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
     }
    
    
    public void printtable(){
        MessageFormat header = new MessageFormat("Report Print");

       MessageFormat footer = new MessageFormat("Page{0,number}");
       try{

        all_t.print(JTable.PrintMode.NORMAL, header, footer);

       }catch(java.awt.print.PrinterException e){
        System.err.format("Cannot Print %s%n", e.getMessage());
       }
    }
    
    
    public void SaveExcel(){
        try {
     ExcelExporter exp = new ExcelExporter();
     exp.exportTable(all_t, new File("E:\\results.xls"));
    }
    catch (IOException ex) {
     System.out.println(ex.getMessage());
     ex.printStackTrace();
    }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jMenu2 = new javax.swing.JMenu();
        search_m = new javax.swing.JMenu();
        user_m = new javax.swing.JMenu();
        about_m = new javax.swing.JMenu();
        aboutAddressBook_mi = new javax.swing.JMenuItem();
        developer_mi = new javax.swing.JMenuItem();
        help_m = new javax.swing.JMenu();
        backtoMain_m = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        all_t = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        file_m2 = new javax.swing.JMenu();
        newAddress_mi2 = new javax.swing.JMenuItem();
        updateaddress_mi2 = new javax.swing.JMenuItem();
        delete_mi2 = new javax.swing.JMenuItem();
        newUser_mi2 = new javax.swing.JMenuItem();
        chanepass_mi2 = new javax.swing.JMenuItem();
        logout_b2 = new javax.swing.JMenuItem();
        exit_mi2 = new javax.swing.JMenuItem();
        display_m2 = new javax.swing.JMenu();
        displayAll_mi2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        male_mi2 = new javax.swing.JMenuItem();
        female_mi2 = new javax.swing.JMenuItem();
        print_mi = new javax.swing.JMenuItem();
        exportE_mi = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        search_m2 = new javax.swing.JMenu();
        user_m2 = new javax.swing.JMenu();
        about_m2 = new javax.swing.JMenu();
        aboutAddressBook_mi2 = new javax.swing.JMenuItem();
        developer_mi2 = new javax.swing.JMenuItem();
        help_m2 = new javax.swing.JMenu();
        web_m = new javax.swing.JMenu();
        backtoMain_m2 = new javax.swing.JMenu();

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 0));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        file_m.setBackground(new java.awt.Color(0, 153, 153));
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

        jMenuBar1.add(display_m);

        jMenu2.setText("Update/Delete");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        search_m.setText("Advance Search");
        search_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(search_m);

        user_m.setText("User Info");
        user_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(user_m);

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

        backtoMain_m.setText("Back to Main");
        backtoMain_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtoMain_mMouseClicked(evt);
            }
        });
        jMenuBar1.add(backtoMain_m);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        all_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(all_t);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addressbook/pic/common.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar3.setBackground(new java.awt.Color(0, 102, 204));
        jMenuBar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        file_m2.setBackground(new java.awt.Color(0, 153, 153));
        file_m2.setForeground(new java.awt.Color(255, 255, 255));
        file_m2.setText("File");

        newAddress_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newAddress_mi2.setText("New Address");
        newAddress_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAddress_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(newAddress_mi2);

        updateaddress_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        updateaddress_mi2.setText("Update Address");
        updateaddress_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateaddress_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(updateaddress_mi2);

        delete_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        delete_mi2.setText("Delete Address");
        delete_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(delete_mi2);

        newUser_mi2.setText("New User");
        newUser_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUser_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(newUser_mi2);

        chanepass_mi2.setText("Change Password");
        chanepass_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanepass_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(chanepass_mi2);

        logout_b2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logout_b2.setText("Logout");
        logout_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_b2ActionPerformed(evt);
            }
        });
        file_m2.add(logout_b2);

        exit_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exit_mi2.setText("Exit");
        exit_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_mi2ActionPerformed(evt);
            }
        });
        file_m2.add(exit_mi2);

        jMenuBar3.add(file_m2);

        display_m2.setForeground(new java.awt.Color(255, 255, 255));
        display_m2.setText("View");

        displayAll_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        displayAll_mi2.setText("Display All Address");
        displayAll_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAll_mi2ActionPerformed(evt);
            }
        });
        display_m2.add(displayAll_mi2);

        jMenu5.setText("Displaly By Gender");

        male_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        male_mi2.setText("All Male");
        male_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_mi2ActionPerformed(evt);
            }
        });
        jMenu5.add(male_mi2);

        female_mi2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        female_mi2.setText("All Female");
        female_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_mi2ActionPerformed(evt);
            }
        });
        jMenu5.add(female_mi2);

        display_m2.add(jMenu5);

        print_mi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print_mi.setText("Print All Address");
        print_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_miActionPerformed(evt);
            }
        });
        display_m2.add(print_mi);

        exportE_mi.setText("Export to Excel ");
        exportE_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportE_miActionPerformed(evt);
            }
        });
        display_m2.add(exportE_mi);

        jMenuBar3.add(display_m2);

        jMenu6.setForeground(new java.awt.Color(255, 255, 255));
        jMenu6.setText("Update/Delete");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar3.add(jMenu6);

        search_m2.setForeground(new java.awt.Color(255, 255, 255));
        search_m2.setText("Advance Search");
        search_m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_m2MouseClicked(evt);
            }
        });
        jMenuBar3.add(search_m2);

        user_m2.setForeground(new java.awt.Color(255, 255, 255));
        user_m2.setText("User Info");
        user_m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_m2MouseClicked(evt);
            }
        });
        jMenuBar3.add(user_m2);

        about_m2.setForeground(new java.awt.Color(255, 255, 255));
        about_m2.setText("About");
        about_m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_m2ActionPerformed(evt);
            }
        });

        aboutAddressBook_mi2.setText("About this Address Book");
        aboutAddressBook_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutAddressBook_mi2ActionPerformed(evt);
            }
        });
        about_m2.add(aboutAddressBook_mi2);

        developer_mi2.setText("Developer Info");
        developer_mi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developer_mi2ActionPerformed(evt);
            }
        });
        about_m2.add(developer_mi2);

        jMenuBar3.add(about_m2);

        help_m2.setForeground(new java.awt.Color(255, 255, 255));
        help_m2.setText("Help");
        help_m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_m2MouseClicked(evt);
            }
        });
        help_m2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                help_m2MenuSelected(evt);
            }
        });
        help_m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_m2ActionPerformed(evt);
            }
        });
        jMenuBar3.add(help_m2);

        web_m.setForeground(new java.awt.Color(255, 255, 255));
        web_m.setText("Web");
        web_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                web_mMouseClicked(evt);
            }
        });
        jMenuBar3.add(web_m);

        backtoMain_m2.setBackground(new java.awt.Color(102, 255, 0));
        backtoMain_m2.setForeground(new java.awt.Color(255, 102, 255));
        backtoMain_m2.setText("Back to Main");
        backtoMain_m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtoMain_m2MouseClicked(evt);
            }
        });
        jMenuBar3.add(backtoMain_m2);

        setJMenuBar(jMenuBar3);

        setBounds(320, 130, 716, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void newAddress_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAddress_miActionPerformed
        AddNewAddress a = new AddNewAddress();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_newAddress_miActionPerformed

    private void updateaddress_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaddress_miActionPerformed
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_updateaddress_miActionPerformed

    private void delete_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_miActionPerformed
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_delete_miActionPerformed

    private void newUser_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUser_miActionPerformed
        user_mMouseClicked(null);
    }//GEN-LAST:event_newUser_miActionPerformed

    private void logout_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_bActionPerformed
        loginPage l  = new loginPage();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logout_bActionPerformed

    private void exit_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_miActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_miActionPerformed

    private void displayAll_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAll_miActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_displayAll_miActionPerformed

    private void male_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_miActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Male Person's Address","select * from person where gender = 'male' ");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_male_miActionPerformed

    private void female_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_miActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Female Person's Address","select * from person where gender = 'female' ");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_female_miActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        updateaddress_miActionPerformed(null);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void search_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_mMouseClicked
        AdvanceSearch as = new AdvanceSearch();
        as.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_search_mMouseClicked

    private void user_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_mMouseClicked

        UserInfo n = new UserInfo();
        n.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_user_mMouseClicked

    private void aboutAddressBook_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutAddressBook_miActionPerformed
        About about = new About(1);
        about.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_aboutAddressBook_miActionPerformed

    private void developer_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developer_miActionPerformed
        DeveloperInfo di = new DeveloperInfo(1);
        di.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_developer_miActionPerformed

    private void about_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_mActionPerformed

    }//GEN-LAST:event_about_mActionPerformed

    private void help_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_mMouseClicked
        Help h = new Help(1);
        h.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_help_mMouseClicked

    private void help_mMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_help_mMenuSelected

    }//GEN-LAST:event_help_mMenuSelected

    private void help_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_mActionPerformed

    }//GEN-LAST:event_help_mActionPerformed

    private void backtoMain_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoMain_mMouseClicked
        MainPage mp = new MainPage();
        mp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backtoMain_mMouseClicked

    private void newAddress_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAddress_mi2ActionPerformed
        AddNewAddress a = new AddNewAddress();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_newAddress_mi2ActionPerformed

    private void updateaddress_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaddress_mi2ActionPerformed
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_updateaddress_mi2ActionPerformed

    private void delete_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_mi2ActionPerformed
        Upadate u = new Upadate();
        u.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_delete_mi2ActionPerformed

    private void newUser_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUser_mi2ActionPerformed
        user_mMouseClicked(null);
    }//GEN-LAST:event_newUser_mi2ActionPerformed

    private void chanepass_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanepass_mi2ActionPerformed
        user_mMouseClicked(null);
    }//GEN-LAST:event_chanepass_mi2ActionPerformed

    private void logout_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_b2ActionPerformed
        loginPage l  = new loginPage();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logout_b2ActionPerformed

    private void exit_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_mi2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_mi2ActionPerformed

    private void displayAll_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAll_mi2ActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_displayAll_mi2ActionPerformed

    private void male_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_mi2ActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Male Person's Address","select * from person where gender = 'male' ");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_male_mi2ActionPerformed

    private void female_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_mi2ActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Female Person's Address","select * from person where gender = 'female' ");
        va.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_female_mi2ActionPerformed

    private void print_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_miActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.printtable();
    }//GEN-LAST:event_print_miActionPerformed

    private void exportE_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportE_miActionPerformed
        ViewAllAddress va = new ViewAllAddress("All Type of Address","select * from person");
        va.SaveExcel();
    }//GEN-LAST:event_exportE_miActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        updateaddress_miActionPerformed(null);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void search_m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_m2MouseClicked
        AdvanceSearch as = new AdvanceSearch();
        as.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_search_m2MouseClicked

    private void user_m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_m2MouseClicked

        UserInfo ui = new UserInfo();
        ui.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_user_m2MouseClicked

    private void aboutAddressBook_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutAddressBook_mi2ActionPerformed
        About about = new About(1);
        about.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_aboutAddressBook_mi2ActionPerformed

    private void developer_mi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developer_mi2ActionPerformed
        DeveloperInfo di = new DeveloperInfo(1);
        di.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_developer_mi2ActionPerformed

    private void about_m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_m2ActionPerformed

    }//GEN-LAST:event_about_m2ActionPerformed

    private void help_m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_m2MouseClicked
        Help h = new Help(1);
        h.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_help_m2MouseClicked

    private void help_m2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_help_m2MenuSelected

    }//GEN-LAST:event_help_m2MenuSelected

    private void help_m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_m2ActionPerformed

    }//GEN-LAST:event_help_m2ActionPerformed

    private void web_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_web_mMouseClicked
        try {
            String URL = "http://addressbook.abdullahalmizan.tk";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_web_mMouseClicked

    private void backtoMain_m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoMain_m2MouseClicked
        MainPage mp = new MainPage();
        mp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backtoMain_m2MouseClicked

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
            java.util.logging.Logger.getLogger(ViewAllAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllAddress(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutAddressBook_mi;
    private javax.swing.JMenuItem aboutAddressBook_mi2;
    private javax.swing.JMenu about_m;
    private javax.swing.JMenu about_m2;
    private javax.swing.JTable all_t;
    private javax.swing.JMenu backtoMain_m;
    private javax.swing.JMenu backtoMain_m2;
    private javax.swing.JMenuItem chanepass_mi;
    private javax.swing.JMenuItem chanepass_mi2;
    private javax.swing.JMenuItem delete_mi;
    private javax.swing.JMenuItem delete_mi2;
    private javax.swing.JMenuItem developer_mi;
    private javax.swing.JMenuItem developer_mi2;
    private javax.swing.JMenuItem displayAll_mi;
    private javax.swing.JMenuItem displayAll_mi2;
    private javax.swing.JMenu display_m;
    private javax.swing.JMenu display_m2;
    private javax.swing.JMenuItem exit_mi;
    private javax.swing.JMenuItem exit_mi2;
    private javax.swing.JMenuItem exportE_mi;
    private javax.swing.JMenuItem female_mi;
    private javax.swing.JMenuItem female_mi2;
    private javax.swing.JMenu file_m;
    private javax.swing.JMenu file_m2;
    private javax.swing.JMenu help_m;
    private javax.swing.JMenu help_m2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logout_b;
    private javax.swing.JMenuItem logout_b2;
    private javax.swing.JMenuItem male_mi;
    private javax.swing.JMenuItem male_mi2;
    private javax.swing.JMenuItem newAddress_mi;
    private javax.swing.JMenuItem newAddress_mi2;
    private javax.swing.JMenuItem newUser_mi;
    private javax.swing.JMenuItem newUser_mi2;
    private javax.swing.JMenuItem print_mi;
    private javax.swing.JMenu search_m;
    private javax.swing.JMenu search_m2;
    private javax.swing.JMenuItem updateaddress_mi;
    private javax.swing.JMenuItem updateaddress_mi2;
    private javax.swing.JMenu user_m;
    private javax.swing.JMenu user_m2;
    private javax.swing.JMenu web_m;
    // End of variables declaration//GEN-END:variables
}


class ExcelExporter {
 public ExcelExporter() {}
 public void exportTable(JTable table, File file) throws IOException {
  TableModel model = table.getModel();
  FileWriter out = new FileWriter(file);

  for(int i=0; i < model.getColumnCount();i++) {
   out.write(model.getColumnName(i)+"\t");
 }
 out.write("\n");

 for(int i=0; i < model.getRowCount();i++){
  for(int j=0;j < model.getColumnCount();j++){
//   I added this check for the ISBN conversion
   if(j==0) {
//    the book Title
    out.write(model.getValueAt(i,j).toString() + "\t");
   } else {

    out.write("\""+model.getValueAt(i, j).toString()+"\t"+"\"");
   }
  }
  out.write("\n");
 }
 out.close();
 JOptionPane.showMessageDialog(null, "File Created to: "+file);
 //System.out.println("write to " + file);
}
}