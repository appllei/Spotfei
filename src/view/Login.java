
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Aluno;


public class Login extends javax.swing.JFrame {

    private JButton bt_cadastro;

    
    public Login() {
        initComponents();
        c = new ControllerLogin(this);
    }

    
    public JButton getBt_cadastro() {
        return bt_cadastro;
    }

    public void setBt_cadastro(JButton bt_cadastro) {
        this.bt_cadastro = bt_cadastro;
    }

    public JButton getBt_login() {
        return bt_login;
    }

    public void setBt_login(JButton bt_login) {
        this.bt_login = bt_login;
    }

    public JLabel getLbl_senha_login() {
        return lbl_senha_login;
    }

    public void setLbl_senha_login(JLabel lbl_senha_login) {
        this.lbl_senha_login = lbl_senha_login;
    }

    public JLabel getLbl_usuario_login() {
        return lbl_usuario_login;
    }

    public void setLbl_usuario_login(JLabel lbl_usuario_login) {
        this.lbl_usuario_login = lbl_usuario_login;
    }

    public JTextField getTxt_senha_login() {
        return txt_senha_login;
    }

    public void setTxt_senha_login(JTextField txt_senha_login) {
        this.txt_senha_login = (JFormattedTextField) txt_senha_login;
    }

    public JTextField getTxt_usuario_login() {
        return txt_usuario_login;
    }

    public void setTxt_usuario_login(JTextField txt_usuario_login) {
        this.txt_usuario_login = (JFormattedTextField) txt_usuario_login;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_login = new javax.swing.JLabel();
        lbl_usuario_login = new javax.swing.JLabel();
        txt_usuario_login = new javax.swing.JFormattedTextField();
        lbl_senha_login = new javax.swing.JLabel();
        txt_senha_login = new javax.swing.JFormattedTextField();
        bt_login = new javax.swing.JButton();
        bt_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_login.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbl_login.setText("LOGIN:");

        lbl_usuario_login.setText("USUARIO:");

        lbl_senha_login.setText("SENHA:");

        bt_login.setText("ENTRAR");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        bt_cadastrar.setText("CADASTRAR");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_senha_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_usuario_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_senha_login, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(bt_cadastrar)
                .addGap(50, 50, 50)
                .addComponent(bt_login)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_login)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario_login)
                    .addComponent(txt_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_senha_login)
                    .addComponent(txt_senha_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_login)
                    .addComponent(bt_cadastrar))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
       c.loginAluno();
        this.setVisible(false);
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
       Cadastro cf = new Cadastro();
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    
    public static void main(String args[]) {
        
        //
    }
    private ControllerLogin c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_senha_login;
    private javax.swing.JLabel lbl_usuario_login;
    private javax.swing.JFormattedTextField txt_senha_login;
    private javax.swing.JFormattedTextField txt_usuario_login;
    // End of variables declaration//GEN-END:variables
}
