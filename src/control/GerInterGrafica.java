package control;

import window.*;
import domain.*;
import domain.Cliente;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import window.DlgItem;

public class GerInterGrafica {

    GerenciadorDominio gerDom;
    GerenciadorRelatorio gerRelatorio;
    framPrincipal frmPrinc;

    //private framPrincipal frmPrinc = null;
    private DljCadCliente cadCliente = null;
    private DlgCadFuncionario cadFuncionario = null;
    private DlgBuscaGeral buscaGeral = null;
    private DlgOrdemServico ordemServico = null;
    private DlgOrdemProducao ordemProducao = null;
    private DlgItem cadItem = null;
    private DlgBuscaCliente buscaCliente = null;
    private DlgMostrarOS mostrarOS = null;
    private DlgBuscaOS buscarOS = null;
    private DlgMostrarCliente mostrarCliente = null;
    private DlgEditarCliente editarCliente = null;
    private DlgInserirServico inserirServico = null;
    private DlgBuscarItem buscaServico = null;
    private DlgEditarServico editarServico = null;
    private DlgRelatorioVendas relatorio = null;
    private DlgVendasAcessorio vendaAcessorio = null;
    
    
    public GerInterGrafica() {
        frmPrinc = null;
        try {
            gerDom = new GerenciadorDominio();
            gerRelatorio = new GerenciadorRelatorio();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(frmPrinc, ex);
            System.out.println("ERROOOOOOOO");
            System.exit(-1);
        }
    }

    public GerenciadorRelatorio getGerRelatorio() {
        return gerRelatorio;
    }
    
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterGrafica.class).newInstance(parent, true, this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(frmPrinc, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    public void abrirJanPrincipal() {
        if (frmPrinc == null) {
            frmPrinc = new framPrincipal(this);
        }
        frmPrinc.setVisible(true);
    }

    public void abrirJanCadCliente() {
        abrirJanela(frmPrinc, cadCliente, DljCadCliente.class);
    }

    public void abrirJanCadFuncionario() {
        abrirJanela(frmPrinc, cadFuncionario, DlgCadFuncionario.class);
    }

    public void abrirBuscaGeral() {
        abrirJanela(frmPrinc, buscaGeral, DlgBuscaGeral.class);
    }
    public void abrirAlterarServico(){
        abrirJanela(frmPrinc, buscaServico, DlgBuscarItem.class);
    }
    public void abrirRelatorioVendas(){
        abrirJanela(frmPrinc, relatorio , DlgRelatorioVendas.class);
    }
    

    public Cliente abrirBuscaCliente() {
        buscaCliente = (DlgBuscaCliente) abrirJanela(frmPrinc, buscaCliente, DlgBuscaCliente.class);
        return buscaCliente.getCliSelecionado(); // Tipo cliente
    }
    public void abrirInserirServico(){
        abrirJanela(frmPrinc, inserirServico, DlgInserirServico.class);  
    }
    
    public void abrirVendaAssesorio(){
        abrirJanela(frmPrinc, vendaAcessorio, DlgVendasAcessorio.class);
    }

  
    public void abrirEditarServico(Produto produto){
        if (editarServico == null) {
            editarServico = new DlgEditarServico(frmPrinc, true, this, produto);
            editarServico.setVisible(true);
        }else{
            editarServico.setProduto(produto);
            editarServico.setVisible(true);
        }
        editarServico.setVisible(false);
    }

    public void abrirItemInsere(JTable tblItemOS) throws Exception {
        if (cadItem == null) {
            cadItem = new DlgItem(frmPrinc, true, this, tblItemOS);
            cadItem.setVisible(true);
        }else{
            cadItem.setTblItemOS(tblItemOS);
            cadItem.setVisible(true);
        }
        cadItem.setVisible(false);
    }

    public void abrirBuscaOS(){
        abrirJanela(frmPrinc, buscarOS, DlgBuscaOS.class);
    }
    
    public void abrirOrdemServico(int tipo, OrdemServico ordemServicoSelecionado) throws Exception {
        //abrirJanela(frmPrinc, ordemServico, DlgOrdemServico.class);
        
        if (ordemServico == null) {
            ordemServico = new DlgOrdemServico(frmPrinc, true, this, tipo, ordemServicoSelecionado);
            ordemServico.setVisible(true);
        }else{
            ordemServico.setTipo(tipo);
            ordemServico.setOrdemServicoSelecionada(ordemServicoSelecionado);
            ordemServico.setVisible(true);
        }
        ordemServico.setVisible(false);
    }

    public void abrirOrdemProdução() {
        abrirJanela(frmPrinc, ordemProducao, DlgOrdemProducao.class);
    }
    public void abrirMostrarCliente(Cliente cliente){
        
        if (mostrarCliente == null) {
            mostrarCliente = new DlgMostrarCliente(frmPrinc, true, this, cliente);
            mostrarCliente.setVisible(true);
            mostrarCliente.dispose();
        }else{
            mostrarCliente.setCliente(cliente);
            mostrarCliente.setVisible(true);
        }
        mostrarOS.setVisible(false);
    }
    
    public void abrirAlterarCliente(Cliente cliente){
        if (editarCliente == null) {
            editarCliente = new DlgEditarCliente(frmPrinc, true, this, cliente);
            editarCliente.setVisible(true);
            editarCliente.dispose();
        }else{
            editarCliente.setClienteSelecionado(cliente);
            editarCliente.setVisible(true);
        }
        editarCliente.setVisible(false);
    }
   
    
    public void abrirMostrarOS(OrdemServico ordemServico) {
        
        if (mostrarOS == null) {
            mostrarOS = new DlgMostrarOS(frmPrinc, true, this, ordemServico);
            mostrarOS.setVisible(true);
            mostrarOS.dispose();
        }else{
            mostrarOS.setOrdemServico(ordemServico);
            mostrarOS.setVisible(true);
        }
        mostrarOS.setVisible(false);
    }
    
  

    public boolean adicionarNovoCliente(Cliente cliente) throws Exception {
        return gerDom.cadastrarCliente(cliente);
    }

    public boolean adicionarNovoFuncionario(Funcionario funcionario) throws Exception {
        return gerDom.cadastrarFuncionario(funcionario);
    }

    public boolean inserirItem(Produto produto) throws Exception {
        return gerDom.cadastrarItem(produto);

    }
    
    

    public void carregarCombo(JComboBox combo, Class classe) throws Exception {
        List lista;
        try {
            lista = gerDom.listar(classe);
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(frmPrinc, "Erro ao carregar COMBO. " + ex);
        }

    }

    public GerenciadorDominio getGerDom() {
        return gerDom;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(framPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GerInterGrafica gerIG = new GerInterGrafica();
        gerIG.abrirJanPrincipal();

    }
/*
    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public boolean criarTabela(String novaTabela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
