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
      Usuario u1 = new Usuario();
      u1.pegaDados();
      u1.mostraIMC(u1.getPeso(),u1.getAltura());
      
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
}

