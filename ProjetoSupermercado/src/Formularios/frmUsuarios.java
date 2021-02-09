
package Formularios;

import Classes.Dados;
import Classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmUsuarios extends javax.swing.JInternalFrame {

    private Dados msDados;
    private int usuarioAtual=0;
    private boolean cmdAdicionar=false;
    private DefaultTableModel UserTable;
    
    public void setDados(Dados msDados){
        this.msDados=msDados;
    }
    
    public frmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        txtconfsenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdperfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmdultimo = new javax.swing.JButton();
        cmdeditar = new javax.swing.JButton();
        cmdprimeiro = new javax.swing.JButton();
        cmdadicionar = new javax.swing.JButton();
        cmdpesquisar = new javax.swing.JButton();
        cmdproximo = new javax.swing.JButton();
        cmdsalvar = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdexcluir = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        txtnome.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtnome.setEnabled(false);
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtusuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtusuario.setEnabled(false);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Nome de Usuario:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Usuario:");

        txtsenha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtsenha.setEnabled(false);

        txtconfsenha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtconfsenha.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Conf. Senha:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Senha:");

        cmdperfil.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cmdperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Um Perfil", "Administrador", "Funcionario" }));
        cmdperfil.setEnabled(false);
        cmdperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdperfilActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Perfil:");

        cmdultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/right-black-arrow.png"))); // NOI18N
        cmdultimo.setToolTipText("Ultimo");
        cmdultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdultimoActionPerformed(evt);
            }
        });

        cmdeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pencil-striped-symbol-for-interface-edit-buttons.png"))); // NOI18N
        cmdeditar.setToolTipText("Editar");
        cmdeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditarActionPerformed(evt);
            }
        });

        cmdprimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow-left-direction.png"))); // NOI18N
        cmdprimeiro.setToolTipText("Primeiro");
        cmdprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprimeiroActionPerformed(evt);
            }
        });

        cmdadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add-circular-button.png"))); // NOI18N
        cmdadicionar.setToolTipText("Adicionar");
        cmdadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadicionarActionPerformed(evt);
            }
        });

        cmdpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        cmdpesquisar.setToolTipText("Pesquisar");
        cmdpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpesquisarActionPerformed(evt);
            }
        });

        cmdproximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/right-arrow-circular-button-outline.png"))); // NOI18N
        cmdproximo.setToolTipText("Proximo");
        cmdproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdproximoActionPerformed(evt);
            }
        });

        cmdsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save-icon-silhouette.png"))); // NOI18N
        cmdsalvar.setToolTipText("Salvar");
        cmdsalvar.setEnabled(false);
        cmdsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalvarActionPerformed(evt);
            }
        });

        cmdanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back-left-arrow-circular-button-outline.png"))); // NOI18N
        cmdanterior.setToolTipText("Anterior");
        cmdanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdanteriorActionPerformed(evt);
            }
        });

        cmdexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recycle-bin.png"))); // NOI18N
        cmdexcluir.setToolTipText("Deletar");
        cmdexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexcluirActionPerformed(evt);
            }
        });

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close-circular-button-symbol.png"))); // NOI18N
        cmdcancelar.setToolTipText("Cancelar");
        cmdcancelar.setEnabled(false);
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });

        MTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(MTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtusuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(3, 3, 3)
                                        .addComponent(cmdperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtconfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(cmdadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 26, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdperfil)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtconfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(434, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(146, 146, 146)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void cmdperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdperfilActionPerformed

    private void cmdultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdultimoActionPerformed
        // Codigo do botão ultimo cadastro usuario
        
        usuarioAtual=msDados.NUsuario()-1;
        visualizarCadastro();
    }//GEN-LAST:event_cmdultimoActionPerformed

    private void cmdeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditarActionPerformed
        // botão editar do cadastro de usuario.
        
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdadicionar.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmdexcluir.setEnabled(false);
        cmdpesquisar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmdcancelar.setEnabled(true);
        
        //Desbloqueio dos campos.
        txtusuario.setEnabled(true);
        txtnome.setEnabled(true);
        txtsenha.setEnabled(true);
        txtconfsenha.setEnabled(true);
        cmdperfil.setEnabled(true);
        
        cmdAdicionar=false;
                
        txtnome.requestFocusInWindow();
    }//GEN-LAST:event_cmdeditarActionPerformed

    private void cmdprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprimeiroActionPerformed
        //botão primeiro cadastro de usuario
        usuarioAtual=0;
        visualizarCadastro();
    }//GEN-LAST:event_cmdprimeiroActionPerformed

    private void cmdadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadicionarActionPerformed
        //Codigo do botão adicionar do cadastro de usuario
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdadicionar.setEnabled(false);
        cmdeditar.setEnabled(false);
        cmdexcluir.setEnabled(false);
        cmdpesquisar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmdcancelar.setEnabled(true);
        
        //Desbloqueio dos campos.
        txtnome.setEnabled(true);
        txtusuario.setEnabled(true);
        txtsenha.setEnabled(true);
        txtconfsenha.setEnabled(true);
        cmdperfil.setEnabled(true);
        
        //limpar as caixas de texto
        txtnome.setText("");
        txtusuario.setText("");
        txtsenha.setText("");
        txtconfsenha.setText("");
        cmdperfil.setSelectedIndex(0);
        
        cmdAdicionar=true;       
        
        txtnome.requestFocus();
        
        CarregarTable();
    }//GEN-LAST:event_cmdadicionarActionPerformed

    private void cmdpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdpesquisarActionPerformed

    private void cmdproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdproximoActionPerformed
        // Codigo do botão Proximo Cadastro Usuario
        
       usuarioAtual++;
       if(usuarioAtual==msDados.NUsuario()){
           usuarioAtual=0;
       }
       visualizarCadastro();
    }//GEN-LAST:event_cmdproximoActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed
        // Codigo do botão salvar do cadastro de usuario
        
        if (txtnome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira o Nome.");
            txtnome.requestFocusInWindow();
            return;
        }
        if (txtusuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira o Usuario.");
            txtusuario.requestFocusInWindow();
            return;
        }
                
        String SSenha = new String (txtsenha.getPassword());
        String confSSenha = new String (txtconfsenha.getPassword());
        
        if (SSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira a Senha.");
            txtsenha.requestFocusInWindow();
            return;
        }
        if (confSSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira a Confirmação da Senha.");
            txtconfsenha.requestFocusInWindow();
            return;
        }
        
        if (!SSenha.equals(confSSenha)){
            JOptionPane.showMessageDialog(rootPane, "As Senhas Não Conferem.");
            txtsenha.requestFocusInWindow();
            return;
        }
        
        if (cmdperfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Insira um Perfil.");
            cmdperfil.requestFocusInWindow();
            return;
        }
        
        int poslinha = msDados.LinhaUsuario(txtusuario.getText());
        if (poslinha!=-1){
            JOptionPane.showMessageDialog(rootPane, "Usuario Existente.");
            txtusuario.requestFocusInWindow();
            return;
        } else {
            if(poslinha==1){
              JOptionPane.showMessageDialog(rootPane, "Usuario Inexistente.");
            txtusuario.requestFocusInWindow();
            return;  
            }
        }
        
        Usuario MUsuario = new Usuario (txtnome.getText(),txtusuario.getText(),SSenha,confSSenha, (int) cmdperfil.getSelectedItem());
        String msg;
        if (cmdAdicionar){
            msg=msDados.CadUsuario(MUsuario);
        } else{
            msg=msDados.EditarUsuario(MUsuario, poslinha);  
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
                
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmdexcluir.setEnabled(true);
        cmdpesquisar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(false);
        
        txtnome.setEnabled(false);
        txtusuario.setEnabled(false);
        txtsenha.setEnabled(false);
        txtconfsenha.setEnabled(false);
        cmdperfil.setEnabled(false);
        
        CarregarTable();
    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmdanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdanteriorActionPerformed
        // Botão Anterior Cadastro Usuario
        usuarioAtual --;
        if(usuarioAtual==-1){
            usuarioAtual=msDados.NUsuario()-1;
        }
        
        visualizarCadastro();
    }//GEN-LAST:event_cmdanteriorActionPerformed
   
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        visualizarCadastro();
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        // Botão cancelar do cadastro de usuario.
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdeditar.setEnabled(true);
        cmdexcluir.setEnabled(true);
        cmdpesquisar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(false);

        txtnome.setEnabled(false);
        txtusuario.setEnabled(false);
        txtsenha.setEnabled(false);
        txtconfsenha.setEnabled(false);
        cmdperfil.setEnabled(false);
        
        
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void cmdexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexcluirActionPerformed
        // Codigo BOtão Deletar
        
        int Del=JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir esse Cadastro?");
        if(Del!=0){
            return;
        }
        String msg;
        msg=msDados.DeletarUsuario(usuarioAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
            usuarioAtual=0;
            visualizarCadastro();
            CarregarTable();
        
    }//GEN-LAST:event_cmdexcluirActionPerformed
    private void visualizarCadastro(){
        txtnome.setText(msDados.getUsuarios()[usuarioAtual].getNome());
        txtusuario.setText(msDados.getUsuarios()[usuarioAtual].getUsuario());
        txtsenha.setText(msDados.getUsuarios()[usuarioAtual].getSenha());
        txtconfsenha.setText(msDados.getUsuarios()[usuarioAtual].getSenha());
        cmdperfil.setSelectedIndex(msDados.getUsuarios()[usuarioAtual].getPerfil());
    }

    private void CarregarTable(){
        String titulocabecalho[]={"Usuario","Nome","Perfil"};
        String RegCadastro[]= new String [3];
        UserTable=new DefaultTableModel(null, titulocabecalho);
        
        for(int i=0; i<msDados.NUsuario();i++){
            RegCadastro[0]=msDados.getUsuarios()[i].getUsuario();
            RegCadastro[1]=msDados.getUsuarios()[i].getNome();
            RegCadastro[2]=msDados.getUsuarios()[i].getPerfil();
            
            UserTable.addRow(RegCadastro);
            
            }
        
        MTable.setModel(UserTable);
        
    }
        private String Perfil(int idperfil){
            if(idperfil==1){
                return "Vendedor";
            } if(idperfil==2) {
                 return "Supervisor";   
                    }
            if(idperfil==3) {
                 return "Gerente";  
                    }
            if(idperfil==4) {
                 return "Tecnico";   
                    }
            
        return null;
        }
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MTable;
    private javax.swing.JButton cmdadicionar;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmdeditar;
    private javax.swing.JButton cmdexcluir;
    private javax.swing.JComboBox<String> cmdperfil;
    private javax.swing.JButton cmdpesquisar;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdproximo;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtconfsenha;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
