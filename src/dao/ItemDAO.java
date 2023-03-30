
package dao;

import domain.*;
import domain.Produto;
import org.hibernate.*;
import java.util.List;
import org.hibernate.criterion.Restrictions;


public class ItemDAO extends GenericDAO{
    
    private List<Produto> pesquisar ( String pesq, int tipo) throws HibernateException {
        
        Session sessao = null;
        List lista = null;

        try   {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Produto.class);
            switch (tipo) {
                case 1: consulta.add( Restrictions.like("nome", "%" + pesq+ "%") );
                        break;
                case 2: consulta.add( Restrictions.eq("nome", pesq) );          
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

    
    public List<Produto> pesquisarPorNome ( String pesq ) throws HibernateException {
        return pesquisar(pesq,1);
    }
    
    public List<Produto> pesquisaInserir ( String pesq ) throws HibernateException {
        return pesquisar(pesq,2);
    }
    
    
    
}
