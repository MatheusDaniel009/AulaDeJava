
import javax.swing.JOptionPane;


public class FormAutonomo extends javax.swing.JFrame {
    Autonomo aut = new Autonomo();
    /**
     * Creates new form FormAutonomo
     */
    public FormAutonomo() {
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

        LabelRegistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextNome = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextSalario = new javax.swing.JTextPane();
        LabelSalario = new javax.swing.JLabel();
        ButHome = new javax.swing.JButton();
        LabelNome = new javax.swing.JLabel();
        LabelPrecVendas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextResg = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextPrecVendas = new javax.swing.JTextPane();
        ButCalcular = new javax.swing.JButton();
        ButCadastrar = new javax.swing.JButton();
        LabelTotVendas = new javax.swing.JLabel();
        ButExibir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextTotVendas = new javax.swing.JTextPane();
        LabelHorista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelRegistro.setText("Registro");

        jScrollPane1.setViewportView(TextNome);

        jScrollPane5.setViewportView(TextSalario);

        LabelSalario.setText("Salario");

        ButHome.setBackground(new java.awt.Color(204, 51, 0));
        ButHome.setForeground(new java.awt.Color(255, 255, 0));
        ButHome.setText("Home");
        ButHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButHomeActionPerformed(evt);
            }
        });

        LabelNome.setText("Nome");

        LabelPrecVendas.setText("Preços das Vendas");

        jScrollPane2.setViewportView(TextResg);

        jScrollPane4.setViewportView(TextPrecVendas);

        ButCalcular.setText("Calcular");
        ButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCalcularActionPerformed(evt);
            }
        });

        ButCadastrar.setText("Cadastrar");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });

        LabelTotVendas.setText("Total de Vendas");

        ButExibir.setText("Exibir");
        ButExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExibirActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(TextTotVendas);

        LabelHorista.setText("Autonomo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButHome)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTotVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(LabelHorista, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPrecVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(LabelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButCadastrar)
                        .addGap(160, 160, 160)
                        .addComponent(ButExibir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButCalcular)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelHorista)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNome)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotVendas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelSalario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelPrecVendas)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCadastrar)
                    .addComponent(ButExibir)
                    .addComponent(ButCalcular))
                .addGap(4, 4, 4)
                .addComponent(ButHome)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // botao de voltar a form empresa
    private void ButHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButHomeActionPerformed
        // TODO add your handling code here:
        new FormEmpresa().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButHomeActionPerformed

    // botao de calcular o salario
    private void ButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCalcularActionPerformed
        // TODO add your handling code here:
        // para exibir o salario
        this.TextSalario.setText(""+ aut.CalcSal());
    }//GEN-LAST:event_ButCalcularActionPerformed

    // botao de cadastar os valores nos atributos
    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
        // TODO add your handling code here:
        //para pegar os atributos dos campos de texto
        aut.nome = this.TextNome.getText();
        aut.reg = Integer.parseInt(this.TextResg.getText());
        aut.totVendas = Double.parseDouble(this.TextTotVendas.getText());
        aut.precVendas = Double.parseDouble(this.TextPrecVendas.getText());
        // menssagem de confirmacao de cadastro
        JOptionPane.showMessageDialog(null, "valores cadastrado com sucesso!!!");

        // limoa os campos de texto
        this.TextNome.setText("");
        this.TextResg.setText("");
        this.TextTotVendas.setText("");
        this.TextPrecVendas.setText("");
    }//GEN-LAST:event_ButCadastrarActionPerformed

    // exibir os valores dos atributos cadastrado
    private void ButExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExibirActionPerformed
        // TODO add your handling code here:
        // exibir os valores cadastrados
        this.TextNome.setText(aut.nome);
        this.TextResg.setText(aut.reg +"");
        this.TextTotVendas.setText(""+ aut.totVendas);
        this.TextPrecVendas.setText(""+ aut.precVendas);
    }//GEN-LAST:event_ButExibirActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JButton ButCalcular;
    private javax.swing.JButton ButExibir;
    private javax.swing.JButton ButHome;
    private javax.swing.JLabel LabelHorista;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelPrecVendas;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JLabel LabelTotVendas;
    private javax.swing.JTextPane TextNome;
    private javax.swing.JTextPane TextPrecVendas;
    private javax.swing.JTextPane TextResg;
    private javax.swing.JTextPane TextSalario;
    private javax.swing.JTextPane TextTotVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
