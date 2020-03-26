/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Andreas E.S
 */
public class Registration extends javax.swing.JPanel {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        pwdConfirm = new javax.swing.JPasswordField();
        cboxSQ = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 241, 241));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(101, 111, 123));
        jLabel1.setText("Registere here");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(101, 111, 123));
        jLabel2.setText("Firstname");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(101, 111, 123));
        jLabel3.setText("Lastname");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(101, 111, 123));
        jLabel4.setText("Username ");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 111, 123));
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(101, 111, 123));
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(101, 111, 123));
        jLabel7.setText("Confirm password");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(101, 111, 123));
        jLabel8.setText("Security question");

        txtFName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        txtLName.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        txtemail.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        pwdPassword.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        pwdConfirm.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        cboxSQ.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cboxSQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What time of the day were you born? (hh:mm)", "What primary school did you attend?", "In what town or city was your first full time job?", "In what town or city did you meet your spouse/partner?" }));
        cboxSQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(101, 111, 123));
        jLabel9.setText("Answer to SQ");

        txtAnswer.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(101, 111, 123));
        btnSubmit.setText("Submit");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(101, 111, 123));
        jButton2.setText("Reset");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\digits\\Documents\\NetBeansProjects\\FisrtActualApp\\src\\Bank\\icons8-back-arrow-50.png")); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel11)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(pwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(cboxSQ, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(pwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(cboxSQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9))
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(jButton2))
                .addGap(154, 178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtFName.setText(" ");
        txtLName.setText(" ");
        txtUsername.setText(" ");
        txtemail.setText(" ");
        pwdPassword.setText(null);
        pwdConfirm.setText(null);
        txtAnswer.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String password = new String(this.pwdPassword.getPassword());
        String cpassword = new String(this.pwdConfirm.getPassword());
        int sq = cboxSQ.getSelectedIndex();

        if (txtFName.getText().isEmpty() || txtLName.getText().isEmpty() || txtUsername.getText().isEmpty()
                || txtemail.getText().isEmpty() || password.isEmpty() || cpassword.isEmpty() || txtAnswer.getText().isEmpty()) {

            if (txtFName.getText().isEmpty()) {
                txtFName.setBorder(new LineBorder(Color.RED));
            }
            if (txtLName.getText().isEmpty()) {
                txtLName.setBorder(new LineBorder(Color.RED));
            }
            if (txtUsername.getText().isEmpty()) {
                txtUsername.setBorder(new LineBorder(Color.RED));
            }
            if (txtemail.getText().isEmpty()) {
                txtemail.setBorder(new LineBorder(Color.RED));
            }
            if (password.isEmpty()) {
                pwdPassword.setBorder(new LineBorder(Color.RED));
            }
            if (cpassword.isEmpty()) {
                pwdConfirm.setBorder(new LineBorder(Color.RED));
            }
            if (txtAnswer.getText().isEmpty()) {
                txtAnswer.setBorder(new LineBorder(Color.RED));
            }
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else {
            try {
                //Database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:sqlserver://localhost:1433; databaseName=Bank; user=sa; password=Nust2019";
                Connection con = (Connection) DriverManager.getConnection(url);
                Statement st = con.createStatement();

                if (password.equalsIgnoreCase(cpassword)) {
                    CallableStatement cal = con.prepareCall("{call Registrations(?,?,?,?,?,?,?,?)}"); //calling the procedure
                    cal.setString(1, txtFName.getText());
                    cal.setString(2, txtLName.getText());
                    cal.setString(3, txtUsername.getText());
                    cal.setString(4, txtemail.getText());
                    cal.setString(5, password);
                    cal.setString(6, cpassword);
                    cal.setString(7, (String) cboxSQ.getSelectedItem());
                    cal.setString(8, txtAnswer.getText());
                    cal.execute();

                    JOptionPane.showMessageDialog(null, "You have registered sauccessfully!");

                    Login login = new Login();
                    FlowLayout l = new FlowLayout();

                    this.removeAll();
                    this.revalidate();
                    this.repaint();

                    this.add(login);
                    this.setLayout(l);
                    this.revalidate();
                    this.repaint();

                } else {
                    JOptionPane.showMessageDialog(null, "Your passwords are not matching!");
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(this, "Username already exists, please choose another one!");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Login login = new Login();
        FlowLayout l = new FlowLayout();

        this.removeAll();
        this.revalidate();
        this.repaint();

        this.add(login);
        this.setLayout(l);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cboxSQ;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pwdConfirm;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
