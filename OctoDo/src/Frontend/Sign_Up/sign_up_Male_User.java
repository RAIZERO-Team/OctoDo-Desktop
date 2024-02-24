package Frontend.Sign_Up;

import Application.Form.SSS_Forms_Manager;
import Frontend.Sign_In.sign_in;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

public class sign_up_Male_User extends javax.swing.JPanel {

    public sign_up_Male_User() {
        initComponents();
        init();
    }

    private void init() {
        Sign_Up_Male_User.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        img1.setCursorHand();
        img4.setCursorHand();
        img5.setCursorHand();
        img8.setCursorHand();
        img9.setCursorHand();

        svgIcon1.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        svgIcon1.setCursorHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sign_Up_Male_User = new Frontend.UI_Components.PanelRound();
        panel1 = new Frontend.UI_Components.PanelRound();
        img1 = new Frontend.UI_Components.ImageAvatar();
        panel4 = new Frontend.UI_Components.PanelRound();
        img4 = new Frontend.UI_Components.ImageAvatar();
        panel5 = new Frontend.UI_Components.PanelRound();
        img5 = new Frontend.UI_Components.ImageAvatar();
        panel8 = new Frontend.UI_Components.PanelRound();
        img8 = new Frontend.UI_Components.ImageAvatar();
        panel9 = new Frontend.UI_Components.PanelRound();
        img9 = new Frontend.UI_Components.ImageAvatar();
        lab_selectAvater = new javax.swing.JLabel();
        lab_uploadImg = new javax.swing.JLabel();
        svgIcon1 = new Frontend.UI_Components.svgIcon();

        Sign_Up_Male_User.setRoundBottomLeft(30);
        Sign_Up_Male_User.setRoundBottomRight(30);
        Sign_Up_Male_User.setRoundTopLeft(30);
        Sign_Up_Male_User.setRoundTopRight(30);
        Sign_Up_Male_User.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(49, 62, 74));
        panel1.setRoundBottomLeft(30);
        panel1.setRoundBottomRight(30);
        panel1.setRoundTopLeft(30);
        panel1.setRoundTopRight(30);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male1.jpg"))); // NOI18N
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        panel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 150));

        panel4.setBackground(new java.awt.Color(49, 62, 74));
        panel4.setDoubleBuffered(false);
        panel4.setRoundBottomLeft(30);
        panel4.setRoundBottomRight(30);
        panel4.setRoundTopLeft(30);
        panel4.setRoundTopRight(30);
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male4.jpg"))); // NOI18N
        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img4MouseClicked(evt);
            }
        });
        panel4.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 150, 150));

        panel5.setBackground(new java.awt.Color(49, 62, 74));
        panel5.setRoundBottomLeft(30);
        panel5.setRoundBottomRight(30);
        panel5.setRoundTopLeft(30);
        panel5.setRoundTopRight(30);
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male5.jpg"))); // NOI18N
        img5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img5MouseClicked(evt);
            }
        });
        panel5.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 150, 150));

        panel8.setBackground(new java.awt.Color(49, 62, 74));
        panel8.setRoundBottomLeft(30);
        panel8.setRoundBottomRight(30);
        panel8.setRoundTopLeft(30);
        panel8.setRoundTopRight(30);
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male8.jpg"))); // NOI18N
        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img8MouseClicked(evt);
            }
        });
        panel8.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 150, 150));

        panel9.setBackground(new java.awt.Color(49, 62, 74));
        panel9.setRoundBottomLeft(30);
        panel9.setRoundBottomRight(30);
        panel9.setRoundTopLeft(30);
        panel9.setRoundTopRight(30);
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/user.png"))); // NOI18N
        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img9MouseClicked(evt);
            }
        });
        panel9.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 110));

        Sign_Up_Male_User.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 150));

        lab_selectAvater.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_selectAvater.setText("OR SELECT AVATAR");
        Sign_Up_Male_User.add(lab_selectAvater, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 30));

        lab_uploadImg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_uploadImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_uploadImg.setText("UPLOAD A PICTURE");
        Sign_Up_Male_User.add(lab_uploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 150, 30));
        Sign_Up_Male_User.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up_Male_User, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up_Male_User, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private static String Pathimage;

    private static void setPathimag(String Path) {
        sign_up_Male_User.Pathimage = Path;
    }

    private String getPath() {
        return this.Pathimage;
    }

    private static String filePath = "";

    // here the backend work
    String getUplodedImagePath() {
        return this.filePath;
    }

    private void setUserImag() {
        try {

            JFileChooser filechooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
            filechooser.setFileFilter(filter);

            filechooser.showDialog(null, "Choose Image");

            File imagefile = filechooser.getSelectedFile();
            //filechooser.APPROVE_OPTION;
            if (imagefile != null) {
                filePath = imagefile.getAbsolutePath();

                Image image = Toolkit.getDefaultToolkit().getImage(filePath);
                Image finalimage = image.getScaledInstance(img9.getWidth(), img9.getHeight(), Image.SCALE_AREA_AVERAGING);
                ImageIcon imageicon = new ImageIcon(finalimage);
                img9.setIcon(imageicon);
            }

            lab_uploadImg.setText("Save");

        } catch (Exception e) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Please Select good image and have extension .jpg or png");
        }

        // here the backend work
        System.out.println(getUplodedImagePath());
    }


    private void img9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseClicked
        setUserImag();
    }//GEN-LAST:event_img9MouseClicked

    private void goto_signIn() {
        SSS_Forms_Manager.getInstance().showForm(new sign_in());
    }

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male1.jpg");

        // here the backend work
        System.out.println("The Path:" + getPath());
    }//GEN-LAST:event_img1MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male4.jpg");
    }//GEN-LAST:event_img4MouseClicked

    private void img5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male5.jpg");
    }//GEN-LAST:event_img5MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male9.jpg");
    }//GEN-LAST:event_img8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Sign_Up_Male_User;
    private Frontend.UI_Components.ImageAvatar img1;
    private Frontend.UI_Components.ImageAvatar img4;
    private Frontend.UI_Components.ImageAvatar img5;
    private Frontend.UI_Components.ImageAvatar img8;
    private Frontend.UI_Components.ImageAvatar img9;
    private javax.swing.JLabel lab_selectAvater;
    private javax.swing.JLabel lab_uploadImg;
    private Frontend.UI_Components.PanelRound panel1;
    private Frontend.UI_Components.PanelRound panel4;
    private Frontend.UI_Components.PanelRound panel5;
    private Frontend.UI_Components.PanelRound panel8;
    private Frontend.UI_Components.PanelRound panel9;
    private Frontend.UI_Components.svgIcon svgIcon1;
    // End of variables declaration//GEN-END:variables
}
