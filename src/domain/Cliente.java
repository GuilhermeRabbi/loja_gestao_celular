package domain;

import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import javax.persistence.*;



@Entity
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    @Column (length = 40, nullable = false)
    private String nome;
    
    
    @Column ( updatable = false, length = 14, nullable = false)
    private String cpf;
    
    @Column (length = 20, nullable = false)
    private String telefone;
    
    private String cep;
    private String cidade;
    private int numero;
    private String bairro;
    private String logradouro;
    
    
    @OneToMany (mappedBy = "cliente", fetch = FetchType.LAZY )
    private List<OrdemServico> ordemservico;
    
    @OneToMany (mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<VendaAcessorio> vendaAcessorio;

    public Cliente(int idCliente, String nome, String cpf, String telefone, String cep, String cidade, int numero, String bairro, String logradouro) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.ordemservico = null;
    }

    public Cliente() {
    }

    public List<OrdemServico> getOrdemservico() {
        return ordemservico;
    }

    public void setOrdemservico(List<OrdemServico> ordemservico) {
        this.ordemservico = ordemservico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] {getIdCliente(), this, getCpf()};
    }

    
    
    

}
