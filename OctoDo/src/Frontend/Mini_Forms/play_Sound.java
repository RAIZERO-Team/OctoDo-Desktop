package Frontend.Mini_Forms;

import Frontend.UI_Components.svgIcon;

public class play_Sound extends javax.swing.JPanel {

    public play_Sound() {
        initComponents();
        init();
    }

    private void init() {

        // sound 1
        pane_sound1 = new Frontend.UI_Components.PanelRound();
        lab_sound1 = new javax.swing.JLabel();
        svgIcon_sound1 = new Frontend.UI_Components.svgIcon();

        pane_sound1.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound1.setRoundBottomLeft(40);
        pane_sound1.setRoundBottomRight(40);
        pane_sound1.setRoundTopLeft(40);
        pane_sound1.setRoundTopRight(40);
        pane_sound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound1.setText("Sea Sound ");
        pane_sound1.add(lab_sound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound1MouseClicked(evt);
            }
        });
        pane_sound1.add(svgIcon_sound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 310, 60));

        // sound 2
        pane_sound2 = new Frontend.UI_Components.PanelRound();
        lab_sound2 = new javax.swing.JLabel();
        svgIcon_sound2 = new Frontend.UI_Components.svgIcon();

        pane_sound2.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound2.setRoundBottomLeft(40);
        pane_sound2.setRoundBottomRight(40);
        pane_sound2.setRoundTopLeft(40);
        pane_sound2.setRoundTopRight(40);
        pane_sound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound2.setText("Sea Sound ");
        pane_sound2.add(lab_sound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound2MouseClicked(evt);
            }
        });
        pane_sound2.add(svgIcon_sound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 310, 60));

        // sound 3
        pane_sound3 = new Frontend.UI_Components.PanelRound();
        lab_sound3 = new javax.swing.JLabel();
        svgIcon_sound3 = new Frontend.UI_Components.svgIcon();

        pane_sound3.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound3.setRoundBottomLeft(40);
        pane_sound3.setRoundBottomRight(40);
        pane_sound3.setRoundTopLeft(40);
        pane_sound3.setRoundTopRight(40);
        pane_sound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound3.setText("Sea Sound ");
        pane_sound3.add(lab_sound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound3MouseClicked(evt);
            }
        });
        pane_sound3.add(svgIcon_sound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 170, 310, 60));

        // sound 4
        pane_sound4 = new Frontend.UI_Components.PanelRound();
        lab_sound4 = new javax.swing.JLabel();
        svgIcon_sound4 = new Frontend.UI_Components.svgIcon();

        pane_sound4.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound4.setRoundBottomLeft(40);
        pane_sound4.setRoundBottomRight(40);
        pane_sound4.setRoundTopLeft(40);
        pane_sound4.setRoundTopRight(40);
        pane_sound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound4.setText("Sea Sound ");
        pane_sound4.add(lab_sound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound4MouseClicked(evt);
            }
        });
        pane_sound4.add(svgIcon_sound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 240, 310, 60));

        // sound 5
        pane_sound5 = new Frontend.UI_Components.PanelRound();
        lab_sound5 = new javax.swing.JLabel();
        svgIcon_sound5 = new Frontend.UI_Components.svgIcon();

        pane_sound5.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound5.setRoundBottomLeft(40);
        pane_sound5.setRoundBottomRight(40);
        pane_sound5.setRoundTopLeft(40);
        pane_sound5.setRoundTopRight(40);
        pane_sound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound5.setText("Sea Sound ");
        pane_sound5.add(lab_sound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound5MouseClicked(evt);
            }
        });
        pane_sound5.add(svgIcon_sound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 310, 310, 60));

        // sound 6
        pane_sound6 = new Frontend.UI_Components.PanelRound();
        lab_sound6 = new javax.swing.JLabel();
        svgIcon_sound6 = new Frontend.UI_Components.svgIcon();

        pane_sound6.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound6.setRoundBottomLeft(40);
        pane_sound6.setRoundBottomRight(40);
        pane_sound6.setRoundTopLeft(40);
        pane_sound6.setRoundTopRight(40);
        pane_sound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound6.setText("Sea Sound ");
        pane_sound6.add(lab_sound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound6MouseClicked(evt);
            }
        });
        pane_sound6.add(svgIcon_sound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 380, 310, 60));

        // sound 7
        pane_sound7 = new Frontend.UI_Components.PanelRound();
        lab_sound7 = new javax.swing.JLabel();
        svgIcon_sound7 = new Frontend.UI_Components.svgIcon();

        pane_sound7.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound7.setRoundBottomLeft(40);
        pane_sound7.setRoundBottomRight(40);
        pane_sound7.setRoundTopLeft(40);
        pane_sound7.setRoundTopRight(40);
        pane_sound7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound7.setText("Sea Sound ");
        pane_sound7.add(lab_sound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound7MouseClicked(evt);
            }
        });
        pane_sound7.add(svgIcon_sound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 450, 310, 60));

        // sound 8
        pane_sound8 = new Frontend.UI_Components.PanelRound();
        lab_sound8 = new javax.swing.JLabel();
        svgIcon_sound8 = new Frontend.UI_Components.svgIcon();

        pane_sound8.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound8.setRoundBottomLeft(40);
        pane_sound8.setRoundBottomRight(40);
        pane_sound8.setRoundTopLeft(40);
        pane_sound8.setRoundTopRight(40);
        pane_sound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound8.setText("Sea Sound ");
        pane_sound8.add(lab_sound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound8.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound8MouseClicked(evt);
            }
        });
        pane_sound8.add(svgIcon_sound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 520, 310, 60));

        // sound 9
        pane_sound9 = new Frontend.UI_Components.PanelRound();
        lab_sound9 = new javax.swing.JLabel();
        svgIcon_sound9 = new Frontend.UI_Components.svgIcon();

        pane_sound9.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound9.setRoundBottomLeft(40);
        pane_sound9.setRoundBottomRight(40);
        pane_sound9.setRoundTopLeft(40);
        pane_sound9.setRoundTopRight(40);
        pane_sound9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound9.setText("Sea Sound ");
        pane_sound9.add(lab_sound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound9.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound9MouseClicked(evt);
            }
        });
        pane_sound9.add(svgIcon_sound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 590, 310, 60));

        // sound 10
        pane_sound10 = new Frontend.UI_Components.PanelRound();
        lab_sound10 = new javax.swing.JLabel();
        svgIcon_sound10 = new Frontend.UI_Components.svgIcon();

        pane_sound10.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound10.setRoundBottomLeft(40);
        pane_sound10.setRoundBottomRight(40);
        pane_sound10.setRoundTopLeft(40);
        pane_sound10.setRoundTopRight(40);
        pane_sound10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound10.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound10.setText("Sea Sound ");
        pane_sound10.add(lab_sound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound10.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound10MouseClicked(evt);
            }
        });
        pane_sound10.add(svgIcon_sound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 660, 310, 60));

        // sound 11
        pane_sound11 = new Frontend.UI_Components.PanelRound();
        lab_sound11 = new javax.swing.JLabel();
        svgIcon_sound11 = new Frontend.UI_Components.svgIcon();

        pane_sound11.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound11.setRoundBottomLeft(40);
        pane_sound11.setRoundBottomRight(40);
        pane_sound11.setRoundTopLeft(40);
        pane_sound11.setRoundTopRight(40);
        pane_sound11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound11.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound11.setText("Sea Sound ");
        pane_sound11.add(lab_sound11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound11.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound11MouseClicked(evt);
            }
        });
        pane_sound11.add(svgIcon_sound11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 730, 310, 60));

        // sound 12
        pane_sound12 = new Frontend.UI_Components.PanelRound();
        lab_sound12 = new javax.swing.JLabel();
        svgIcon_sound12 = new Frontend.UI_Components.svgIcon();

        pane_sound12.setBackground(new java.awt.Color(0, 153, 153));
        pane_sound12.setRoundBottomLeft(40);
        pane_sound12.setRoundBottomRight(40);
        pane_sound12.setRoundTopLeft(40);
        pane_sound12.setRoundTopRight(40);
        pane_sound12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_sound12.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lab_sound12.setText("Sea Sound ");
        pane_sound12.add(lab_sound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        svgIcon_sound12.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIcon_sound12MouseClicked(evt);
            }
        });
        pane_sound12.add(svgIcon_sound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, 30, 30));

        Sounds.add(pane_sound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 800, 310, 60));

        scrollPane.setViewportView(Sounds);

        svgIcon_sound1.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound2.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound3.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound4.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound5.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound6.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound7.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound8.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound9.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound10.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound11.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
        svgIcon_sound12.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);

        svgIcon_sound1.setCursorHand();
        svgIcon_sound2.setCursorHand();
        svgIcon_sound3.setCursorHand();
        svgIcon_sound4.setCursorHand();
        svgIcon_sound5.setCursorHand();
        svgIcon_sound6.setCursorHand();
        svgIcon_sound7.setCursorHand();
        svgIcon_sound8.setCursorHand();
        svgIcon_sound9.setCursorHand();
        svgIcon_sound10.setCursorHand();
        svgIcon_sound11.setCursorHand();
        svgIcon_sound12.setCursorHand();
    }

    private void playSound() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new Frontend.UI_Components.ScrollBar.ScrollPaneWin11();
        Sounds = new javax.swing.JPanel();

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Sounds.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPane.setViewportView(Sounds);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void play_svg_Icon(svgIcon play) {
        play.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);
    }

    private void stop_svg_Icon(svgIcon stop) {
        stop.setSVGIcon("Asstes/SVG_Icons/stop-play-sound.svg", 30, 30);
    }

    private void sound1() {
        stop_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound2() {
        stop_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound3() {
        stop_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound4() {
        stop_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound5() {
        stop_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound6() {
        stop_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound7() {
        stop_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound8() {
        stop_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound9() {
        stop_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound10() {
        stop_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound11() {
        stop_svg_Icon(svgIcon_sound11);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound12);
    }

    private void sound12() {
        stop_svg_Icon(svgIcon_sound12);
        play_svg_Icon(svgIcon_sound1);
        play_svg_Icon(svgIcon_sound2);
        play_svg_Icon(svgIcon_sound3);
        play_svg_Icon(svgIcon_sound4);
        play_svg_Icon(svgIcon_sound5);
        play_svg_Icon(svgIcon_sound6);
        play_svg_Icon(svgIcon_sound7);
        play_svg_Icon(svgIcon_sound8);
        play_svg_Icon(svgIcon_sound9);
        play_svg_Icon(svgIcon_sound10);
        play_svg_Icon(svgIcon_sound11);
    }

    private void svgIcon_sound1MouseClicked(java.awt.event.MouseEvent evt) {
        sound1();
        //svgIcon_sound1.setSVGIcon("Asstes/SVG_Icons/play-sound.svg", 30, 30);

    }

    private void svgIcon_sound2MouseClicked(java.awt.event.MouseEvent evt) {
        sound2();

    }

    private void svgIcon_sound3MouseClicked(java.awt.event.MouseEvent evt) {
        sound3();

    }

    private void svgIcon_sound4MouseClicked(java.awt.event.MouseEvent evt) {
        sound4();

    }

    private void svgIcon_sound5MouseClicked(java.awt.event.MouseEvent evt) {
        sound5();

    }

    private void svgIcon_sound6MouseClicked(java.awt.event.MouseEvent evt) {
        sound6();

    }

    private void svgIcon_sound7MouseClicked(java.awt.event.MouseEvent evt) {
        sound7();

    }

    private void svgIcon_sound8MouseClicked(java.awt.event.MouseEvent evt) {
        sound8();

    }

    private void svgIcon_sound9MouseClicked(java.awt.event.MouseEvent evt) {
        sound9();

    }

    private void svgIcon_sound10MouseClicked(java.awt.event.MouseEvent evt) {
        sound10();

    }

    private void svgIcon_sound11MouseClicked(java.awt.event.MouseEvent evt) {
        sound11();

    }

    private void svgIcon_sound12MouseClicked(java.awt.event.MouseEvent evt) {
        sound12();

    }

    private Frontend.UI_Components.PanelRound pane_sound1;
    private javax.swing.JLabel lab_sound1;
    private Frontend.UI_Components.svgIcon svgIcon_sound1;

    private Frontend.UI_Components.PanelRound pane_sound2;
    private javax.swing.JLabel lab_sound2;
    private Frontend.UI_Components.svgIcon svgIcon_sound2;

    private Frontend.UI_Components.PanelRound pane_sound3;
    private javax.swing.JLabel lab_sound3;
    private Frontend.UI_Components.svgIcon svgIcon_sound3;

    private Frontend.UI_Components.PanelRound pane_sound4;
    private javax.swing.JLabel lab_sound4;
    private Frontend.UI_Components.svgIcon svgIcon_sound4;

    private Frontend.UI_Components.PanelRound pane_sound5;
    private javax.swing.JLabel lab_sound5;
    private Frontend.UI_Components.svgIcon svgIcon_sound5;

    private Frontend.UI_Components.PanelRound pane_sound6;
    private javax.swing.JLabel lab_sound6;
    private Frontend.UI_Components.svgIcon svgIcon_sound6;

    private Frontend.UI_Components.PanelRound pane_sound7;
    private javax.swing.JLabel lab_sound7;
    private Frontend.UI_Components.svgIcon svgIcon_sound7;

    private Frontend.UI_Components.PanelRound pane_sound8;
    private javax.swing.JLabel lab_sound8;
    private Frontend.UI_Components.svgIcon svgIcon_sound8;

    private Frontend.UI_Components.PanelRound pane_sound9;
    private javax.swing.JLabel lab_sound9;
    private Frontend.UI_Components.svgIcon svgIcon_sound9;

    private Frontend.UI_Components.PanelRound pane_sound10;
    private javax.swing.JLabel lab_sound10;
    private Frontend.UI_Components.svgIcon svgIcon_sound10;

    private Frontend.UI_Components.PanelRound pane_sound11;
    private javax.swing.JLabel lab_sound11;
    private Frontend.UI_Components.svgIcon svgIcon_sound11;

    private Frontend.UI_Components.PanelRound pane_sound12;
    private javax.swing.JLabel lab_sound12;
    private Frontend.UI_Components.svgIcon svgIcon_sound12;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sounds;
    private Frontend.UI_Components.ScrollBar.ScrollPaneWin11 scrollPane;
    // End of variables declaration//GEN-END:variables
}
