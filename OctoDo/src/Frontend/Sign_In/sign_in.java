package Frontend.Sign_In;

import Application.Form.FormsManager;
import com.formdev.flatlaf.FlatClientProperties;
import Application.Main.Application;
import Frontend.Sign_Up.sign_up;
import java.util.prefs.Preferences;

public class sign_in extends javax.swing.JPanel {

    public sign_in() {
        initComponents();
        init();
    }

    private void init() {
        //setLayout(new LoginFormLayout());
        //login.setLayout(new LoginLayout());
        lb_Title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        Login.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Login.background;"
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
        txt_email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your Email");
        PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your Password");
    }

    private void SetSVGIcon(){
        svgIcon1.setSVGIcon("Asstes/SVG_Icons/test2.svg", 449, 460);
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
        btn_signup = new javax.swing.JButton();
        lab_error_Password = new javax.swing.JLabel();
        lab_user_is_exits = new javax.swing.JLabel();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        lab_forgetPass = new javax.swing.JLabel();
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
        lab_email.setText("Email");
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
        sign_in_Panel.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 290, -1));

        lab_DHAAC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab_DHAAC.setForeground(new java.awt.Color(255, 255, 255));
        lab_DHAAC.setText("Don't have an account ? ");
        sign_in_Panel.add(lab_DHAAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 150, -1));

        btn_signup.setBackground(new java.awt.Color(60, 63, 65));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(21, 101, 192));
        btn_signup.setText("Sign up now");
        btn_signup.setBorder(null);
        btn_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        sign_in_Panel.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

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
        sign_in_Panel.add(lab_forgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 320, -1, 25));

        Login.add(sign_in_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 449, 460));
        Login.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 449, 460));

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

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Application.sign_in();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        FormsManager.getInstance().showForm(new sign_up());
    }//GEN-LAST:event_btn_signupActionPerformed

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
    private javax.swing.JButton btn_signup;
    private javax.swing.JCheckBox cbx_rememberMe;
    private javax.swing.JLabel lab_DHAAC;
    private javax.swing.JLabel lab_email;
    private javax.swing.JLabel lab_error_Password;
    private javax.swing.JLabel lab_forgetPass;
    private javax.swing.JLabel lab_password;
    private javax.swing.JLabel lab_user_is_exits;
    private javax.swing.JLabel lb_Description;
    private javax.swing.JLabel lb_Title;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.PanelRound sign_in_Panel;
    private Frontend.UI_Components.svgIcon svgIcon1;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
