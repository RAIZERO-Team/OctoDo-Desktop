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
        Frontend.Mini_Forms.Task Tasks = new Frontend.Mini_Forms.Task();
        Tasks.setMaximumSize(new Dimension(240, 70));
        Week_Tasks.add(Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, m, -1, -1));
        m += 900;
        revalidate();
        repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Week_Tasks = new Frontend.UI_Components.PanelRound();
        task1 = new Frontend.Mini_Forms.Task();
        jButton1 = new javax.swing.JButton();

        Week_Tasks.setBackground(new java.awt.Color(102, 102, 102));
        Week_Tasks.setRoundBottomLeft(30);
        Week_Tasks.setRoundBottomRight(30);
        Week_Tasks.setRoundTopLeft(30);
        Week_Tasks.setRoundTopRight(30);
        Week_Tasks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Week_Tasks.add(task1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Week_Tasks.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Week_Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Week_Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       createTasks();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Week_Tasks;
    private javax.swing.JButton jButton1;
    private Frontend.Mini_Forms.Task task1;
    // End of variables declaration//GEN-END:variables
}
