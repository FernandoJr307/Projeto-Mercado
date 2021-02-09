/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;

public class frmMenu extends javax.swing.JFrame {

    private Dados msDados;
    
    public void setDados(Dados msDados){
        this.msDados=msDados;
    }
    
    public frmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        deskpainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivos = new javax.swing.JMenu();
        mnarquivosclientes = new javax.swing.JMenuItem();
        mnarquivosprodutos = new javax.swing.JMenuItem();
        mnarquivosusuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivosaltsenha = new javax.swing.JMenuItem();
        mnarquivosaltusuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnarquivossair = new javax.swing.JMenuItem();
        mnmovimento = new javax.swing.JMenu();
        mnmovimentovendas = new javax.swing.JMenuItem();
        mnmovimentorelatorios = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajudasobre = new javax.swing.JMenuItem();
        mnajudaajuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Mercado");
        setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout deskpainelLayout = new javax.swing.GroupLayout(deskpainel);
        deskpainel.setLayout(deskpainelLayout);
        deskpainelLayout.setHorizontalGroup(
            deskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        deskpainelLayout.setVerticalGroup(
            deskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnarquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/boxes.png"))); // NOI18N
        mnarquivos.setText("Arquivo");
        mnarquivos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        mnarquivosclientes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivosclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/workers-team.png"))); // NOI18N
        mnarquivosclientes.setText("Clientes");
        mnarquivosclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosclientesActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosclientes);

        mnarquivosprodutos.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivosprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/barcode.png"))); // NOI18N
        mnarquivosprodutos.setText("Produtos");
        mnarquivos.add(mnarquivosprodutos);

        mnarquivosusuarios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivosusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user-silhouette.png"))); // NOI18N
        mnarquivosusuarios.setText("Usuarios");
        mnarquivosusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosusuariosActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosusuarios);
        mnarquivos.add(jSeparator1);

        mnarquivosaltsenha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivosaltsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/key.png"))); // NOI18N
        mnarquivosaltsenha.setText("Alterar Senha");
        mnarquivos.add(mnarquivosaltsenha);

        mnarquivosaltusuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivosaltusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/man-shape.png"))); // NOI18N
        mnarquivosaltusuario.setText("Alterar Usuario");
        mnarquivosaltusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosaltusuarioActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivosaltusuario);
        mnarquivos.add(jSeparator2);

        mnarquivossair.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnarquivossair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/standby-power-button.png"))); // NOI18N
        mnarquivossair.setText("Sair");
        mnarquivossair.setPreferredSize(new java.awt.Dimension(63, 23));
        mnarquivossair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivossairActionPerformed(evt);
            }
        });
        mnarquivos.add(mnarquivossair);

        jMenuBar1.add(mnarquivos);

        mnmovimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coins-money-stack.png"))); // NOI18N
        mnmovimento.setText("Movimento");
        mnmovimento.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        mnmovimentovendas.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnmovimentovendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dollars-bag.png"))); // NOI18N
        mnmovimentovendas.setText("Vendas");
        mnmovimento.add(mnmovimentovendas);

        mnmovimentorelatorios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnmovimentorelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/list.png"))); // NOI18N
        mnmovimentorelatorios.setText("Relatorios");
        mnmovimento.add(mnmovimentorelatorios);

        jMenuBar1.add(mnmovimento);

        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/information (1).png"))); // NOI18N
        mnajuda.setText("Ajuda");
        mnajuda.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        mnajudasobre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnajudasobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info.png"))); // NOI18N
        mnajudasobre.setText("Sobre");
        mnajuda.add(mnajudasobre);

        mnajudaajuda.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mnajudaajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/doubts-button.png"))); // NOI18N
        mnajudaajuda.setText("Ajuda");
        mnajudaajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnajudaajudaActionPerformed(evt);
            }
        });
        mnajuda.add(mnajudaajuda);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskpainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnarquivosclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosclientesActionPerformed

    private void mnarquivosusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosusuariosActionPerformed
        //Codigo Botão Usuarios Menu
        frmUsuarios fusuario = new frmUsuarios();
        fusuario.setDados(msDados);
        deskpainel.add (fusuario);
        fusuario.show();
    }//GEN-LAST:event_mnarquivosusuariosActionPerformed

    private void mnarquivosaltusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosaltusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosaltusuarioActionPerformed

    private void mnarquivossairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivossairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivossairActionPerformed

    private void mnajudaajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnajudaajudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnajudaajudaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskpainel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajudaajuda;
    private javax.swing.JMenuItem mnajudasobre;
    private javax.swing.JMenu mnarquivos;
    private javax.swing.JMenuItem mnarquivosaltsenha;
    private javax.swing.JMenuItem mnarquivosaltusuario;
    private javax.swing.JMenuItem mnarquivosclientes;
    private javax.swing.JMenuItem mnarquivosprodutos;
    private javax.swing.JMenuItem mnarquivossair;
    private javax.swing.JMenuItem mnarquivosusuarios;
    private javax.swing.JMenu mnmovimento;
    private javax.swing.JMenuItem mnmovimentorelatorios;
    private javax.swing.JMenuItem mnmovimentovendas;
    // End of variables declaration//GEN-END:variables
}
