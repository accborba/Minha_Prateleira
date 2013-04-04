/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.siscursos.lacunas;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class GeradorDeNomesDeMusicas {
    
    private static String[] comeco = {
        "O canto ",
        "Amor ",
        "O Rock ",
        "Não há nada ",
        "Coração ",
        "Falacias ",
        "Fotografias ",
        "A mão ",
        "A lua",
            
     
    };
    
    private static String[] meio = {
        "da cidade ",
        "da alma ",
        "do bom jovem ",
        "da pastorinha ",
        "da infância ",
        "de cristal "
    };
    
    private static String[] fim = {
        "alegre ",
        "sagaz ",
        "azul",
        "infiel",
        "real",
        "bela"
    };
    
    public static void main(String[] args) {
        Random x = new Random();
        for (int i = 0; i < 10; i++) {
            int a = x.nextInt(comeco.length);
            String primeira = comeco[a];
            int b = x.nextInt(meio.length);
            String segunda = meio[b];
            int c = x.nextInt(fim.length);
            String terceira = fim[c];
            System.out.println(primeira+segunda+terceira);
            
            
            
        }
    }
    
}
