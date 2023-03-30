/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import control.GerInterGrafica;
import domain.*;
import domain.OrdemServico;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class DlgBuscaOS extends javax.swing.JDialog {

    private GerInterGrafica gerIG;

    public DlgBuscaOS(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG) {
        super(parent, modal);
        this.gerIG = gerIG;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbTipoPesquisa = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdemServico = new javax.swing.JTable();
        btnBuscaOrdemServico = new javax.swing.JToggleButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca Ordem de Serviço");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Ordem de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        cmbTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPF", "PLACA", "RENAVAM" }));

        tblOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME CLIENTE", "PLACA", "RENAVAM", "STATUS"
            }
        ));
        tblOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdemServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrdemServico);

        btnBuscaOrdemServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscaOrdemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/search.png"))); // NOI18N
        btnBuscaOrdemServico.setText("Buscar Ordem Serviço");
        btnBuscaOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaOrdemServicoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(cmbTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtPesquisa))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnBuscaOrdemServico)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscaOrdemServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaOrdemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaOrdemServicoActionPerformed
       // int status = cmbStatus.getSelectedIndex();
        int tipo = cmbTipoPesquisa.getSelectedIndex();
        String pesquisa = txtPesquisa.getText();

        try {
            carregarTabela();
        } catch (Exception ex) {
            Logger.getLogger(DlgBuscaOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscaOrdemServicoActionPerformed

    private void tblOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdemServicoMouseClicked

        OrdemServico ordemServicoSelecionado = null;

        int linha = tblOrdemServico.getSelectedRow();
        try {
            if (linha >= 0) {
                ordemServicoSelecionado = (OrdemServico) tblOrdemServico.getValueAt(linha, 0);
                gerIG.abrirOrdemServico(2, ordemServicoSelecionado);
                carregarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma Ordem de Serviço.");
            }
        } catch (Exception ex) {
            Logger.getLogger(DlgBuscaOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblOrdemServicoMouseClicked

    public void carregarTabela() throws Exception {
        List<OrdemServico> listOrdemServico = new ArrayList();
       // String status = (String) cmbStatus.getSelectedItem();
        String tipo = (String) cmbTipoPesquisa.getSelectedItem();
        listOrdemServico = gerIG.getGerDom().carregarOrdemServico(tipo, txtPesquisa.getText());
        
        ((DefaultTableModel) tblOrdemServico.getModel()).setRowCount(0);
        /*
        for (OrdemServico ordemServico : listOrdemServico) {
            ((DefaultTableModel) tblOrdemServico.getModel()).addRow(ordemServico.toArrayBusca());
        }*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscaOrdemServico;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbTipoPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrdemServico;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
