
package Frontend.Mini_Forms;

import javax.swing.SwingConstants;


public class Add_Medicine_Reminder extends javax.swing.JPanel {

    public String Name_of_Medicine;

    public Add_Medicine_Reminder() {
        initComponents();
        init();
    }
    
    private void init(){
        timePicker.setEditor(txt_time);
        dateChooser.toDay();
        timePicker.setOrientation(SwingConstants.HORIZONTAL);
        
        svgIcon1.setSVGIcon("Asstes/SVG_Icons/2.svg", 30, 30);
        svgIcon1.setCursorHand();
    }
    
    private void setData(){
        Name_of_Medicine = txt_name_of_medicine.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker = new Frontend.UI_Components.TimePiker.TimePicker();
        dateChooser = new com.raven.datechooser.DateChooser();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        btn_save_draft = new java.awt.Button();
        btn_discard = new java.awt.Button();
        btn_done = new java.awt.Button();
        panelRound2 = new Frontend.UI_Components.PanelRound();
        lab_medicine_name = new javax.swing.JLabel();
        txt_name_of_medicine = new javax.swing.JTextField();
        panelRound3 = new Frontend.UI_Components.PanelRound();
        lab_reminder_time = new javax.swing.JLabel();
        combo_reminder_time = new javax.swing.JComboBox<>();
        panelRound4 = new Frontend.UI_Components.PanelRound();
        lab_time = new javax.swing.JLabel();
        txt_time = new javax.swing.JFormattedTextField();
        panelRound5 = new Frontend.UI_Components.PanelRound();
        lab_Dosage = new javax.swing.JLabel();
        combo_dosage = new javax.swing.JComboBox<>();
        panelRound6 = new Frontend.UI_Components.PanelRound();
        lab_days = new javax.swing.JLabel();
        combo_day = new javax.swing.JComboBox<>();
        panelRound7 = new Frontend.UI_Components.PanelRound();
        lab_end_of_duration = new javax.swing.JLabel();
        txt_end_of_duration = new javax.swing.JTextField();
        svgIcon1 = new Frontend.UI_Components.svgIcon();
        panelRound8 = new Frontend.UI_Components.PanelRound();
        lab_add_alarm = new javax.swing.JLabel();
        btn_add_alarm = new javax.swing.JToggleButton();

        dateChooser.setTextRefernce(txt_end_of_duration);

        panelRound1.setBackground(new java.awt.Color(102, 0, 102));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_save_draft.setLabel("Save Draft");
        btn_save_draft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_draftActionPerformed(evt);
            }
        });
        panelRound1.add(btn_save_draft, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 100, -1));

        btn_discard.setLabel("Discard");
        btn_discard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_discardActionPerformed(evt);
            }
        });
        panelRound1.add(btn_discard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 100, -1));

        btn_done.setLabel("Done");
        btn_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doneActionPerformed(evt);
            }
        });
        panelRound1.add(btn_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 100, -1));

        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_medicine_name.setBackground(new java.awt.Color(204, 204, 204));
        lab_medicine_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_medicine_name.setText("Name of medicine:");
        panelRound2.add(lab_medicine_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        txt_name_of_medicine.setBackground(new java.awt.Color(204, 204, 204));
        txt_name_of_medicine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelRound2.add(txt_name_of_medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 15, 265, 27));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, 55));

        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_reminder_time.setText("Reminder Timer");
        panelRound3.add(lab_reminder_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        combo_reminder_time.setBackground(new java.awt.Color(153, 153, 153));
        combo_reminder_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Once", "Twice", "Tree times" }));
        combo_reminder_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_reminder_timeActionPerformed(evt);
            }
        });
        panelRound3.add(combo_reminder_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 55));

        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_time.setText("Time:");
        panelRound4.add(lab_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelRound4.add(txt_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 30));

        panelRound1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 470, 55));

        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_Dosage.setText("Dosage(per day)");
        panelRound5.add(lab_Dosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        combo_dosage.setBackground(new java.awt.Color(153, 153, 153));
        combo_dosage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        panelRound5.add(combo_dosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 85, -1));

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 470, 55));

        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_days.setText("Days");
        panelRound6.add(lab_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        combo_day.setBackground(new java.awt.Color(153, 153, 153));
        combo_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAT", "SUN", "MON", "TUE", "WED", "THURS", "FRI", "Every day" }));
        panelRound6.add(combo_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        panelRound1.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 470, 55));

        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_end_of_duration.setText("End of Duration");
        panelRound7.add(lab_end_of_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panelRound7.add(txt_end_of_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 12, 180, 30));

        svgIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon1MouseClicked(evt);
            }
        });
        panelRound7.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 15, 30, 30));

        panelRound1.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 470, 55));

        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_add_alarm.setText("Add alarm with voice note");
        panelRound8.add(lab_add_alarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        btn_add_alarm.setBackground(new java.awt.Color(204, 204, 204));
        btn_add_alarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frontend/Mini_Forms/microphone (2).png"))); // NOI18N
        panelRound8.add(btn_add_alarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 50, 40));

        panelRound1.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 470, 55));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_save_draftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_draftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save_draftActionPerformed

    private void btn_discardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_discardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_discardActionPerformed

    private void btn_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doneActionPerformed
        // TODO add your handling code here:
        
        String name = txt_name_of_medicine.getText();
        String remider_time = combo_reminder_time.getSelectedItem().toString();
        String time = txt_time.getText();
        int dosage = Integer.parseInt(combo_dosage.getSelectedItem().toString());
        String days = combo_day.getSelectedItem().toString();
        String EndDuration = txt_end_of_duration.getText();
        // voice 
        
                //combo_dosage.getSelectedItem().toString()
    }//GEN-LAST:event_btn_doneActionPerformed

    private void svgIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIcon1MouseClicked
        dateChooser.showPopup();
    }//GEN-LAST:event_svgIcon1MouseClicked

    private void combo_reminder_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_reminder_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_reminder_timeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_add_alarm;
    private java.awt.Button btn_discard;
    private java.awt.Button btn_done;
    private java.awt.Button btn_save_draft;
    private javax.swing.JComboBox<String> combo_day;
    private javax.swing.JComboBox<String> combo_dosage;
    private javax.swing.JComboBox<String> combo_reminder_time;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JLabel lab_Dosage;
    private javax.swing.JLabel lab_add_alarm;
    private javax.swing.JLabel lab_days;
    private javax.swing.JLabel lab_end_of_duration;
    private javax.swing.JLabel lab_medicine_name;
    private javax.swing.JLabel lab_reminder_time;
    private javax.swing.JLabel lab_time;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.PanelRound panelRound2;
    private Frontend.UI_Components.PanelRound panelRound3;
    private Frontend.UI_Components.PanelRound panelRound4;
    private Frontend.UI_Components.PanelRound panelRound5;
    private Frontend.UI_Components.PanelRound panelRound6;
    private Frontend.UI_Components.PanelRound panelRound7;
    private Frontend.UI_Components.PanelRound panelRound8;
    private Frontend.UI_Components.svgIcon svgIcon1;
    private Frontend.UI_Components.TimePiker.TimePicker timePicker;
    private javax.swing.JTextField txt_end_of_duration;
    private javax.swing.JTextField txt_name_of_medicine;
    private javax.swing.JFormattedTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
