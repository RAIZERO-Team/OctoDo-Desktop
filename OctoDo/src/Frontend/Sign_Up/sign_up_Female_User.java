package Frontend.Sign_Up;

import Application.Form.SSS_Forms_Manager;
import Frontend.Sign_In.sign_in;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class sign_up_Female_User extends javax.swing.JPanel {

    public sign_up_Female_User() {
        initComponents();
        Sign_Up_Female_User.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        cursorhand();
    }

    private void cursorhand() {
        img1.setCursorHand();
        img3.setCursorHand();
        img4.setCursorHand();
        img8.setCursorHand();
        img9.setCursorHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sign_Up_Female_User = new Frontend.UI_Components.PanelRound();
        pane1 = new Frontend.UI_Components.PanelRound();
        img1 = new Frontend.UI_Components.ImageAvatar();
        pane3 = new Frontend.UI_Components.PanelRound();
        img3 = new Frontend.UI_Components.ImageAvatar();
        pane4 = new Frontend.UI_Components.PanelRound();
        img4 = new Frontend.UI_Components.ImageAvatar();
        pane8 = new Frontend.UI_Components.PanelRound();
        img8 = new Frontend.UI_Components.ImageAvatar();
        pane9 = new Frontend.UI_Components.PanelRound();
        img9 = new Frontend.UI_Components.ImageAvatar();
        lab_selectAvatar = new javax.swing.JLabel();
        lab_uploadImg = new javax.swing.JLabel();

        Sign_Up_Female_User.setRoundBottomLeft(30);
        Sign_Up_Female_User.setRoundBottomRight(30);
        Sign_Up_Female_User.setRoundTopLeft(30);
        Sign_Up_Female_User.setRoundTopRight(30);
        Sign_Up_Female_User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane1.setBackground(new java.awt.Color(49, 62, 74));
        pane1.setRoundBottomLeft(30);
        pane1.setRoundBottomRight(30);
        pane1.setRoundTopLeft(30);
        pane1.setRoundTopRight(30);
        pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Female_User_Avatar/femal1.jpg"))); // NOI18N
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        pane1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Female_User.add(pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 150));

        pane3.setBackground(new java.awt.Color(49, 62, 74));
        pane3.setRoundBottomLeft(30);
        pane3.setRoundBottomRight(30);
        pane3.setRoundTopLeft(30);
        pane3.setRoundTopRight(30);
        pane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Female_User_Avatar/femal3.jpg"))); // NOI18N
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
        });
        pane3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Female_User.add(pane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 150, 150));

        pane4.setBackground(new java.awt.Color(49, 62, 74));
        pane4.setDoubleBuffered(false);
        pane4.setRoundBottomLeft(30);
        pane4.setRoundBottomRight(30);
        pane4.setRoundTopLeft(30);
        pane4.setRoundTopRight(30);
        pane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Female_User_Avatar/femal4.jpg"))); // NOI18N
        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
        });
        pane4.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Female_User.add(pane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 150, 150));

        pane8.setBackground(new java.awt.Color(49, 62, 74));
        pane8.setRoundBottomLeft(30);
        pane8.setRoundBottomRight(30);
        pane8.setRoundTopLeft(30);
        pane8.setRoundTopRight(30);
        pane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Female_User_Avatar/femal9.jpg"))); // NOI18N
        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img8MouseClicked(evt);
            }
        });
        pane8.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Female_User.add(pane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 150, 150));

        pane9.setBackground(new java.awt.Color(49, 62, 74));
        pane9.setRoundBottomLeft(30);
        pane9.setRoundBottomRight(30);
        pane9.setRoundTopLeft(30);
        pane9.setRoundTopRight(30);
        pane9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Female_User_Avatar/user.png"))); // NOI18N
        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img9MouseClicked(evt);
            }
        });
        pane9.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Female_User.add(pane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 150));

        lab_selectAvatar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_selectAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lab_selectAvatar.setText("OR SELECT AVATAR");
        Sign_Up_Female_User.add(lab_selectAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 30));

        lab_uploadImg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lab_uploadImg.setForeground(new java.awt.Color(255, 255, 255));
        lab_uploadImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_uploadImg.setText("UPLOAD A PICTURE");
        Sign_Up_Female_User.add(lab_uploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up_Female_User, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up_Female_User, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String Pathimage;

    private void setPathimag(String Path) {
        this.Pathimage = Path;

    }

    private String getPath() {
        return this.Pathimage;
    }

    private String filePath = "";

    String getUplodedImagePath() {
        return this.filePath;
    }


    private void img9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseClicked
        try {

            JFileChooser filechooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
            filechooser.setFileFilter(filter);

            filechooser.showDialog(null, "Choose Image");

            File imagefile = filechooser.getSelectedFile();

            if (imagefile != null) {
                filePath = imagefile.getAbsolutePath();

                Image image = Toolkit.getDefaultToolkit().getImage(filePath);
                Image finalimage = image.getScaledInstance(img9.getWidth(), img9.getHeight(), Image.SCALE_AREA_AVERAGING);
                ImageIcon imageicon = new ImageIcon(finalimage);
                img9.setIcon(imageicon);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_img9MouseClicked

    private void goto_signIn() {
        SSS_Forms_Manager.getInstance().showForm(new sign_in());
    }

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        goto_signIn();
        setPathimag("Asstes/Female_User_Avatar/female1.jpg");
    }//GEN-LAST:event_img1MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked
        goto_signIn();
        setPathimag("Asstes/Female_User_Avatar/female3.jpg");
    }//GEN-LAST:event_img3MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        goto_signIn();
        setPathimag("Asstes/Female_User_Avatar/female4.jpg");
    }//GEN-LAST:event_img4MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        goto_signIn();
        setPathimag("Asstes/Female_User_Avatar/female9.jpg");
    }//GEN-LAST:event_img8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Sign_Up_Female_User;
    private Frontend.UI_Components.ImageAvatar img1;
    private Frontend.UI_Components.ImageAvatar img3;
    private Frontend.UI_Components.ImageAvatar img4;
    private Frontend.UI_Components.ImageAvatar img8;
    private Frontend.UI_Components.ImageAvatar img9;
    private javax.swing.JLabel lab_selectAvatar;
    private javax.swing.JLabel lab_uploadImg;
    private Frontend.UI_Components.PanelRound pane1;
    private Frontend.UI_Components.PanelRound pane3;
    private Frontend.UI_Components.PanelRound pane4;
    private Frontend.UI_Components.PanelRound pane8;
    private Frontend.UI_Components.PanelRound pane9;
    // End of variables declaration//GEN-END:variables
}
