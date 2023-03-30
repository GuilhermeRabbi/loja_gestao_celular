/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import control.GerInterGrafica;
import domain.Cliente;
import domain.OrdemServico;
import domain.VendaAcessorio;
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
public class DlgMostrarCliente extends javax.swing.JDialog {

    private GerInterGrafica gerIG;
    private Cliente cliente;

    public DlgMostrarCliente(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG, Cliente cliente) {
        super(parent, modal);
        this.gerIG = gerIG;
        this.cliente = cliente;
        initComponents();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdemServico = new javax.swing.JTable();
        lblOrdemServico = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        btnAlterarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setText("ID");

        txtID.setEnabled(false);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setEnabled(false);

        lblCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCPF.setText("CPF");

        txtCPF.setEnabled(false);

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCidade.setText("Cidade");

        txtCidade.setEnabled(false);

        tblOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vendedor", "Dt Garantia", "Valor", "Status"
            }
        ));
        tblOrdemServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdemServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrdemServico);

        lblOrdemServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrdemServico.setText("Lista Ordem de Serviço");

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorTotal.setText("Valor Total");

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorTotal.setEnabled(false);

        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("Valor referente as OS Confirmadas");

        lblCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCEP.setText("CEP");

        txtCEP.setEnabled(false);

        btnAlterarCliente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/alterar.Item.png"))); // NOI18N
        btnAlterarCliente.setText("Alterar Cliente");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(25, 287, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCEP)
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarCliente)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblOrdemServico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(lblCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrdemServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorTotal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarCliente)
                        .addContainerGap())))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        gerIG.abrirAlterarCliente(cliente);
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        txtID.setText(String.valueOf(cliente.getIdCliente()));
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
        txtCidade.setText(cliente.getCidade());
        txtCEP.setText(cliente.getCep());
        Double valor = 0.0;
        List<OrdemServico> listaOrdemServico = new ArrayList();
        List<VendaAcessorio> listaAcessorio = new ArrayList();
        try {
            txtValorTotal.setText("");
           listaOrdemServico = gerIG.getGerDom().carregarOrdemServico("TODOS", cliente.getCpf());
           listaAcessorio = gerIG.getGerDom().carregarVendasAcessorio("TODOS", cliente.getCpf());
           carregarTabelaOrcamento(listaOrdemServico, listaAcessorio);
        } catch (Exception ex) {
            Logger.getLogger(DlgMostrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formComponentShown

    public void carregarTabelaOrcamento(List<OrdemServico> listaOrdemServico, List<VendaAcessorio> listaVendaAcessorio) throws ParseException{
        Double valor = 0.0;
        ((DefaultTableModel) tblOrdemServico.getModel()).setRowCount(0);    
        for (OrdemServico ordemServico : listaOrdemServico) {
            if (ordemServico.getStatus().getNome().equals("CONCLUIDO")) {
                valor += ordemServico.getValotTotal();
            }
            ((DefaultTableModel) tblOrdemServico.getModel()).addRow(ordemServico.toArrayJanCliente());
        }
        for (VendaAcessorio venda_acessorio : listaVendaAcessorio) {
            if (venda_acessorio.getStatus().getNome().equals("CONCLUIDO")) {
                valor += venda_acessorio.getValotTotal();
            }
            ((DefaultTableModel) tblOrdemServico.getModel()).addRow(venda_acessorio.toArrayJanCliente());
        }
        txtValorTotal.setText(String.valueOf(valor));
    }


    private void tblOrdemServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdemServicoMouseClicked
        
        OrdemServico ordemServicoSelecionada = null;
        List<OrdemServico> listaOrdemServico = new ArrayList();
        List<VendaAcessorio> listaAcessorio = new ArrayList();
        int linha = tblOrdemServico.getSelectedRow();
        if (linha >= 0) {
            ordemServicoSelecionada = (OrdemServico) tblOrdemServico.getValueAt(linha, 0);
            gerIG.abrirMostrarOS(ordemServicoSelecionada);
            try {
                listaOrdemServico = gerIG.getGerDom().carregarOrdemServico("TODOS", cliente.getCpf());
                listaAcessorio = gerIG.getGerDom().carregarVendasAcessorio("TODOS", cliente.getCpf());
                carregarTabelaOrcamento(listaOrdemServico, listaAcessorio);
            } catch (Exception ex) {
                Logger.getLogger(DlgMostrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente sem Ordem de Servico!");
        }
    }//GEN-LAST:event_tblOrdemServicoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrdemServico;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblOrdemServico;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
