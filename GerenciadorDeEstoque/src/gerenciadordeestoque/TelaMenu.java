package gerenciadordeestoque;


public class TelaMenu extends javax.swing.JFrame {

   
    public TelaMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuPopUpOpcoes = new javax.swing.JMenu();
        jMenuItemPopUpTrocarSenha = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItemPopUpSair = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuPopUpProdutos = new javax.swing.JMenu();
        jMenuItemPopUpIncluirProduto = new javax.swing.JMenuItem();
        jMenuItemPopUpAlterarProduto = new javax.swing.JMenuItem();
        jMenuItemPopUpConsultarProduto = new javax.swing.JMenuItem();
        jMenuItemPopUpExcluirProduto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuPopUpFornecedores = new javax.swing.JMenu();
        jMenuItemPopUpIncluirFornecedor = new javax.swing.JMenuItem();
        jMenuItemPopUpAlterarFornecedor = new javax.swing.JMenuItem();
        jMenuItemPopUpConsultarFornecedor = new javax.swing.JMenuItem();
        jMenuItemPopUpExcluirFornecedor = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuPopUpRelatorios = new javax.swing.JMenu();
        jMenuItemPopUpGerarRelatorio = new javax.swing.JMenuItem();
        jMenuItemPopUpConsultarRelatorio = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuPopUpEstoque = new javax.swing.JMenu();
        jMenuItemPopUpConsultarEstoque = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuPopUpSobre = new javax.swing.JMenu();
        jMenuItemPopUpAjuda = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItemPopUpVersao = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemTrocarSenha = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemIncluirProduto = new javax.swing.JMenuItem();
        jMenuItemAlterarProduto = new javax.swing.JMenuItem();
        jMenuItemConsultarProduto = new javax.swing.JMenuItem();
        jMenuItemExcluirProduto = new javax.swing.JMenuItem();
        jMenuFornecedores = new javax.swing.JMenu();
        jMenuItemIncluirFornecedores = new javax.swing.JMenuItem();
        jMenuItemAlterarFornecedores = new javax.swing.JMenuItem();
        jMenuItemConsultarFornecedores = new javax.swing.JMenuItem();
        jMenuItemExcluirFornecedores = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemGerarRelatorio = new javax.swing.JMenuItem();
        jMenuItemConsultarRelatorio = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenu();
        jMenuItemConsultarEstoque = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVersao = new javax.swing.JMenuItem();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseReleased(evt);
            }
        });

        jMenuPopUpOpcoes.setText("Opções");

        jMenuItemPopUpTrocarSenha.setText("Trocar Senha");
        jMenuPopUpOpcoes.add(jMenuItemPopUpTrocarSenha);
        jMenuPopUpOpcoes.add(jSeparator7);

        jMenuItemPopUpSair.setText("Sair");
        jMenuPopUpOpcoes.add(jMenuItemPopUpSair);

        jPopupMenu1.add(jMenuPopUpOpcoes);
        jPopupMenu1.add(jSeparator3);

        jMenuPopUpProdutos.setText("Produtos");

        jMenuItemPopUpIncluirProduto.setText("Incluir");
        jMenuPopUpProdutos.add(jMenuItemPopUpIncluirProduto);

        jMenuItemPopUpAlterarProduto.setText("Alterar");
        jMenuPopUpProdutos.add(jMenuItemPopUpAlterarProduto);

        jMenuItemPopUpConsultarProduto.setText("Consultar");
        jMenuPopUpProdutos.add(jMenuItemPopUpConsultarProduto);

        jMenuItemPopUpExcluirProduto.setText("Excluir");
        jMenuPopUpProdutos.add(jMenuItemPopUpExcluirProduto);

        jPopupMenu1.add(jMenuPopUpProdutos);
        jPopupMenu1.add(jSeparator4);

        jMenuPopUpFornecedores.setText("Fornecedores");

        jMenuItemPopUpIncluirFornecedor.setText("Incluir");
        jMenuPopUpFornecedores.add(jMenuItemPopUpIncluirFornecedor);

        jMenuItemPopUpAlterarFornecedor.setText("Alterar");
        jMenuPopUpFornecedores.add(jMenuItemPopUpAlterarFornecedor);

        jMenuItemPopUpConsultarFornecedor.setText("Consultar");
        jMenuPopUpFornecedores.add(jMenuItemPopUpConsultarFornecedor);

        jMenuItemPopUpExcluirFornecedor.setText("Excluir");
        jMenuPopUpFornecedores.add(jMenuItemPopUpExcluirFornecedor);

        jPopupMenu1.add(jMenuPopUpFornecedores);
        jPopupMenu1.add(jSeparator5);

        jMenuPopUpRelatorios.setText("Relatórios");

        jMenuItemPopUpGerarRelatorio.setText("Gerar");
        jMenuPopUpRelatorios.add(jMenuItemPopUpGerarRelatorio);

        jMenuItemPopUpConsultarRelatorio.setText("Consultar");
        jMenuPopUpRelatorios.add(jMenuItemPopUpConsultarRelatorio);

        jPopupMenu1.add(jMenuPopUpRelatorios);
        jPopupMenu1.add(jSeparator6);

        jMenuPopUpEstoque.setText("Estoque");

        jMenuItemPopUpConsultarEstoque.setText("Consultar");
        jMenuPopUpEstoque.add(jMenuItemPopUpConsultarEstoque);

        jPopupMenu1.add(jMenuPopUpEstoque);
        jPopupMenu1.add(jSeparator9);

        jMenuPopUpSobre.setText("Sobre");

        jMenuItemPopUpAjuda.setText("Ajuda");
        jMenuPopUpSobre.add(jMenuItemPopUpAjuda);
        jMenuPopUpSobre.add(jSeparator8);

        jMenuItemPopUpVersao.setText("Versão");
        jMenuPopUpSobre.add(jMenuItemPopUpVersao);

        jPopupMenu1.add(jMenuPopUpSobre);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("... Gerenciador de Estoque ...");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jMenuBar1.setToolTipText("");
        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuOpcoes.setText("Opções");

        jMenuItemTrocarSenha.setText("Trocar Senha");
        jMenuItemTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocarSenhaActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemTrocarSenha);
        jMenuOpcoes.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcoes);

        jMenuProdutos.setText("Produtos");

        jMenuItemIncluirProduto.setText("Incluir");
        jMenuProdutos.add(jMenuItemIncluirProduto);

        jMenuItemAlterarProduto.setText("Alterar");
        jMenuProdutos.add(jMenuItemAlterarProduto);

        jMenuItemConsultarProduto.setText("Consultar");
        jMenuProdutos.add(jMenuItemConsultarProduto);

        jMenuItemExcluirProduto.setText("Excluir");
        jMenuProdutos.add(jMenuItemExcluirProduto);

        jMenuBar1.add(jMenuProdutos);

        jMenuFornecedores.setText("Fornecedores");

        jMenuItemIncluirFornecedores.setText("Incluir");
        jMenuFornecedores.add(jMenuItemIncluirFornecedores);

        jMenuItemAlterarFornecedores.setText("Alterar");
        jMenuFornecedores.add(jMenuItemAlterarFornecedores);

        jMenuItemConsultarFornecedores.setText("Consultar");
        jMenuFornecedores.add(jMenuItemConsultarFornecedores);

        jMenuItemExcluirFornecedores.setText("Excluir");
        jMenuFornecedores.add(jMenuItemExcluirFornecedores);

        jMenuBar1.add(jMenuFornecedores);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemGerarRelatorio.setText("Gerar");
        jMenuRelatorios.add(jMenuItemGerarRelatorio);

        jMenuItemConsultarRelatorio.setText("Consultar");
        jMenuRelatorios.add(jMenuItemConsultarRelatorio);

        jMenuBar1.add(jMenuRelatorios);

        jMenuEstoque.setText("Estoque");

        jMenuItemConsultarEstoque.setText("Consultar");
        jMenuEstoque.add(jMenuItemConsultarEstoque);

        jMenuBar1.add(jMenuEstoque);

        jMenuSobre.setText("Sobre");

        jMenuItemAjuda.setText("Ajuda");
        jMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjudaActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemAjuda);
        jMenuSobre.add(jSeparator2);

        jMenuItemVersao.setText("Versão");
        jMenuSobre.add(jMenuItemVersao);

        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjudaActionPerformed
        
    }//GEN-LAST:event_jMenuItemAjudaActionPerformed

    private void jMenuItemTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocarSenhaActionPerformed
                  
    }//GEN-LAST:event_jMenuItemTrocarSenhaActionPerformed

    private void jPopupMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenu1MouseReleased

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
      
        if (evt.isPopupTrigger()){
            jPopupMenu1.show(this,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_formMouseReleased

 
    public static void main(String args[]) {
     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEstoque;
    private javax.swing.JMenu jMenuFornecedores;
    private javax.swing.JMenuItem jMenuItemAjuda;
    private javax.swing.JMenuItem jMenuItemAlterarFornecedores;
    private javax.swing.JMenuItem jMenuItemAlterarProduto;
    private javax.swing.JMenuItem jMenuItemConsultarEstoque;
    private javax.swing.JMenuItem jMenuItemConsultarFornecedores;
    private javax.swing.JMenuItem jMenuItemConsultarProduto;
    private javax.swing.JMenuItem jMenuItemConsultarRelatorio;
    private javax.swing.JMenuItem jMenuItemExcluirFornecedores;
    private javax.swing.JMenuItem jMenuItemExcluirProduto;
    private javax.swing.JMenuItem jMenuItemGerarRelatorio;
    private javax.swing.JMenuItem jMenuItemIncluirFornecedores;
    private javax.swing.JMenuItem jMenuItemIncluirProduto;
    private javax.swing.JMenuItem jMenuItemPopUpAjuda;
    private javax.swing.JMenuItem jMenuItemPopUpAlterarFornecedor;
    private javax.swing.JMenuItem jMenuItemPopUpAlterarProduto;
    private javax.swing.JMenuItem jMenuItemPopUpConsultarEstoque;
    private javax.swing.JMenuItem jMenuItemPopUpConsultarFornecedor;
    private javax.swing.JMenuItem jMenuItemPopUpConsultarProduto;
    private javax.swing.JMenuItem jMenuItemPopUpConsultarRelatorio;
    private javax.swing.JMenuItem jMenuItemPopUpExcluirFornecedor;
    private javax.swing.JMenuItem jMenuItemPopUpExcluirProduto;
    private javax.swing.JMenuItem jMenuItemPopUpGerarRelatorio;
    private javax.swing.JMenuItem jMenuItemPopUpIncluirFornecedor;
    private javax.swing.JMenuItem jMenuItemPopUpIncluirProduto;
    private javax.swing.JMenuItem jMenuItemPopUpSair;
    private javax.swing.JMenuItem jMenuItemPopUpTrocarSenha;
    private javax.swing.JMenuItem jMenuItemPopUpVersao;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTrocarSenha;
    private javax.swing.JMenuItem jMenuItemVersao;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuPopUpEstoque;
    private javax.swing.JMenu jMenuPopUpFornecedores;
    private javax.swing.JMenu jMenuPopUpOpcoes;
    private javax.swing.JMenu jMenuPopUpProdutos;
    private javax.swing.JMenu jMenuPopUpRelatorios;
    private javax.swing.JMenu jMenuPopUpSobre;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
