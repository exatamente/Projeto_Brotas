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


import java.util.Scanner;

class Main {
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
      System.out.printf("NOTA: Adicionar tela de login...\n");
      
      int choice = 0;
        do {
            printMenuLogin();
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Você escolheu a opção: 1 - Cadastro de usuário.\n");
                    db.cadastra();
                    if(db.cadastra()){
                        
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu a opção: 2 - Login de usuário.\n");
                    System.out.println("Digite seu login: \n");
                    if(db.login(input.nextLine())){
                                                
                    }
                    break;
                    
                case 3:
                    System.out.println("Você escolheu a opção: 3 - Login anônimo.\n");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção: 4 - Sair.\n");
                    System.out.println("Até mais.");
                    break;
                default:
                    System.out.println("Opção não encontrada! Tente novamente");
                    
            }
        } while(choice != 4);
      
      //Adicionar seção de login. by: Matheus
      
      
      //Iniciando Banco de Dados
      /*Database db = new Database("Users");
      
      db.Users.get(0).pegaDados();
      db.Users.get(0).mostraIMC(db.Users.get(0).getPeso(),db.Users.get(0).getAltura());
      //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*/
    /*
    PARA TESTES
    Scanner input = new Scanner(System.in);
    User paciente = new User();
    
    
    System.out.println("Digite o nome do paciente: ");
    String nome = input.nextLine();
    System.out.println("Digite o peso do paciente:");
    float peso = input.nextFloat();
    System.out.println("Digite a altura do paciente:");
    float altura = input.nextFloat();
    System.out.println("Digite a glicemia do paciente: ");
    float glicemia = input.nextFloat();
    paciente.setAltura(altura);
    paciente.setGlicemia(glicemia);
    paciente.setPeso(peso);
    */


    // construtor App() instancia todas as outras classes contruindo a aplicação
    //App();
  }
  
  public static void printMenuLogin(){
    System.out.println("Seja bem vindo usuário. Por favor, escolha uma opção...\n");      
    System.out.println("1 -  Cadastro de usuário.\n");      
    System.out.println("2 -  Login de usuário.\n");
    System.out.println("3 -  Login anônimo.\n");
    System.out.println("4 -  Sair.\n");
  }
  //Isto abaixo será substituido no Database
  /*public static void cadastra(){
      System.out.println("Crie um login: (Exemplo: unifmcruz) \n");
      String login = input.nextLine();
      String senha, senha2;
      boolean voltar = false;
      
      do{
        System.out.println("Crie uma senha: (Exemplo: diabetech123) \n");
        senha = input.nextLine();
        System.out.println("Digite a senha novamente: (Exemplo: diabetech123) \n");
        senha2 = input.nextLine();
        if(senha.equals(senha2) == false){
                System.out.println("Você digitou senhas diferentes, faça de novo ☺\n");
                voltar = true;
            }
      }while(voltar == false);
      db.criaPessoa(login, senha);
      System.out.println("Usuário " + login + " criado com sucesso!\n");
  }
  
  public static boolean loga(String login, String senha){
      //continuar... matheus  
      db.procuraPessoa(login);
      
      return false;
  }*/
}

