/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.minhaprateleira;

/**
 *
 * @author aluno
 */
public class Filmes {
    private String titulo;
    private String diretor;
    
    Filmes(String titulo){
        this.titulo = titulo;
        this.diretor = " ";
    }
    
    public static void main(String[] args){
        Filmes x = new Filmes("filme");
    }
    
}
