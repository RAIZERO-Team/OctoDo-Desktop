package Frontend.Sign_In;

import Application.Form.FormsManager;
import com.formdev.flatlaf.FlatClientProperties;
import Application.Main.Application;
import Backend.Account.User;
import Backend.Database.QueriesAdministrator;
import Frontend.Sign_Up.sign_up;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

public class sign_in extends javax.swing.JPanel {

    public sign_in() {
        initComponents();
        init();
    }

    private void init() {
        lb_Title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        Login.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        PasswordField.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "showCapsLock:true");
        btn_login.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        fillText();
        SetSVGIcon();
    }

    private void fillText() {
        txt_email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter The username");
        PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your Password");
    }

    private void SetSVGIcon() {
        svgIcon1.setSVGIcon("Asstes/SVG_Icons/test2.svg", 449, 540);

        svgIconLinkedin.setSVGIcon("Asstes/SVG_Icons/linkedin.svg", 30, 30);
        svgIconGitHub.setSVGIcon("Asstes/SVG_Icons/Github.svg", 30, 30);
        svgIconGoogle.setSVGIcon("Asstes/SVG_Icons/google.svg", 30, 30);
        svgIconFaceBook.setSVGIcon("Asstes/SVG_Icons/facebook.svg", 30, 30);

        svgIconLinkedin.setCursorHand();
        svgIconGitHub.setCursorHand();
        svgIconGoogle.setCursorHand();
        svgIconFaceBook.setCursorHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new Frontend.UI_Components.PanelRound();
        sign_in_Panel = new Frontend.UI_Components.PanelRound();
        lb_Title = new javax.swing.JLabel();
        lb_Description = new javax.swing.JLabel();
        lab_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lab_password = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        cbx_rememberMe = new javax.swing.JCheckBox();
        btn_login = new javax.swing.JButton();
        lab_DHAAC = new javax.swing.JLabel();
        lab_error_Password = new javax.swing.JLabel();
        lab_user_is_exits = new javax.swing.JLabel();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        lab_forgetPass = new javax.swing.JLabel();
        lab_signUp_options = new javax.swing.JLabel();
        svgIconLinkedin = new Frontend.UI_Components.svgIcon();
        svgIconGitHub = new Frontend.UI_Components.svgIcon();
        svgIconGoogle = new Frontend.UI_Components.svgIcon();
        svgIconFaceBook = new Frontend.UI_Components.svgIcon();
        lab_sign_up = new javax.swing.JLabel();
        svgIcon1 = new Frontend.UI_Components.svgIcon();

        Login.setRoundBottomLeft(30);
        Login.setRoundBottomRight(30);
        Login.setRoundTopLeft(30);
        Login.setRoundTopRight(30);
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_in_Panel.setBackground(new java.awt.Color(49, 62, 74));
        sign_in_Panel.setRoundBottomLeft(30);
        sign_in_Panel.setRoundBottomRight(30);
        sign_in_Panel.setRoundTopLeft(30);
        sign_in_Panel.setRoundTopRight(30);
        sign_in_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Title.setForeground(new java.awt.Color(255, 255, 255));
        lb_Title.setText("Welcome back!");
        sign_in_Panel.add(lb_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lb_Description.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_Description.setForeground(new java.awt.Color(204, 204, 204));
        lb_Description.setText("Please sign in to access your account");
        sign_in_Panel.add(lb_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lab_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_email.setForeground(new java.awt.Color(255, 255, 255));
        lab_email.setText("User Name");
        sign_in_Panel.add(lab_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_email.setMinimumSize(new java.awt.Dimension(64, 20));
        sign_in_Panel.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 290, 36));

        lab_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_password.setForeground(new java.awt.Color(255, 255, 255));
        lab_password.setText("Password");
        sign_in_Panel.add(lab_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        PasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasswordField.setMinimumSize(new java.awt.Dimension(64, 20));
        sign_in_Panel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 290, 36));

        cbx_rememberMe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbx_rememberMe.setForeground(new java.awt.Color(255, 255, 255));
        cbx_rememberMe.setText("Remember me");
        cbx_rememberMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_rememberMeActionPerformed(evt);
            }
        });
        sign_in_Panel.add(cbx_rememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        btn_login.setBackground(new java.awt.Color(21, 101, 192));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorderPainted(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        sign_in_Panel.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 290, -1));

        lab_DHAAC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab_DHAAC.setForeground(new java.awt.Color(255, 255, 255));
        lab_DHAAC.setText("Don't have an account ? ");
        sign_in_Panel.add(lab_DHAAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, -1));

        lab_error_Password.setForeground(new java.awt.Color(255, 77, 77));
        sign_in_Panel.add(lab_error_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 290, 16));

        lab_user_is_exits.setForeground(new java.awt.Color(255, 77, 77));
        sign_in_Panel.add(lab_user_is_exits, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 290, 16));

        panelRound1.setBackground(new java.awt.Color(0, 204, 204));
        panelRound1.setRoundBottomRight(500);
        panelRound1.setRoundTopLeft(500);
        panelRound1.setRoundTopRight(500);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sign_in_Panel.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 100));

        lab_forgetPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_forgetPass.setForeground(new java.awt.Color(21, 101, 192));
        lab_forgetPass.setText("Forget Password?");
        lab_forgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_forgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_forgetPassMouseClicked(evt);
            }
        });
        sign_in_Panel.add(lab_forgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 320, -1, 25));

        lab_signUp_options.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_signUp_options.setForeground(new java.awt.Color(255, 255, 255));
        lab_signUp_options.setText("Or Login with");
        sign_in_Panel.add(lab_signUp_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        svgIconLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconLinkedinMouseClicked(evt);
            }
        });
        sign_in_Panel.add(svgIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 30, 30));

        svgIconGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconGitHubMouseClicked(evt);
            }
        });
        sign_in_Panel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 30, 30));

        svgIconGoogle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconGoogleMouseClicked(evt);
            }
        });
        sign_in_Panel.add(svgIconGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 30, 30));

        svgIconFaceBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconFaceBookMouseClicked(evt);
            }
        });
        sign_in_Panel.add(svgIconFaceBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 30, 30));

        lab_sign_up.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab_sign_up.setForeground(new java.awt.Color(21, 101, 192));
        lab_sign_up.setText("Sign up here");
        lab_sign_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_sign_upMouseClicked(evt);
            }
        });
        sign_in_Panel.add(lab_sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        Login.add(sign_in_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 449, 540));
        Login.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 449, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_rememberMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_rememberMeActionPerformed
