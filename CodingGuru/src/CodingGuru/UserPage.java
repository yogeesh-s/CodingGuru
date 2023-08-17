/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingGuru;

/**
 *
 * @author Yogeesh
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPage
     */
    public UserPage() {
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

        MainPanel = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        HeaderTitle = new javax.swing.JLabel();
        HeaderTagline = new javax.swing.JLabel();
        HeaderImage = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        Homepage = new javax.swing.JButton();
        FooterCredits = new javax.swing.JLabel();
        FooterImage = new javax.swing.JLabel();
        PythonLogo = new javax.swing.JLabel();
        PythonTitle = new javax.swing.JLabel();
        PythonDescription = new javax.swing.JLabel();
        PythonProgressBar = new javax.swing.JProgressBar();
        MERNTitle = new javax.swing.JLabel();
        MERNLogo = new javax.swing.JLabel();
        MERNDescription = new javax.swing.JLabel();
        MERNProgress = new javax.swing.JProgressBar();
        UserInformation = new javax.swing.JPanel();
        UserInformationTitle = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameDetails = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EmailId = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        MobileNumberDetails = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        AddressDetails = new javax.swing.JLabel();
        EditDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Page");

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HeaderTitle.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTitle.setText("Coding Guru");
        Content.add(HeaderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        HeaderTagline.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HeaderTagline.setForeground(new java.awt.Color(255, 255, 255));
        HeaderTagline.setText("All Coding Courses in one Place.....");
        Content.add(HeaderTagline, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        HeaderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Banner Home Page.png"))); // NOI18N
        HeaderImage.setText("jLabel1");
        Content.add(HeaderImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Logout.png"))); // NOI18N
        Logout.setText("Log Out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Content.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 120, 30));

        Homepage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Home.png"))); // NOI18N
        Homepage.setText("Homepage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });
        Content.add(Homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 140, 30));

        FooterCredits.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FooterCredits.setForeground(new java.awt.Color(255, 255, 255));
        FooterCredits.setText("Copyrigyt © Coding Guru");
        Content.add(FooterCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 30));

        FooterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Footer Home Page.png"))); // NOI18N
        FooterImage.setText("jLabel2");
        Content.add(FooterImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 900, 50));

        PythonLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Card7.png"))); // NOI18N
        PythonLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PythonLogoMouseClicked(evt);
            }
        });
        Content.add(PythonLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 100));

        PythonTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PythonTitle.setText("Python");
        Content.add(PythonTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        PythonDescription.setText("Complete Python Course with Certificate");
        Content.add(PythonDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));
        Content.add(PythonProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 290, 20));

        MERNTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MERNTitle.setText("MERN Stack");
        Content.add(MERNTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        MERNLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Card10.png"))); // NOI18N
        MERNLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MERNLogoMouseClicked(evt);
            }
        });
        Content.add(MERNLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 100));

        MERNDescription.setText("Complete MERN Stack Course with Certificate");
        Content.add(MERNDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));
        Content.add(MERNProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 290, 20));

        UserInformation.setBackground(new java.awt.Color(255, 255, 255));
        UserInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        UserInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserInformationTitle.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        UserInformationTitle.setText("User Information");
        UserInformation.add(UserInformationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Name.setText("Name :");
        UserInformation.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        NameDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NameDetails.setText("Yogeesh S");
        UserInformation.add(NameDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setText("Email ID :");
        UserInformation.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, -1));

        EmailId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmailId.setText("yogeesh.sryd@gmail.com");
        UserInformation.add(EmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MobileNumber.setText("Mobile No :");
        UserInformation.add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 20));

        MobileNumberDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MobileNumberDetails.setText("8660639268");
        UserInformation.add(MobileNumberDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Address.setText("Address :");
        UserInformation.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        AddressDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AddressDetails.setText("<html> Anaveri<br>Bhadravathi<br>Shimoga<br>Karnataka</html>");
        UserInformation.add(AddressDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        EditDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CodingGuru/Assets/Icons/Edit.png"))); // NOI18N
        EditDetails.setText("Edit Details");
        EditDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDetailsActionPerformed(evt);
            }
        });
        UserInformation.add(EditDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 130, 30));

        Content.add(UserInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 290, 350));

        MainPanel.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        this.setVisible(false);
        this.dispose();
        LoginPage lp = new LoginPage();
        lp.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
        this.setVisible(false);
        this.dispose();
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }//GEN-LAST:event_HomepageActionPerformed

    private void EditDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDetailsActionPerformed
        this.setVisible(false);
        this.dispose();
        EditInformation ei = new EditInformation();
        ei.Rfname.setText("Yogeesh");
        ei.Rlname.setText("S");
        ei.Remail.setText("yogeesh.sryd@gmail.com");
        ei.Rusername.setText("Yogeesh");
        ei.Rpassword.setText("12345");
        ei.Rcpassword.setText("12345");
        ei.Rmnumber.setText("8660639268");
        ei.Raddress.setText("Anaveri\nBhadravathi\nShimoga\nKarnataka");
        ei.setVisible(true);
        
    }//GEN-LAST:event_EditDetailsActionPerformed

    private void MERNLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MERNLogoMouseClicked
        this.setVisible(false);
        this.dispose();
        MERNPage mp = new MERNPage();
        mp.setVisible(true);
    }//GEN-LAST:event_MERNLogoMouseClicked

    private void PythonLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PythonLogoMouseClicked
        this.setVisible(false);
        this.dispose();
        PythonPage pp = new PythonPage();
        pp.setVisible(true);
    }//GEN-LAST:event_PythonLogoMouseClicked

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final UserPage up = new UserPage();
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                up.setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel AddressDetails;
    private javax.swing.JPanel Content;
    private javax.swing.JButton EditDetails;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmailId;
    private javax.swing.JLabel FooterCredits;
    private javax.swing.JLabel FooterImage;
    private javax.swing.JLabel HeaderImage;
    private javax.swing.JLabel HeaderTagline;
    private javax.swing.JLabel HeaderTitle;
    private javax.swing.JButton Homepage;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel MERNDescription;
    private javax.swing.JLabel MERNLogo;
    public javax.swing.JProgressBar MERNProgress;
    private javax.swing.JLabel MERNTitle;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JLabel MobileNumberDetails;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameDetails;
    private javax.swing.JLabel PythonDescription;
    private javax.swing.JLabel PythonLogo;
    public javax.swing.JProgressBar PythonProgressBar;
    private javax.swing.JLabel PythonTitle;
    private javax.swing.JPanel UserInformation;
    private javax.swing.JLabel UserInformationTitle;
    // End of variables declaration//GEN-END:variables
}