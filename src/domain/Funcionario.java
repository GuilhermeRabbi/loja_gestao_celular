
package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Funcionario implements Serializable{
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idFuncionario;
    
    @Column (length = 30, nullable = false)
    private String nome;
    
    @Column (updatable = false)
    @Temporal (TemporalType.DATE)
    private Date dataNasc;
    
    @Column (length = 11, nullable = false)
    private String sexo;
    
    @Column (length = 8, nullable = false)
    private String rg;
    
    @Column (length = 16, nullable = false)
    private String cpf;
    
    @Column (length = 20, nullable = false)
    private String telefone;
    
    @Column (length = 30, nullable = false)
    private String email;
    
    private int salario;
    
    @Column (updatable = false)
    @Temporal (TemporalType.DATE)
    private Date dataContratacao;
    
    private String cargo;
    private String endereco;
    private String bairro;
    private int numero;
    
    
    @OneToMany (mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<OrdemServico> ordemServico;
    
    @OneToMany (mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<VendaAcessorio> vendaAcessorio;
    
    public Funcionario(int idFuncionario, String nome, Date dataNasc, String sexo, String rg, String cpf, String telefone, String email, int salario, Date dataContratacao, String cargo, String endereco, String bairro, int numero) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.endereco = endereco;
        this.bairro = bairro;
        this.numero = numero;
        this.ordemServico = null;
    }

    public Funcionario() {
    }
    
    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    @Override
    public String toString() {
        return nome;
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] {getIdFuncionario(), this};
    }
    
    
}
