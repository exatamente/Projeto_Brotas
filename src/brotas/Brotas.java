import java.util.Scanner;//oi gente bem vindos

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner();
    User paciente = new User();

    System.out.println("Digite o nome do paciente: ");
    nome = input.nextLine();
    System.out.println("Digite o peso do paciente:");
    peso = input.nextFloat();
    System.out.println("Digite a altura do paciente:");
    altura = input.nextAltura();
    System.out.println("Digite a glicemia do paciente: ");
    glicemia = input.nextFloat();
    paciente.setAltura(altura);
    paciente.setGlicemia(glicemia);
    paciente.setPeso(peso);
    paciente.recomendacoes();
    
  }
}

