package Frontend.Mini_Forms;

public class Task extends javax.swing.JPanel {

    public String taskName;
    public String time;

    public Task() {
        initComponents();
        init();
        getdata();
    }
    
    private void init(){
        Task.setCursorHand();
        Task.add(edit_Task1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 2, -1, -1));
        edit_Task1.setVisible(false);        
    }

    public void setdata(String taskName, String Time) {
        this.taskName = taskName;
        this.time = Time;
    }

    public void getdata() {
        Task_Name.setText(taskName);
        Task_Reminder_Time.setText(time);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_Task1 = new Frontend.Mini_Forms.Edit_Task();
        Task = new Frontend.UI_Components.PanelRound();
        Task_Name = new javax.swing.JLabel();
        Task_Reminder_Time = new javax.swing.JLabel();

        Task.setBackground(new java.awt.Color(153, 153, 153));
        Task.setRoundBottomLeft(40);
        Task.setRoundBottomRight(40);
        Task.setRoundTopLeft(40);
        Task.setRoundTopRight(40);
        Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskMouseClicked(evt);
            }
        });
        Task.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Task_Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Task_Name.setForeground(new java.awt.Color(0, 0, 0));
        Task_Name.setText("Task1");
        Task.add(Task_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 25, 90, 20));

        Task_Reminder_Time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Task_Reminder_Time.setForeground(new java.awt.Color(0, 0, 0));
        Task_Reminder_Time.setText("8:00 Pm");
        Task.add(Task_Reminder_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 25, 75, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Task, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Task, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back() {
        if (edit_Task1.n == 1){
        edit_Task1.setVisible(false);
        Task.setBackground(new java.awt.Color(153, 153, 153));  // [135,135,135]
        Task_Name.setVisible(true);
        Task_Reminder_Time.setVisible(true);
        }
    }

    private void TaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskMouseClicked

       edit_Task1.setVisible(true);
        Task.setBackground(new java.awt.Color(135, 135, 135));  // [135,135,135]
        Task_Name.setVisible(false);
        Task_Reminder_Time.setVisible(false);
    }//GEN-LAST:event_TaskMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Task;
    private javax.swing.JLabel Task_Name;
    private javax.swing.JLabel Task_Reminder_Time;
    private Frontend.Mini_Forms.Edit_Task edit_Task1;
    // End of variables declaration//GEN-END:variables
}
