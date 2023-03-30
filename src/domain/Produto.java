
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import javax.persistence.*;


@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idProduto;
    
    @Column (length = 50)
    private String nome;
    
    private double valorCusto;
    
    private double valorVenda;
    
    private int qtd_estoque;
    
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "OS_Produto", 
                joinColumns = {@JoinColumn (name = "idProduto")}, 
                inverseJoinColumns = {@JoinColumn(name = "idOS")} )
    private List<OrdemServico> ordemservico;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "VendaAss_Produto", 
                joinColumns = {@JoinColumn (name = "idProduto")}, 
                inverseJoinColumns = {@JoinColumn(name = "idVA")} )
    private List<VendaAcessorio> venda_acessorio;

    
    //Hibernate
    public Produto() {
    }
    
    public Produto(int idProduto, String nome, double valorCusto, double valorVenda, int qtd_estoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.qtd_estoque = qtd_estoque;
    }
    

    public List<OrdemServico> getOrdemservico() {
        return ordemservico;
    }

    public void setOrdemservico(List<OrdemServico> ordemservico) {
        this.ordemservico = ordemservico;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

   
    
    @Override
    public String toString() {
        return nome;
    }
    public Object[] toArrayOS() throws ParseException {
        return new Object[] {getIdProduto(), this,getValorVenda(), getQtd_estoque()};
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] {getIdProduto(), this, getValorCusto(), getValorVenda() ,getQtd_estoque()};
    }
    
    
}
