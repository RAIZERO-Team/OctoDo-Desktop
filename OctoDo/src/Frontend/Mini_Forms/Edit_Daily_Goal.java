
package Frontend.Mini_Forms;


public class Edit_Daily_Goal extends javax.swing.JPanel {


    public Edit_Daily_Goal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Frontend.UI_Components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        shadow_Button1 = new Frontend.UI_Components.Shadow_Button();
        shadow_Button2 = new Frontend.UI_Components.Shadow_Button();

        setBackground(new java.awt.Color(51, 51, 51));

        panelRound1.setBackground(new java.awt.Color(96, 96, 96));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Your Daily Goal");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 30));

        jComboBox1.setBackground(new java.awt.Color(213, 213, 213));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 minutes", "1 hours", "2 hours", "3 hours", "3 hours, 30 minutes", "4 hours", "5 hours", "6 hours", "7 hours", "8 hours", " " }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelRound1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 370, 50));

        shadow_Button1.setBackground(new java.awt.Color(204, 204, 204));
        shadow_Button1.setForeground(new java.awt.Color(51, 51, 51));
        shadow_Button1.setText("Save");
        shadow_Button1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        shadow_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadow_Button1ActionPerformed(evt);
            }
        });
        panelRound1.add(shadow_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 160, 50));

        shadow_Button2.setBackground(new java.awt.Color(204, 204, 204));
        shadow_Button2.setForeground(new java.awt.Color(51, 51, 51));
        shadow_Button2.setText("Cancel");
        shadow_Button2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        shadow_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadow_Button2ActionPerformed(evt);
            }
        });
        panelRound1.add(shadow_Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void shadow_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadow_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shadow_Button1ActionPerformed

    private void shadow_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadow_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shadow_Button2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.Shadow_Button shadow_Button1;
    private Frontend.UI_Components.Shadow_Button shadow_Button2;
    // End of variables declaration//GEN-END:variables
}
