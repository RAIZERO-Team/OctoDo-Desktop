
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
    }

    private void setIcon(){
        svgIcon_Left.setSVGIcon("Asstes/SVG_Icons/left.svg", 30, 30);
        svgIcon_Right.setSVGIcon("Asstes/SVG_Icons/right.svg", 30, 30);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        week_task = new Frontend.UI_Components.PanelRound();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        panelRound2 = new Frontend.UI_Components.PanelRound();
        panelRound3 = new Frontend.UI_Components.PanelRound();
        panelRound4 = new Frontend.UI_Components.PanelRound();
        panelRound5 = new Frontend.UI_Components.PanelRound();
        panelRound6 = new Frontend.UI_Components.PanelRound();
        panelRound7 = new Frontend.UI_Components.PanelRound();
        svgIcon_Left = new Frontend.UI_Components.svgIcon();
        svgIcon_Right = new Frontend.UI_Components.svgIcon();

        week_task.setRoundBottomLeft(30);
        week_task.setRoundBottomRight(30);
        week_task.setRoundTopLeft(30);
        week_task.setRoundTopRight(30);
        week_task.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        week_task.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 10, 250, 40));

        panelRound1.setBackground(new java.awt.Color(102, 102, 102));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 988, 75));

        panelRound2.setBackground(new java.awt.Color(102, 102, 102));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 988, 75));

        panelRound3.setBackground(new java.awt.Color(102, 102, 102));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 988, 75));

        panelRound4.setBackground(new java.awt.Color(102, 102, 102));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 988, 75));

        panelRound5.setBackground(new java.awt.Color(102, 102, 102));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 988, 75));

        panelRound6.setBackground(new java.awt.Color(102, 102, 102));
        panelRound6.setRoundBottomLeft(50);
        panelRound6.setRoundBottomRight(50);
        panelRound6.setRoundTopLeft(50);
        panelRound6.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 988, 75));

        panelRound7.setBackground(new java.awt.Color(102, 102, 102));
        panelRound7.setRoundBottomLeft(50);
        panelRound7.setRoundBottomRight(50);
        panelRound7.setRoundTopLeft(50);
        panelRound7.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        week_task.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 988, 75));
        week_task.add(svgIcon_Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, 30, 30));
        week_task.add(svgIcon_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 354, 30, 30));

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
                .addComponent(week_task, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.PanelRound panelRound2;
    private Frontend.UI_Components.PanelRound panelRound3;
    private Frontend.UI_Components.PanelRound panelRound4;
    private Frontend.UI_Components.PanelRound panelRound5;
    private Frontend.UI_Components.PanelRound panelRound6;
    private Frontend.UI_Components.PanelRound panelRound7;
    private Frontend.UI_Components.svgIcon svgIcon_Left;
    private Frontend.UI_Components.svgIcon svgIcon_Right;
    private Frontend.UI_Components.PanelRound week_task;
    // End of variables declaration//GEN-END:variables
}
