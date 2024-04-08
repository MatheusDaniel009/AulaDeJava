
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author matat
 */


public class FormFornecedor extends javax.swing.JFrame {
    Fonercedor forne = new Fonercedor();
    /**
     * Creates new form FormFornecedor
     */
    public FormFornecedor() {
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

        ButExibir = new javax.swing.JButton();
        ButVoltar = new javax.swing.JButton();
        LabelFornecedor = new javax.swing.JLabel();
        ButTipoPioridade = new javax.swing.JButton();
        ButCadastro = new javax.swing.JButton();
        TextTipoPioridade = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        LabelCidade = new javax.swing.JLabel();
        TextCidade = new javax.swing.JTextField();
        LabelTempoEntrega = new javax.swing.JLabel();
        TextTempoEntrega = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        LabelFornecedor.setText("Fornecedor");

        ButTipoPioridade.setText("Tipo de pioridade");
        ButTipoPioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButTipoPioridadeActionPerformed(evt);
            }
        });

        ButCadastro.setText("Cadastrar");
        ButCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastroActionPerformed(evt);
            }
        });

        LabelNome.setText("Nome");

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        LabelCidade.setText("Cidade");

        LabelTempoEntrega.setText("Tempo de Entrega");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButCadastro)
                                .addGap(50, 50, 50)
                                .addComponent(ButExibir)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButTipoPioridade)
                            .addComponent(TextTipoPioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TextTempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButVoltar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelFornecedor)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(LabelTempoEntrega))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTempoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCidade)
                    .addComponent(ButTipoPioridade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTipoPioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCadastro)
                    .addComponent(ButExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButVoltar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //mostra o tipo de de entrregador
    private void ButTipoPioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButTipoPioridadeActionPerformed
        // TODO add your handling code here:
        this.TextTipoPioridade.setText(forne.AnalisarTempo());
    }//GEN-LAST:event_ButTipoPioridadeActionPerformed

    // pega a informação dos capos de texto
    private void ButCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastroActionPerformed
        // TODO add your handling code here:
        forne.nome = this.TextNome.getText();
        forne.cidade = this.TextCidade.getText();
        forne.setTempoEntrega(Integer.parseInt(this.TextTempoEntrega.getText()));
        
        JOptionPane.showMessageDialog(null, "dados cadastrado com sucesso!!!");
        
        this.TextNome.setText("");
        this.TextCidade.setText("");
        this.TextTempoEntrega.setText("");
        
    }//GEN-LAST:event_ButCadastroActionPerformed

    //exibir as informacoes 
    private void ButExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExibirActionPerformed
        // TODO add your handling code here:
        this.TextNome.setText(forne.nome);
        this.TextCidade.setText(forne.cidade);
        this.TextTempoEntrega.setText("" + forne.getTempoEntrega());
    }//GEN-LAST:event_ButExibirActionPerformed

    // voltar para o form empresa
    private void ButVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButVoltarActionPerformed
        // TODO add your handling code here:
        
        new FormEmpresa().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButVoltarActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCadastro;
    private javax.swing.JButton ButExibir;
    private javax.swing.JButton ButTipoPioridade;
    private javax.swing.JButton ButVoltar;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelFornecedor;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTempoEntrega;
    private javax.swing.JTextField TextCidade;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextTempoEntrega;
    private javax.swing.JTextField TextTipoPioridade;
    // End of variables declaration//GEN-END:variables
}