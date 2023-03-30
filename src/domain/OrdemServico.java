
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class OrdemServico implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idOS;
    
    @Column (length = 30, nullable = false)
    private String nomeCliente;
    
    @Column (length = 16, nullable = false)
    private String cpf;
    
    @Column (nullable = false)
    private double valotTotal; 
    
    @Column ( updatable = false )
    @Temporal ( TemporalType.DATE )
    private Date dataGarantia; 
    
    @Column ( updatable = false )
    @Temporal ( TemporalType.DATE )
    private Date dataInicio; 
    
    @Column ( updatable = false )
    @Temporal ( TemporalType.DATE )
    private Date dataConclusao;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idStatus")
    private Status status;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "idFuncionario")
    private Funcionario funcionario;
    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable( name = "OS_produto", 
                joinColumns = {@JoinColumn (name = "idOS")}, 
                inverseJoinColumns = {@JoinColumn(name = "idProduto")} )
    private List<Produto> produto;
                            
    public OrdemServico(int idOS, String nomeCliente, String cpf, double valotTotal,Date dataGarantia, Date dataInicio, Date dataConclusao, Status status, Cliente cliente, Funcionario funcionario, List<Produto> produto) {
        this.idOS = idOS;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.valotTotal = valotTotal;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
        this.dataGarantia = dataGarantia;
    }

    

    public OrdemServico() {
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public Date getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(Date dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValotTotal() {
        return valotTotal;
    }

    public void setValotTotal(double valotTotal) {
        this.valotTotal = valotTotal;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
 
    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    
    @Override
    public String toString() {
        return String.valueOf(getIdOS()) ;
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] {this, getFuncionario().getNome(), cliente.getIdCliente() + " - " + getNomeCliente() ,getDataConclusao(), getValotTotal(), status.getNome()};
    }
    /*
    public Object[] toArrayBusca() throws ParseException {
        return new Object[] {this, getNomeCliente(), getCarro().getPlaca() ,getCarro().getRenavam(), getStatus()};
    }
    */
    public Object[] toArrayJanCliente() throws ParseException {
        return new Object[] {this, getFuncionario().getNome(), getDataGarantia().toString() ,getValotTotal(), getStatus().getNome()};
    }
    
    public Object[] toArrayJanCarro() throws ParseException {
        return new Object[] {this, getNomeCliente(), getCpf(), getStatus() , getValotTotal()};
    }
    
    
    
    
}
