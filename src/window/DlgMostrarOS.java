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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static util.FuncoesUteis.*;
/**
 *
 * @author guilh
 */
public class DlgMostrarOS extends javax.swing.JDialog {

    private GerInterGrafica gerIG;
    private OrdemServico ordemServico;
            
    public DlgMostrarOS(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG, OrdemServico ordemServico) {
        super(parent, modal);
        this.gerIG = gerIG;
        initComponents();
        this.ordemServico = ordemServico;
    }

    public GerInterGrafica getGerIG() {
        return gerIG;
    }

    public void setGerIG(GerInterGrafica gerIG) {
        this.gerIG = gerIG;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblProfissional = new javax.swing.JLabel();
        txtProfissional = new javax.swing.JTextField();
        lblDataInicio = new javax.swing.JLabel();
        lblDataConclusao = new javax.swing.JLabel();
        txtDataInicio = new javax.swing.JTextField();
        txtDataConclusao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaItem = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblProdutoVendido = new javax.swing.JLabel();
        btnSalvaStatus = new javax.swing.JButton();
        lblIDOS = new javax.swing.JLabel();
        txtIDOS = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnConcluido = new javax.swing.JRadioButton();
        btnProducao = new javax.swing.JRadioButton();
        btnFaltaPgto = new javax.swing.JRadioButton();
        lblDataGarantia = new javax.swing.JLabel();
        txtDataGarantia = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de Serviço");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vizualizar OS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");

        lblCliente.setText("Cliente");

        lblCPF.setText("CPF");

        txtCliente.setEnabled(false);

        txtCPF.setEnabled(false);

        lblProfissional.setText("Vendedor");

        txtProfissional.setEnabled(false);

        lblDataInicio.setText("Data Inicio");

        lblDataConclusao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDataConclusao.setText("Data Conclusão");

        txtDataInicio.setEnabled(false);

        txtDataConclusao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDataConclusao.setEnabled(false);

        tblListaItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "VALOR", "QT VENDIDO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaItem.setEnabled(false);
        jScrollPane1.setViewportView(tblListaItem);

        lblProdutoVendido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblProdutoVendido.setText("Produtos Vendido");

        btnSalvaStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvaStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/accept.png"))); // NOI18N
        btnSalvaStatus.setText("Salva Status");
        btnSalvaStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaStatusActionPerformed(evt);
            }
        });

        lblIDOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIDOS.setText("ID OS");

        txtIDOS.setEnabled(false);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("TOTAL");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotal.setEnabled(false);

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/impressora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(btnConcluido);
        btnConcluido.setMnemonic('C');
        btnConcluido.setText("CONCLUIDO");

        buttonGroup1.add(btnProducao);
        btnProducao.setMnemonic('P');
        btnProducao.setText("Produção");

        buttonGroup1.add(btnFaltaPgto);
        btnFaltaPgto.setMnemonic('F');
        btnFaltaPgto.setText("F. Pgto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducao)
                    .addComponent(btnFaltaPgto)
                    .addComponent(btnConcluido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnProducao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFaltaPgto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConcluido))
        );

        lblDataGarantia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDataGarantia.setText("Data Garantia");

        try {
            txtDataGarantia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataGarantia.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(lblIDOS))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDataInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDataConclusao))
                                    .addComponent(lblDataGarantia, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(147, 147, 147)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCPF)
                                    .addComponent(lblCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(lblProfissional)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblProdutoVendido)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvaStatus)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfissional)
                    .addComponent(txtProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDOS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataGarantia)
                            .addComponent(txtDataGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProdutoVendido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(btnSalvaStatus)
                    .addComponent(btnImprimir))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        txtCliente.setText(ordemServico.getNomeCliente());
        txtCPF.setText(ordemServico.getCpf());
        txtProfissional.setText(ordemServico.getFuncionario().getNome());
        txtIDOS.setText(Integer.toString(ordemServico.getIdOS()));
        //cmbStatus.setSelectedItem(ordemServico.getStatus());
        //buttonGroup1.setSelected(m, rootPaneCheckingEnabled);
        txtTotal.setText(String.valueOf( ordemServico.getValotTotal()));
        try {
            txtDataGarantia.setText(dateToStr(ordemServico.getDataGarantia()));
            txtDataConclusao.setText( dateToStr(ordemServico.getDataConclusao()));
            txtDataInicio.setText(dateToStr(ordemServico.getDataInicio()) );
            if(ordemServico.getStatus().getNome().equals("PRODUÇÃO")){
                btnProducao.setSelected(true);
            }else if(ordemServico.getStatus().getNome().equals("F. PGTO")){
               btnFaltaPgto.setSelected(true);
            }else{
                btnConcluido.setSelected(true);
            }
            
            //resetar tabela
            ((DefaultTableModel) tblListaItem.getModel()).setRowCount(0);
            for (Produto produto : ordemServico.getProduto()){ 
                ((DefaultTableModel) tblListaItem.getModel()).addRow(produto.toArrayOS());
            }
        } catch (ParseException ex) {
            Logger.getLogger(DlgMostrarOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void btnSalvaStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaStatusActionPerformed
        List<Status> lista_status = gerIG.getGerDom().carregarStatus();
        if(!ordemServico.getStatus().getNome().equals("CONCLUIDO")){ 
            switch (buttonGroup1.getButtonCount()) {
                case 1:
                    ordemServico.setStatus(lista_status.get(1));
                    break;
                case 2:
                    ordemServico.setStatus(lista_status.get(2));
                    break;
                default:
                    ordemServico.setStatus(lista_status.get(3));
                    break;  
            }
            Date novaData = new Date();
            ordemServico.setDataConclusao(novaData);
        }
        try {
            gerIG.getGerDom().alterarObj(ordemServico);
            JOptionPane.showMessageDialog(this, "Ordem de Serviço Alterado com Sucesso!\n" + "->" +  " (" + ordemServico.getIdOS() + ") " + "-" + ordemServico.getNomeCliente());  
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(DljCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvaStatusActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        
        
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnConcluido;
    private javax.swing.JRadioButton btnFaltaPgto;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JRadioButton btnProducao;
    private javax.swing.JButton btnSalvaStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDataConclusao;
    private javax.swing.JLabel lblDataGarantia;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblIDOS;
    private javax.swing.JLabel lblProdutoVendido;
    private javax.swing.JLabel lblProfissional;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblListaItem;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDataConclusao;
    private javax.swing.JFormattedTextField txtDataGarantia;
    private javax.swing.JTextField txtDataInicio;
    private javax.swing.JTextField txtIDOS;
    private javax.swing.JTextField txtProfissional;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
