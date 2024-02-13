package Frontend.Program_Intro;

import Application.Form.FormsManager;
import Frontend.Sign_In.sign_in;
import com.formdev.flatlaf.FlatClientProperties;

public class Intro_To_Program extends javax.swing.JPanel {

    public Intro_To_Program() {
        initComponents();
        intro_to_program.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        
        svgIcon1.setSVGIcon("Asstes/SVG_Icons/Splash_Screen 1.svg", 250, 250);
        //lab_image.setText("The Application help you to manage your time");
        //svgIcon2.setSVGIcon("Icons/1F642.svg", 50, 50);
        btn_skip.setCursorHand();
        btn_next.setCursorHand();
        jProgressBar1.setValue(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intro_to_program = new Frontend.UI_Components.PanelRound();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        btn_skip = new Frontend.UI_Components.Shadow_Button();
        btn_next = new Frontend.UI_Components.Shadow_Button();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        lab_mainTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        svgIcon1 = new Frontend.UI_Components.svgIcon();

        intro_to_program.setRoundBottomLeft(30);
        intro_to_program.setRoundBottomRight(30);
        intro_to_program.setRoundTopLeft(30);
        intro_to_program.setRoundTopRight(30);
        intro_to_program.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        intro_to_program.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 120, 4));
        intro_to_program.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, 4));
        intro_to_program.add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 120, 4));
        intro_to_program.add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 120, 4));

        btn_skip.setBackground(new java.awt.Color(60, 63, 65));
        btn_skip.setForeground(new java.awt.Color(255, 255, 255));
        btn_skip.setText("Skip");
        btn_skip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_skip.setShadowColor(new java.awt.Color(49, 62, 74));
        btn_skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_skipActionPerformed(evt);
            }
        });
        intro_to_program.add(btn_skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 150, 40));

        btn_next.setBackground(new java.awt.Color(56, 166, 83));
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Next");
        btn_next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        intro_to_program.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 150, 40));

        panelRound1.setBackground(new java.awt.Color(49, 62, 74));
        panelRound1.setRoundBottomLeft(500);
        panelRound1.setRoundBottomRight(500);
        panelRound1.setRoundTopLeft(150);
        panelRound1.setRoundTopRight(150);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_mainTxt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lab_mainTxt.setForeground(new java.awt.Color(255, 255, 255));
        lab_mainTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_mainTxt.setText("Manage Yor Time");
        panelRound1.add(lab_mainTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 410, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("This App Make your Time easy to manage");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 350, 20));
        panelRound1.add(svgIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, 250));

        intro_to_program.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 450, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(intro_to_program, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(intro_to_program, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    short count = 1;

    private void image(short x) {
        if (x == 2) {
            svgIcon1.setSVGIcon("Asstes/SVG_Icons/Splash_Screen 2.svg", 250, 250);
            jProgressBar2.setValue(100);
            lab_mainTxt.setText("");
        } else if (x == 3) {
            svgIcon1.setSVGIcon("Asstes/SVG_Icons/Splash_Screen 3.svg", 250, 250);
            jProgressBar3.setValue(100);
            lab_mainTxt.setText("");
        } else if (x == 4){
            svgIcon1.setSVGIcon("Asstes/SVG_Icons/Splash_Screen 4.svg", 250, 250);
            jProgressBar4.setValue(100);
            lab_mainTxt.setText("");
            btn_next.setText("Let's Start");
        } else {
            FormsManager.getInstance().showForm(new sign_in());
        }
    }

    private void close_This_panel(){
        
    }
    
    private void btn_skipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_skipActionPerformed
        FormsManager.getInstance().showForm(new sign_in());
    }//GEN-LAST:event_btn_skipActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        count++;
        image(count);
        
    }//GEN-LAST:event_btn_nextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frontend.UI_Components.Shadow_Button btn_next;
    private Frontend.UI_Components.Shadow_Button btn_skip;
    private Frontend.UI_Components.PanelRound intro_to_program;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JLabel lab_mainTxt;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.svgIcon svgIcon1;
    // End of variables declaration//GEN-END:variables
}
