/*
 * Classe para funcionar como o banco de dados do sistema ou um conector para o banco de dados
 */
package main;

import java.awt.List;

/**
 *
 * @author MatheusEliasC
 */

public class Database {
    public Database(){
        
    }
    public Database(String tipo){
        
        this.tipo = tipo;
    }
    List tipos = new List(2);
    //aaaa
    
    private String tipo;
}
