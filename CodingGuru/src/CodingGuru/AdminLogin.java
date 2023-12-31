/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingGuru;

import javax.swing.JOptionPane;

/**
 *
 * @author Yogeesh
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        Submit1 = new javax.swing.JButton();
        Submit2 = new javax.swing.JButton();
        RightCard1 = new javax.swing.JLabel();
        FooterCredits = new javax.swing.JLabel();
        TagLine = new javax.swing.JLabel();
        NameofInstitute = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();
        PageName = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        UserNameInput = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();
        Submit3 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setName("MainFrame"); // NOI18N
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Submit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Submit.png"))); // NOI18N
        Submit1.setText("Submit");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        Submit2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/cancel.PNG"))); // NOI18N
        Submit2.setText("Quit");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        RightCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Login Card2.png"))); // NOI18N
        jPanel1.add(RightCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 580, -1));

        FooterCredits.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FooterCredits.setForeground(new java.awt.Color(255, 255, 255));
        FooterCredits.setText("Copyrigyt © Coding Guru");
        jPanel1.add(FooterCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 240, 30));

        TagLine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TagLine.setForeground(new java.awt.Color(255, 255, 255));
        TagLine.setText("All Coding Courses in one Place.....");
        jPanel1.add(TagLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 280, -1));

        NameofInstitute.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        NameofInstitute.setForeground(new java.awt.Color(255, 255, 255));
        NameofInstitute.setText("Coding Guru");
        jPanel1.add(NameofInstitute, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 330, 70));

        Header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Banner Home Page.png"))); // NOI18N
        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        Footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Footer Home Page.png"))); // NOI18N
        jPanel1.add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 900, 50));

        PageName.setFont(new java.awt.Font("Gabriola", 3, 36)); // NOI18N
        PageName.setText("Admin Login");
        jPanel1.add(PageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 40));

        Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Password.png"))); // NOI18N
        Password.setText("Password :");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 30));

        UserNameInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameInputActionPerformed(evt);
            }
        });
        jPanel1.add(UserNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 30));

        UserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/User1.png"))); // NOI18N
        UserName.setText(" Admin ID :");
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, 180, -1));

        PasswordInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordInputActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        Submit3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/User.png"))); // NOI18N
        Submit3.setText("User Login");
        Submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit3ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameInputActionPerformed

    private void PasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordInputActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
            
            String str1 = UserNameInput.getText();
            String str2 = new String(PasswordInput.getPassword());
            String aname = "Admin",apass = "12345";
            if(!"".equals(str1))
            {
                if(!"".equals(str2))
                {
                    if(str1.equals(aname))
                    {
                        if(str2.equals(apass))
                        {
                                    this.setVisible(false);
                                    this.dispose();
                                    AdminPage ap = new AdminPage();
                                    ap.setVisible(true);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Invalid Password");  
                        }
                                            
                    }
                    else if(!str2.equals(apass))
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID and Password");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Invalid Admin ID");
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "Please Enter Password");
            }
            else if("".equals(str2))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Admin ID and Password");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter Admin ID");
            }
            
    }//GEN-LAST:event_Submit1ActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Submit2ActionPerformed

    private void Submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit3ActionPerformed
                        this.setVisible(false);
                        this.dispose();
                        LoginPage lp = new LoginPage();
                        lp.setVisible(true);
    }//GEN-LAST:event_Submit3ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        UserNameInput.setText("");
        PasswordInput.setText("");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           AdminLogin al = new AdminLogin();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                al.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JLabel FooterCredits;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel NameofInstitute;
    private javax.swing.JLabel PageName;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel RightCard1;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JButton Submit3;
    private javax.swing.JLabel TagLine;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameInput;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
