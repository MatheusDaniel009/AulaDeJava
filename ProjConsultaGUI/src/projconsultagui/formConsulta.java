/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projconsultagui;

import javax.swing.JOptionPane;

/**
 *
 * @author matat
 */
public class formConsulta extends javax.swing.JFrame {
    
    //instanciando a Class Consulta
    Consulta consulta = new Consulta();
    /**
     * Creates new form formConsulta
     */
    public formConsulta() {
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

        LabCadastroConsulta = new javax.swing.JLabel();
        LabNome = new javax.swing.JLabel();
        LabSex = new javax.swing.JLabel();
        LabIdade = new javax.swing.JLabel();
        LabVlConsulta = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextSex = new javax.swing.JTextField();
        TextVlConsulta = new javax.swing.JTextField();
        TextIdade = new javax.swing.JTextField();
        ButCadastro = new javax.swing.JButton();
        ButExibir = new javax.swing.JButton();
        ButPromocao = new javax.swing.JButton();
        TextPromocao = new javax.swing.JTextField();
        ButExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabCadastroConsulta.setText("Cadastro de Consultas");

        LabNome.setText("Nome");

        LabSex.setText("Sexo");

        LabIdade.setText("Idade");

        LabVlConsulta.setText("Valor Consulta");

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        TextSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSexActionPerformed(evt);
            }
        });

        TextVlConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextVlConsultaActionPerformed(evt);
            }
        });

        TextIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdadeActionPerformed(evt);
            }
        });

        ButCadastro.setText("Cadastrar");
        ButCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastroActionPerformed(evt);
            }
        });

        ButExibir.setText("Exibir");
        ButExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExibirActionPerformed(evt);
            }
        });

        ButPromocao.setText("Promoção");
        ButPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButPromocaoActionPerformed(evt);
            }
        });

        TextPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPromocaoActionPerformed(evt);
            }
        });

        ButExit.setForeground(new java.awt.Color(255, 51, 51));
        ButExit.setText("Exit");
        ButExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabSex, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabNome, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextNome)
                            .addComponent(TextSex)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(LabCadastroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabVlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButCadastro)
                                .addGap(105, 105, 105)
                                .addComponent(ButExibir))
                            .addComponent(TextVlConsulta)
                            .addComponent(TextIdade)
                            .addComponent(TextPromocao, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButPromocao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButExit)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabCadastroConsulta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabNome)
                    .addComponent(TextNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabSex)
                    .addComponent(TextSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabIdade)
                    .addComponent(TextIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabVlConsulta)
                    .addComponent(TextVlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButPromocao)
                    .addComponent(TextPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ButExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // para o usuario colocar seu nome
    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    // para o usuario colocar seu sexo
    private void TextSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSexActionPerformed

    // para o usuario colocar o valor da consuta
    private void TextVlConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextVlConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVlConsultaActionPerformed

    // para o usuario colocar sua idade
    private void TextIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdadeActionPerformed

    // mostrar o valor com o desconto se tiver se nao so mostra o valor
    private void ButPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButPromocaoActionPerformed
        // TODO add your handling code here:
        // mostrar o valor com o desconto se tiver se nao so mostra o valor
        this.TextPromocao.setText(""+consulta.CalcularPromocao());
    }//GEN-LAST:event_ButPromocaoActionPerformed
    
    //cadastra os dados na variaveis
    private void ButCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastroActionPerformed
        // TODO add your handling code here:
        // cadastrando os valores na variaveis
        consulta.nome = this.TextNome.getText();
        consulta.sexo = this.TextSex.getText();
        consulta.idade = Integer.parseInt(this.TextIdade.getText());
        consulta.vlConsulta = Double.parseDouble(this.TextVlConsulta.getText());
        // mostrando que o cadastro deu certo
        JOptionPane.showMessageDialog(null, "dados cadastrados com sucesso!!!");
        // limpando os campos
        this.TextNome.setText("");
        this.TextSex.setText("");
        this.TextIdade.setText("");
        this.TextVlConsulta.setText("");
    }//GEN-LAST:event_ButCadastroActionPerformed

    // exibir o cadastro
    private void ButExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExibirActionPerformed
        // TODO add your handling code here:
        // exibir o cadastro
        this.TextNome.setText(consulta.nome);
        this.TextSex.setText(consulta.sexo);
        this.TextIdade.setText(""+ consulta.idade);
        this.TextVlConsulta.setText(""+consulta.vlConsulta);
        
    }//GEN-LAST:event_ButExibirActionPerformed
    
    // para o programa voltar o valor que sera pago
    private void TextPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPromocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPromocaoActionPerformed

    // para sair do programa
    private void ButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCadastro;
    private javax.swing.JButton ButExibir;
    private javax.swing.JButton ButExit;
    private javax.swing.JButton ButPromocao;
    private javax.swing.JLabel LabCadastroConsulta;
    private javax.swing.JLabel LabIdade;
    private javax.swing.JLabel LabNome;
    private javax.swing.JLabel LabSex;
    private javax.swing.JLabel LabVlConsulta;
    private javax.swing.JTextField TextIdade;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPromocao;
    private javax.swing.JTextField TextSex;
    private javax.swing.JTextField TextVlConsulta;
    // End of variables declaration//GEN-END:variables
}
