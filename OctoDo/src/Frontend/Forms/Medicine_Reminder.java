package Frontend.Forms;

import Frontend.UI_Components.PanelRound;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;

public class Medicine_Reminder extends javax.swing.JPanel {

    public Medicine_Reminder() {
        initComponents();
        init();
        setIcons();
    }

    private void init() {
        medicine_reminder.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        btn_delete.setCursorHand();;
        btn_change_schedule.setCursorHand();
        btn_done.setCursorHand();
        btn_add.setCursorHand();

        Day1.setCursorHand();
        Day2.setCursorHand();
        Day3.setCursorHand();
        Day4.setCursorHand();
        Day5.setCursorHand();
        Day6.setCursorHand();
        Day7.setCursorHand();
    }

    private void setIcons() {

    }

    // Methods to Make The Day Panels Animated And More Beautiful
    private void DefultColor(PanelRound paneA) {
        paneA.setBackground(new Color(65, 63, 60));      // Defult color    [65,63,60]

    }

    private void Colorpane(PanelRound paneB) {
        paneB.setBackground(new Color(255, 159, 10));       // Second Color     [178,242,187] , [255,159,10]
    }

    
    private void PaneDay1() {
        Colorpane(Day1);
        DefultColor(Day2);
        DefultColor(Day3);
        DefultColor(Day4);
        DefultColor(Day5);
        DefultColor(Day6);
        DefultColor(Day7);
    }

    private void PaneDay2() {
        Colorpane(Day2);
        DefultColor(Day1);
        DefultColor(Day3);
        DefultColor(Day4);
        DefultColor(Day5);
        DefultColor(Day6);
        DefultColor(Day7);
    }

    private void PaneDay3() {
        Colorpane(Day3);
        DefultColor(Day1);
        DefultColor(Day2);
        DefultColor(Day4);
        DefultColor(Day5);
        DefultColor(Day6);
        DefultColor(Day7);
    }

    private void PaneDay4() {
        Colorpane(Day4);
        DefultColor(Day1);
        DefultColor(Day2);
        DefultColor(Day3);
        DefultColor(Day5);
        DefultColor(Day6);
        DefultColor(Day7);
    }

    private void PaneDay5() {
        Colorpane(Day5);
        DefultColor(Day1);
        DefultColor(Day2);
        DefultColor(Day3);
        DefultColor(Day4);
        DefultColor(Day6);
        DefultColor(Day7);
    }

    private void PaneDay6() {
        Colorpane(Day6);
        DefultColor(Day1);
        DefultColor(Day2);
        DefultColor(Day3);
        DefultColor(Day4);
        DefultColor(Day5);
        DefultColor(Day7);
    }

