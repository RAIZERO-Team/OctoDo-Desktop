
package Frontend.Forms;

import com.formdev.flatlaf.FlatClientProperties;


public class Dashboard extends javax.swing.JPanel {


    public Dashboard() {
        initComponents();
        Dashborad.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashborad = new Frontend.UI_Components.PanelRound();
        jButton1 = new javax.swing.JButton();

        Dashborad.setRoundBottomLeft(30);
        Dashborad.setRoundBottomRight(30);
        Dashborad.setRoundTopLeft(30);
        Dashborad.setRoundTopRight(30);

        jButton1.setText("Test");

        javax.swing.GroupLayout DashboradLayout = new javax.swing.GroupLayout(Dashborad);
        Dashborad.setLayout(DashboradLayout);
        DashboradLayout.setHorizontalGroup(
            DashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboradLayout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addComponent(jButton1)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        DashboradLayout.setVerticalGroup(
            DashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboradLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton1)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dashborad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dashborad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Dashborad;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
