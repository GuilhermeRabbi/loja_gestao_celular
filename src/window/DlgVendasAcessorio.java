/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import control.GerInterGrafica;
import domain.Cliente;
import domain.Funcionario;
import domain.Produto;
import domain.Status;
import domain.VendaAcessorio;
import java.awt.Color;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jboss.logging.Logger;
import static util.FuncoesUteis.dateToStr;
import static util.FuncoesUteis.strToDate;

/**
 *
 * @author guilh
 */
public class DlgVendasAcessorio extends javax.swing.JDialog {

    private GerInterGrafica gerIG;
    Cliente clienteSelecionado;
    Funcionario funcionario;
    Status status;
    
    public DlgVendasAcessorio(java.awt.Frame parent, boolean modal, GerInterGrafica gerIG) {
        super(parent, modal);
        this.gerIG = gerIG;
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenuTabela = new javax.swing.JPopupMenu();
        btnMenuExcluir = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblVendedor = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        btnFaltaPagamento = new javax.swing.JRadioButton();
        btnConcluido = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnInserirProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoVA = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnRealizarVenda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDataGarantia = new javax.swing.JFormattedTextField();
        txtValorTotal = new javax.swing.JLabel();

        btnMenuExcluir.setText("Excluir");
        btnMenuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuExcluirActionPerformed(evt);
            }
        });
        PopMenuTabela.add(btnMenuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Venda de Acessorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        lblNomeCliente.setText("Nome Cliente");

        lblCPF.setText("CPF");

        txtNomeCliente.setEnabled(false);

        txtCPF.setEnabled(false);

        btnBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/search.png"))); // NOI18N
        btnBuscaCliente.setText("Buscar Cliente");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        lblVendedor.setText("Vendedor");

        buttonGroup1.add(btnFaltaPagamento);
        btnFaltaPagamento.setMnemonic('F');
        btnFaltaPagamento.setText("F. PGTO");

        buttonGroup1.add(btnConcluido);
        btnConcluido.setMnemonic('C');
        btnConcluido.setSelected(true);
        btnConcluido.setText("CONCLUIDO");

        jLabel3.setText("Dt Venda");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setEnabled(false);

        btnInserirProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInserirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/add.png"))); // NOI18N
        btnInserirProduto.setText("Inserir Produto");
        btnInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdutoActionPerformed(evt);
            }
        });

        tblProdutoVA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Produto", "Nome", "Valor Custo", "Valor Venda", "Qt Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutoVA.setComponentPopupMenu(PopMenuTabela);
        jScrollPane2.setViewportView(tblProdutoVA);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Valor Total");

        btnRealizarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/windows/imagens/accept.png"))); // NOI18N
        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
            }
        });

        jLabel5.setText("Garantia 90 dias");

        try {
            txtDataGarantia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataGarantia.setEnabled(false);

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtValorTotal.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lblVendedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFaltaPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConcluido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCPF)
                                    .addComponent(lblNomeCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscaCliente))
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarVenda)
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnInserirProduto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(cmbFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFaltaPagamento)
                    .addComponent(btnConcluido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserirProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnRealizarVenda))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdutoActionPerformed

        try {
            gerIG.abrirItemInsere(tblProdutoVA);
            valorTotal();

        } catch (Exception ex) {
            //Logger.getLogger(DlgOrdemServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInserirProdutoActionPerformed

    private void btnMenuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuExcluirActionPerformed
        int linha = tblProdutoVA.getSelectedRow();
        double somaTotal;
        double valor;

        if (linha >= 0) {
            somaTotal = Double.parseDouble(tblProdutoVA.getValueAt(linha, 2).toString());
            valor = Double.parseDouble(txtValorTotal.getText());

            txtValorTotal.setText("" + (valor - somaTotal) + "0");

            ((DefaultTableModel) tblProdutoVA.getModel()).removeRow(linha);
        }
    }//GEN-LAST:event_btnMenuExcluirActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Date dataOrcamento = new Date();
        Date dataGarantia = new Date();
        dataGarantia = dataGarantia(dataGarantia);
        try {
            txtData.setText(dateToStr(dataOrcamento));
            txtDataGarantia.setText(dateToStr(dataGarantia));
            gerIG.carregarCombo(cmbFuncionario, Funcionario.class);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(DlgVendasAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(DlgVendasAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        clienteSelecionado = gerIG.abrirBuscaCliente();

        if (clienteSelecionado != null) {
            preencherCamposCliente(clienteSelecionado);
        }
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
        String nome = txtNomeCliente.getText();
        String cpf = txtCPF.getText();
        
        Date dt_venda = new Date();
        Date dt_garantia = new Date();
        dt_garantia = dataGarantia(dt_garantia); // Avança data atual para 90 dias
        
        List<Produto> listProduto = new ArrayList();
        Produto produto = null;
        for (int i = 0; i < tblProdutoVA.getRowCount(); i++) {
            produto = (Produto) tblProdutoVA.getValueAt(i, 1);
            listProduto.add(produto);
        }
        if(listProduto.isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor Adicionar o Serviço desejado");
        }else{
            if(validarDados()){
                funcionario = (Funcionario) cmbFuncionario.getSelectedItem();
                Cliente cliente = clienteSelecionado;
                buscarStatus(); //Buscou e Selecionou o Status
                double valorTotal = Double.parseDouble(txtValorTotal.getText());
                //REALIZANDO VENDA.
                VendaAcessorio venda = new VendaAcessorio(0,nome, cpf, valorTotal, dt_venda, dt_garantia, status, cliente, funcionario, listProduto);
                
                try {
                    if (gerIG.getGerDom().cadastrarVenda(venda)){
                        JOptionPane.showMessageDialog(this, "Venda Registrada com Sucesso!\n" + "Venda:" + venda.getNomeCliente());
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Inserir Venda");
                    }
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(DlgOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        }
            
     
    }//GEN-LAST:event_btnRealizarVendaActionPerformed
/*
        if (btnGrupStatus.getSelection().getMnemonic() == 'O') {
            status = "ORÇAMENTO";
        } else {
            status = "PRODUÇÃO";
        }
        if (btnProducao.isSelected()) {
            dataIncio = txtDataInicio.getDate();
            dataConclusao = txtDataConclusao.getDate();
        }*/
    
    public void buscarStatus(){
        List<Status> listaStatus = null;
        listaStatus = gerIG.getGerDom().carregarStatus();
        if(!listaStatus.isEmpty()){
            if(buttonGroup1.getSelection().getMnemonic() == 'C'){
                //Concluido
                for(int i=0; i < listaStatus.size(); i++){
                    if(listaStatus.get(i).getNome().equals("CONCLUIDO")){
                        status = listaStatus.get(i);
                        break;
                    }
                }
                        
            }else{
                //Falta Pagamento
                for(int i=0; i < listaStatus.size(); i++){
                    if(listaStatus.get(i).getNome().equals("F. PGTO")){
                        status = listaStatus.get(i);
                        break;
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Falha ao Carregar Status");
        }
    }
    
    public boolean validarDados(){
        retornaCores();
        String msgErro = "";

        if (txtNomeCliente.getText().isEmpty() || txtCPF.getText().isEmpty()) {
            msgErro = msgErro + "Seleciona Cliente Solicitante!\n";
            lblNomeCliente.setForeground(Color.red);
            lblCPF.setForeground(Color.red);
        }
        if (cmbFuncionario.getSelectedItem().equals(null)) {
            msgErro = msgErro + "Adicione Vendedor Responsavel!\n";
            lblVendedor.setForeground(Color.red);
        } 
        if (msgErro.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro + "Favor Completar os campos!\n", "Registrar Venda", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public void retornaCores() {
        btnConcluido.setForeground(Color.black);
        btnFaltaPagamento.setForeground(Color.black);
        lblVendedor.setForeground(Color.black);
        lblNomeCliente.setForeground(Color.black);
        lblCPF.setForeground(Color.black);
    }
    
    public void valorTotal() {
        double somaTotal = 0;
        for (int i = 0; i < tblProdutoVA.getRowCount(); i++) {
            somaTotal += Double.parseDouble(tblProdutoVA.getValueAt(i, 3).toString());
        }
        txtValorTotal.setText("" + somaTotal + "0");
    }
   
    public void preencherCamposCliente(Cliente cliente) {
        txtNomeCliente.setText(cliente.getNome());
        txtCPF.setText(cliente.getCpf());
    }
    
    public Date dataGarantia(Date dataGarantia){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataGarantia);
        cal.add(Calendar.DATE, 90);
        dataGarantia = cal.getTime();
        return dataGarantia; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopMenuTabela;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JRadioButton btnConcluido;
    private javax.swing.JRadioButton btnFaltaPagamento;
    private javax.swing.JButton btnInserirProduto;
    private javax.swing.JMenuItem btnMenuExcluir;
    private javax.swing.JButton btnRealizarVenda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTable tblProdutoVA;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDataGarantia;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
