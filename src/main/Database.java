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
import java.util.Scanner;

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
    
    Scanner input = new Scanner(System.in);
    
    private String tipo;
    private int i=0,teste=0;
    
    public void criaConta(String login,String senha){
        Users.add(new Usuario(login,senha));
    }
    
    public int procuraConta(String login){
        //Procura de Usuários
        for(i=0;i<Users.size();i++){
            if(login.equals(Users.get(i).getLogin())){
                return i;
            }
        }
        return -1;
    }
    
    public boolean login(String login){
        int existe = procuraConta(login);
        if(existe > -1){
            System.out.println("Seja bem vindo, seu nome é "+Users.get(i).getNome() + " ?, se sim digite 'Sim', ou digite 'Não' para voltar.");
            boolean refazer = false;
            do{
                refazer = false;
                if(input.nextLine().contains("Sim")){}
                else if(input.nextLine().contains("Não")){
                    System.out.println("Voltando ao menu.");
                    return false;
                }
                else{
                    System.out.println("Opção de resposta inválida. Tente novamente.");
                    refazer = true;
                    System.out.println("Digite 'Sim' se seu nome é: "+Users.get(i).getNome() +" ou 'Não' para voltar.");
                }
            }while(refazer = true);
            
            System.out.println("Digite a sua senha.");
            String testeSenha = input.nextLine();
            if(testeSenha.equals(Users.get(i).getSenha())){
                System.out.println("Login efetuado com sucesso");
                return true;
            }
            else{
                System.out.println("Senha incorreta, tente novamente.");
                int tentativas = 2;
                for(i=0;i<tentativas;i++){
                    System.out.println("Digite a sua senha.");
                    testeSenha = input.nextLine();
                    if(testeSenha.equals(Users.get(i).getSenha())){
                        System.out.println("Login efetuado com sucesso");
                        return true;
                    }
                    else{
                        System.out.println("Senha incorreta!");
                    }
                }
                System.out.println("Limite de tentativas atingido, voltando ao menu.");
                return false;
            }
        }
        else{
            System.out.println("Usuário não encontrado, voltando ao menu.");
            return false;
        }
    }
}
