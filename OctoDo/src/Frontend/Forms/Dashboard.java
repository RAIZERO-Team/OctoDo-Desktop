package Frontend.Forms;

import Backend.Account.User;
import com.formdev.flatlaf.FlatClientProperties;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        init();
        showDialog();
        setSVGIcons();
        // fillDadhboard();
    }

    private void fillDadhboard() {
        user.setText(User.currentUser.getUserName());
        email.setText(User.currentUser.getUserEmail());
        sound.setText(User.currentUser.getNotification().getNotification_name());
        
    }

    private void init() {
        Dashborad.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        user_name.setCursorHand();
        user_email.setCursorHand();
        user_password.setCursorHand();
        sound_notfication.setCursorHand();
        delete_account.setCursorHand();

        edit_userName.setCursorHand();
        edit_Pass.setCursorHand();
        edit_sound.setCursorHand();

    }

    private void showDialog() {
        Change_Pass.setSize(360, 500);
        Change_Pass.add(change_Password);
    }

    private void setSVGIcons() {
        user_name.setSVGIcon("Asstes/SVG_Icons/user.svg", 30, 30);
        user_email.setSVGIcon("Asstes/SVG_Icons/email.svg", 30, 30);
        user_password.setSVGIcon("Asstes/SVG_Icons/password.svg", 30, 30);
        sound_notfication.setSVGIcon("Asstes/SVG_Icons/notification-Sound.svg", 30, 30);
        delete_account.setSVGIcon("Asstes/SVG_Icons/delete-account.svg", 30, 30);

        edit_userName.setSVGIcon("Asstes/SVG_Icons/edit.svg", 30, 30);
        edit_Pass.setSVGIcon("Asstes/SVG_Icons/edit.svg", 30, 30);
        edit_sound.setSVGIcon("Asstes/SVG_Icons/edit.svg", 30, 30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Change_Pass = new javax.swing.JDialog();
        change_Password = new Frontend.Mini_Forms.Change_Password();
        Dashborad = new Frontend.UI_Components.PanelRound();
        user_img = new Frontend.UI_Components.ImageAvatar();
        pane_userName = new Frontend.UI_Components.PanelRound();
        lab_user_Name = new javax.swing.JLabel();
        user_name = new Frontend.UI_Components.svgIcon();
        user = new javax.swing.JLabel();
        edit_userName = new Frontend.UI_Components.svgIcon();
        pane_pass = new Frontend.UI_Components.PanelRound();
        lab_pass = new javax.swing.JLabel();
        user_password = new Frontend.UI_Components.svgIcon();
        pass = new javax.swing.JLabel();
        edit_Pass = new Frontend.UI_Components.svgIcon();
        pane_email = new Frontend.UI_Components.PanelRound();
        lab_email = new javax.swing.JLabel();
        user_email = new Frontend.UI_Components.svgIcon();
        email = new javax.swing.JLabel();
        pane_notfication = new Frontend.UI_Components.PanelRound();
        lab_change_soung = new javax.swing.JLabel();
        sound_notfication = new Frontend.UI_Components.svgIcon();
        sound = new javax.swing.JLabel();
        edit_sound = new Frontend.UI_Components.svgIcon();
        pane_deleteAccount = new Frontend.UI_Components.PanelRound();
        Delete_Account = new javax.swing.JLabel();
        delete_account = new Frontend.UI_Components.svgIcon();

        Change_Pass.setLocation(new java.awt.Point(550, 150));

        javax.swing.GroupLayout Change_PassLayout = new javax.swing.GroupLayout(Change_Pass.getContentPane());
        Change_Pass.getContentPane().setLayout(Change_PassLayout);
        Change_PassLayout.setHorizontalGroup(
            Change_PassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(Change_PassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Change_PassLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(change_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Change_PassLayout.setVerticalGroup(
            Change_PassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(Change_PassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Change_PassLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(change_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Dashborad.setRoundBottomLeft(30);
        Dashborad.setRoundBottomRight(30);
        Dashborad.setRoundTopLeft(30);
        Dashborad.setRoundTopRight(30);
        Dashborad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Dashborad.add(user_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 30, 100, 100));

        pane_userName.setBackground(new java.awt.Color(204, 204, 204));
        pane_userName.setRoundBottomLeft(40);
        pane_userName.setRoundBottomRight(40);
        pane_userName.setRoundTopLeft(40);
        pane_userName.setRoundTopRight(40);
        pane_userName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_user_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_user_Name.setForeground(new java.awt.Color(0, 0, 0));
        lab_user_Name.setText("User Name");
        pane_userName.add(lab_user_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));
        pane_userName.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 30, 30));

        user.setBackground(new java.awt.Color(206, 211, 214));
        user.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("User 1203");
        pane_userName.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 300, -1));
        pane_userName.add(edit_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 15, 30, 30));

        Dashborad.add(pane_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 500, 60));

        pane_pass.setBackground(new java.awt.Color(204, 204, 204));
        pane_pass.setRoundBottomLeft(40);
        pane_pass.setRoundBottomRight(40);
        pane_pass.setRoundTopLeft(40);
        pane_pass.setRoundTopRight(40);
        pane_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane_passMouseClicked(evt);
            }
        });
        pane_pass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_pass.setForeground(new java.awt.Color(0, 0, 0));
        lab_pass.setText("Password");
        pane_pass.add(lab_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));
        pane_pass.add(user_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 30, 30));

        pass.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 0));
        pass.setText("********");
        pane_pass.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 90, 20));

        edit_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_PassMouseClicked(evt);
            }
        });
        pane_pass.add(edit_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 15, 30, 30));

        Dashborad.add(pane_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 500, 60));

        pane_email.setBackground(new java.awt.Color(204, 204, 204));
        pane_email.setRoundBottomLeft(40);
        pane_email.setRoundBottomRight(40);
        pane_email.setRoundTopLeft(40);
        pane_email.setRoundTopRight(40);
        pane_email.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_email.setForeground(new java.awt.Color(0, 0, 0));
        lab_email.setText("Email");
        pane_email.add(lab_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));
        pane_email.add(user_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 30, 30));

        email.setBackground(new java.awt.Color(206, 211, 214));
        email.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("user1203@gmail.com");
        pane_email.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 300, -1));

        Dashborad.add(pane_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 500, 60));

        pane_notfication.setBackground(new java.awt.Color(204, 204, 204));
        pane_notfication.setRoundBottomLeft(40);
        pane_notfication.setRoundBottomRight(40);
        pane_notfication.setRoundTopLeft(40);
        pane_notfication.setRoundTopRight(40);
        pane_notfication.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_change_soung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_change_soung.setForeground(new java.awt.Color(0, 0, 0));
        lab_change_soung.setText("Change Notification Sound");
        pane_notfication.add(lab_change_soung, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        pane_notfication.add(sound_notfication, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        sound.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        sound.setForeground(new java.awt.Color(0, 0, 0));
        sound.setText("Rain");
        pane_notfication.add(sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 190, -1));
        pane_notfication.add(edit_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 15, 30, 30));

        Dashborad.add(pane_notfication, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 500, 60));

        pane_deleteAccount.setBackground(new java.awt.Color(204, 204, 204));
        pane_deleteAccount.setRoundBottomLeft(40);
        pane_deleteAccount.setRoundBottomRight(40);
        pane_deleteAccount.setRoundTopLeft(40);
        pane_deleteAccount.setRoundTopRight(40);
        pane_deleteAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete_Account.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Delete_Account.setForeground(new java.awt.Color(255, 77, 77));
        Delete_Account.setText("Delete My Account");
        pane_deleteAccount.add(Delete_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        pane_deleteAccount.add(delete_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 15, 30, 30));

        Dashborad.add(pane_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 500, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dashborad, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dashborad, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pane_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane_passMouseClicked
        Change_Pass.setVisible(true);
    }//GEN-LAST:event_pane_passMouseClicked

    private void edit_PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_PassMouseClicked
        Change_Pass.setVisible(true);
    }//GEN-LAST:event_edit_PassMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Change_Pass;
    private Frontend.UI_Components.PanelRound Dashborad;
    private javax.swing.JLabel Delete_Account;
    private Frontend.Mini_Forms.Change_Password change_Password;
    private Frontend.UI_Components.svgIcon delete_account;
    private Frontend.UI_Components.svgIcon edit_Pass;
    private Frontend.UI_Components.svgIcon edit_sound;
    private Frontend.UI_Components.svgIcon edit_userName;
    private javax.swing.JLabel email;
    private javax.swing.JLabel lab_change_soung;
    private javax.swing.JLabel lab_email;
    private javax.swing.JLabel lab_pass;
    private javax.swing.JLabel lab_user_Name;
    private Frontend.UI_Components.PanelRound pane_deleteAccount;
    private Frontend.UI_Components.PanelRound pane_email;
    private Frontend.UI_Components.PanelRound pane_notfication;
    private Frontend.UI_Components.PanelRound pane_pass;
    private Frontend.UI_Components.PanelRound pane_userName;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel sound;
    private Frontend.UI_Components.svgIcon sound_notfication;
    private javax.swing.JLabel user;
    private Frontend.UI_Components.svgIcon user_email;
    private Frontend.UI_Components.ImageAvatar user_img;
    private Frontend.UI_Components.svgIcon user_name;
    private Frontend.UI_Components.svgIcon user_password;
    // End of variables declaration//GEN-END:variables
}
