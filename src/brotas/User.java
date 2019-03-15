package brotas;

public class User{

  private String nome;
  private float peso;
  private float altura;
  private int idade;

  private float glicemia; //taxa de açucar
  private boolean aplicouInsulina; 
  

  public void calcularIMC(){
    float imc = peso/(altura*altura);
  }

  public void coletaAtivFis(int atividade){

  }

  public void retornaRecomend(){

  }

  public void recomendaDieta(){
    
  }
 

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

}
