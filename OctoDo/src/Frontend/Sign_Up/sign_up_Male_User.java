package Frontend.Sign_Up;

import Application.Form.FormsManager;
import Frontend.Sign_In.sign_in;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

public class sign_up_Male_User extends javax.swing.JPanel {

    public sign_up_Male_User() {
        initComponents();
        Sign_Up_Male_User.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        cursorhand();
        svgIcon1.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
    }

    private void cursorhand() {
        img1.setCursorHand();
        img2.setCursorHand();
        img3.setCursorHand();
        img4.setCursorHand();
        img5.setCursorHand();
        img6.setCursorHand();
        img7.setCursorHand();
        img8.setCursorHand();
        img9.setCursorHand();

        svgIcon1.setCursorHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sign_Up_Male_User = new Frontend.UI_Components.PanelRound();
        panel1 = new Frontend.UI_Components.PanelRound();
        img1 = new Frontend.UI_Components.ImageAvatar();
        panel2 = new Frontend.UI_Components.PanelRound();
        img2 = new Frontend.UI_Components.ImageAvatar();
        panel3 = new Frontend.UI_Components.PanelRound();
        img3 = new Frontend.UI_Components.ImageAvatar();
        panel4 = new Frontend.UI_Components.PanelRound();
        img4 = new Frontend.UI_Components.ImageAvatar();
        panel5 = new Frontend.UI_Components.PanelRound();
        img5 = new Frontend.UI_Components.ImageAvatar();
        panel6 = new Frontend.UI_Components.PanelRound();
        img6 = new Frontend.UI_Components.ImageAvatar();
        panel7 = new Frontend.UI_Components.PanelRound();
        img7 = new Frontend.UI_Components.ImageAvatar();
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

        Sign_Up_Male_User.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, 150));

        panel2.setBackground(new java.awt.Color(49, 62, 74));
        panel2.setRoundBottomLeft(30);
        panel2.setRoundBottomRight(30);
        panel2.setRoundTopLeft(30);
        panel2.setRoundTopRight(30);
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male2.jpg"))); // NOI18N
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        panel2.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 150, 150));

        panel3.setBackground(new java.awt.Color(49, 62, 74));
        panel3.setRoundBottomLeft(30);
        panel3.setRoundBottomRight(30);
        panel3.setRoundTopLeft(30);
        panel3.setRoundTopRight(30);
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male3.jpg"))); // NOI18N
        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img3MouseClicked(evt);
            }
        });
        panel3.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 150, 150));

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

        Sign_Up_Male_User.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 150, 150));

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

        Sign_Up_Male_User.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 150, 150));

        panel6.setBackground(new java.awt.Color(49, 62, 74));
        panel6.setRoundBottomLeft(30);
        panel6.setRoundBottomRight(30);
        panel6.setRoundTopLeft(30);
        panel6.setRoundTopRight(30);
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male7.jpg"))); // NOI18N
        img6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img6MouseClicked(evt);
            }
        });
        panel6.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 150, 150));

        panel7.setBackground(new java.awt.Color(49, 62, 74));
        panel7.setRoundBottomLeft(30);
        panel7.setRoundBottomRight(30);
        panel7.setRoundTopLeft(30);
        panel7.setRoundTopRight(30);
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Male_User_Avatar/male7.jpg"))); // NOI18N
        img7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img7MouseClicked(evt);
            }
        });
        panel7.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 100, 100));

        Sign_Up_Male_User.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 150, 150));

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

        Sign_Up_Male_User.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 150, 150));

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

        Sign_Up_Male_User.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 150, 150));

        lab_selectAvater.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_selectAvater.setText("OR SELECT AVATAR");
        Sign_Up_Male_User.add(lab_selectAvater, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, 30));

        lab_uploadImg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_uploadImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_uploadImg.setText("UPLOAD A PICTURE");
        Sign_Up_Male_User.add(lab_uploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 30));
        Sign_Up_Male_User.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up_Male_User, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
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
 private String Pathimage;

    private void setPathimag(String Path) {
        this.Pathimage = Path;
    }

    private String getPath() {
        return this.Pathimage;
    }

    private String filePath = "";

    // here the backend work
    String getUplodedImagePath() {
        return this.filePath;
    }

    private void setUserImag(){
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
        FormsManager.getInstance().showForm(new sign_in());
    }

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male1.jpg");

        // here the backend work
        System.out.println("The Path:" + getPath());
    }//GEN-LAST:event_img1MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male2.jpg");
    }//GEN-LAST:event_img2MouseClicked

    private void img3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male3.jpg");

        // here the backend work
        System.out.println("The Path:" + getPath());
    }//GEN-LAST:event_img3MouseClicked

    private void img4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male4.jpg");
    }//GEN-LAST:event_img4MouseClicked

    private void img5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male5.jpg");
    }//GEN-LAST:event_img5MouseClicked

    private void img6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male6.jpg");
    }//GEN-LAST:event_img6MouseClicked

    private void img7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male7.jpg");
    }//GEN-LAST:event_img7MouseClicked

    private void img8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseClicked
        goto_signIn();
        setPathimag("Asstes/Male_User_Avatar/male9.jpg");
    }//GEN-LAST:event_img8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Sign_Up_Male_User;
    private Frontend.UI_Components.ImageAvatar img1;
    private Frontend.UI_Components.ImageAvatar img2;
    private Frontend.UI_Components.ImageAvatar img3;
    private Frontend.UI_Components.ImageAvatar img4;
    private Frontend.UI_Components.ImageAvatar img5;
    private Frontend.UI_Components.ImageAvatar img6;
    private Frontend.UI_Components.ImageAvatar img7;
    private Frontend.UI_Components.ImageAvatar img8;
    private Frontend.UI_Components.ImageAvatar img9;
    private javax.swing.JLabel lab_selectAvater;
    private javax.swing.JLabel lab_uploadImg;
    private Frontend.UI_Components.PanelRound panel1;
    private Frontend.UI_Components.PanelRound panel2;
    private Frontend.UI_Components.PanelRound panel3;
    private Frontend.UI_Components.PanelRound panel4;
    private Frontend.UI_Components.PanelRound panel5;
    private Frontend.UI_Components.PanelRound panel6;
    private Frontend.UI_Components.PanelRound panel7;
    private Frontend.UI_Components.PanelRound panel8;
    private Frontend.UI_Components.PanelRound panel9;
    private Frontend.UI_Components.svgIcon svgIcon1;
    // End of variables declaration//GEN-END:variables
}
