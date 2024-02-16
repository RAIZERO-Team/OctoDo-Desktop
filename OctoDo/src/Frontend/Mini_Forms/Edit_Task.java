package Frontend.Mini_Forms;

public class Edit_Task extends javax.swing.JPanel {

    public Edit_Task() {
        initComponents();
        SetSVGIcon();
    }

    private void SetSVGIcon() {
        Delete.setSVGIcon("Asstes/SVG_Icons/Github.svg", 30, 30);
        Edit.setSVGIcon("Asstes/SVG_Icons/Github.svg", 30, 30);
        Done.setSVGIcon("Asstes/SVG_Icons/Github.svg", 30, 30);

        Delete.setCursorHand();
        Edit.setCursorHand();
        Done.setCursorHand();
    }

    public void EditTask(String NameTask , String TimeTask) {

    }

    public void EditTask(String NameTask , String TimeTask , String DayTask , String DateTask) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Task_Editing = new Frontend.UI_Components.PanelRound();
        Delete = new Frontend.UI_Components.svgIcon();
        Edit = new Frontend.UI_Components.svgIcon();
        Done = new Frontend.UI_Components.svgIcon();

        setBackground(new java.awt.Color(153, 153, 153));

        Task_Editing.setBackground(new java.awt.Color(0, 153, 153));
        Task_Editing.setRoundBottomLeft(30);
        Task_Editing.setRoundBottomRight(30);
        Task_Editing.setRoundTopLeft(30);
        Task_Editing.setRoundTopRight(30);
        Task_Editing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Task_Editing.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 15, 30, 30));

        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Task_Editing.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 15, 30, 30));

        Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneMouseClicked(evt);
            }
        });
        Task_Editing.add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Task_Editing, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Task_Editing, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public int n = 0;

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EditMouseClicked

    private void DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseClicked
        n++;
    }//GEN-LAST:event_DoneMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.svgIcon Delete;
    private Frontend.UI_Components.svgIcon Done;
    private Frontend.UI_Components.svgIcon Edit;
    private Frontend.UI_Components.PanelRound Task_Editing;
    // End of variables declaration//GEN-END:variables
}
