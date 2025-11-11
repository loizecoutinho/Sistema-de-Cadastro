/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final String PERSISTENCE_UNIT_NAME = "aluno";
    private static EntityManagerFactory factory;
    //executado apenas uma vez
    static {
        try {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            
        } catch (Throwable ex) {
            System.err.println("Falha ao criar o EntityManagerFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * Método público que será usado para pegar a fábrica
     * que foi criada
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }
}
