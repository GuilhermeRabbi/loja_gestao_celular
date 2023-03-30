package control;

import dao.*;
import domain.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class GerenciadorDominio {

    private OrdemServicoDAO servicoDAO;
    private ClienteDAO cliDAO;
    private FuncionarioDAO funcDAO;
    private ItemDAO itemDAO;
    private GenericDAO gernecDAO;
    private VendaAcessorioDAO acessorioDAO;

    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConexaoHibernate.getSessionFactory();
        cliDAO = new ClienteDAO();
        funcDAO = new FuncionarioDAO();
        itemDAO = new ItemDAO();
        acessorioDAO = new VendaAcessorioDAO();
        servicoDAO = new OrdemServicoDAO();
        gernecDAO = new GenericDAO();

    }

    public boolean cadastrarCliente(Cliente cliente) throws Exception {
        return gernecDAO.inserir(cliente);

    }

    public boolean cadastrarFuncionario(Funcionario funcionario) throws Exception {
        return funcDAO.inserir(funcionario);
    }

    public boolean cadastrarItem(Produto produto) throws Exception {
        return itemDAO.inserir(produto); 
    }
    
    public boolean cadastrarVenda(VendaAcessorio venda_acessorio) throws Exception{
        return gernecDAO.inserir(venda_acessorio);
    }

    

    public List<Cliente> carregarClientes(int tipo, String pesq) throws Exception {

        List<Cliente> lista = null;
        switch (tipo) {
            case 0:
                lista = cliDAO.pesquisarPorNome(pesq);
                break;
            case 1:
                lista = cliDAO.pesquisarPorCPF(pesq);
                break;
            case 2:
                if(pesq.equals("")) {
                    pesq = "1";
                }
                lista = cliDAO.pesquisarPorId(pesq);   
                break;
            case 3:
                lista = cliDAO.pesquisarInserir(pesq);
        }
        return lista;
    }

    public List<Status> carregarStatus(){
        List<Status> lista = null;
        lista = gernecDAO.carregarTodosIndex(Status.class);
        return lista;
    }
    
    

    public List<Produto> carregarItem(int tipo, String pesq) throws Exception {
        List<Produto> lista = null;
        switch (tipo) {
            case 0:
                lista = itemDAO.pesquisarPorNome(pesq);
                break;
            case 1:
                lista = itemDAO.pesquisaInserir(pesq);
                break;
            //case 2: lista = carroDAO.pesquisarPorCor(pesq); break;
        }
        return lista;
    }

    public List<VendaAcessorio> carregarVendasAcessorio(String tipo, String pesq) throws Exception {
        List<VendaAcessorio> lista = null;
        //List<OrdemServico> lista2 = null;
        
        switch (tipo) {
            case "PRODUÇÃO":
                lista = acessorioDAO.pesquisarOrdemProducao();
                break;
            /*case "CPF": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;
            case "PLACA": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;            
            case "RENAVAM": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;*/                   
            case "TODOS": lista = acessorioDAO.pesquisarTodosPeloCliente(pesq);
                    break;
            //case "TODOSCARRO": lista = servicoDAO.pesquisarTodosPeloCarros(pesq);
            //case "RELATORIO": lista = servicoDAO.pesquisarTodosPeloCarros(pesq);
            /*case 3: lista = cliDAO.pesquisarInserir(pesq); */
        }
        
        return lista;

    }
    
    
    public List<OrdemServico> carregarOrdemServico(String tipo, String pesq) throws Exception {
        List<OrdemServico> lista = null;
        //List<OrdemServico> lista2 = null;
        
        switch (tipo) {
            case "PRODUÇÃO":
                lista = (List<OrdemServico>) servicoDAO.pesquisarOrdemProducao();
                break;
            case "CPF": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;
            /*case "PLACA": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;            
            case "RENAVAM": lista = (List<OrdemServico>) servicoDAO.pesquisarOrçamentoCPF(pesq);
                    break;*/                   
            case "TODOS": lista = servicoDAO.pesquisarTodosPeloCliente(pesq);
                    break;
            case "TODOSCARRO": lista = servicoDAO.pesquisarTodosPeloCarros(pesq);
            case "RELATORIO": lista = servicoDAO.pesquisarTodosPeloCarros(pesq);
            /*case 3: lista = cliDAO.pesquisarInserir(pesq); */
        }
        
        return lista;

    }
    
    public void buscarPesquisaRelatorio(String dataInic, String dataConc){
        servicoDAO.pesquisarRelatorios(dataInic, dataConc);
    }
            

    public List listar(Class classe) throws HibernateException {
        return gernecDAO.carregarTodosIndex(classe);
    }

    public boolean alterarObj(Object obj) throws Exception {
        return gernecDAO.alterarObject(obj);
    }

    public boolean cadOrdemServico(OrdemServico ordemServico) throws Exception {
        return servicoDAO.inserir(ordemServico);
    }
    
    
}
