/*
@MatheusElias - coder

Classe Usuario instancia o usuario assim como os metodos para operações internas da aplicação.

*/

package main;
public class User{
  //Parâmetros: String nome,int idade, float peso, float altura
  User(){
    /*
    Ver.:0.4

    Construtor - Usuário
    Responsável por dar valor as váriaveis privadas nome, peso, altura, idade, glicemia e também a variável booleana aplicouInsulina
    que irá verificar se o paciente tomou insulina(true) ou não(false).
    
    */
    
    
  }
  private String nome;
  private float peso;
  private float altura;
  private int idade;
  private float glicemia; //taxa de açucar
  private boolean aplicouInsulina; 
  
  /* calcularIMC() utiliza o peso e a altura do usuário fornecidas anteriormente para o calculo do IMC(Índice de Massa Muscular).*/
  public void calcularIMC(){
    float imc = peso/(altura*altura);
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

  public void setPeso(float peso){
    this.peso = peso;
  }

  public void setAltura(float altura){
    this.altura = altura;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }
  //FIM DOS GETTERS E SETTERS
  
}