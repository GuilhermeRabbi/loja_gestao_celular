
package dao;


import java.util.List;
import org.hibernate.*;


public class GenericDAO {

    public GenericDAO() {
    }
   
    public boolean inserir(Object objeto) throws Exception {
        // INSERIR NO BANCO
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
           
            sessao.save(objeto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
            return false;
        }
        return true;
    }
    

    public boolean excluir(Object objeto) throws Exception {
        // INSERIR NO BANCO
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(objeto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
            return false;
        } finally {
            if (sessao != null) {
                sessao.close();
                return true;
            } else {
                return false;
            }
        }
    }
    
    
    public boolean alterarObject(Object objeto) throws Exception {
        // INSERIR NO BANCO
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(objeto);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
            return false;
        }
        return true;
    }
    
    
    public List carregarTodosIndex(Class classe) throws HibernateException{
        // INSERIR NO BANCO
        Session sessao = null;
        List lista = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            Criteria consulta = sessao.createCriteria(classe);
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException he) {
            if (sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(he);
        }
        return lista;
    }

    
    
}
