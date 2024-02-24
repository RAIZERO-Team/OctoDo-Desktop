package Application.Main;

import Application.Form.SSS_Forms_Manager;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import Frontend.Sign_In.sign_in;
import Application.Form.MainForm;
import java.awt.Toolkit;
import raven.toast.Notifications;

public class Application extends javax.swing.JFrame {

    private static Application app;
    private final MainForm mainForm;
    private final sign_in loginForm;

    public Application() {
        initComponents();
        setSize(new Dimension(1360, 770));
        setLocationRelativeTo(null);
        setTitle("<html><b>OCTODO</b></html>");
        setResizable(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asstes/Icons/logo.png")));
        mainForm = new MainForm();
        loginForm = new sign_in();
        SSS_Forms_Manager.getInstance().initApplication(this);
        setContentPane(loginForm);
        Notifications.getInstance().setJFrame(this);
    }

    public void showDialog() {
        Show_Notification.setSize(420, 210);
        Show_Notification.add(notification);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = 420;   // 420
        int frameHeight = 260;  // 260
        int x = (screenWidth - frameWidth);
        int y = (screenHeight - frameHeight);
        Show_Notification.setLocation(new java.awt.Point(x, y));
        Show_Notification.setVisible(true);
    }

    public static void showForm(Component component) {
        component.applyComponentOrientation(app.getComponentOrientation());
        app.mainForm.showForm(component);
    }

    public static void sign_in() {
        FlatAnimatedLafChange.showSnapshot();
        app.setContentPane(app.mainForm);
        app.mainForm.applyComponentOrientation(app.getComponentOrientation());
        setSelectedMenu(0, 0);
        //app.mainForm.hideMenu();
        SwingUtilities.updateComponentTreeUI(app.mainForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }

    public static void logout() {
        FlatAnimatedLafChange.showSnapshot();
        app.setContentPane(app.loginForm);
        app.loginForm.applyComponentOrientation(app.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(app.loginForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }

    public static void setSelectedMenu(int index, int subIndex) {
        app.mainForm.setSelectedMenu(index, subIndex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Show_Notification = new javax.swing.JDialog();
        notification = new Frontend.Mini_Forms.Notification();
        MenuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout Show_NotificationLayout = new javax.swing.GroupLayout(Show_Notification.getContentPane());
        Show_Notification.getContentPane().setLayout(Show_NotificationLayout);
        Show_NotificationLayout.setHorizontalGroup(
            Show_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Show_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Show_NotificationLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Show_NotificationLayout.setVerticalGroup(
            Show_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Show_NotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Show_NotificationLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Icons/undo.png"))); // NOI18N
        jMenu3.setText("Back");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asstes/Icons/redo.png"))); // NOI18N
        jMenu4.setText("Forword");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MenuBar.add(jMenu4);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("Frontend.Application_Theme");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            app = new Application();
            app.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JDialog Show_Notification;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private Frontend.Mini_Forms.Notification notification;
    // End of variables declaration//GEN-END:variables
}
