package view;


import Controller.ControllerCadastro;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends javax.swing.JFrame {

    private JLabel lbl_senha_cadastro;

    

    
   

   //

     public Cadastro() {
        initComponents();
        c = new ControllerCadastro(this);
    }
    

   
       
   public JButton getBr_cadastrar() {
        return bt_cadastrar;
    }

    public void setBr_cadastrar(JButton bt_cadastrar) {
        this.bt_cadastrar = bt_cadastrar;
    }

    public JLabel getLbl_nome_cadastro() {
        return lbl_nome_cadastro;
    }

    public void setLbl_nome_cadastro(JLabel lbl_nome_cadastro) {
        this.lbl_nome_cadastro = lbl_nome_cadastro;
    }

    public JLabel getLbl_senha_cadastro() {
        return lbl_senha_cadastro;
    }

    public void setLbl_senha_cadastro(JLabel lbl_senha_cadastro) {
        this.lbl_senha_cadastro = lbl_senha_cadastro;
    }

    public JLabel getLbl_usuario_cadastro() {
        return lbl_usuario_cadastro;
    }

    public void setLbl_usuario_cadastro(JLabel lbl_usuario_cadastro) {
        this.lbl_usuario_cadastro = lbl_usuario_cadastro;
    }

    public JTextField getTxt_nome_cadastro() {
        return txt_nome_cadastro;
    }

    public void setTxt_nome_cadastro(JTextField txt_nome_cadastro) {
        this.txt_nome_cadastro = (JFormattedTextField) txt_nome_cadastro;
    }

    public JTextField getTxt_senha_cadastro() {
        return txt_senha_cadastro;
    }

    public void setTxt_senha_cadastro(JTextField txt_senha_cadastro) {
        this.txt_senha_cadastro = (JFormattedTextField) txt_senha_cadastro;
    }

    public JTextField getTxt_usuario_cadastro() {
        return txt_usuario_cadastro;
    }

    public void setTxt_usuario_cadastro(JTextField txt_usuario_cadastro) {
        this.txt_usuario_cadastro = (JFormattedTextField) txt_usuario_cadastro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome_cadastro = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_nome_cadastro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_usuario_cadastro = new javax.swing.JLabel();
        txt_usuario_cadastro = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_senha_cadastro = new javax.swing.JFormattedTextField();
        bt_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Cadastro");

        lbl_nome_cadastro.setText("NOME:");

        lbl_usuario_cadastro.setText("USUARIO:");

        jLabel5.setText("SENHA:");

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
                .addGap(0, 178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_usuario_cadastro)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_usuario_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_senha_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_cadastrar)
                        .addGap(309, 309, 309))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome_cadastro)
                    .addComponent(txt_nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_usuario_cadastro)
                            .addComponent(txt_usuario_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_senha_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(bt_cadastrar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        c.salvarAluno();
        
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    
//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cadastro().setVisible(true);
//            }
//        });
//    }
private ControllerCadastro c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_nome_cadastro;
    private javax.swing.JLabel lbl_usuario_cadastro;
    private javax.swing.JFormattedTextField txt_nome_cadastro;
    private javax.swing.JFormattedTextField txt_senha_cadastro;
    private javax.swing.JFormattedTextField txt_usuario_cadastro;
    // End of variables declaration//GEN-END:variables
}
