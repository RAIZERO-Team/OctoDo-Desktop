package Frontend.Splash_Screen;

import static Backend.Database.QuerieAdninstratorSqlite.dayToDelayTasks;
import static Backend.Database.QuerieAdninstratorSqlite.weekToDayTasks;
import java.awt.Desktop;
import java.net.URL;

public class splash_screen1 extends javax.swing.JPanel {

    public splash_screen1() {
        initComponents();
        setIcon();
        borderPanel1.start();
        DBstart();
    }

    private static void DBstart() {

        dayToDelayTasks();
        weekToDayTasks();
    }
    private void setIcon() {
        svgIconLinkedin.setSVGIcon("Icons/linkedin1.svg", 40, 40);
        svgIconLinkedin.setCursorHand();
        svgIconGitHub.setSVGIcon("Icons/Github1.svg", 40, 40);
        svgIconGitHub.setCursorHand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel = new keeptoo.KGradientPanel();
        lab_CSB = new javax.swing.JLabel();
        lodingValue = new javax.swing.JLabel();
        lodingtxt = new javax.swing.JLabel();
        lodingBar = new javax.swing.JProgressBar();
        lodingChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lab_teamName = new javax.swing.JLabel();
        lab_ver = new javax.swing.JLabel();
        borderPanel1 = new Frontend.UI_Components.FancyBorderRadius.BorderPanel();
        svgIconLinkedin = new Frontend.UI_Components.svgIcon();
        svgIconGitHub = new Frontend.UI_Components.svgIcon();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel.setkEndColor(new java.awt.Color(191, 90, 242));
        kGradientPanel.setkGradientFocus(200);
        kGradientPanel.setkStartColor(new java.awt.Color(4, 125, 198));
        kGradientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_CSB.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        lab_CSB.setForeground(new java.awt.Color(255, 255, 255));
        lab_CSB.setText("OctoDo");
        lab_CSB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(lab_CSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, 140, -1));

        lodingValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lodingValue.setForeground(new java.awt.Color(255, 255, 255));
        lodingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lodingValue.setText("0%");
        kGradientPanel.add(lodingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        lodingtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lodingtxt.setForeground(new java.awt.Color(255, 255, 255));
        lodingtxt.setText("Loding...");
        kGradientPanel.add(lodingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 304, 73, -1));

        lodingBar.setForeground(new java.awt.Color(50, 215, 75));
        kGradientPanel.add(lodingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 330, 440, 8));

        lodingChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lodingChange.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel.add(lodingChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 344, 302, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 235, 235));
        jLabel1.setText("A Beautifull Applicathion With Big Resourse");
        kGradientPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 40));

        lab_teamName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_teamName.setForeground(new java.awt.Color(255, 255, 255));
        lab_teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_teamName.setText("RaiZero");
        lab_teamName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(lab_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 110, 20));

        lab_ver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_ver.setForeground(new java.awt.Color(255, 255, 255));
        lab_ver.setText("Version1.0.0 2024");
        kGradientPanel.add(lab_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 24));
        kGradientPanel.add(borderPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 150, 150));

        svgIconLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconLinkedinMouseClicked(evt);
            }
        });
        kGradientPanel.add(svgIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 40, 40));

        svgIconGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconGitHubMouseClicked(evt);
            }
        });
        kGradientPanel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 40, 40));

        add(kGradientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.FancyBorderRadius.BorderPanel borderPanel1;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JLabel lab_CSB;
    private javax.swing.JLabel lab_teamName;
    private javax.swing.JLabel lab_ver;
    public static javax.swing.JProgressBar lodingBar;
    public static javax.swing.JLabel lodingChange;
    public static javax.swing.JLabel lodingValue;
    public static javax.swing.JLabel lodingtxt;
    private Frontend.UI_Components.svgIcon svgIconGitHub;
    private Frontend.UI_Components.svgIcon svgIconLinkedin;
    // End of variables declaration//GEN-END:variables
}
