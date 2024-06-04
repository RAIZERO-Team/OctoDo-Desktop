
package Frontend.Splash_Screen;

import Application.Main.Application;
import static Backend.Database.QuerieAdninstratorSqlite.dayToDelayTasks;
import static Backend.Database.QuerieAdninstratorSqlite.weekToDayTasks;
import java.awt.Desktop;
import java.net.URL;

public class splash_screen2 extends javax.swing.JPanel {


    public splash_screen2() {
        initComponents();
        DBstart();
    }
    private static void DBstart(){
    
        dayToDelayTasks();
        weekToDayTasks();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel = new keeptoo.KGradientPanel();
        lab_CSB = new javax.swing.JLabel();
        svgIconLinkedin = new Frontend.UI_Components.svgIcon();
        svgIconGitHub = new Frontend.UI_Components.svgIcon();
        jPanel1 = new javax.swing.JPanel();
        lodingBar = new javax.swing.JProgressBar();
        lab_teamName = new javax.swing.JLabel();
        lab_ver = new javax.swing.JLabel();
        lodingChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        borderPanel1 = new Frontend.UI_Components.FancyBorderRadius.BorderPanel();

        kGradientPanel.setkEndColor(new java.awt.Color(191, 90, 242));
        kGradientPanel.setkGradientFocus(200);
        kGradientPanel.setkStartColor(new java.awt.Color(4, 125, 198));
        kGradientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_CSB.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        lab_CSB.setForeground(new java.awt.Color(255, 255, 255));
        lab_CSB.setText("OctoDo");
        lab_CSB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(lab_CSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, -1));

        svgIconLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconLinkedinMouseClicked(evt);
            }
        });
        kGradientPanel.add(svgIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, 40));

        svgIconGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconGitHubMouseClicked(evt);
            }
        });
        kGradientPanel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 40, 40));

        jPanel1.setBackground(new java.awt.Color(169, 130, 189));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lodingBar.setForeground(new java.awt.Color(50, 215, 75));
        jPanel1.add(lodingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 730, 8));

        lab_teamName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_teamName.setForeground(new java.awt.Color(40, 122, 166));
        lab_teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_teamName.setText("RaiZero");
        lab_teamName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lab_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 20));

        lab_ver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_ver.setForeground(new java.awt.Color(0, 0, 0));
        lab_ver.setText("Version1.0.0");
        jPanel1.add(lab_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 90, 24));

        lodingChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lodingChange.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lodingChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 302, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Copyright © 2024 RaiZero || All rights reserved");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 320, 20));
        jPanel1.add(borderPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 70, 70));

        kGradientPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 730, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void svgIconLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconLinkedinMouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/ahmedbadawihosny/Computer-Science-Bridge").toURI());
        } catch (Exception e) {

        }
    }//GEN-LAST:event_svgIconLinkedinMouseClicked

    private void svgIconGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconGitHubMouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/ahmedbadawihosny/Computer-Science-Bridge").toURI());
        } catch (Exception e) {

        }
    }//GEN-LAST:event_svgIconGitHubMouseClicked

   static splash_screen2 app ;
    public static void main(String[] args) {
     
        System.out.println("hhhhhhhhhh");
         dayToDelayTasks();
        weekToDayTasks();
        System.out.println("llllllllllll");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.FancyBorderRadius.BorderPanel borderPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JLabel lab_CSB;
    private javax.swing.JLabel lab_teamName;
    private javax.swing.JLabel lab_ver;
    private javax.swing.JProgressBar lodingBar;
    private javax.swing.JLabel lodingChange;
    private Frontend.UI_Components.svgIcon svgIconGitHub;
    private Frontend.UI_Components.svgIcon svgIconLinkedin;
    // End of variables declaration//GEN-END:variables
}
