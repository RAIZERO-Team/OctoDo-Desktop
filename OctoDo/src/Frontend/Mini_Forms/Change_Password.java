package Frontend.Mini_Forms;

import Backend.Account.PasswordUtil;
import Backend.Account.User;
import Backend.Account.Vaildition;
import Backend.Database.QueriesAdministrator;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Change_Password extends javax.swing.JPanel {

    private JPasswordField passwordField1;
    private DocumentListener documentListener;
    private int type;

    public Change_Password() {
        initComponents();
        init();
        initPasswordField(New_PasswordField);
    }

    private void init() {
        Current_PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your old password");
        Current_PasswordField.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");

        New_PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter New password");
        New_PasswordField.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");

        Confirm_PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Confirm New password");
        Confirm_PasswordField.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");
    }

    // Methods of check Password Status 
    // Method To set color
    private Color getStrengthColor(int type) {
        if (type == 1) {
            return Color.decode("#FF4D4D");
        } else if (type == 2) {
            return Color.decode("#FFB04D");
        } else {
            return Color.decode("#58C359");
        }
    }

    // Method To set txt password status
    private void set_txtStatus(String password) {
        this.type = password.isEmpty() ? 0 : PasswordUtil.checkPasswordStrength(password);

        if (type == 0) {
            lab_passwordStatus.setText("none");
            lab_passwordStatus.setVisible(false);
        } else {
            lab_passwordStatus.setVisible(true);
            if (type == 1) {
                lab_passwordStatus.setText("Too weak");
            } else if (type == 2) {
                lab_passwordStatus.setText("Medium");
            } else {
                lab_passwordStatus.setText("Strong");
            }
            lab_passwordStatus.setForeground(getStrengthColor(type));
        }
        repaint();
    }

    // Method to set progress bar password status
    private void set_progreesBarStatus(String password) {
        Color disableColor = Color.decode("#4E5052");
        if (type >= 1) {
            bar_week.setBackground(getStrengthColor(1));
        } else {
            bar_week.setBackground(disableColor);
        }

        if (type >= 2) {
            bar_medium.setBackground(getStrengthColor(2));
        } else {
            bar_medium.setBackground(disableColor);
        }

        if (type >= 3) {
            bar_strong.setBackground(getStrengthColor(3));
        } else {
            bar_strong.setBackground(disableColor);
        }
    }

    // Method to init The password
    public void initPasswordField(JPasswordField txt) {
        if (documentListener == null) {
            documentListener = new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }
            };
        }
        if (passwordField1 != null) {
            passwordField1.getDocument().removeDocumentListener(documentListener);
        }
        txt.getDocument().addDocumentListener(documentListener);
        passwordField1 = txt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Frontend.UI_Components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Current_PasswordField = new javax.swing.JPasswordField();
        New_PasswordField = new javax.swing.JPasswordField();
        Confirm_PasswordField = new javax.swing.JPasswordField();
        lab_current_Pass = new javax.swing.JLabel();
        lab_new_pass = new javax.swing.JLabel();
        lab_confirm_NewPass = new javax.swing.JLabel();
        lab_forgrt_Pass = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bar_week = new javax.swing.JProgressBar();
        bar_medium = new javax.swing.JProgressBar();
        bar_strong = new javax.swing.JProgressBar();
        lab_passwordStatus = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Change Password");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        Current_PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Current_PasswordFieldActionPerformed(evt);
            }
        });
        panelRound1.add(Current_PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 300, 35));
        panelRound1.add(New_PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 300, 35));
        panelRound1.add(Confirm_PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 300, 35));

        lab_current_Pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_current_Pass.setText("Current Password");
        panelRound1.add(lab_current_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lab_new_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_new_pass.setText("New Password");
        panelRound1.add(lab_new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lab_confirm_NewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_confirm_NewPass.setText("Confirm New Password");
        panelRound1.add(lab_confirm_NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lab_forgrt_Pass.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lab_forgrt_Pass.setForeground(new java.awt.Color(21, 101, 192));
        lab_forgrt_Pass.setText("forget password?");
        lab_forgrt_Pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(lab_forgrt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 300, 15));

        bar_week.setMinimumSize(new java.awt.Dimension(8, 4));
        panelRound1.add(bar_week, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 45, -1));

        bar_medium.setMinimumSize(new java.awt.Dimension(8, 4));
        panelRound1.add(bar_medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 45, -1));

        bar_strong.setMinimumSize(new java.awt.Dimension(8, 4));
        panelRound1.add(bar_strong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 45, -1));

        lab_passwordStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound1.add(lab_passwordStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 60, 20));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        panelRound1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        panelRound1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed


    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        String Email = User.currentUser.gitUserEmail();

        String oldPassword = Current_PasswordField.getText();
        String newPassword = New_PasswordField.getText();
        String confirmPassword = Confirm_PasswordField.getText();

        boolean isValid = QueriesAdministrator.sign_in(Email, oldPassword);

        if (isValid) {
            if (Vaildition.isValidPassword(newPassword)) {
                if (newPassword.equals(confirmPassword)) {

                    if (QueriesAdministrator.updatePassword(Email, newPassword)) {
                        JOptionPane.showMessageDialog(null, "changing  is done");
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "changing is not done",
                                "error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this,
                            "the new Password not confirm    Password",
                            "confirm Password",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Please enter a    Strong Password",
                        "Strong Password",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Please enter correct Email Or Password",
                    "Invalid Email or Password",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void Current_PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Current_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Current_PasswordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Confirm_PasswordField;
    private javax.swing.JPasswordField Current_PasswordField;
    private javax.swing.JPasswordField New_PasswordField;
    private javax.swing.JProgressBar bar_medium;
    private javax.swing.JProgressBar bar_strong;
    private javax.swing.JProgressBar bar_week;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lab_confirm_NewPass;
    private javax.swing.JLabel lab_current_Pass;
    private javax.swing.JLabel lab_forgrt_Pass;
    private javax.swing.JLabel lab_new_pass;
    private javax.swing.JLabel lab_passwordStatus;
    private Frontend.UI_Components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
