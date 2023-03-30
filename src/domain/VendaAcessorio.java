/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VendaAcessorio implements Serializable  {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVA;
    
    @Column (length = 30, nullable = false)
    private String nomeCliente;
    
    @Column (length = 16, nullable = false)
    private String cpf;
    
    @Column (nullable = false)
    private double valotTotal;
    
    @Column ( updatable = false )
    @Temporal ( TemporalType.DATE )
    private Date dataVenda; 
    
    @Column ( updatable = false )
    @Temporal ( TemporalType.DATE )
    private Date dataGarantia; 
    
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
    @JoinTable( name = "VendaAss_Produto", 
                joinColumns = {@JoinColumn (name = "idVA")}, 
                inverseJoinColumns = {@JoinColumn(name = "idProduto")} )
    private List<Produto> produto;

    public VendaAcessorio() {
    }

    public VendaAcessorio(int idVA, String nomeCliente, String cpf, double valotTotal, Date dataVenda, Date dataGarantia, Status status, Cliente cliente, Funcionario funcionario, List<Produto> produto) {
        this.idVA = idVA;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.valotTotal = valotTotal;
        this.dataVenda = dataVenda;
        this.dataGarantia = dataGarantia;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
    }

    public int getIdVA() {
        return idVA;
    }

    public void setIdVA(int idVA) {
        this.idVA = idVA;
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

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(Date dataGarantia) {
        this.dataGarantia = dataGarantia;
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
        return String.valueOf(getIdVA()) ;
    }
    public Object[] toArrayJanCliente() throws ParseException {
        return new Object[] {this, getFuncionario().getNome(), getDataGarantia().toString() ,getValotTotal(), getStatus().getNome()};
    }

    
    
    
}


