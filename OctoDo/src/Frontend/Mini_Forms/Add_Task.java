package Frontend.Mini_Forms;

import Backend.Date.Date_Time;
import javax.swing.SwingConstants;

public class Add_Task extends javax.swing.JPanel {

    public static String Task_Name = "";
    public static String Task_Reminder_Time = "";
    public static String Task_Day = "";
    public static String Task_Date = "";

    
    public Add_Task() {
        initComponents();
        timePicker.setEditor(Set_Task_Time);
        timePicker.setOrientation(SwingConstants.HORIZONTAL);
    }

    
    public void addTask() {
        Task_Name = Set_Task_Name.getText();
        Task_Reminder_Time = Set_Task_Time.getText();
        
        // Here we want the day and date of create this task
        //Task_Day = Date_Time.getDay();
        //Task_Date = Date_Time.getDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker = new Frontend.UI_Components.TimePiker.TimePicker();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        lab_add = new javax.swing.JLabel();
        btn_save = new Frontend.UI_Components.Shadow_Button();
        btn_cancel = new Frontend.UI_Components.Shadow_Button();
        Set_Task_Time = new javax.swing.JFormattedTextField();
        Set_Task_Name = new javax.swing.JTextField();
        lab_taskName = new javax.swing.JLabel();
        lab_taskRemin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Task_description = new javax.swing.JTextArea();
        lab_taskDesc = new javax.swing.JLabel();

        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lab_add.setText("Add New Task");
        panelRound1.add(lab_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 165, 30));

        btn_save.setText("Save");
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        panelRound1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 100, -1));

        btn_cancel.setText("Cancel");
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        panelRound1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, -1));

        Set_Task_Time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelRound1.add(Set_Task_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 280, 30));

        Set_Task_Name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelRound1.add(Set_Task_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 30));

        lab_taskName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_taskName.setText("Task Name");
        panelRound1.add(lab_taskName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));

        lab_taskRemin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_taskRemin.setText("Task Reminder Time");
        panelRound1.add(lab_taskRemin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        Task_description.setColumns(20);
        Task_description.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Task_description.setRows(5);
        Task_description.setText("Test");
        jScrollPane1.setViewportView(Task_description);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 280, 80));

        lab_taskDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_taskDesc.setText("Task Description");
        panelRound1.add(lab_taskDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

  public int n = 0;
    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        new Task().setdata(Task_Name ,Task_Reminder_Time);
        n++;
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Set_Task_Name;
    private javax.swing.JFormattedTextField Set_Task_Time;
    private javax.swing.JTextArea Task_description;
    private Frontend.UI_Components.Shadow_Button btn_cancel;
    private Frontend.UI_Components.Shadow_Button btn_save;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_add;
    private javax.swing.JLabel lab_taskDesc;
    private javax.swing.JLabel lab_taskName;
    private javax.swing.JLabel lab_taskRemin;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.TimePiker.TimePicker timePicker;
    // End of variables declaration//GEN-END:variables
}
