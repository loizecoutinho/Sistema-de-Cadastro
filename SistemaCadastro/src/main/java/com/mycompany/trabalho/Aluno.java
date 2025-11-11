/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import java.io.Serializable;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {

    @Id
    @Column(name = "Matricula")
    private String matr;
    
    @Column(nullable = false)
    private int idade;
    
    @Column(nullable = false)
    private String cpf;
    
    @Column(nullable = false)
    private String telefone;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private LocalDate dataNasc; //formato:2007-12-03
    
    //formatação para a data
    @Transient //estava dando erro no banco de dados
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //para formato pt_br
    
    public Aluno(){
        
    }
    
    //construtor
    public Aluno(String matr, String nome, LocalDate dataNasc, String telefone, String cpf, int idade) {
            this.matr = matr;
            this.nome = nome;
            this.dataNasc = dataNasc;
            this.telefone = telefone;
            this.cpf = cpf;
            this.idade = idade;
    }
    
    //getters
    public String getMatr(){   return matr;    }

    public String getTelefone(){    return telefone;   }
    
    public String getCpf(){    return cpf; }
    
    public int getIdade(){      return idade;   }    
    
    public String getNome(){    return nome;    }
    
    public String getDataNasc(){    return String.format(dataNasc.format(fmt)); }
    
    //setters
    public void setMatr(String matr){    this.matr = matr; }
    
    public void setTelefone(String telefone){    this.telefone = telefone; }
    
    public void setCpf(String cpf){    this.cpf = cpf; }

    public void setIdade(int idade){    this.idade = idade; }
    
    public void setNome(String nome){    this.nome = nome;  }    
    
    public void setDataNasc(LocalDate dataNasc){    this.dataNasc = dataNasc;   }
    
    // para remoção correta!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
        Aluno a = (Aluno) o;
        return Objects.equals(matr, a.matr);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(matr);
    }
    
}

