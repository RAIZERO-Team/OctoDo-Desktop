package Frontend.Mini_Forms;

import java.awt.Dimension;

public class Day_Tasks extends javax.swing.JPanel {

    public Day_Tasks() {
        initComponents();
        init();
        createTasks();
    }

    
    private void init(){
        
    }
    
    public void createTasks() {
        int m = 90;
        add_task = new Add_Task();
        Frontend.Mini_Forms.Task Tasks = new Frontend.Mini_Forms.Task(add_task.Task_Name, add_task.Task_Reminder_Time);
        Tasks.setMaximumSize(new Dimension(240, 70));
        //Week_Tasks.add(Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, m, -1, -1));
        m += 900;
        revalidate();
        repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private Add_Task add_task;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
