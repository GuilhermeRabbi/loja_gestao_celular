
package dao;

import domain.OrdemServico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;


public class OrdemServicoDAO extends GenericDAO{
    
    
    
    
    
    private List<OrdemServico> pesquisar ( String pesq, int tipo) throws HibernateException {
        
        Session sessao = null;
        List lista = null;

        try   {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(OrdemServico.class);
            consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            switch (tipo) {
                case 1: consulta.createAlias("status", "S");
                        consulta.add( Restrictions.like ("S.nome", pesq) );
                    break;
                case 2: 
                    consulta.add( Restrictions.eq("status", "ORÇAMENTO") );
                    consulta.add( Restrictions.like("cpf", pesq+"%") );
                    break;
                case 3: consulta.createAlias("status", "S");
                        //consulta.add( Restrictions.eq ("S.nome", "PRODUÇÃO") );
                        consulta.add( Restrictions.like ("S.nome", "F. PGTO") );
                        break;
                case 4: consulta.add( Restrictions.eq ("cpf", pesq) );
                        //consulta.add( Restrictions.like ("status", "%") );
                        break;
                case 5: consulta.add( Restrictions.eq ("renavam", pesq));
                        consulta.add( Restrictions.like ("status", "%") );
                /*case 4: consulta.add( Restrictions.eq ("cpf", pesq) );*/
                default:
                    System.out.println("Fim do switch");
                    break;
            }                           
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;                             
    }
    /*----------------------------------------------
    ------------------------------------------------*/
    
    private List<OrdemServico> pesquisarRelatorio (String dataInic, String dataConc) throws HibernateException {
        
        Session sessao = null;
        List lista = null;

        try   {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();
       
            Criteria consulta = sessao.createCriteria(OrdemServico.class);
            consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            
            consulta.add(Restrictions.between("dataConclusao", dataInic, dataConc));
            consulta.add( Restrictions.eq ("status", "CONCLUIDO"));
            
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;                             
    }
    
    
    
    /*------------------------------------------------
    case 5: consulta.add( Restrictions.eq ("renavam", pesq));
            consulta.add( Restrictions.like ("status", "%") );
    ------------------------------------------------*/
    //OS.DATA >= '2016-01-01' AND OS.DATA <= '2016-01-31'
    
    
    
    
    
    public List<OrdemServico> pesquisarStatus ( String pesq ) throws HibernateException {
        return pesquisar(pesq,1);
    }
    public List<OrdemServico> pesquisarOrçamentoCPF ( String pesq ) throws HibernateException {
        return pesquisar(pesq,2);
    }
    public List<OrdemServico> pesquisarOrdemProducao () throws HibernateException {
        List<OrdemServico> lista = new ArrayList();
        //List<OrdemServico> lista2 = new ArrayList();
        lista = pesquisar("S",3);
        
        return lista; 
    }
    
    public List<OrdemServico> pesquisarTodosPeloCliente(String pesq) {
        return pesquisar(pesq, 4);
    }
    
    public List<OrdemServico> pesquisarTodosPeloCarros(String pesq) {
        return pesquisar(pesq, 5);
    }
    
    public List<OrdemServico> pesquisarRelatorios(String dataInic, String dataConc){
        return pesquisarRelatorio(dataInic, dataConc);  
    }
    
    /*
    public List<OrdemServico> pesquisarPorCPF ( String pesq ) throws HibernateException {
        return pesquisar(pesq,2);
    }*/

   
       
}
