/**
*Projeto Brotas
*Resumo de Descrição: Aplicativo para monitoramento de diabetes.
*Versão:  0.4
*
*Project Brotas
*Description Summary: Diabetes monitoring application.
*Version: 0.4 
*
*@EdgarGomes(exatamente) - code Owner 
*@MatheusElias - coder , project idealizer
*@JuanManuel(Juan_Pascual) - idea developer
*@RenanMartins(RenanMartins2) - co-coder
*
*/
package main;


import java.util.Date;
import java.util.Scanner;

class Main {
  static String login;
  static Scanner input = new Scanner(System.in);
  static Database db = new Database();
  public static void main(String[] args) {
    
      /**
       * @RenanMartins
      
       * As estruturas de dados ajudam no armazenamento de informações, de algumas formas específicas como
       * lista, pilha, vetor, etc.
       * O Arraylist é uma classe que vai ser utilizada para criação do banco de dados do usuário, com
       * implementação no aplicativo de forma a salvar os dados do programa a fins de calcular o progresso periódico do usuário.
       */ 
      System.out.printf("Bem vindo ao Diabetech, seu aplicativo de monitoramento!\n");
      System.out.printf("Nossa motivação é a sua preocupação.\n");
      System.out.printf("Carregando a tela de login...\n");
                 
      String choice;
        do {
            printMenuLogin();
            choice = input.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Você escolheu a opção: 1 - Cadastro de usuário.\n");
                    if(db.cadastra()){
                      usuarioLogado();                            
                    }
                    break;
                case "2":
                    System.out.println("Você escolheu a opção: 2 - Login de usuário.\n");
                    System.out.println("Digite seu login: \n");
                    login = input.nextLine();
                    if(db.login(login)){
                      usuarioLogado();                          
                    }
                    break;
                    
                case "3":
                    System.out.println("Você escolheu a opção: 3 - Login anônimo.\n");
                    db.loginAnonimo();
                    break;
                case "4":
                    System.out.println("Você escolheu a opção: 4 - Sair.\n");
                    System.out.println("Até mais.");
                    break;
                default:
                    System.out.println("Opção não encontrada! Tente novamente");
                    
            }
        } while(!choice.equals("4"));
         
  }
  
  public static void usuarioLogado(){
      System.out.println("Bem vindo "+ login + " .");
      String choice ;
      do{
          printMenuFuncionalidades();
          choice = input.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Você escolheu a opção: 1 - Mostrar calendário.\n");
                    break;
                case "2":
                    System.out.println("Você escolheu a opção: 2 - Atualizar dados.\n");
                    break;
                case "3":
                    System.out.println("Você escolheu a opção: 3 - Mostrar dicas.\n");
                    break;
                default:
                    System.out.println("Opção não encontrada! Tente novamente");
            }
      }while(!choice.equals("4"));
  }
  
  public static void printMenuLogin(){
    System.out.println("Seja bem vindo usuário. Por favor, escolha uma opção...\n");      
    System.out.println("1 -  Cadastro de usuário.\n");      
    System.out.println("2 -  Login de usuário.\n");
    System.out.println("3 -  Login anônimo.\n");
    System.out.println("4 -  Sair.\n");
  }
  public static void printMenuFuncionalidades(){
    System.out.println("Por favor, escolha uma opção...\n");      
    System.out.println("1 -  Mostrar calendário.\n");      
    System.out.println("2 -  Atualizar dados.\n");
    System.out.println("3 -  Mostrar dicas.\n");
    System.out.println("4 -  Sair.\n");
  }
}

