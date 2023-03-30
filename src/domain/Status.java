/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Status implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idStatus;
    
    private String nome;
    
    @OneToMany (mappedBy = "status", fetch = FetchType.LAZY)
    private List<OrdemServico> ordemServico;
    
    @OneToMany (mappedBy = "status", fetch = FetchType.LAZY)
    private List<VendaAcessorio> vendaAcessorio;  

    public Status() {
    }

    public Status(int idStatus, String nome) {
        this.idStatus = idStatus;
        this.nome = nome;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
