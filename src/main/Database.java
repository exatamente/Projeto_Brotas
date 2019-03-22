/*
 * Classe para funcionar como o banco de dados do sistema ou um conector para o banco de dados
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author MatheusEliasC
 */

public class Database {
    public Database(){
        
    }
    public Database(String tipo){
        for(i=0;i<tipos.length;i++){
            if(tipo == tipos[i]){
                this.tipo = tipo;
                this.teste = 1;
                return;
            }
            if(teste ==1){
                System.out.println("Erro de Database... Contate a central da Diabetech!!!\n");
            }
        }
        
    }
    
    String tipos[] = {"Users"};
    ArrayList <Usuario> Users = new ArrayList<>();
    
    private String tipo;
    private int i=0,teste=0;
    
    public void criaPessoa(){
        Users.add(new Usuario());
    }
}
