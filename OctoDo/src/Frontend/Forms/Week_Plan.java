package Frontend.Forms;

import com.formdev.flatlaf.FlatClientProperties;

public class Week_Plan extends javax.swing.JPanel {

    public Week_Plan() {
        initComponents();
        init();
        setIcon();
    }

    private void init() {
        week_task.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        svgIcon_Left.setCursorHand();
        svgIcon_Right.setCursorHand();

        add1.setCursorHand();
        add2.setCursorHand();
        add3.setCursorHand();
        add4.setCursorHand();
        add5.setCursorHand();
        add6.setCursorHand();
        add7.setCursorHand();

        Dialog.setSize(400, 600);
        Dialog.add(Week_plan_add_Task);
        
        Day_Tasks.setSize(350,585);
        Day_Tasks.add(day_Tasks1);
    }

    private void setIcon() {
        svgIcon_Left.setSVGIcon("Asstes/SVG_Icons/left.svg", 30, 30);
        svgIcon_Right.setSVGIcon("Asstes/SVG_Icons/right.svg", 30, 30);

        add1.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add2.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add3.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add4.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add5.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add6.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
        add7.setSVGIcon("Asstes/SVG_Icons/addIcon.svg", 30, 30);
    }

    public void close_Add_Task(){
        Dialog.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        Week_plan_add_Task = new Frontend.Mini_Forms.Add_Task();
        Day_Tasks = new javax.swing.JDialog();
        day_Tasks1 = new Frontend.Mini_Forms.Day_Tasks();
        week_task = new Frontend.UI_Components.PanelRound();
        ComboBox_Months = new javax.swing.JComboBox<>();
        pane_saturday = new Frontend.UI_Components.PanelRound();
        add1 = new Frontend.UI_Components.svgIcon();
        sat_Separator = new javax.swing.JSeparator();
        lab_saturday = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pane_sunday = new Frontend.UI_Components.PanelRound();
        sun_Separator = new javax.swing.JSeparator();
        add2 = new Frontend.UI_Components.svgIcon();
        lab_sunday = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pane_monday = new Frontend.UI_Components.PanelRound();
        add3 = new Frontend.UI_Components.svgIcon();
        mon_Separator = new javax.swing.JSeparator();
        lab_monday = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pane_tuesday = new Frontend.UI_Components.PanelRound();
        add4 = new Frontend.UI_Components.svgIcon();
        tus_Separator = new javax.swing.JSeparator();
        lab_tuesday = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pane_wednesday = new Frontend.UI_Components.PanelRound();
        add5 = new Frontend.UI_Components.svgIcon();
        wed_Separator = new javax.swing.JSeparator();
        lab_wednesday = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pane_thursday = new Frontend.UI_Components.PanelRound();
        add6 = new Frontend.UI_Components.svgIcon();
        thur_Separator = new javax.swing.JSeparator();
        lab_thursday = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pane_friday = new Frontend.UI_Components.PanelRound();
        add7 = new Frontend.UI_Components.svgIcon();
        fri_Separator = new javax.swing.JSeparator();
        lab_friday = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        svgIcon_Left = new Frontend.UI_Components.svgIcon();
        svgIcon_Right = new Frontend.UI_Components.svgIcon();

        Dialog.setLocation(new java.awt.Point(588, 150));

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Week_plan_add_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Week_plan_add_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Day_Tasks.setLocation(new java.awt.Point(588, 150));

        javax.swing.GroupLayout Day_TasksLayout = new javax.swing.GroupLayout(Day_Tasks.getContentPane());
        Day_Tasks.getContentPane().setLayout(Day_TasksLayout);
        Day_TasksLayout.setHorizontalGroup(
            Day_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(Day_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Day_TasksLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(day_Tasks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Day_TasksLayout.setVerticalGroup(
            Day_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(Day_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Day_TasksLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(day_Tasks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        week_task.setRoundBottomLeft(30);
        week_task.setRoundBottomRight(30);
        week_task.setRoundTopLeft(30);
        week_task.setRoundTopRight(30);
        week_task.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBox_Months.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComboBox_Months.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_Months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January              2024 ", "February            2024 ", "March                2024 ", "April                  2024 ", "May                   2024", "June                   2024", "Julay                  2024", "August               2024", "September        2024", "October             2024", "November         2024", "December         2024" }));
        week_task.add(ComboBox_Months, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 240, 40));

        pane_saturday.setBackground(new java.awt.Color(102, 102, 102));
        pane_saturday.setRoundBottomLeft(50);
        pane_saturday.setRoundBottomRight(50);
        pane_saturday.setRoundTopLeft(50);
        pane_saturday.setRoundTopRight(50);
        pane_saturday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane_saturdayMouseClicked(evt);
            }
        });
        pane_saturday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
        });
        pane_saturday.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        sat_Separator.setForeground(new java.awt.Color(0, 0, 0));
        sat_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_saturday.add(sat_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_saturday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_saturday.setForeground(new java.awt.Color(255, 255, 255));
        lab_saturday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_saturday.setText("Saturday");
        lab_saturday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_saturday.add(lab_saturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("3/2/2024");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_saturday.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_saturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 988, 75));

        pane_sunday.setBackground(new java.awt.Color(102, 102, 102));
        pane_sunday.setRoundBottomLeft(50);
        pane_sunday.setRoundBottomRight(50);
        pane_sunday.setRoundTopLeft(50);
        pane_sunday.setRoundTopRight(50);
        pane_sunday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sun_Separator.setForeground(new java.awt.Color(0, 0, 0));
        sun_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sun_Separator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pane_sunday.add(sun_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });
        pane_sunday.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        lab_sunday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_sunday.setForeground(new java.awt.Color(255, 255, 255));
        lab_sunday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_sunday.setText("Sunday");
        lab_sunday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_sunday.add(lab_sunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3/2/2024");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_sunday.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_sunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 195, 988, 75));

        pane_monday.setBackground(new java.awt.Color(102, 102, 102));
        pane_monday.setRoundBottomLeft(50);
        pane_monday.setRoundBottomRight(50);
        pane_monday.setRoundTopLeft(50);
        pane_monday.setRoundTopRight(50);
        pane_monday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add3MouseClicked(evt);
            }
        });
        pane_monday.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        mon_Separator.setForeground(new java.awt.Color(0, 0, 0));
        mon_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_monday.add(mon_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_monday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_monday.setForeground(new java.awt.Color(255, 255, 255));
        lab_monday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_monday.setText("Monday");
        lab_monday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_monday.add(lab_monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3/2/2024");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_monday.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 988, 75));

        pane_tuesday.setBackground(new java.awt.Color(102, 102, 102));
        pane_tuesday.setRoundBottomLeft(50);
        pane_tuesday.setRoundBottomRight(50);
        pane_tuesday.setRoundTopLeft(50);
        pane_tuesday.setRoundTopRight(50);
        pane_tuesday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add4MouseClicked(evt);
            }
        });
        pane_tuesday.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        tus_Separator.setForeground(new java.awt.Color(0, 0, 0));
        tus_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_tuesday.add(tus_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_tuesday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_tuesday.setForeground(new java.awt.Color(255, 255, 255));
        lab_tuesday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tuesday.setText("Tuesday");
        lab_tuesday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_tuesday.add(lab_tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("3/2/2024");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_tuesday.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 365, 988, 75));

        pane_wednesday.setBackground(new java.awt.Color(102, 102, 102));
        pane_wednesday.setRoundBottomLeft(50);
        pane_wednesday.setRoundBottomRight(50);
        pane_wednesday.setRoundTopLeft(50);
        pane_wednesday.setRoundTopRight(50);
        pane_wednesday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add5MouseClicked(evt);
            }
        });
        pane_wednesday.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        wed_Separator.setForeground(new java.awt.Color(0, 0, 0));
        wed_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_wednesday.add(wed_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_wednesday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_wednesday.setForeground(new java.awt.Color(255, 255, 255));
        lab_wednesday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_wednesday.setText("Wednesday");
        lab_wednesday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_wednesday.add(lab_wednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("3/2/2024");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_wednesday.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_wednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 988, 75));

        pane_thursday.setBackground(new java.awt.Color(102, 102, 102));
        pane_thursday.setRoundBottomLeft(50);
        pane_thursday.setRoundBottomRight(50);
        pane_thursday.setRoundTopLeft(50);
        pane_thursday.setRoundTopRight(50);
        pane_thursday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add6MouseClicked(evt);
            }
        });
        pane_thursday.add(add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        thur_Separator.setForeground(new java.awt.Color(0, 0, 0));
        thur_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_thursday.add(thur_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_thursday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_thursday.setForeground(new java.awt.Color(255, 255, 255));
        lab_thursday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_thursday.setText("Thursday");
        lab_thursday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_thursday.add(lab_thursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3/2/2024");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_thursday.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_thursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 535, 988, 75));

        pane_friday.setBackground(new java.awt.Color(102, 102, 102));
        pane_friday.setRoundBottomLeft(50);
        pane_friday.setRoundBottomRight(50);
        pane_friday.setRoundTopLeft(50);
        pane_friday.setRoundTopRight(50);
        pane_friday.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add7MouseClicked(evt);
            }
        });
        pane_friday.add(add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 22, 30, 30));

        fri_Separator.setForeground(new java.awt.Color(0, 0, 0));
        fri_Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pane_friday.add(fri_Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 10, 75));

        lab_friday.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_friday.setForeground(new java.awt.Color(255, 255, 255));
        lab_friday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_friday.setText("Friday");
        lab_friday.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_friday.add(lab_friday, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 10, 140, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3/2/2024");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pane_friday.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 48, 140, -1));

        week_task.add(pane_friday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 988, 75));
        week_task.add(svgIcon_Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 30, 30));
        week_task.add(svgIcon_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(week_task, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(week_task, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add1MouseClicked

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add2MouseClicked

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add3MouseClicked

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add4MouseClicked

    private void add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add5MouseClicked

    private void add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add6MouseClicked

    private void add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MouseClicked
        Dialog.setVisible(true);
    }//GEN-LAST:event_add7MouseClicked

    private void pane_saturdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane_saturdayMouseClicked
       Day_Tasks.setVisible(true);
    }//GEN-LAST:event_pane_saturdayMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Months;
    private javax.swing.JDialog Day_Tasks;
    private javax.swing.JDialog Dialog;
    private Frontend.Mini_Forms.Add_Task Week_plan_add_Task;
    private Frontend.UI_Components.svgIcon add1;
    private Frontend.UI_Components.svgIcon add2;
    private Frontend.UI_Components.svgIcon add3;
    private Frontend.UI_Components.svgIcon add4;
    private Frontend.UI_Components.svgIcon add5;
    private Frontend.UI_Components.svgIcon add6;
    private Frontend.UI_Components.svgIcon add7;
    private Frontend.Mini_Forms.Day_Tasks day_Tasks1;
    private javax.swing.JSeparator fri_Separator;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lab_friday;
    private javax.swing.JLabel lab_monday;
    private javax.swing.JLabel lab_saturday;
    private javax.swing.JLabel lab_sunday;
    private javax.swing.JLabel lab_thursday;
    private javax.swing.JLabel lab_tuesday;
    private javax.swing.JLabel lab_wednesday;
    private javax.swing.JSeparator mon_Separator;
    private Frontend.UI_Components.PanelRound pane_friday;
    private Frontend.UI_Components.PanelRound pane_monday;
    private Frontend.UI_Components.PanelRound pane_saturday;
    private Frontend.UI_Components.PanelRound pane_sunday;
    private Frontend.UI_Components.PanelRound pane_thursday;
    private Frontend.UI_Components.PanelRound pane_tuesday;
    private Frontend.UI_Components.PanelRound pane_wednesday;
    private javax.swing.JSeparator sat_Separator;
    private javax.swing.JSeparator sun_Separator;
    private Frontend.UI_Components.svgIcon svgIcon_Left;
    private Frontend.UI_Components.svgIcon svgIcon_Right;
    private javax.swing.JSeparator thur_Separator;
    private javax.swing.JSeparator tus_Separator;
    private javax.swing.JSeparator wed_Separator;
    private Frontend.UI_Components.PanelRound week_task;
    // End of variables declaration//GEN-END:variables
}
