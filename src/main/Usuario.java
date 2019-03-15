/*
@MatheusElias - coder

Classe Usuario instancia o usuario assim como os metodos para operações internas da aplicação.

*/

package main;
public class Usuario extends Pessoa{
  //Parâmetros: String nome,int idade, float peso, float altura
  Usuario(){
    /*
    Ver.:0.4

    Construtor - Usuário
    Responsável por dar valor as váriaveis privadas nome, peso, altura, idade, glicemia e também a variável booleana aplicouInsulina
    que irá verificar se o paciente tomou insulina(true) ou não(false).
    
    */
    
    super();
    
    
  }

  private String email;
  private String login;
  private String senha;
  private String telefone;
  
  
  private float glicemia; //taxa de açucar
  private boolean aplicouInsulina; 
  
  /* calcularIMC() utiliza o peso e a altura do usuário fornecidas anteriormente para o calculo do IMC(Índice de Massa Muscular).*/
  public void calcularIMC(){
    double imc = getPeso()/(getAltura()*getAltura());
  }

  /* coletaAtivFis() resgata diariamente a quantidade/medida de atividade praticada pelo usuário. */
  public void coletaAtivFis(int atividade){

  }

  /* retornaRecomend(), responsável por calcular a melhor recomendação, conforme o desenvolvimento do usuário. */
  public void retornaRecomend(){

  }

  /* recomendaDieta() responsável por avaliar o desenpenho conforme as refeições do usuário e, assim recomendar uma dieta possivelmente adequada.*/
  public void recomendaDieta(){
    
  }

  /*void recomendacoes(){

    if(getGlicemia() < 70){

      System.out.println("Taxa de jejum abaixo, cuidado aumente o consumo de carboidratos.");
    }

    else if(getGlicemia() <= 110 && getGlicemia() >= 70){
      System.out.println("Taxa de jejum normal, tome cuidado e mantenha uma alimentação saúdavel.");
    }

    else if(getGlicemia() > 110 && getGlicemia() <= 125){
      System.out.println("Taxa de jejum alterada, diminua o consumo de carboidratos.");
    }

    else if(getGlicemia() > 125){
      System.out.println("Procure um médico imediatamente, glicemia muito acima do normal.");
    }
  }*/

  //GETTERS e SETTERS
  public void setGlicemia(float glicemia){
    this.glicemia = glicemia;
  }

  //FIM DOS GETTERS E SETTERS
  
}