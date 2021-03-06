/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.awt.FlowLayout;
import static java.awt.SystemColor.menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas E.S
 */
public class Login extends javax.swing.JPanel {
    Password p = new Password();
    Registration reg = new Registration();
    Menu menu = new Menu();
    FlowLayout l = new FlowLayout();

    /**
     * Creates new form Login
     */
    public Login() {
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

        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        Registration = new javax.swing.JLabel();
        forgetPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 241, 241));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1920, 2871));

        Login.setBackground(new java.awt.Color(244, 245, 232));
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Login.setInheritsPopupMenu(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Niagara Solid", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Username");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Niagara Solid", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Password");

        txtUsername.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        pwdPassword.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        btnOK.setFont(new java.awt.Font("Niagara Solid", 0, 20)); // NOI18N
        btnOK.setForeground(new java.awt.Color(51, 51, 51));
        btnOK.setText("OK");
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Niagara Solid", 0, 20)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 51, 51));
        btnReset.setText("RESET");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        Registration.setFont(new java.awt.Font("Niagara Solid", 0, 18)); // NOI18N
        Registration.setForeground(new java.awt.Color(42, 119, 235));
        Registration.setText("New here? Click here to signup.");
        Registration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrationMouseClicked(evt);
            }
        });

        forgetPassword.setFont(new java.awt.Font("Niagara Solid", 0, 18)); // NOI18N
        forgetPassword.setForeground(new java.awt.Color(42, 119, 235));
        forgetPassword.setText("Forgot your password? Click here");
        forgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswordMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Niagara Solid", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("WELCOME TO E-BANK NAMIBIA");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pwdPassword)
                            .addComponent(txtUsername)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Registration, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(forgetPassword)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnReset))
                .addGap(26, 26, 26)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registration)
                    .addComponent(forgetPassword))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(698, 698, 698))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2408, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String password = new String(this.pwdPassword.getPassword());

        if (txtUsername.getText().isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:sqlserver://localhost:1433; databaseName=Bank; user=sa; password=Nust2019";
                Connection con = (Connection) DriverManager.getConnection(url);

                String ver = "select * from Registration where Username=? and Password = ?";
                PreparedStatement pre = con.prepareStatement(ver);

                pre.setString(1, txtUsername.getText());
                pre.setString(2, password);
                ResultSet re = pre.executeQuery();

                if (re.next()) {
                    JOptionPane.showMessageDialog(null, "Login successfull!");

                    this.removeAll();
                    this.revalidate();
                    this.repaint();

                    this.add(menu);
                    this.setLayout(l);
                    this.revalidate();
                    this.repaint();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText(null);
        pwdPassword.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void RegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrationMouseClicked
        this.removeAll();
        this.revalidate();
        this.repaint();

        this.add(reg);
        this.setLayout(l);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_RegistrationMouseClicked

    private void forgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordMouseClicked

        this.removeAll();
        this.revalidate();
        this.repaint();

        this.add(p);
        this.setLayout(l);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_forgetPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Registration;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel forgetPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