//        if (cbx_rememberMe.isSelected()) {
//            saveCredentials(txt_email.getText(), new String(PasswordField.getPassword()));
//        } else {
//            clearSavedCredentials();
//        }
    }//GEN-LAST:event_cbx_rememberMeActionPerformed


    private void lab_forgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_forgetPassMouseClicked

    }//GEN-LAST:event_lab_forgetPassMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        String email = txt_email.getText();
        String password = PasswordField.getText();
        // Check sign-in
        if (QueriesAdministrator.sign_in(email, password.toString().trim())) {
            try {
                // Successful sign-in

                User.currentUser = QueriesAdministrator.CurrentUser(email);
                Application.sign_in();

            } catch (SQLException ex) {
                Logger.getLogger(sign_in.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // Unsuccessful sign-in   

            if (QueriesAdministrator.isEmailExist(email)) {
                // Email exists, but password is incorrect              }
            } else {
                // Email and password are both incorrect
            }

        }


    }//GEN-LAST:event_btn_loginActionPerformed

    private void lab_sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sign_upMouseClicked
        FormsManager.getInstance().showForm(new sign_up());
    }//GEN-LAST:event_lab_sign_upMouseClicked

    private void Sign_Up_API_Key() {

    }

    private void svgIconLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconLinkedinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_svgIconLinkedinMouseClicked

    private void svgIconGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconGitHubMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_svgIconGitHubMouseClicked

    private void svgIconGoogleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconGoogleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_svgIconGoogleMouseClicked

    private void svgIconFaceBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconFaceBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_svgIconFaceBookMouseClicked

    // The next Methodes is For Remember Me Check box
    private void saveCredentials(String email, String password) {
        Preferences prefs = Preferences.userNodeForPackage(getClass());

        prefs.put("email", email);
        prefs.put("password", password);

        prefs.putBoolean("rememberMe", true);
    }

    private void loadSavedCredentials() {
        Preferences prefs = Preferences.userNodeForPackage(getClass());

        String savedEmail = prefs.get("email", "");
        String savedPassword = prefs.get("password", "");

        txt_email.setText(savedEmail);
        PasswordField.setText(savedPassword);

        cbx_rememberMe.setSelected(true);
    }

    private void clearSavedCredentials() {
        Preferences prefs = Preferences.userNodeForPackage(getClass());

        prefs.remove("email");
        prefs.remove("password");
        prefs.remove("rememberMe");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Login;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox cbx_rememberMe;
    private javax.swing.JLabel lab_DHAAC;
    private javax.swing.JLabel lab_email;
    private javax.swing.JLabel lab_error_Password;
    private javax.swing.JLabel lab_forgetPass;
    private javax.swing.JLabel lab_password;
    private javax.swing.JLabel lab_signUp_options;
    private javax.swing.JLabel lab_sign_up;
    private javax.swing.JLabel lab_user_is_exits;
    private javax.swing.JLabel lb_Description;
    private javax.swing.JLabel lb_Title;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.PanelRound sign_in_Panel;
    private Frontend.UI_Components.svgIcon svgIcon1;
    private Frontend.UI_Components.svgIcon svgIconFaceBook;
    private Frontend.UI_Components.svgIcon svgIconGitHub;
    private Frontend.UI_Components.svgIcon svgIconGoogle;
    private Frontend.UI_Components.svgIcon svgIconLinkedin;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
