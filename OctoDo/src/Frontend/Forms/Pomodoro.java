package Frontend.Forms;

import Backend.Date.Date_Time;
import com.formdev.flatlaf.FlatClientProperties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pomodoro extends javax.swing.JPanel {

    public Pomodoro() {
        initComponents();
        init();
        setSVGIcons();
    }

    private void init() {
        Study_Space.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        Timer.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Form.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        UP_Minutes.setCursorHand();
        Dowen_Minutes.setCursorHand();
        svgIconplay_sound.setCursorHand();
        svgIcon_soundcloud.setCursorHand();
        svgIcon_steting.setCursorHand();
        svgIcon_edit.setCursorHand();

        play_sounds.setSize(400, 460);
        play_sounds.add(play_Sound1);
    }

    private void setSVGIcons() {
        UP_Minutes.setSVGIcon("Asstes/SVG_Icons/up-arrow.svg", 30, 30);
        Dowen_Minutes.setSVGIcon("Asstes/SVG_Icons/down-arrow.svg", 30, 30);
        svgIcon_steting.setSVGIcon("Asstes/SVG_Icons/settings.svg", 30, 30);

        svgIconplay_sound.setSVGIcon("Asstes/SVG_Icons/play-circle-sound.svg", 40, 40);
        svgIcon_soundcloud.setSVGIcon("Asstes/SVG_Icons/soundcloud.svg", 53, 53);

        svgIcon_edit.setSVGIcon("Asstes/SVG_Icons/edit.svg", 30, 30);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play_sounds = new javax.swing.JDialog();
        play_Sound1 = new Frontend.Mini_Forms.play_Sound();
        Study_Space = new Frontend.UI_Components.PanelRound();
        Pomodoro = new Frontend.UI_Components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        svgIcon_steting = new Frontend.UI_Components.svgIcon();
        Timer = new Frontend.UI_Components.PanelRound();
        Pane_UP = new Frontend.UI_Components.Shadow_Round_Panel();
        UP_Minutes = new Frontend.UI_Components.svgIcon();
        Pane_Down = new Frontend.UI_Components.Shadow_Round_Panel();
        Dowen_Minutes = new Frontend.UI_Components.svgIcon();
        minutes_Timer = new javax.swing.JTextField();
        Sound_Player = new Frontend.UI_Components.PanelRound();
        lab_play_sound = new javax.swing.JLabel();
        svgIconplay_sound = new Frontend.UI_Components.svgIcon();
        svgIcon_soundcloud = new Frontend.UI_Components.svgIcon();
        Daily_Progress = new Frontend.UI_Components.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spinnerProgress = new Frontend.UI_Components.spinner_progress.SpinnerProgress();
        jLabel10 = new javax.swing.JLabel();
        lab_Daily_Day = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        svgIcon_edit = new Frontend.UI_Components.svgIcon();
        Tasks = new Frontend.UI_Components.PanelRound();
        lab_tasks = new javax.swing.JLabel();

        play_sounds.setLocation(new java.awt.Point(588, 150));

        javax.swing.GroupLayout play_soundsLayout = new javax.swing.GroupLayout(play_sounds.getContentPane());
        play_sounds.getContentPane().setLayout(play_soundsLayout);
        play_soundsLayout.setHorizontalGroup(
            play_soundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(play_soundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(play_soundsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(play_Sound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        play_soundsLayout.setVerticalGroup(
            play_soundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(play_soundsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(play_soundsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(play_Sound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Study_Space.setRoundBottomLeft(30);
        Study_Space.setRoundBottomRight(30);
        Study_Space.setRoundTopLeft(30);
        Study_Space.setRoundTopRight(30);
        Study_Space.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pomodoro.setRoundBottomLeft(30);
        Pomodoro.setRoundBottomRight(30);
        Pomodoro.setRoundTopLeft(30);
        Pomodoro.setRoundTopRight(30);
        Pomodoro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("POMODORO");
        Pomodoro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 36));

        btn_start.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_start.setText("Start Focus session");
        btn_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        Pomodoro.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 360, -1, -1));

        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        Pomodoro.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        btn_stop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stop.setText("STOP");
        btn_stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });
        Pomodoro.add(btn_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));
        Pomodoro.add(svgIcon_steting, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 30, 30));

        Timer.setRoundBottomLeft(40);
        Timer.setRoundBottomRight(40);
        Timer.setRoundTopLeft(40);
        Timer.setRoundTopRight(40);
        Timer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pane_UP.setRippleColor(new java.awt.Color(153, 0, 153));
        Pane_UP.setRoundTopRight(30);
        Pane_UP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pane_UPMouseClicked(evt);
            }
        });
        Pane_UP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UP_Minutes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UP_MinutesMouseClicked(evt);
            }
        });
        Pane_UP.add(UP_Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 30, 30));

        Timer.add(Pane_UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 60, 60));

        Pane_Down.setRippleColor(new java.awt.Color(153, 0, 153));
        Pane_Down.setRoundBottomRight(30);
        Pane_Down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pane_DownMouseClicked(evt);
            }
        });
        Pane_Down.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dowen_Minutes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dowen_MinutesMouseClicked(evt);
            }
        });
        Pane_Down.add(Dowen_Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 30, 30));

        Timer.add(Pane_Down, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, 60));

        minutes_Timer.setFont(new java.awt.Font("Segoe UI", 1, 39)); // NOI18N
        minutes_Timer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutes_Timer.setText("25");
        minutes_Timer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutes_TimerActionPerformed(evt);
            }
        });
        Timer.add(minutes_Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 120));

        Pomodoro.add(Timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, 120));

        Study_Space.add(Pomodoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 500, 510));

        Sound_Player.setRoundBottomLeft(30);
        Sound_Player.setRoundBottomRight(30);
        Sound_Player.setRoundTopLeft(30);
        Sound_Player.setRoundTopRight(30);
        Sound_Player.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_play_sound.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_play_sound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_play_sound.setText("Play Sound");
        lab_play_sound.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Sound_Player.add(lab_play_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));
        Sound_Player.add(svgIconplay_sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 40, 40));
        Sound_Player.add(svgIcon_soundcloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 30));

        Study_Space.add(Sound_Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 540, 500, 150));

        Daily_Progress.setRoundBottomLeft(30);
        Daily_Progress.setRoundBottomRight(30);
        Daily_Progress.setRoundTopLeft(30);
        Daily_Progress.setRoundTopRight(30);
        Daily_Progress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Daily Progress");
        Daily_Progress.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Daily goal");
        Daily_Progress.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setText("1");
        Daily_Progress.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 160, 13, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Hour");
        Daily_Progress.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 195, 38, 15));

        spinnerProgress.setValue(50);
        Daily_Progress.add(spinnerProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 80, 150, 170));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Completed:");
        Daily_Progress.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        lab_Daily_Day.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_Daily_Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_Daily_Day.setText("Yesterday");
        Daily_Progress.add(lab_Daily_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("minutes");
        Daily_Progress.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, 70, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        Daily_Progress.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, 25));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("streak");
        Daily_Progress.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 70, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("1");
        Daily_Progress.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 70, 25));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("days");
        Daily_Progress.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 70, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("0");
        Daily_Progress.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 10, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("minutes");
        Daily_Progress.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        Daily_Progress.add(svgIcon_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        Study_Space.add(Daily_Progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 500, 370));

        Tasks.setRoundBottomLeft(30);
        Tasks.setRoundBottomRight(30);
        Tasks.setRoundTopLeft(30);
        Tasks.setRoundTopRight(30);
        Tasks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_tasks.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lab_tasks.setText("Tasks");
        Tasks.add(lab_tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Study_Space.add(Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 500, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Study_Space, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Study_Space, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int minutes;
    private int seconds;
    
    private void up_min() {
        minutes = Short.parseShort(minutes_Timer.getText());
        if (minutes < 240) {
            minutes += 5;
            minutes_Timer.setText(String.valueOf(minutes));
        }
    }

    private void down_min() {
        minutes = Short.parseShort(minutes_Timer.getText());
        if (minutes > 10) {
            minutes -= 5;
            minutes_Timer.setText(String.valueOf(minutes));
        }
    }

    private void start_Timer(int start) {
        seconds = start * 60;
        try {
        for (int i = seconds - 1 ;i > 0; i--){
            Thread.sleep(1000);
            System.out.println(i);
            
            if (i % 60 == 0){
                minutes-=1;
                System.out.println(minutes);
            }
        }            
        } catch (Exception e) {
        }
        

    }

    private void stop_Timer(short stop) {

    }

    private void UP_MinutesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UP_MinutesMouseClicked
        //play_sounds.setVisible(true);
        up_min();
    }//GEN-LAST:event_UP_MinutesMouseClicked

    private void Dowen_MinutesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dowen_MinutesMouseClicked
        down_min();
    }//GEN-LAST:event_Dowen_MinutesMouseClicked

    private void Pane_UPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pane_UPMouseClicked
        up_min();
    }//GEN-LAST:event_Pane_UPMouseClicked

    private void Pane_DownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pane_DownMouseClicked
        down_min();
    }//GEN-LAST:event_Pane_DownMouseClicked

    private void minutes_TimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutes_TimerActionPerformed
        short tt = Short.parseShort(minutes_Timer.getText());
        if ( tt < 10) {
            minutes_Timer.setText("10");
        }
    }//GEN-LAST:event_minutes_TimerActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        //start_Timer(2);
        Date_Time.decreaseStopwatch(1);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_stopActionPerformed

    // Daily Progress Section

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.PanelRound Daily_Progress;
    private Frontend.UI_Components.svgIcon Dowen_Minutes;
    private Frontend.UI_Components.Shadow_Round_Panel Pane_Down;
    private Frontend.UI_Components.Shadow_Round_Panel Pane_UP;
    private Frontend.UI_Components.PanelRound Pomodoro;
    private Frontend.UI_Components.PanelRound Sound_Player;
    private Frontend.UI_Components.PanelRound Study_Space;
    private Frontend.UI_Components.PanelRound Tasks;
    private Frontend.UI_Components.PanelRound Timer;
    private Frontend.UI_Components.svgIcon UP_Minutes;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lab_Daily_Day;
    private javax.swing.JLabel lab_play_sound;
    private javax.swing.JLabel lab_tasks;
    private javax.swing.JTextField minutes_Timer;
    private Frontend.Mini_Forms.play_Sound play_Sound1;
    private javax.swing.JDialog play_sounds;
    private Frontend.UI_Components.spinner_progress.SpinnerProgress spinnerProgress;
    private Frontend.UI_Components.svgIcon svgIcon_edit;
    private Frontend.UI_Components.svgIcon svgIcon_soundcloud;
    private Frontend.UI_Components.svgIcon svgIcon_steting;
    private Frontend.UI_Components.svgIcon svgIconplay_sound;
    // End of variables declaration//GEN-END:variables
}
