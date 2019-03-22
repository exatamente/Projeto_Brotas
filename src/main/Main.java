/**
*@EdgarGomes(exatamente) - code Owner 
*@MatheusElias - coder , project idealizer
*@JuanManuel(Juan_Pascual) - idea developer
*@RenanMartins(RenanMartins2) - co-coder
*
*Projeto Brotas
*Resumo de Descrição: Aplicativo para monitoramento de diabetes.
*Versão:  0.4
*
*Project Brotas
*Description Summary: Diabetes monitoring application.
*Version: 0.4
*/
package main;


import java.util.Scanner;

class Main {
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
      Scanner menu = new Scanner(System.in);
      int choice;
        do {
            //menu();
            choice = menu.nextInt();
            // ...
        } while(choice != 4);
      
      //Adicionar seção de login. by: Matheus
      
      
      //Iniciando Banco de Dados
      Database db = new Database("Users");
      
      db.Users.get(0).pegaDados();
      db.Users.get(0).mostraIMC(db.Users.get(0).getPeso(),db.Users.get(0).getAltura());
      //aaaaaaaaaaaaaaaa
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
  /*public static void menu(){
  System.out.println("Seja bem vindo usuário" + Por favor, escolha uma opção...\n");      
  System.out.println("1 - \n");      
  }*/
}

