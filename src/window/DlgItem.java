/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import control.GerInterGrafica;
import domain.*;
import java.awt.Color;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class DlgItem extends javax.swing.JDialog {

    private GerInterGrafica gerIG;
    private Produto itemSelecionado;
    private JTable tblItemOS;

    public DlgItem(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG, JTable tblItemOS) {
        super(parent, modal);
        this.gerIG = gerIG;
        this.itemSelecionado = null;
        this.tblItemOS = tblItemOS;
        initComponents();
        lblServicoInserido.setVisible(false);
    }

    public Produto getItemSelecionado() {
        return itemSelecionado;
    }

    public void setItemSelecionado(Produto itemSelecionado) {
        this.itemSelecionado = itemSelecionado;
    }

    public JTable getTblItemOS() {
        return tblItemOS;
    }

    public void setTblItemOS(JTable tblItemOS) {
        this.tblItemOS = tblItemOS;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuPopTabela = new javax.swing.JPopupMenu();
        mnuAlterar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        btnInserirItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnBucarItem = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        lblServicoInserido = new javax.swing.JLabel();

        mnuAlterar.setText("jMenuItem1");
        mnuPopTabela.add(mnuAlterar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Item");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInserirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/add.png"))); // NOI18N
        btnInserirItem.setText("Adicionar Novo Produto");
        btnInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirItemActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor Custo", "Valor Venda", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setComponentPopupMenu(mnuPopTabela);
        jScrollPane1.setViewportView(tblItem);

        btnBucarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/search.png"))); // NOI18N
        btnBucarItem.setText("Buscar Item");
        btnBucarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarItemActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/add.png"))); // NOI18N
        btnConfirmar.setText("Adicionar na OS");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblServicoInserido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblServicoInserido.setForeground(new java.awt.Color(0, 153, 0));
        lblServicoInserido.setText("Serviço Inserido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnBucarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInserirItem)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblServicoInserido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBucarItem)
                    .addComponent(btnInserirItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar)
                    .addComponent(lblServicoInserido))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirItemActionPerformed
        lblServicoInserido.setVisible(false);        
        try {
            gerIG.abrirInserirServico();    
        } catch (Exception ex) {
            Logger.getLogger(DlgItem.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_btnInserirItemActionPerformed

    private void btnBucarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarItemActionPerformed
        lblServicoInserido.setVisible(false);
        String nome = txtNome.getText();
        try {

            List<Produto> listaItem = gerIG.getGerDom().carregarItem(0, nome);

            //resetar tabela
            ((DefaultTableModel) tblItem.getModel()).setRowCount(0);

            if (listaItem.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não existem registros com essa pesquisa.");
            } else {
                for (Produto item : listaItem) {
                    ((DefaultTableModel) tblItem.getModel()).addRow(item.toArray());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DlgBuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBucarItemActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        lblServicoInserido.setVisible(false);
        
        int linha = tblItem.getSelectedRow();
        if ( linha >= 0 ) {
            itemSelecionado = (Produto) tblItem.getValueAt(linha, 1); 
            try {
                ((DefaultTableModel) tblItemOS.getModel()).addRow(itemSelecionado.toArray());
                jlabelInserido();
            }catch (ParseException ex) {
                jlabelErro();
                Logger.getLogger(DlgItem.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else {
            jlabelErro();
            JOptionPane.showMessageDialog(this, "Selecione um Serviço.");
        }   
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
    public void jlabelErro(){
        lblServicoInserido.setVisible(true);
        lblServicoInserido.setText("Erro ao Inserir");
        lblServicoInserido.setForeground(Color.red);
    }
    
    public void jlabelInserido(){
        lblServicoInserido.setVisible(true);
        lblServicoInserido.setText("Produto Inserido!");
        lblServicoInserido.setForeground(Color.green);
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lblServicoInserido.setVisible(false);
        try {

            List<Produto> listaItem = gerIG.getGerDom().carregarItem(0, "");

            //resetar tabela
            ((DefaultTableModel) tblItem.getModel()).setRowCount(0);

            if (listaItem.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não existem Serviçso cadastrados.");
            } else {
                for (Produto item : listaItem) {
                    ((DefaultTableModel) tblItem.getModel()).addRow(item.toArray());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(DlgBuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    /*public boolean validarDados() {
        lblNome.setForeground(Color.black);

        String msgErro = "";

        if (txtNome.getText().isEmpty()) {
            msgErro = msgErro + "Digite o nome do Item\n";
            lblNome.setForeground(Color.red);
        }
        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro + "Favor Completar os campos!", "Inserir Item", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }*/

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBucarItem;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnInserirItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblServicoInserido;
    private javax.swing.JMenuItem mnuAlterar;
    private javax.swing.JPopupMenu mnuPopTabela;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
