
import javax.swing.JOptionPane;


public class FormAlunos extends javax.swing.JFrame {

    ControleAlunos conalu = new ControleAlunos();
    
    public FormAlunos() {
        conalu.Conecta();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        TextN2 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextN1 = new javax.swing.JEditorPane();
        ButBuscar = new javax.swing.JButton();
        ButAltenar = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButCadastro = new javax.swing.JButton();
        LabelNotaAlunos = new javax.swing.JLabel();
        LabelRGM = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelN1 = new javax.swing.JLabel();
        LabelN2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextRgm = new javax.swing.JEditorPane();
        ButMedia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextNome = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextMedia = new javax.swing.JEditorPane();
        ButExcluir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setViewportView(TextN2);

        jScrollPane4.setViewportView(TextN1);

        ButBuscar.setText("Buscar");
        ButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButBuscarActionPerformed(evt);
            }
        });

        ButAltenar.setText("Alterar");
        ButAltenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAltenarActionPerformed(evt);
            }
        });

        ButExcluir.setText("Excluir");
        ButExcluir.setActionCommand("Excluir");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });

        ButCadastro.setText("Cadastrar");
        ButCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastroActionPerformed(evt);
            }
        });

        LabelNotaAlunos.setText("notas alunos");

        LabelRGM.setText("RGM");

        LabelNome.setText("Nome");

        LabelN1.setText("N1");

        LabelN2.setText("N2");

        jScrollPane1.setViewportView(TextRgm);

        ButMedia.setText("Media");
        ButMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMediaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(TextNome);

        jScrollPane5.setViewportView(TextMedia);

        ButExcluir1.setText("Lista");
        ButExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelNotaAlunos)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelRGM)
                            .addComponent(LabelNome)
                            .addComponent(LabelN1)
                            .addComponent(LabelN2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(ButMedia))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButAltenar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButBuscar)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ButExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButExcluir1))))))
                    .addComponent(ButCadastro))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelNotaAlunos)
                                        .addGap(35, 35, 35)
                                        .addComponent(LabelRGM))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(LabelNome))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelN1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ButBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelN2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButMedia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButAltenar)
                    .addComponent(ButExcluir)
                    .addComponent(ButCadastro)
                    .addComponent(ButExcluir1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButBuscarActionPerformed
        // TODO add your handling code here:
        String info = conalu.Exibir(Integer.parseInt(this.TextRgm.getText()));
        
        if (!info.equals("")){
            String vetor[] = info.split(";");
               this.TextNome.setText("");
        this.TextNome.setText(vetor[1]);
        this.TextN1.setText(vetor[2]);
        this.TextN2.setText(vetor[3]);
        
            
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro não existente!!!");
            this.TextRgm.setText("");   
            this.TextNome.setText("");
            this.TextN1.setText("");
            this.TextN2.setText("");
            this.TextMedia.setText("");
        }
    }//GEN-LAST:event_ButBuscarActionPerformed

    private void ButAltenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAltenarActionPerformed
        // TODO add your handling code here:
        conalu.Alterar(Integer.parseInt(this.TextRgm.getText()), this.TextNome.getText(), Double.parseDouble(this.TextN1.getText()), Double.parseDouble(this.TextN2.getText()));
         this.TextRgm.setText("");
         this.TextNome.setText("");
         this.TextN1.setText("");
         this.TextN2.setText("");
         this.TextMedia.setText("");
    }//GEN-LAST:event_ButAltenarActionPerformed

    private void ButMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMediaActionPerformed
        // TODO add your handling code here:
        double media = (Double.parseDouble(this.TextN1.getText()) + Double.parseDouble(this.TextN2.getText()))/2;
        this.TextMedia.setText(""+ media);
    }//GEN-LAST:event_ButMediaActionPerformed

    private void ButExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluir1ActionPerformed
        // TODO add your handling code here:
        conalu.Listar();
    }//GEN-LAST:event_ButExcluir1ActionPerformed

    private void ButCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastroActionPerformed
        // TODO add your handling code here:
        conalu.Cadastrar(Integer.parseInt (this.TextRgm.getText()), this.TextNome.getText(), Double.parseDouble(this.TextN2.getText()), Double.parseDouble(this.TextN1.getText()));
        this.TextRgm.setText("");
        this.TextNome.setText("");
        this.TextN1.setText("");
        this.TextN2.setText("");
        this.TextMedia.setText("");
    }//GEN-LAST:event_ButCadastroActionPerformed

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
        // TODO add your handling code here:
        
        conalu.Excluir(Integer.parseInt(this.TextRgm.getText()));
        this.TextRgm.setText("");
        this.TextNome.setText("");
        this.TextN1.setText("");
        this.TextN2.setText("");
        this.TextMedia.setText("");
    }//GEN-LAST:event_ButExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAltenar;
    private javax.swing.JButton ButBuscar;
    private javax.swing.JButton ButCadastro;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButExcluir1;
    private javax.swing.JButton ButMedia;
    private javax.swing.JLabel LabelN1;
    private javax.swing.JLabel LabelN2;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNotaAlunos;
    private javax.swing.JLabel LabelRGM;
    private javax.swing.JEditorPane TextMedia;
    private javax.swing.JEditorPane TextN1;
    private javax.swing.JEditorPane TextN2;
    private javax.swing.JEditorPane TextNome;
    private javax.swing.JEditorPane TextRgm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