    private void PaneDay7() {
        Colorpane(Day7);
        DefultColor(Day1);
        DefultColor(Day2);
        DefultColor(Day3);
        DefultColor(Day4);
        DefultColor(Day5);
        DefultColor(Day6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicine_reminder = new Frontend.UI_Components.PanelRound();
        Days = new Frontend.UI_Components.PanelRound();
        Day1 = new Frontend.UI_Components.PanelRound();
        lab_1 = new javax.swing.JLabel();
        lab_sat = new javax.swing.JLabel();
        Day2 = new Frontend.UI_Components.PanelRound();
        lab_2 = new javax.swing.JLabel();
        lab_sun = new javax.swing.JLabel();
        Day3 = new Frontend.UI_Components.PanelRound();
        lab_3 = new javax.swing.JLabel();
        lab_mon = new javax.swing.JLabel();
        Day4 = new Frontend.UI_Components.PanelRound();
        lab_4 = new javax.swing.JLabel();
        lab_tue = new javax.swing.JLabel();
        Day5 = new Frontend.UI_Components.PanelRound();
        lab_5 = new javax.swing.JLabel();
        lab_wed = new javax.swing.JLabel();
        Day6 = new Frontend.UI_Components.PanelRound();
        lab_6 = new javax.swing.JLabel();
        lab_thu = new javax.swing.JLabel();
        lab_fri = new javax.swing.JLabel();
        Day7 = new Frontend.UI_Components.PanelRound();
        lab_7 = new javax.swing.JLabel();
        Today_Plan = new Frontend.UI_Components.PanelRound();
        btn_add = new Frontend.UI_Components.Shadow_Button();
        lab_Today_Plan = new javax.swing.JLabel();
        medicine = new Frontend.UI_Components.PanelRound();
        btn_done = new Frontend.UI_Components.Shadow_Button();
        btn_change_schedule = new Frontend.UI_Components.Shadow_Button();
        btn_delete = new Frontend.UI_Components.Shadow_Button();
        Medicine_Pane = new Frontend.UI_Components.PanelRound();
        lab_Medicine_Num = new javax.swing.JLabel();
        lab_Medicine_program = new javax.swing.JLabel();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        lab_Medicine_Dosage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        medicine_reminder.setMinimumSize(new java.awt.Dimension(1050, 700));
        medicine_reminder.setPreferredSize(new java.awt.Dimension(1050, 700));
        medicine_reminder.setRoundBottomLeft(30);
        medicine_reminder.setRoundBottomRight(30);
        medicine_reminder.setRoundTopLeft(30);
        medicine_reminder.setRoundTopRight(30);
        medicine_reminder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Days.setRoundBottomLeft(50);
        Days.setRoundBottomRight(50);
        Days.setRoundTopLeft(50);
        Days.setRoundTopRight(50);
        Days.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Day1.setBackground(new java.awt.Color(255, 159, 10));
        Day1.setRoundBottomLeft(500);
        Day1.setRoundBottomRight(500);
        Day1.setRoundTopLeft(500);
        Day1.setRoundTopRight(500);
        Day1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day1MouseClicked(evt);
            }
        });
        Day1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_1.setForeground(new java.awt.Color(255, 255, 255));
        lab_1.setText("1");
        Day1.add(lab_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 10, 60, 60));

        lab_sat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_sat.setForeground(new java.awt.Color(255, 255, 255));
        lab_sat.setText("Saturday");
        lab_sat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_sat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_satMouseClicked(evt);
            }
        });
        Days.add(lab_sat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 75, -1, -1));

        Day2.setBackground(new java.awt.Color(65, 63, 60));
        Day2.setRoundBottomLeft(500);
        Day2.setRoundBottomRight(500);
        Day2.setRoundTopLeft(500);
        Day2.setRoundTopRight(500);
        Day2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day2MouseClicked(evt);
            }
        });
        Day2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_2.setForeground(new java.awt.Color(255, 255, 255));
        lab_2.setText("2");
        Day2.add(lab_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 10, 60, 60));

        lab_sun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_sun.setForeground(new java.awt.Color(255, 255, 255));
        lab_sun.setText("Sunday");
        lab_sun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_sun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_sunMouseClicked(evt);
            }
        });
        Days.add(lab_sun, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 75, -1, -1));

        Day3.setBackground(new java.awt.Color(65, 63, 60));
        Day3.setRoundBottomLeft(500);
        Day3.setRoundBottomRight(500);
        Day3.setRoundTopLeft(500);
        Day3.setRoundTopRight(500);
        Day3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day3MouseClicked(evt);
            }
        });
        Day3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_3.setForeground(new java.awt.Color(255, 255, 255));
        lab_3.setText("3");
        Day3.add(lab_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day3, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 10, 60, 60));

        lab_mon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_mon.setForeground(new java.awt.Color(255, 255, 255));
        lab_mon.setText("Monday");
        lab_mon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_mon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_monMouseClicked(evt);
            }
        });
        Days.add(lab_mon, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 75, -1, -1));

        Day4.setBackground(new java.awt.Color(65, 63, 60));
        Day4.setRoundBottomLeft(500);
        Day4.setRoundBottomRight(500);
        Day4.setRoundTopLeft(500);
        Day4.setRoundTopRight(500);
        Day4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day4MouseClicked(evt);
            }
        });
        Day4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_4.setForeground(new java.awt.Color(255, 255, 255));
        lab_4.setText("4");
        Day4.add(lab_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day4, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 10, 60, 60));

        lab_tue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_tue.setForeground(new java.awt.Color(255, 255, 255));
        lab_tue.setText("Tuesday");
        lab_tue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_tue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_tueMouseClicked(evt);
            }
        });
        Days.add(lab_tue, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 75, -1, -1));

        Day5.setBackground(new java.awt.Color(65, 63, 60));
        Day5.setRoundBottomLeft(500);
        Day5.setRoundBottomRight(500);
        Day5.setRoundTopLeft(500);
        Day5.setRoundTopRight(500);
        Day5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day5MouseClicked(evt);
            }
        });
        Day5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_5.setForeground(new java.awt.Color(255, 255, 255));
        lab_5.setText("5");
        Day5.add(lab_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 60, 60));

        lab_wed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_wed.setForeground(new java.awt.Color(255, 255, 255));
        lab_wed.setText("Wednesday");
        lab_wed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_wed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_wedMouseClicked(evt);
            }
        });
        Days.add(lab_wed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, -1, -1));

        Day6.setBackground(new java.awt.Color(65, 63, 60));
        Day6.setRoundBottomLeft(500);
        Day6.setRoundBottomRight(500);
        Day6.setRoundTopLeft(500);
        Day6.setRoundTopRight(500);
        Day6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day6MouseClicked(evt);
            }
        });
        Day6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_6.setForeground(new java.awt.Color(255, 255, 255));
        lab_6.setText("6");
        Day6.add(lab_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day6, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 10, 60, 60));

        lab_thu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_thu.setForeground(new java.awt.Color(255, 255, 255));
        lab_thu.setText("Thursday");
        lab_thu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_thu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_thuMouseClicked(evt);
            }
        });
        Days.add(lab_thu, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 75, -1, -1));

        lab_fri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_fri.setForeground(new java.awt.Color(255, 255, 255));
        lab_fri.setText("Friday");
        lab_fri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_fri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_friMouseClicked(evt);
            }
        });
        Days.add(lab_fri, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 75, -1, -1));

        Day7.setBackground(new java.awt.Color(65, 63, 60));
        Day7.setRoundBottomLeft(500);
        Day7.setRoundBottomRight(500);
        Day7.setRoundTopLeft(500);
        Day7.setRoundTopRight(500);
        Day7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Day7MouseClicked(evt);
            }
        });
        Day7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_7.setForeground(new java.awt.Color(255, 255, 255));
        lab_7.setText("7");
        Day7.add(lab_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 17, 10, 26));

        Days.add(Day7, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 10, 60, 60));

        medicine_reminder.add(Days, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, 968, 100));

        Today_Plan.setRoundBottomLeft(30);
        Today_Plan.setRoundBottomRight(30);
        Today_Plan.setRoundTopLeft(30);
        Today_Plan.setRoundTopRight(30);
        Today_Plan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setText("Add");
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Today_Plan.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 120, -1));

        medicine_reminder.add(Today_Plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, 470));

        lab_Today_Plan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_Today_Plan.setForeground(new java.awt.Color(255, 255, 255));
        lab_Today_Plan.setText("Today's Plan:");
        medicine_reminder.add(lab_Today_Plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        medicine.setRoundBottomLeft(30);
        medicine.setRoundBottomRight(30);
        medicine.setRoundTopLeft(30);
        medicine.setRoundTopRight(30);
        medicine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_done.setText("Done");
        btn_done.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine.add(btn_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 70, 40));

        btn_change_schedule.setText("Change Schedule");
        btn_change_schedule.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine.add(btn_change_schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 40));

        btn_delete.setText("Delete");
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicine.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 40));

        Medicine_Pane.setBackground(new java.awt.Color(153, 153, 153));
        Medicine_Pane.setRoundBottomLeft(40);
        Medicine_Pane.setRoundBottomRight(40);
        Medicine_Pane.setRoundTopLeft(40);
        Medicine_Pane.setRoundTopRight(40);
        Medicine_Pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_Medicine_Num.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lab_Medicine_Num.setForeground(new java.awt.Color(255, 255, 255));
        lab_Medicine_Num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Medicine_Num.setText("Medicine1");
        Medicine_Pane.add(lab_Medicine_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 200, 40));

        medicine.add(Medicine_Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 75));

        lab_Medicine_program.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_Medicine_program.setForeground(new java.awt.Color(255, 255, 255));
        lab_Medicine_program.setText("program");
        medicine.add(lab_Medicine_program, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        panelRound1.setBackground(new java.awt.Color(208, 191, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Two pills daily during the whole month  ");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 400, -1));

        medicine.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 430, 50));

        lab_Medicine_Dosage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab_Medicine_Dosage.setForeground(new java.awt.Color(255, 255, 255));
        lab_Medicine_Dosage.setText("Dosage");
        medicine.add(lab_Medicine_Dosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 226, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2 times:");
        medicine.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("13/30 days done");
        medicine.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 325, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("08:00 AM");
        medicine.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("08:00 PM");
        medicine.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        medicine_reminder.add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 650, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medicine_reminder, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(medicine_reminder, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Day1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day1MouseClicked
        PaneDay1();
    }//GEN-LAST:event_Day1MouseClicked

    private void lab_satMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_satMouseClicked
        PaneDay1();
    }//GEN-LAST:event_lab_satMouseClicked

    private void Day2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day2MouseClicked
        PaneDay2();
    }//GEN-LAST:event_Day2MouseClicked

    private void lab_sunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sunMouseClicked
       PaneDay2();
    }//GEN-LAST:event_lab_sunMouseClicked

    private void Day3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day3MouseClicked
        PaneDay3();
    }//GEN-LAST:event_Day3MouseClicked

    private void lab_monMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_monMouseClicked
        PaneDay3();
    }//GEN-LAST:event_lab_monMouseClicked

    private void Day4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day4MouseClicked
        PaneDay4();
    }//GEN-LAST:event_Day4MouseClicked

    private void lab_tueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_tueMouseClicked
        PaneDay4();
    }//GEN-LAST:event_lab_tueMouseClicked

    private void Day5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day5MouseClicked
        PaneDay5();
    }//GEN-LAST:event_Day5MouseClicked

    private void lab_wedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_wedMouseClicked
        PaneDay5();
    }//GEN-LAST:event_lab_wedMouseClicked

    private void Day6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day6MouseClicked
       PaneDay6();
    }//GEN-LAST:event_Day6MouseClicked

    private void lab_thuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_thuMouseClicked
        PaneDay6();
    }//GEN-LAST:event_lab_thuMouseClicked

    private void Day7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Day7MouseClicked
        PaneDay7();
    }//GEN-LAST:event_Day7MouseClicked

    private void lab_friMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_friMouseClicked
       PaneDay7();
    }//GEN-LAST:event_lab_friMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Day1;
    private Frontend.UI_Components.PanelRound Day2;
    private Frontend.UI_Components.PanelRound Day3;
    private Frontend.UI_Components.PanelRound Day4;
    private Frontend.UI_Components.PanelRound Day5;
    private Frontend.UI_Components.PanelRound Day6;
    private Frontend.UI_Components.PanelRound Day7;
    private Frontend.UI_Components.PanelRound Days;
    private Frontend.UI_Components.PanelRound Medicine_Pane;
    private Frontend.UI_Components.PanelRound Today_Plan;
    private Frontend.UI_Components.Shadow_Button btn_add;
    private Frontend.UI_Components.Shadow_Button btn_change_schedule;
    private Frontend.UI_Components.Shadow_Button btn_delete;
    private Frontend.UI_Components.Shadow_Button btn_done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lab_1;
    private javax.swing.JLabel lab_2;
    private javax.swing.JLabel lab_3;
    private javax.swing.JLabel lab_4;
    private javax.swing.JLabel lab_5;
    private javax.swing.JLabel lab_6;
    private javax.swing.JLabel lab_7;
    private javax.swing.JLabel lab_Medicine_Dosage;
    private javax.swing.JLabel lab_Medicine_Num;
    private javax.swing.JLabel lab_Medicine_program;
    private javax.swing.JLabel lab_Today_Plan;
    private javax.swing.JLabel lab_fri;
    private javax.swing.JLabel lab_mon;
    private javax.swing.JLabel lab_sat;
    private javax.swing.JLabel lab_sun;
    private javax.swing.JLabel lab_thu;
    private javax.swing.JLabel lab_tue;
    private javax.swing.JLabel lab_wed;
    private Frontend.UI_Components.PanelRound medicine;
    private Frontend.UI_Components.PanelRound medicine_reminder;
    private Frontend.UI_Components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
