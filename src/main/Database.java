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
import java.util.Calendar;

/**
 *
 * @author MatheusEliasC
 */

public class Database {
    Pessoa anonimo;
    public Database(){
        
    }
    public Database(String tipo){
        for(i=0;i<tipos.length;i++){
            if(tipo.equals(tipos[i])){
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
        Users.add(new Usuario(login, senha));
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
        //System.out.println(Users.);
        if(existe > -1){
            System.out.println("Seja bem vindo, seu nome é "+Users.get(existe).getNome() + " ?, se sim digite 'Sim', ou digite 'Não' para voltar.");
            boolean refazer = false;
            do{
                refazer = false;
                String opc = input.nextLine();
                if(opc.toLowerCase().contains("s")){}
                else if(opc.toLowerCase().contains("n")){
                    System.out.println("Voltando ao menu.");
                    return false;
                }
                else{
                    System.out.println("Opção de resposta inválida. Tente novamente.");
                    refazer = true;
                    System.out.println("Digite 'Sim' se seu nome é: " + Users.get(i).getNome() + " ou 'Não' para voltar.");
                }
            }while(refazer == true);
            
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
    
    public boolean cadastra(){
        System.out.println("Bem vindo ao sistema de cadastro!");
        System.out.println("Digite um login.");
        String login = input.nextLine();
        int existe = procuraConta(login);
        if(existe > -1){
            System.out.println("login: " + Users.get(existe).getNome() + " já pertence ao banco de dados, deseja realizar login? Digite 'Sim' ou 'Não'.");
            boolean refazer = false;    
            do{
                refazer = false;
                if(input.nextLine().contains("Sim")){
                    System.out.println("Voltando ao menu.");
                    return false;
                }
                else if(input.nextLine().contains("Não")){
                    System.out.println(" Digite outro login para cadastro.");
                    login = input.nextLine();
                    if(procuraConta(login)>=1){
                        System.out.println("Conta ja existente, voltando ao menu.");
                        return false;
                    }
                    else{}
                }
                
                else{
                    System.out.println("Opção de resposta inválida. Tente novamente.");
                    refazer = true;
                    System.out.println("Digite 'Sim' se seu nome é: " + Users.get(i).getNome() + " ou 'Não' para voltar.");
                }
            }while(refazer = true);
        }
        else{
            System.out.println("Login criado com sucesso!");
        }
        String senha;
        boolean refazerSenha = false;
        do{
            refazerSenha = false;
            System.out.println("Digite uma senha!");
            senha = input.nextLine();
            System.out.println("Digite novamente sua senha!");
            String confirmaSenha = input.nextLine();
            
            if(senha.equals(confirmaSenha)){
                System.out.println("Senha criada com sucesso.");
                refazerSenha = false;
            }
            else{
                System.out.println("Suas senhas não conferem, tente novamente.");
                refazerSenha = true;
            }
        }while(refazerSenha == true);
        System.out.println("LOGIN: "+login);
        criaConta(login,senha);
        pegaDados(Users.size() - 1);
        System.out.println("Parabéns, você esta cadastrado com sucesso!");
        return true;
    }
    
    public void pegaDados(int i){
      
      System.out.printf("Digite o seu nome completo:\n");
      String nome = input.nextLine();
      Users.get(i).setNome(nome);//
      System.out.printf("Digite o seu email:\n");
      String email = input.nextLine();
      Users.get(i).setEmail(email);
  }
    
    
    
    //Login anônimo
    public void loginAnonimo(){
        int idade = 0;
        double glicemia = 0;
        System.out.println("Bem - vindo ao Diabetech!");
        System.out.println("Insira sua glicemia (mg/dL): ");
        glicemia = input.nextDouble();
        if(glicemia < 70){
            System.out.println("Consulte um médico você pode estar hipoglicêmico");
        }
        if(glicemia >= 70 && glicemia <= 100){
            System.out.println("Sua glicemia está estável");
        }
        else if(glicemia >= 100 && glicemia <= 140){
            System.out.println("Consulte um médico você pode estar hiperglicêmico");
        }
        else if(glicemia > 140){
            System.out.println("Vá ao médico, a sua glicemia está muito acima do normal");
        }
        
        
        
        
    }
    
}
