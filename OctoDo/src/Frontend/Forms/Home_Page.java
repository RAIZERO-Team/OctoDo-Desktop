package Frontend.Forms;

import Frontend.Mini_Forms.Add_Task;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Dimension;

public class Home_Page extends javax.swing.JPanel {

    
    public Home_Page() {
        initComponents();
        svgtIcon();
        init();
        showDialog();
        createTasks();
    }

    private void svgtIcon() {
        svgIcon_welco.setSVGIcon("Asstes/SVG_Icons/1F44B.svg", 30, 30);
    }

    private void init() {
        homepage.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        btn_Add_Task.setCursorHand();
    }

    private void showDialog(){
        Dialog.setSize(400, 600);
        Dialog.add(add_Task);        
    }
    
    public void createTasks() {
        if (new Add_Task().n == 1){
        Frontend.Mini_Forms.Task Tasks = new Frontend.Mini_Forms.Task();
        Tasks.setMaximumSize(new Dimension(240, 70));
        num++;
        today_tasks.add(Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, m, -1, -1));
        m += 100;
        System.out.println(test + num);
        revalidate();
        repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        add_Task = new Frontend.Mini_Forms.Add_Task();
        homepage = new Frontend.UI_Components.PanelRound();
        lab_welc = new javax.swing.JLabel();
        svgIcon_welco = new Frontend.UI_Components.svgIcon();
        lab_user_Name = new javax.swing.JLabel();
        lab_todayTask = new javax.swing.JLabel();
        lab_completed = new javax.swing.JLabel();
        lab_notStarted = new javax.swing.JLabel();
        Today_Tasks = new Frontend.UI_Components.PanelRound();
        btn_Add_Task = new Frontend.UI_Components.Shadow_Button();
        scrollPane1 = new Frontend.UI_Components.ScrollBar.ScrollPaneWin11();
        today_tasks = new javax.swing.JPanel();
        Completed = new Frontend.UI_Components.PanelRound();
        scrollPaneWin2 = new Frontend.UI_Components.ScrollBar.ScrollPaneWin11();
        completed_Tasks = new javax.swing.JPanel();
        Overdue_Tasks = new Frontend.UI_Components.PanelRound();
        ScrollPane3 = new javax.swing.JScrollPane();
        overdue_tasks = new javax.swing.JPanel();

        Dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Dialog.setLocation(new java.awt.Point(588, 150));

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(add_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(add_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        homepage.setRoundBottomLeft(30);
        homepage.setRoundBottomRight(30);
        homepage.setRoundTopLeft(30);
        homepage.setRoundTopRight(30);
        homepage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_welc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lab_welc.setForeground(new java.awt.Color(255, 255, 255));
        lab_welc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_welc.setText("Welcome");
        homepage.add(lab_welc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));
        homepage.add(svgIcon_welco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, 30));

        lab_user_Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_user_Name.setForeground(new java.awt.Color(255, 255, 255));
        lab_user_Name.setText("Ahmed badawi");
        homepage.add(lab_user_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, -1));

        lab_todayTask.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_todayTask.setForeground(new java.awt.Color(255, 255, 255));
        lab_todayTask.setText("Today Task");
        homepage.add(lab_todayTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lab_completed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_completed.setForeground(new java.awt.Color(255, 255, 255));
        lab_completed.setText("Completed");
        homepage.add(lab_completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        lab_notStarted.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_notStarted.setForeground(new java.awt.Color(255, 255, 255));
        lab_notStarted.setText("Overdue tasks");
        homepage.add(lab_notStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        Today_Tasks.setRoundBottomLeft(30);
        Today_Tasks.setRoundBottomRight(30);
        Today_Tasks.setRoundTopLeft(30);
        Today_Tasks.setRoundTopRight(30);
        Today_Tasks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Add_Task.setText("Add Task");
        btn_Add_Task.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Add_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add_TaskActionPerformed(evt);
            }
        });
        Today_Tasks.add(btn_Add_Task, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 140, -1));

        scrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        today_tasks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPane1.setViewportView(today_tasks);

        Today_Tasks.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 440));

        homepage.add(Today_Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 280, 520));

        Completed.setRoundBottomLeft(30);
        Completed.setRoundBottomRight(30);
        Completed.setRoundTopLeft(30);
        Completed.setRoundTopRight(30);
        Completed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPaneWin2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout completed_TasksLayout = new javax.swing.GroupLayout(completed_Tasks);
        completed_Tasks.setLayout(completed_TasksLayout);
        completed_TasksLayout.setHorizontalGroup(
            completed_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        completed_TasksLayout.setVerticalGroup(
            completed_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        scrollPaneWin2.setViewportView(completed_Tasks);

        Completed.add(scrollPaneWin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 500));

        homepage.add(Completed, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 180, 320, 520));

        Overdue_Tasks.setRoundBottomLeft(30);
        Overdue_Tasks.setRoundBottomRight(30);
        Overdue_Tasks.setRoundTopLeft(30);
        Overdue_Tasks.setRoundTopRight(30);
        Overdue_Tasks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout overdue_tasksLayout = new javax.swing.GroupLayout(overdue_tasks);
        overdue_tasks.setLayout(overdue_tasksLayout);
        overdue_tasksLayout.setHorizontalGroup(
            overdue_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        overdue_tasksLayout.setVerticalGroup(
            overdue_tasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        ScrollPane3.setViewportView(overdue_tasks);

        Overdue_Tasks.add(ScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 500));

        homepage.add(Overdue_Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 320, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepage, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    short num = 0, m = 10;
    String test = "Task";

    
    private void btn_Add_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add_TaskActionPerformed
        //createTasks();        
        Dialog.setVisible(true);
    }//GEN-LAST:event_btn_Add_TaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Completed;
    public javax.swing.JDialog Dialog;
    private Frontend.UI_Components.PanelRound Overdue_Tasks;
    private javax.swing.JScrollPane ScrollPane3;
    private Frontend.UI_Components.PanelRound Today_Tasks;
    private Frontend.Mini_Forms.Add_Task add_Task;
    private Frontend.UI_Components.Shadow_Button btn_Add_Task;
    private javax.swing.JPanel completed_Tasks;
    private Frontend.UI_Components.PanelRound homepage;
    private javax.swing.JLabel lab_completed;
    private javax.swing.JLabel lab_notStarted;
    private javax.swing.JLabel lab_todayTask;
    private javax.swing.JLabel lab_user_Name;
    private javax.swing.JLabel lab_welc;
    private javax.swing.JPanel overdue_tasks;
    private Frontend.UI_Components.ScrollBar.ScrollPaneWin11 scrollPane1;
    private Frontend.UI_Components.ScrollBar.ScrollPaneWin11 scrollPaneWin2;
    private Frontend.UI_Components.svgIcon svgIcon_welco;
    private javax.swing.JPanel today_tasks;
    // End of variables declaration//GEN-END:variables
}
