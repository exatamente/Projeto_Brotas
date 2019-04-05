/**
 * 
 */
package main;
/**
 * 
 * Classe para funcionar como o banco de dados do sistema ou um conector para o banco de dados
 * @author MatheusElias - coder
 */
import java.util.ArrayList;
import java.util.Iterator;

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
    Iterator <Usuario> itr = Users.iterator();
    
    private String tipo;
    private int i=0,teste=0;
    
    public void criaPessoa(String login,String senha){
        Users.add(new Usuario(login,senha));
    }
    
    public int procuraPessoa(String login){
        int i=-1;
        //continuar... matheus
        /*while(itr.hasNext()){
            
            if()
        }*/
        return i;
    }
}
