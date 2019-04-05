/*
@MatheusElias - coder

Classe Usuario instancia o usuario assim como os metodos para operações internas da aplicação.

*/

package main;

import java.util.Scanner;

public class Usuario extends Pessoa implements Alimentacao{
    Scanner input = new Scanner(System.in);
  //Parâmetros: String nome,int idade, float peso, float altura
  public Usuario(String login, String senha){
    /*
    Ver.:0.4

    Construtor - Usuário
    Responsável por dar valor as váriaveis privadas nome, peso, altura, idade, glicemia e também a variável booleana aplicouInsulina
    que irá verificar se o paciente tomou insulina(true) ou não(false).
    
    */
    
    super();
    this.login = login;
    this.senha = senha;
      
    
  }

  private String email;
  private String login;
  private String senha;
  private String telefone;
  private double resultados;
  
  private float glicemia; //taxa de açucar
  private boolean aplicouInsulina; 
  
  /* calcularIMC() utiliza o peso e a altura do usuário fornecidas anteriormente para o calculo do IMC(Índice de Massa Muscular).*/
  public void mostraIMC(double peso,double altura){
    double imc = peso/Math.pow(altura, 2);
    System.out.printf("Seu Indíce de Massa Muscular ideal é igual a: %.2f\n", imc);
  }

  /* coletaAtivFis() resgata diariamente a quantidade/medida de atividade praticada pelo usuário. */
  public void coletaAtivFis(int atividade){

  }
  
  
  
  public double calculaCarboidratos(){
    
  }
  
  public void recomendacoes(double resultados){
      
  }
  
  public void coletaAlimentos(){
      
  }
  
 
  
  /* retornaRecomend(), responsável por calcular a melhor recomendação, conforme o desenvolvimento do usuário. */
 // public void retornaRecomend(){;
//
  //}

  /* recomendaDieta() responsável por avaliar o desenpenho conforme as refeições do usuário e, assim recomendar uma dieta possivelmente adequada.*/
//  public void recomendaDieta(){
//    
//  }
  
  public void pegaDados(String email, String login, String senha){
      System.out.printf("Digite o seu email:\n");
      email = input.nextLine();
      System.out.printf("Digite o seu login:\n");
      login = input.nextLine();
      System.out.printf("Digite uma senha:(Você precisará dela para realizar login)\n");
      senha = input.nextLine();
      System.out.printf("Digite o seu número de telefone:\n");
      telefone = input.nextLine();
  }

  

  //GETTERS e SETTERS
  public void setGlicemia(float glicemia){
    this.glicemia = glicemia;
  }
  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
  
      

  //FIM DOS GETTERS E SETTERS
}
