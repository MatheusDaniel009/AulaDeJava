
import javax.swing.JOptionPane;


public class FormCliente extends javax.swing.JFrame {
    Cliente cli = new Cliente();
    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
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

        LabelCliente = new javax.swing.JLabel();
        ButCadastro = new javax.swing.JButton();
        LabelNome = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        LabelTelefone = new javax.swing.JLabel();
        TextTelefone = new javax.swing.JTextField();
        LabelTipoPessoa = new javax.swing.JLabel();
        CBTipoPessoa = new javax.swing.JComboBox<>();
        ButExibir = new javax.swing.JButton();
        ButVoltar = new javax.swing.JButton();
        ButDesconto = new javax.swing.JButton();
        TextDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelCliente.setText("Cliente");

        ButCadastro.setText("Cadastrar");
        ButCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastroActionPerformed(evt);
            }
        });

        LabelNome.setText("Nome");

        LabelTelefone.setText("Telefone");

        LabelTipoPessoa.setText("Tipo de Pessoa");

        CBTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "F", "J" }));

        ButExibir.setText("Exibir");
        ButExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExibirActionPerformed(evt);
            }
        });

        ButVoltar.setForeground(new java.awt.Color(255, 0, 0));
        ButVoltar.setText("Voltar");
        ButVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButVoltarActionPerformed(evt);
            }
        });

        ButDesconto.setText("Desconto");
        ButDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButDescontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ButCadastro)
                                                .addGap(50, 50, 50)
                                                .addComponent(ButExibir)))))
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextDesconto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CBTipoPessoa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButDesconto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCliente)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(LabelTipoPessoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefone)
                    .addComponent(ButDesconto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCadastro)
                    .addComponent(ButExibir))
                .addGap(18, 18, 18)
                .addComponent(ButVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // cadastra as informacoes dos caampos de texto
    private void ButCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastroActionPerformed
        // TODO add your handling code here:
        cli.nome = this.TextNome.getText();
        cli.telefone = Integer.parseInt(this.TextTelefone.getText());
        cli.setTipoPessoa(this.CBTipoPessoa.getSelectedItem().toString() +"");
        
        JOptionPane.showMessageDialog(null, "cadastro feito com sucesso!!!");
        
        this.TextNome.setText("");
        this.TextTelefone.setText("");
        this.CBTipoPessoa.setSelectedItem("N");
        
        
        
        
    }//GEN-LAST:event_ButCadastroActionPerformed

    //mostra o taanto de desconto que tem
    private void ButDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButDescontoActionPerformed
        // TODO add your handling code here:
        this.TextDesconto.setText(cli.CalculaDesc()+"%");
    }//GEN-LAST:event_ButDescontoActionPerformed

    // exibi as informacao dos campo de cadastro
    private void ButExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExibirActionPerformed
        // TODO add your handling code here:
        this.TextNome.setText(cli.nome);
        this.TextTelefone.setText(""+ cli.telefone);
        this.CBTipoPessoa.setSelectedItem(cli.getTipoPessoa());
    }//GEN-LAST:event_ButExibirActionPerformed

    // volta para a tela de empresa
    private void ButVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButVoltarActionPerformed
        // TODO add your handling code here:
        new FormEmpresa().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCadastro;
    private javax.swing.JButton ButDesconto;
    private javax.swing.JButton ButExibir;
    private javax.swing.JButton ButVoltar;
    private javax.swing.JComboBox<String> CBTipoPessoa;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JLabel LabelTipoPessoa;
    private javax.swing.JTextField TextDesconto;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextTelefone;
    // End of variables declaration//GEN-END:variables
}
