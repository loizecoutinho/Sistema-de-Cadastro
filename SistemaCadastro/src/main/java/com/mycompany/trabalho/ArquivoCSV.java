/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ArquivoCSV {
    private static final String NOME_ARQUIVO = "ListagemAlunos.txt";
    
    public static void salvarAluno(ArrayList<Aluno> listaAlunos){
        
        boolean arquivoExiste = new File (NOME_ARQUIVO).exists();
        
        try{
            OutputStream os = new FileOutputStream ("ListagemAlunos.txt", false);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            
            for(Aluno aluno : listaAlunos){
           //intera a llistaAlunos e o adiciona ao csv sempre que hoouver uma alteração
               if (!arquivoExiste) {
                bw.write("nome;idade;Matricula;CPF;Telefone;Data de Nascimento");
                bw.newLine(); 
            }
                String linha = aluno.getNome() + ";"+ aluno.getIdade()+";"+  aluno.getMatr()+";"          
                + aluno.getCpf() +";" + aluno.getTelefone()+";"+ aluno.getDataNasc();


                bw.write(linha);
                bw.newLine();
            }
            
            bw.close();
            osw.close();
            os.close();
        
        } catch(FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado ou permissão negada.");
        }
        catch(Exception e){
        System.out.println("Erro ao salvar");
        }
   
    }
}