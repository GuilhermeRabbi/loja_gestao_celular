/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import static util.FuncoesUteis.*;
import window.*;
import control.GerInterGrafica;
import domain.*;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public final class DlgOrdemServico extends javax.swing.JDialog {

    private GerInterGrafica gerIG;
    private Cliente cliSelecionado;
    private Produto itemSelecionado;
    private int tipo;
    private OrdemServico ordemServicoSelecionada;

    public DlgOrdemServico(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG, int tipo, OrdemServico ordemServicoSelecionado) throws Exception {
        super(parent, modal);
        this.gerIG = gerIG;
        this.cliSelecionado = null;
        this.itemSelecionado = null;
        this.ordemServicoSelecionada = ordemServicoSelecionado;
        this.tipo = tipo;
        initComponents();
        carregarCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        mnuPopUp = new javax.swing.JPopupMenu();
        mnuExcluir = new javax.swing.JMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnGrupStatus = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        PainelFundo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemOS = new javax.swing.JTable();
        lblProfissional = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnAdicionarOS = new javax.swing.JButton();
        btnInserirTabela = new javax.swing.JButton();
        lblDataConclusao = new javax.swing.JLabel();
        lblDataInic = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        painelStatus = new javax.swing.JPanel();
        btnProducao = new javax.swing.JCheckBox();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cmbDesconto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAplicarDesconto = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JLabel();
        txtValorDesconto = new javax.swing.JTextField();
        txtDataInicio = new com.toedter.calendar.JDateChooser();
        txtDataConclusao = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Buscar Cliente");

        mnuExcluir.setText("Excluir");
        mnuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExcluirActionPerformed(evt);
            }
        });
        mnuPopUp.add(mnuExcluir);

        jCheckBox1.setText("jCheckBox1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setTitle("Criar Ordem de Serviço");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        PainelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordem de Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        lblNome.setText("Nome Cliente");

        txtNome.setEnabled(false);

        lblCPF.setText("CPF");

        txtCPF.setEnabled(false);

        btnBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/search.png"))); // NOI18N
        btnBuscaCliente.setText("Busca Cliente");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        tblItemOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor Custo", "Valor Venda", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItemOS.setComponentPopupMenu(mnuPopUp);
        jScrollPane2.setViewportView(tblItemOS);

        lblProfissional.setText("Vendedor");

        cmbFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vazio" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Valor Total");

        btnAdicionarOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/add.png"))); // NOI18N
        btnAdicionarOS.setText("Registrar OS");
        btnAdicionarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarOSActionPerformed(evt);
            }
        });

        btnInserirTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/add.png"))); // NOI18N
        btnInserirTabela.setText("Inserir Serviço na OS");
        btnInserirTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirTabelaActionPerformed(evt);
            }
        });

        lblDataConclusao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDataConclusao.setText("Data Conclusão");

        lblDataInic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDataInic.setText("Data Inicio");

        painelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status OS"));

        btnGrupStatus.add(btnProducao);
        btnProducao.setMnemonic('P');
        btnProducao.setSelected(true);
        btnProducao.setText("Produção");
        btnProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelStatusLayout = new javax.swing.GroupLayout(painelStatus);
        painelStatus.setLayout(painelStatusLayout);
        painelStatusLayout.setHorizontalGroup(
            painelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProducao)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        painelStatusLayout.setVerticalGroup(
            painelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProducao)
        );

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setText("ID");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        cmbDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Dinheiro", "Porcentagem" }));

        jLabel1.setText("Desconto:");

        btnAplicarDesconto.setText("Aplicar Desconto");
        btnAplicarDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarDescontoActionPerformed(evt);
            }
        });

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtValorTotal.setText("0");

        javax.swing.GroupLayout PainelFundoLayout = new javax.swing.GroupLayout(PainelFundo);
        PainelFundo.setLayout(PainelFundoLayout);
        PainelFundoLayout.setHorizontalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelFundoLayout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnBuscaCliente)))
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                                        .addComponent(lblID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PainelFundoLayout.createSequentialGroup()
                                            .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblProfissional)
                                                .addComponent(lblDataInic))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PainelFundoLayout.createSequentialGroup()
                                                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(25, 25, 25)
                                                    .addComponent(lblDataConclusao))
                                                .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(painelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(23, 23, 23)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarOS))
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAplicarDesconto))
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btnInserirTabela)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelFundoLayout.setVerticalGroup(
            PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(btnBuscaCliente))
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))))
                .addGap(10, 10, 10)
                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PainelFundoLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblProfissional)
                                    .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PainelFundoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(painelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataInic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserirTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnAplicarDesconto)
                            .addComponent(txtValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(PainelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionarOS)
                            .addComponent(jLabel9)
                            .addComponent(txtValorTotal))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Cliente getCliSelecionado() {
        return cliSelecionado;
    }

    public void setCliSelecionado(Cliente cliSelecionado) {
        this.cliSelecionado = cliSelecionado;
    }

  

    public Produto getItemSelecionado() {
        return itemSelecionado;
    }

    public void setItemSelecionado(Produto itemSelecionado) {
        this.itemSelecionado = itemSelecionado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public OrdemServico getOrdemServicoSelecionada() {
        return ordemServicoSelecionada;
    }

    public void setOrdemServicoSelecionada(OrdemServico ordemServicoSelecionada) {
        this.ordemServicoSelecionada = ordemServicoSelecionada;
    }


    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        int linha = tblItemOS.getSelectedRow();
        double somaTotal;
        double valor;

        if (linha >= 0) {
            somaTotal = Double.parseDouble(tblItemOS.getValueAt(linha, 2).toString());
            valor = Double.parseDouble(txtValorTotal.getText());

            if((valor - somaTotal) < 0){
                txtValorTotal.setText(""+ "0,00");
            }else{
                txtValorTotal.setText("" + (valor - somaTotal) + "0");
            }
            ((DefaultTableModel) tblItemOS.getModel()).removeRow(linha);
        }
    }//GEN-LAST:event_mnuExcluirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            
            retornarCamposVazios();
            if (this.getTipo() == 1) {
                Date dataOrcamento = new Date();
                Date date = null;
                //btnGrupStatus.setSelected(btnOrcamento, true);
                txtDataInicio.setDate(dataOrcamento);
                txtDataConclusao.setDate(dataOrcamento);
    
                btnAdicionarOS.setVisible(true);
                btnBuscaCliente.setVisible(true);
                //btnSalvaOS.setVisible(false);
                lblID.setVisible(false);
                txtID.setVisible(false);
                //btnOrcamento.setEnabled(true);

            } else {
                btnAdicionarOS.setVisible(false);
                btnBuscaCliente.setVisible(false);
                //btnSalvaOS.setVisible(true);
                lblID.setVisible(true);
                txtID.setVisible(true);
                //btnOrcamento.setEnabled(false);
                btnProducao.setSelected(true);
                preencherDados();
            }
            gerIG.carregarCombo(cmbFuncionario, Funcionario.class);

        } catch (Exception ex) {
            Logger.getLogger(DlgOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formComponentShown

    public void preencherDados() throws ParseException {

        txtNome.setText(ordemServicoSelecionada.getNomeCliente());
        txtCPF.setText(ordemServicoSelecionada.getCpf());
        cmbFuncionario.setSelectedItem(ordemServicoSelecionada.getFuncionario().getNome());
        txtDataConclusao.setDate(ordemServicoSelecionada.getDataConclusao());
        txtDataInicio.setDate(ordemServicoSelecionada.getDataInicio());
        txtValorTotal.setText(String.valueOf(ordemServicoSelecionada.getValotTotal()));
        if(ordemServicoSelecionada.getStatus().equals("ORÇAMENTO")){
            //btnSalvaOS.setVisible(true);
            txtID.setText(String.valueOf(ordemServicoSelecionada.getIdOS()) );
       }
        ((DefaultTableModel) tblItemOS.getModel()).setRowCount(0);
        for (Produto produto : ordemServicoSelecionada.getProduto()) {
            ((DefaultTableModel) tblItemOS.getModel()).addRow(produto.toArray());
        }
    }


    private void btnProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducaoActionPerformed
        
    }//GEN-LAST:event_btnProducaoActionPerformed

    private void btnInserirTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirTabelaActionPerformed

        try {
            gerIG.abrirItemInsere(tblItemOS);
            valorTotal();

        } catch (Exception ex) {
            Logger.getLogger(DlgOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInserirTabelaActionPerformed

    private void btnAdicionarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarOSActionPerformed
        List<Status> status = gerIG.getGerDom().carregarStatus();
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String valor = txtValorTotal.getText();
        Date garantia = new Date();
        Date dataIncio = null;
        Date dataConclusao = null;
        garantia = dataGarantia(garantia);
        dataIncio = txtDataInicio.getDate();
        dataConclusao = txtDataConclusao.getDate();
        Status statusEscolhido = status.get(1);
        List<Produto> listProduto = new ArrayList();
        Produto produto = null;
        for (int i = 0; i < tblItemOS.getRowCount(); i++) {
            produto = (Produto) tblItemOS.getValueAt(i, 1);
            listProduto.add(produto);
        }
        if (listProduto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor Adicionar o Serviço desejado");
        } else try {
            if (validarDados()) {
                double valorTotal = Double.parseDouble(valor);
                Funcionario funcionario = (Funcionario) cmbFuncionario.getSelectedItem();
                Cliente cliente = cliSelecionado;
                
                                                       
                OrdemServico ordemServico = new OrdemServico(0, nome, cpf,valorTotal, garantia,dataIncio, dataConclusao, statusEscolhido, cliente, funcionario, listProduto);
                try {
                    if (gerIG.getGerDom().cadOrdemServico(ordemServico)) {
                        JOptionPane.showMessageDialog(this, "Ordem de Serviço Inserida com Sucesso!\n" + "Cliente:" + ordemServico.getNomeCliente());
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Inserir Ordem de Serviço!");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(DlgOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(DlgOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarOSActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        cliSelecionado = gerIG.abrirBuscaCliente();

        if (cliSelecionado != null) {
            preencherCamposCliente(cliSelecionado);
        }
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnAplicarDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarDescontoActionPerformed
        String tipo_desconto = (String) cmbDesconto.getSelectedItem();
        String valor = txtValorTotal.getText();
        int desconto = Integer.parseInt(txtValorDesconto.getText());
        double valorBruto = Double.parseDouble(valor);
        double valorFinal = 0;
        if (tipo_desconto.equals("Dinheiro")){
            if(desconto > valorBruto){
                JOptionPane.showMessageDialog(this, "Valor do desconto deve ser inferior ao Valor Total!\n", "Aplicar Desconto", JOptionPane.ERROR_MESSAGE);
            }else{
                valorFinal = valorBruto - desconto;
                txtValorTotal.setText("" + String.valueOf(valorFinal) + "0");
            }   
        }else if(tipo_desconto.equals("Porcentagem")){
            if(desconto <= 0){
                JOptionPane.showMessageDialog(this, "Valor do desconto deve ser Superior a 0!\n", "Aplicar Desconto", JOptionPane.ERROR_MESSAGE);
            }else{
                valorFinal =  valorBruto - ((valorBruto * desconto) / 100) ;
                txtValorTotal.setText("" + String.valueOf(valorFinal) + "0");
            }
        }
        
    }//GEN-LAST:event_btnAplicarDescontoActionPerformed

    public Date dataGarantia(Date dataGarantia){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataGarantia);
        cal.add(Calendar.DATE, 90);
        dataGarantia = cal.getTime();
        return dataGarantia; 
    }
    
    public boolean validarDados() throws ParseException {
        retornaCores();
        String msgErro = "";

        if (txtNome.getText().isEmpty() || txtCPF.getText().isEmpty()) {
            msgErro = msgErro + "Seleciona Cliente Solicitante!\n";
            lblNome.setForeground(Color.red);
            lblCPF.setForeground(Color.red);
        }
        if (cmbFuncionario.getSelectedItem().toString().equals("Vazio")) {
            msgErro = msgErro + "Adicione Profissional Responsavel!\n";
            lblProfissional.setForeground(Color.red);
        }
        if (btnProducao.isSelected()) {
            if (txtDataInicio.getDate() == null) {
                msgErro = msgErro + "Informa a Data de Inicio\n";
                lblDataInic.setForeground(Color.red);
            }
            if (txtDataConclusao.getDate() == null) {
                msgErro = msgErro + "Informa a Data de Conclusão\n";
                lblDataConclusao.setForeground(Color.red);

            } else if (txtDataConclusao.getDate().before(txtDataInicio.getDate())) {
                msgErro = msgErro + "Data de Conclusão inferior a Data Inicial\n";
                lblDataConclusao.setForeground(Color.red);
            }
        }
        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro + "Favor Completar os campos!\n", "Registrar OS", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void retornarCamposVazios(){
        txtCPF.setText("");
        txtID.setText("");
        txtNome.setText("");
        txtValorTotal.setText("0");
        ((DefaultTableModel) tblItemOS.getModel()).setRowCount(0);
    }
    
    
    public void carregarCampos() throws Exception {

        if (getTipo() == 2) {
            txtCPF.setText(ordemServicoSelecionada.getCpf());
            txtID.setText(Integer.toString(ordemServicoSelecionada.getIdOS()));
            txtNome.setText(ordemServicoSelecionada.getNomeCliente());
            txtValorTotal.setText(String.valueOf((ordemServicoSelecionada.getValotTotal())));
            cmbFuncionario.setSelectedItem(ordemServicoSelecionada.getFuncionario().getNome());

            for (Produto item : ordemServicoSelecionada.getProduto()) {
                ((DefaultTableModel) tblItemOS.getModel()).addRow(item.toArray());
            }
        }
    }

    public void retornaCores() {
        lblCPF.setForeground(Color.black);
        lblDataConclusao.setForeground(Color.black);
        lblDataInic.setForeground(Color.black);
        lblNome.setForeground(Color.black);
        lblProfissional.setForeground(Color.black);
    }

    private void valorTotal() {
        double somaTotal = 0;
        for (int i = 0; i < tblItemOS.getRowCount(); i++) {
            somaTotal += Double.parseDouble(tblItemOS.getValueAt(i, 3).toString());
        }
        txtValorTotal.setText("" + somaTotal + "0");
    }

    private void inserirDadosTabela(String nomeItem, int valorItem) {
        ((DefaultTableModel) tblItemOS.getModel()).addRow(new Object[1]);
        int linha = tblItemOS.getRowCount() - 1;
        int col = 0;
        tblItemOS.setValueAt(nomeItem, linha, col++);
        tblItemOS.setValueAt(valorItem, linha, col++);

    }

    public void preencherCamposCliente(Cliente cliente) {
        txtNome.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JButton btnAdicionarOS;
    private javax.swing.JButton btnAplicarDesconto;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.ButtonGroup btnGrupStatus;
    private javax.swing.JButton btnInserirTabela;
    private javax.swing.JCheckBox btnProducao;
    private javax.swing.JComboBox<String> cmbDesconto;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataConclusao;
    private javax.swing.JLabel lblDataInic;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProfissional;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JPopupMenu mnuPopUp;
    private javax.swing.JPanel painelStatus;
    private javax.swing.JTable tblItemOS;
    private javax.swing.JTextField txtCPF;
    private com.toedter.calendar.JDateChooser txtDataConclusao;
    private com.toedter.calendar.JDateChooser txtDataInicio;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorDesconto;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables

}
