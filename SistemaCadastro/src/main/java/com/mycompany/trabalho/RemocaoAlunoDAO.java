/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import java.util.*;

public class RemocaoAlunoDAO implements AlunoDAO {
    
    @Override
    public ArrayList<Aluno> removerAluno(ArrayList<Aluno> alunos, Aluno a){
        alunos.remove(a);
        System.out.println("Aluno removido: " + a.getNome());
        return alunos;
    }
}

