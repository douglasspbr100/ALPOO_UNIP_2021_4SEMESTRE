/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Produto;
import Model.Tecnico;
import Util.Converte;
import Util.Mascara;

/**
 *
 * @author dougl
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
  
    public TelaCadastro() {
        initComponents();
        setMask();
        tfCliNome.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void limpaCliente(){
        tfCliNome.setText("");
        tfCliCPF.setText("");
        tfCliFone.setText("");
        tfCliCelular.setText("");
        tfCliEmail.setText("");
        tfCliNome.requestFocus();
    }
    
    private void gravaCliente(){
        String nome = tfCliNome.getText();
        String cpf = tfCliCPF.getText();
        String fone = tfCliFone.getText();
        String celular = tfCliCelular.getText();
        String email = tfCliEmail.getText();
        System.out.println(new Cliente(nome, cpf, fone ,celular, email));
        limpaCliente();
    }
    
    private void gravaProduto(){
        String descricao = tfProDescricao.getText();
        int estoque = (int) spProEstoque.getValue();
        double custo = Converte.textToValue(tfProCusto.getText());
        double valor = Converte.textToValue(tfProValor.getText());
        System.out.println(new Produto(descricao, estoque, custo, valor));
        limpaProduto();
    }
    
    private void limpaProduto(){
        tfProDescricao.setText("");
        spProEstoque.setValue(0);
        cbAtivo.setSelected(true);
        tfProCusto.setText("0,00");
        tfProValor.setText("0,00");
        tfProDescricao.requestFocus();
    }
    
    private void gravaTecnico(){
        String nome = tfTecNome.getText();
        double salario = Double.parseDouble(tfTecSalario.getText());
        double valor = Double.parseDouble(tfTecValor.getText());
        System.out.println(new Tecnico(nome, salario, valor));
        limpaTecnico();
        
    }
    
    private void limpaTecnico(){
        tfTecNome.setText("");
        tfTecSalario.setText("");
        tfTecValor.setText("");
        tfTecNome.requestFocus();
        
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        pnButtons = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tbTela = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        lbCliNome = new javax.swing.JLabel();
        tfCliNome = new javax.swing.JTextField();
        lbCliCPF = new javax.swing.JLabel();
        lbCliFone = new javax.swing.JLabel();
        lbCliCelular = new javax.swing.JLabel();
        lbCliEmail = new javax.swing.JLabel();
        tfCliEmail = new javax.swing.JTextField();
        tfCliCPF = new javax.swing.JFormattedTextField();
        tfCliFone = new javax.swing.JFormattedTextField();
        tfCliCelular = new javax.swing.JFormattedTextField();
        pnProduto = new javax.swing.JPanel();
        lbProDescricao = new javax.swing.JLabel();
        tfProDescricao = new javax.swing.JTextField();
        spProEstoque = new javax.swing.JSpinner();
        lbProEstoque = new javax.swing.JLabel();
        cbAtivo = new javax.swing.JCheckBox();
        pnProPreco = new javax.swing.JPanel();
        lbProCusto = new javax.swing.JLabel();
        lbProValor = new javax.swing.JLabel();
        tfProCusto = new javax.swing.JFormattedTextField();
        tfProValor = new javax.swing.JFormattedTextField();
        pnServico = new javax.swing.JPanel();
        pnTecnico = new javax.swing.JPanel();
        lbTecNome = new javax.swing.JLabel();
        lbTecSalario = new javax.swing.JLabel();
        lbTecValordaHora = new javax.swing.JLabel();
        tfTecNome = new javax.swing.JTextField();
        tfTecSalario = new javax.swing.JFormattedTextField();
        tfTecValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro");
        lbTitulo.setToolTipText("");
        pnTitulo.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 43, -1, -1));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/WhatsApp Image 2021-09-06 at 15.52.34.jpeg"))); // NOI18N
        pnTitulo.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, 130, 115));

        pnButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLimpar)
                .addGap(35, 35, 35))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        lbCliNome.setText("Nome:");

        lbCliCPF.setText("CPF:");

        lbCliFone.setText("Telefone:");

        lbCliCelular.setText("Celular:");

        lbCliEmail.setText("Email:");

        tfCliCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCliCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCliNome)
                            .addComponent(lbCliCPF))
                        .addGap(33, 33, 33)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCliNome, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(tfCliCPF)))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCliFone)
                            .addComponent(lbCliCelular)
                            .addComponent(lbCliEmail))
                        .addGap(18, 18, 18)
                        .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCliEmail)
                            .addComponent(tfCliFone)
                            .addComponent(tfCliCelular))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliNome)
                    .addComponent(tfCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCPF)
                    .addComponent(tfCliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliFone)
                    .addComponent(tfCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliCelular)
                    .addComponent(tfCliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliEmail)
                    .addComponent(tfCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        tbTela.addTab("Cliente", pnCliente);

        lbProDescricao.setText("Descrição:");

        tfProDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProDescricaoActionPerformed(evt);
            }
        });

        spProEstoque.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spProEstoqueStateChanged(evt);
            }
        });

        lbProEstoque.setText("Estoque:");

        cbAtivo.setText("Ativo");

        pnProPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço"));

        lbProCusto.setText("Custo:");

        lbProValor.setText("Venda:");

        javax.swing.GroupLayout pnProPrecoLayout = new javax.swing.GroupLayout(pnProPreco);
        pnProPreco.setLayout(pnProPrecoLayout);
        pnProPrecoLayout.setHorizontalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbProCusto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbProValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProValor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pnProPrecoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfProCusto, tfProValor});

        pnProPrecoLayout.setVerticalGroup(
            pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProPrecoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnProPrecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProCusto)
                    .addComponent(lbProValor)
                    .addComponent(tfProCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProDescricao)
                    .addComponent(lbProEstoque))
                .addGap(18, 18, 18)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbAtivo)
                        .addGap(84, 84, 84))
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnProPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProDescricao)
                    .addComponent(tfProDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spProEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProEstoque)
                    .addComponent(cbAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(pnProPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbTela.addTab("Produtos", pnProduto);

        javax.swing.GroupLayout pnServicoLayout = new javax.swing.GroupLayout(pnServico);
        pnServico.setLayout(pnServicoLayout);
        pnServicoLayout.setHorizontalGroup(
            pnServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        pnServicoLayout.setVerticalGroup(
            pnServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        tbTela.addTab("Serviços", pnServico);

        lbTecNome.setText("Nome:");

        lbTecSalario.setText("Salário:");

        lbTecValordaHora.setText("Valor da Hora: ");

        javax.swing.GroupLayout pnTecnicoLayout = new javax.swing.GroupLayout(pnTecnico);
        pnTecnico.setLayout(pnTecnicoLayout);
        pnTecnicoLayout.setHorizontalGroup(
            pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTecnicoLayout.createSequentialGroup()
                        .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTecSalario)
                            .addComponent(lbTecNome))
                        .addGap(18, 18, 18)
                        .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnTecnicoLayout.createSequentialGroup()
                        .addComponent(lbTecValordaHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTecValor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        pnTecnicoLayout.setVerticalGroup(
            pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTecnicoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecNome)
                    .addComponent(tfTecNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecSalario)
                    .addComponent(tfTecSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTecValordaHora)
                    .addComponent(tfTecValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tbTela.addTab("Técnicos", pnTecnico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbTela)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setMask(){
        tfCliCPF.setFormatterFactory(Mascara.getCpfMask());
        tfCliFone.setFormatterFactory(Mascara.getFoneFixoMask());
        tfCliCelular.setFormatterFactory(Mascara.getCelularMask());
        tfProCusto.setFormatterFactory(Mascara.getValorMask());
        tfProValor.setFormatterFactory(Mascara.getValorMask());
        tfTecSalario.setFormatterFactory(Mascara.getValorMask());
        tfTecValor.setFormatterFactory(Mascara.getValorMask());
    }
    
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente) limpaCliente();
        else if (tbTela.getSelectedComponent() == pnProduto) limpaProduto();
        else if (tbTela.getSelectedComponent() == pnTecnico) limpaTecnico();
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        if (tbTela.getSelectedComponent() == pnCliente) gravaCliente();
        else if (tbTela.getSelectedComponent() == pnProduto) gravaProduto();
        else if (tbTela.getSelectedComponent() == pnTecnico) gravaTecnico();
        // TODO add your handling code here:
    }//GEN-LAST:event_btGravarActionPerformed

    private void tfProDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProDescricaoActionPerformed

    private void spProEstoqueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spProEstoqueStateChanged
        int v = (int) spProEstoque.getValue();
        if (v < 0) spProEstoque.setValue(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_spProEstoqueStateChanged

    private void tfCliCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCliCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCliCPFActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JCheckBox cbAtivo;
    private javax.swing.JLabel lbCliCPF;
    private javax.swing.JLabel lbCliCelular;
    private javax.swing.JLabel lbCliEmail;
    private javax.swing.JLabel lbCliFone;
    private javax.swing.JLabel lbCliNome;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbProCusto;
    private javax.swing.JLabel lbProDescricao;
    private javax.swing.JLabel lbProEstoque;
    private javax.swing.JLabel lbProValor;
    private javax.swing.JLabel lbTecNome;
    private javax.swing.JLabel lbTecSalario;
    private javax.swing.JLabel lbTecValordaHora;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnProPreco;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnServico;
    private javax.swing.JPanel pnTecnico;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSpinner spProEstoque;
    private javax.swing.JTabbedPane tbTela;
    private javax.swing.JFormattedTextField tfCliCPF;
    private javax.swing.JFormattedTextField tfCliCelular;
    private javax.swing.JTextField tfCliEmail;
    private javax.swing.JFormattedTextField tfCliFone;
    private javax.swing.JTextField tfCliNome;
    private javax.swing.JFormattedTextField tfProCusto;
    private javax.swing.JTextField tfProDescricao;
    private javax.swing.JFormattedTextField tfProValor;
    private javax.swing.JTextField tfTecNome;
    private javax.swing.JFormattedTextField tfTecSalario;
    private javax.swing.JFormattedTextField tfTecValor;
    // End of variables declaration//GEN-END:variables
}
