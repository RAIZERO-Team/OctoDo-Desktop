
package Frontend.Mini_Forms;

public class Home_Page_Tasks extends javax.swing.JPanel {


    public Home_Page_Tasks(String HTName , String HTRTime , String HTDay , String HTDate) {
        initComponents();
        H_Task_Name.setText(HTName);
        H_Task_Reminder_Time.setText(HTRTime);
        H_Task_Day.setText(HTDay);
        H_Task_Date.setText(HTDate);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Frontend.UI_Components.PanelRound();
        H_Task_Name = new javax.swing.JLabel();
        H_Task_Day = new javax.swing.JLabel();
        H_Task_Reminder_Time = new javax.swing.JLabel();
        H_Task_Date = new javax.swing.JLabel();

        panelRound1.setBackground(new java.awt.Color(0, 51, 102));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        H_Task_Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        H_Task_Name.setForeground(new java.awt.Color(255, 255, 255));
        H_Task_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H_Task_Name.setText("Task1");
        panelRound1.add(H_Task_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 110, 20));

        H_Task_Day.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        H_Task_Day.setForeground(new java.awt.Color(255, 255, 255));
        H_Task_Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H_Task_Day.setText("Thursday");
        panelRound1.add(H_Task_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, 105, 20));

        H_Task_Reminder_Time.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        H_Task_Reminder_Time.setForeground(new java.awt.Color(255, 255, 255));
        H_Task_Reminder_Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H_Task_Reminder_Time.setText("10:00 PM");
        panelRound1.add(H_Task_Reminder_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 35, 60, -1));

        H_Task_Date.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        H_Task_Date.setForeground(new java.awt.Color(255, 255, 255));
        H_Task_Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H_Task_Date.setText("30-12-2024");
        panelRound1.add(H_Task_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 35, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel H_Task_Date;
    private javax.swing.JLabel H_Task_Day;
    private javax.swing.JLabel H_Task_Name;
    private javax.swing.JLabel H_Task_Reminder_Time;
    private Frontend.UI_Components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
