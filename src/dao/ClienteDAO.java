package dao;

import domain.Cliente;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

public class ClienteDAO extends GenericDAO {

    private List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException {

        Session sessao = null;
        List lista = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.getTransaction().begin();

            Criteria consulta = sessao.createCriteria(Cliente.class);
            switch (tipo) {
                case 1:
                    consulta.add(Restrictions.like("nome", "%" + pesq + "%"));
                    break;
                case 2:
                    consulta.add(Restrictions.like("cpf", "%" + pesq + "%"));
                    break;
                case 3:
                    consulta.add(Restrictions.eq("idCliente", Integer.parseInt(pesq)));
                    break;
                default:
                        break;

            }
            lista = consulta.list();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;
    }

    public List<Cliente> pesquisarPorNome(String pesq) throws HibernateException {
        return pesquisar(pesq, 1);
    }

    public List<Cliente> pesquisarPorCPF(String pesq) throws HibernateException {
        return pesquisar(pesq, 2);
    }

    public List<Cliente> pesquisarPorId(String pesq) throws HibernateException {
        return pesquisar(pesq, 3);
    }

    public List<Cliente> pesquisarInserir(String pesq) throws HibernateException {
        return pesquisar(pesq, 4);
    }

    /*
    public boolean alterarTeste(Cliente cliente) throws Exception {
        // INSERIR NO BANCO
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(cliente);

            sessao.getTransaction().commit();
        } catch (HibernateException he) {
            sessao.getTransaction().rollback();
            return false;
        }
        return true;
    }*/
}
