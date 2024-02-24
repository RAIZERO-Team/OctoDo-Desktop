package Frontend.Sign_Up;

import Application.Form.SSS_Forms_Manager;
import Backend.Account.PasswordUtil;
import static Backend.Account.Vaildition.isValidName;
import static Backend.Account.Vaildition.isValidPassword;
import static Backend.Account.Vaildition.isValidemail;
import static Backend.Database.QueriesAdministrator.isEmailExist;
import static Backend.Database.QueriesAdministrator.sign_up;
import Frontend.Sign_In.sign_in;
import Frontend.Program_Intro.Intro_To_Program;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class sign_up extends javax.swing.JPanel {

    private JPasswordField passwordField1;
    private DocumentListener documentListener;
    private int type;

    public sign_up() {
        initComponents();
        initPasswordField(PasswordField);
        Sign_Up.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$SSS.background;"
                + "arc:20;"
                + "border:30,40,50,30");

        fillText();
        setSVGIcons();
    }

    private void fillText() {
        txt_Fname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "First Name");
        txt_Lname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Last Name");
        txt_email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "e.g. example@gmail.com");
        PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
        PasswordField.putClientProperty(FlatClientProperties.STYLE, "" + "showRevealButton:true");
    }

    private void setSVGIcons() {
        svgIcon_Sign_Up.setSVGIcon("Asstes/SVG_Icons/sign_up.svg", 520, 620);

        svgIconLinkedin.setSVGIcon("Asstes/SVG_Icons/linkedin.svg", 30, 30);
        svgIconGitHub.setSVGIcon("Asstes/SVG_Icons/Github.svg", 30, 30);
        svgIconGoogle.setSVGIcon("Asstes/SVG_Icons/google.svg", 30, 30);
        svgIconFaceBook.setSVGIcon("Asstes/SVG_Icons/facebook.svg", 30, 30);

        svgIconLinkedin.setCursorHand();
        svgIconGitHub.setCursorHand();
        svgIconGoogle.setCursorHand();
        svgIconFaceBook.setCursorHand();
    }

    // Methods of check Password Status 
    // Method To set color
    private Color getStrengthColor(int type) {
        if (type == 1) {
            return Color.decode("#FF4D4D");
        } else if (type == 2) {
            return Color.decode("#FFB04D");
        } else {
            return Color.decode("#58C359");
        }
    }

    // Method To set txt password status
    private void set_txtStatus(String password) {
        this.type = password.isEmpty() ? 0 : PasswordUtil.checkPasswordStrength(password);

        if (type == 0) {
            lab_passwordStatus.setText("none");
            lab_passwordStatus.setVisible(false);
        } else {
            lab_passwordStatus.setVisible(true);
            if (type == 1) {
                lab_passwordStatus.setText("Too weak");
            } else if (type == 2) {
                lab_passwordStatus.setText("Medium");
            } else {
                lab_passwordStatus.setText("Strong");
            }
            lab_passwordStatus.setForeground(getStrengthColor(type));
        }
        repaint();
    }

    // Method to set progress bar password status
    private void set_progreesBarStatus(String password) {
        Color disableColor = Color.decode("#4E5052");
        if (type >= 1) {
            bar_week.setBackground(getStrengthColor(1));
        } else {
            bar_week.setBackground(disableColor);
        }

        if (type >= 2) {
            bar_medium.setBackground(getStrengthColor(2));
        } else {
            bar_medium.setBackground(disableColor);
        }

        if (type >= 3) {
            bar_strong.setBackground(getStrengthColor(3));
        } else {
            bar_strong.setBackground(disableColor);
        }
    }

    // Method to init The password
    public void initPasswordField(JPasswordField txt) {
        if (documentListener == null) {
            documentListener = new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    set_txtStatus(String.valueOf(txt.getPassword()));
                    set_progreesBarStatus(String.valueOf(txt.getPassword()));
                }
            };
        }
        if (passwordField1 != null) {
            passwordField1.getDocument().removeDocumentListener(documentListener);
        }
        txt.getDocument().addDocumentListener(documentListener);
        passwordField1 = txt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderSelect = new javax.swing.ButtonGroup();
        Sign_Up = new Frontend.UI_Components.PanelRound();
        sign_up_Panel = new Frontend.UI_Components.PanelRound();
        lab_signUp_options = new javax.swing.JLabel();
        rbn_male = new javax.swing.JRadioButton();
        rbn_female = new javax.swing.JRadioButton();
        lab_gender = new javax.swing.JLabel();
        lab_FName = new javax.swing.JLabel();
        lab_LName = new javax.swing.JLabel();
        txt_Fname = new javax.swing.JTextField();
        lab_errorFName = new javax.swing.JLabel();
        txt_Lname = new javax.swing.JTextField();
        lab_errorLName = new javax.swing.JLabel();
        lab_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lab_errorEmail = new javax.swing.JLabel();
        lab_password = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        bar_week = new javax.swing.JProgressBar();
        bar_strong = new javax.swing.JProgressBar();
        bar_medium = new javax.swing.JProgressBar();
        lab_passwordStatus = new javax.swing.JLabel();
        lab_haveAccout = new javax.swing.JLabel();
        btn_Next = new javax.swing.JButton();
        lb_Description = new javax.swing.JLabel();
        lb_Title = new javax.swing.JLabel();
        svgIconLinkedin = new Frontend.UI_Components.svgIcon();
        svgIconGitHub = new Frontend.UI_Components.svgIcon();
        svgIconGoogle = new Frontend.UI_Components.svgIcon();
        svgIconFaceBook = new Frontend.UI_Components.svgIcon();
        lab_sign_in = new javax.swing.JLabel();
        panelRound1 = new Frontend.UI_Components.PanelRound();
        panelRound2 = new Frontend.UI_Components.PanelRound();
        panelRound3 = new Frontend.UI_Components.PanelRound();
        panelRound4 = new Frontend.UI_Components.PanelRound();
        svgIcon_Sign_Up = new Frontend.UI_Components.svgIcon();

        Sign_Up.setRoundBottomLeft(30);
        Sign_Up.setRoundBottomRight(30);
        Sign_Up.setRoundTopLeft(30);
        Sign_Up.setRoundTopRight(30);
        Sign_Up.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign_up_Panel.setBackground(new java.awt.Color(49, 62, 74));
        sign_up_Panel.setForeground(new java.awt.Color(65, 63, 60));
        sign_up_Panel.setRoundBottomLeft(30);
        sign_up_Panel.setRoundBottomRight(30);
        sign_up_Panel.setRoundTopLeft(30);
        sign_up_Panel.setRoundTopRight(30);
        sign_up_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_signUp_options.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_signUp_options.setForeground(new java.awt.Color(255, 255, 255));
        lab_signUp_options.setText("Or sign up with");
        sign_up_Panel.add(lab_signUp_options, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        GenderSelect.add(rbn_male);
        rbn_male.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbn_male.setForeground(new java.awt.Color(255, 255, 255));
        rbn_male.setSelected(true);
        rbn_male.setText("Male");
        sign_up_Panel.add(rbn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        GenderSelect.add(rbn_female);
        rbn_female.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbn_female.setForeground(new java.awt.Color(255, 255, 255));
        rbn_female.setText("Female");
        sign_up_Panel.add(rbn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        lab_gender.setBackground(new java.awt.Color(206, 211, 214));
        lab_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_gender.setForeground(new java.awt.Color(255, 255, 255));
        lab_gender.setText("Gender");
        sign_up_Panel.add(lab_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        lab_FName.setBackground(new java.awt.Color(206, 211, 214));
        lab_FName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_FName.setForeground(new java.awt.Color(255, 255, 255));
        lab_FName.setText("First Name");
        sign_up_Panel.add(lab_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lab_LName.setBackground(new java.awt.Color(206, 211, 214));
        lab_LName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_LName.setForeground(new java.awt.Color(255, 255, 255));
        lab_LName.setText("Last Name");
        sign_up_Panel.add(lab_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        txt_Fname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Fname.setPreferredSize(new java.awt.Dimension(68, 28));
        sign_up_Panel.add(txt_Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, 33));

        lab_errorFName.setForeground(new java.awt.Color(255, 77, 77));
        sign_up_Panel.add(lab_errorFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 187, 170, 14));

        txt_Lname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Lname.setPreferredSize(new java.awt.Dimension(68, 28));
        sign_up_Panel.add(txt_Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 170, 33));

        lab_errorLName.setForeground(new java.awt.Color(255, 77, 77));
        sign_up_Panel.add(lab_errorLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 187, 170, 14));

        lab_email.setBackground(new java.awt.Color(206, 211, 214));
        lab_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_email.setForeground(new java.awt.Color(255, 255, 255));
        lab_email.setText("Email");
        sign_up_Panel.add(lab_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_email.setPreferredSize(new java.awt.Dimension(68, 28));
        sign_up_Panel.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 360, 33));

        lab_errorEmail.setForeground(new java.awt.Color(255, 77, 77));
        sign_up_Panel.add(lab_errorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 370, 14));

        lab_password.setBackground(new java.awt.Color(206, 211, 214));
        lab_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_password.setForeground(new java.awt.Color(255, 255, 255));
        lab_password.setText("Password");
        sign_up_Panel.add(lab_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        PasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sign_up_Panel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 360, 33));

        bar_week.setMinimumSize(new java.awt.Dimension(8, 4));
        sign_up_Panel.add(bar_week, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 45, -1));

        bar_strong.setMinimumSize(new java.awt.Dimension(8, 4));
        sign_up_Panel.add(bar_strong, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 45, -1));

        bar_medium.setMinimumSize(new java.awt.Dimension(8, 4));
        sign_up_Panel.add(bar_medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 45, -1));

        lab_passwordStatus.setForeground(new java.awt.Color(0, 0, 0));
        lab_passwordStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_up_Panel.add(lab_passwordStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 60, 20));

        lab_haveAccout.setBackground(new java.awt.Color(206, 211, 214));
        lab_haveAccout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab_haveAccout.setForeground(new java.awt.Color(255, 255, 255));
        lab_haveAccout.setText("Already have an account? ");
        sign_up_Panel.add(lab_haveAccout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, -1, -1));

        btn_Next.setBackground(new java.awt.Color(21, 101, 192));
        btn_Next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Next.setForeground(new java.awt.Color(255, 255, 255));
        btn_Next.setText("Next");
        btn_Next.setBorderPainted(false);
        btn_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });
        sign_up_Panel.add(btn_Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 260, -1));

        lb_Description.setBackground(new java.awt.Color(206, 211, 214));
        lb_Description.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Description.setForeground(new java.awt.Color(204, 204, 204));
        lb_Description.setText("Join us to learn and be very good . Sign up now! ");
        sign_up_Panel.add(lb_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lb_Title.setBackground(new java.awt.Color(206, 211, 214));
        lb_Title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lb_Title.setForeground(new java.awt.Color(255, 255, 255));
        lb_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Title.setText("Welcome To OctoDo Application");
        sign_up_Panel.add(lb_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        sign_up_Panel.add(svgIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 30, 30));
        sign_up_Panel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 30, 30));
        sign_up_Panel.add(svgIconGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 30, 30));
        sign_up_Panel.add(svgIconFaceBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 30, 30));

        lab_sign_in.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab_sign_in.setForeground(new java.awt.Color(21, 101, 192));
        lab_sign_in.setText("Sign in here");
        lab_sign_in.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lab_sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_sign_inMouseClicked(evt);
            }
        });
        sign_up_Panel.add(lab_sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, -1, -1));

        panelRound1.setBackground(new java.awt.Color(201, 222, 255));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sign_up_Panel.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        panelRound2.setBackground(new java.awt.Color(84, 87, 212));
        panelRound2.setRoundBottomLeft(500);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(500);
        panelRound2.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sign_up_Panel.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        panelRound3.setBackground(new java.awt.Color(52, 59, 151));
        panelRound3.setRoundBottomLeft(500);
        panelRound3.setRoundBottomRight(500);
        panelRound3.setRoundTopLeft(500);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sign_up_Panel.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        panelRound4.setBackground(new java.awt.Color(142, 229, 255));
        panelRound4.setRoundBottomLeft(500);
        panelRound4.setRoundBottomRight(500);
        panelRound4.setRoundTopLeft(50);

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        sign_up_Panel.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        Sign_Up.add(sign_up_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 520, 620));
        Sign_Up.add(svgIcon_Sign_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 20, 520, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sign_Up, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        if (rbn_male.isSelected()){
            SSS_Forms_Manager.getInstance().showForm(new sign_up_Male_User());
        } else {
            SSS_Forms_Manager.getInstance().showForm(new sign_up_Female_User());
        }       

        String Fname = txt_Fname.getText().trim();
        String Lname = txt_Lname.getText().trim();
        String Email = txt_email.getText().trim();
        char[] password = PasswordField.getPassword();
        String passwordstr = new String(password);//convert char[] to string (password)
        String Gender;
        boolean Check = true; // check all information

        if (!isValidName(Fname)) {//check valid first name
            Check = false;
        }

        if (!isValidName(Lname)) {//check valid last name
            Check = false;
        }

        if (isValidemail(Email)) {//check valid email and if ok check is exist or not
            if (isEmailExist(Email)) {
                System.out.println("is already exist");
                Check = false;
            }

        } else {
            Check = false;
        }

        if (!isValidPassword(passwordstr)) {//check valid password
            Check = false;
        }

        if (rbn_male.isSelected()) {// check if user chossen male or female
            Gender = "Male";
        } else {
            Gender = "Female";
        }

        // check if all are ok or not
        if (Check) {
            if (sign_up(Fname, Lname, Email, passwordstr, Gender)) {
                System.out.println("Successful stored");//informations stored

                if (rbn_male.isSelected()) {
                    SSS_Forms_Manager.getInstance().showForm(new sign_up_Male_User());
                } else {
                    SSS_Forms_Manager.getInstance().showForm(new sign_up_Female_User());
                }

            } else {
                System.out.println("something went wrong");//Exception when stored information
            }
        } else {
            System.out.println("you stored wrong information");// if user insert false information at least one of them
        }


    }//GEN-LAST:event_btn_NextActionPerformed

    private void lab_sign_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_sign_inMouseClicked
        SSS_Forms_Manager.getInstance().showForm(new Intro_To_Program());
    }//GEN-LAST:event_lab_sign_inMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderSelect;
    private javax.swing.JPasswordField PasswordField;
    private Frontend.UI_Components.PanelRound Sign_Up;
    private javax.swing.JProgressBar bar_medium;
    private javax.swing.JProgressBar bar_strong;
    private javax.swing.JProgressBar bar_week;
    private javax.swing.JButton btn_Next;
    private javax.swing.JLabel lab_FName;
    private javax.swing.JLabel lab_LName;
    private javax.swing.JLabel lab_email;
    private javax.swing.JLabel lab_errorEmail;
    private javax.swing.JLabel lab_errorFName;
    private javax.swing.JLabel lab_errorLName;
    private javax.swing.JLabel lab_gender;
    private javax.swing.JLabel lab_haveAccout;
    private javax.swing.JLabel lab_password;
    private javax.swing.JLabel lab_passwordStatus;
    private javax.swing.JLabel lab_signUp_options;
    private javax.swing.JLabel lab_sign_in;
    private javax.swing.JLabel lb_Description;
    private javax.swing.JLabel lb_Title;
    private Frontend.UI_Components.PanelRound panelRound1;
    private Frontend.UI_Components.PanelRound panelRound2;
    private Frontend.UI_Components.PanelRound panelRound3;
    private Frontend.UI_Components.PanelRound panelRound4;
    private javax.swing.JRadioButton rbn_female;
    private javax.swing.JRadioButton rbn_male;
    private Frontend.UI_Components.PanelRound sign_up_Panel;
    private Frontend.UI_Components.svgIcon svgIconFaceBook;
    private Frontend.UI_Components.svgIcon svgIconGitHub;
    private Frontend.UI_Components.svgIcon svgIconGoogle;
    private Frontend.UI_Components.svgIcon svgIconLinkedin;
    private Frontend.UI_Components.svgIcon svgIcon_Sign_Up;
    private javax.swing.JTextField txt_Fname;
    private javax.swing.JTextField txt_Lname;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables

}
