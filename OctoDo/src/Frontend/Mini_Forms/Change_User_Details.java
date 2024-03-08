
package Frontend.Mini_Forms;


public class Change_User_Details extends javax.swing.JPanel {

    public static String First_Name;
    public static String Last_Name;
    
    public Change_User_Details() {
        initComponents();
        init();
    }

    private void init(){
        
    }
    
    public void setData(){
        First_Name = Fname.getText();
        Last_Name = Lname.getText();
    }

    // here backend work
    public void updateData(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound = new Frontend.UI_Components.PanelRound();
        lab_text = new javax.swing.JLabel();
        lab_Lname = new javax.swing.JLabel();
        lab_Fname = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        btn_save = new Frontend.UI_Components.Shadow_Button();
        btn_cancel = new Frontend.UI_Components.Shadow_Button();

        setBackground(new java.awt.Color(51, 51, 51));

        panelRound.setRoundBottomLeft(30);
        panelRound.setRoundBottomRight(30);
        panelRound.setRoundTopLeft(30);
        panelRound.setRoundTopRight(30);
        panelRound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab_text.setForeground(new java.awt.Color(255, 255, 255));
        lab_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_text.setText("Change Username");
        panelRound.add(lab_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 30));

        lab_Lname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lab_Lname.setForeground(new java.awt.Color(255, 255, 255));
        lab_Lname.setText("Last Name");
        panelRound.add(lab_Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 90, 30));

        lab_Fname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lab_Fname.setForeground(new java.awt.Color(255, 255, 255));
        lab_Fname.setText("First Name");
        panelRound.add(lab_Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 30));

        Fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelRound.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 30));

        Lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelRound.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 30));

        btn_save.setBackground(new java.awt.Color(204, 204, 204));
        btn_save.setForeground(new java.awt.Color(51, 51, 51));
        btn_save.setText("Save");
        btn_save.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        panelRound.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 155, 160, 40));

        btn_cancel.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancel.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancel.setText("Cancel");
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        panelRound.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 155, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private Frontend.UI_Components.Shadow_Button btn_cancel;
    private Frontend.UI_Components.Shadow_Button btn_save;
    private javax.swing.JLabel lab_Fname;
    private javax.swing.JLabel lab_Lname;
    private javax.swing.JLabel lab_text;
    private Frontend.UI_Components.PanelRound panelRound;
    // End of variables declaration//GEN-END:variables
}
