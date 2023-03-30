/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author guilh
 */
public class VendaAcessorioDAO extends GenericDAO{
    
    
    private List<VendaAcessorio> pesquisar ( String pesq, int tipo) throws HibernateException {
        
        Session sessao = null;
        List lista = null;

        try   {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(VendaAcessorio.class);
            consulta.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
            switch (tipo) {
                case 1: consulta.createAlias("status", "S");
                        consulta.add( Restrictions.like ("S.nome", pesq) );
                    break;
                case 2: 
                    consulta.add( Restrictions.eq("status", "ORÇAMENTO") );
                    consulta.add( Restrictions.like("cpf", pesq+"%") );
                    break;
                case 3: consulta.add( Restrictions.eq ("status.nome", "F. PGTO") );
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
    
    
    public List<VendaAcessorio> pesquisarTodosPeloCliente(String pesq) {
        return pesquisar(pesq, 4);
    }
    
    public List<VendaAcessorio> pesquisarOrdemProducao() throws HibernateException {
        List<VendaAcessorio> lista = new ArrayList();
        
        lista = pesquisar("S",3);
        
        return lista; 
    }
}
