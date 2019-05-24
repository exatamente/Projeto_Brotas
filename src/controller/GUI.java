/**
 * 
 */
package controller;

import java.util.Scanner;
import main.Database;
import view.Inicial;
import view.Login;
import view.cadastro;
import view.fichaCadastro;

/**
 * Classe GUI estende a classe Graficos.java contendo métodos para instanciar e manipular as janelas.
 * @author MatheusElias - coder
*/
public class GUI{
  
  public GUI(){
    /*
    Ver.:0.4
    
    @RenanMartins2
    Construtor - GUI
    Esse construtor será responsável pela interface gráfica do usuário
    seria a parte de interação com o usuário.
    Ela não terá parâmetros pois ela apenas irá chamar os métodos da classe.
    
    */ 

  }
  static Scanner input = new Scanner(System.in);
  static Database db = new Database();
  static Inicial telaInicial;
  static cadastro telaCadastro;
  static fichaCadastro telaFichaC;
  static Login telaLogin;

  public void renderScreen(int i){
      if(i ==0){
          telaInicial = new Inicial();
          telaInicial.setVisible(true);
      }
      else if(i==1){
          telaCadastro = new cadastro();
          telaCadastro.setVisible(true);
      }
      else if (i==2){
          telaFichaC = new fichaCadastro();
          telaFichaC.setVisible(true);
      }
      else if (i==3){
          telaLogin = new Login();
          telaLogin.setVisible(true);
      }
  }
  
    public void closeScreen(int i){
      if(i ==0){
          telaInicial.setVisible(false);
      }
      else if(i==1){
          telaCadastro.setVisible(false);
      }
      else if (i==2){
          telaFichaC.setVisible(false);
      }
      else if (i==3){
          telaLogin.setVisible(false);
      }
  }
  
  public void getInitialButtonPressed(int i){
      if(i==1){
          renderScreen(1);
          closeScreen(0);
      }
      else if(i==2){
          renderScreen(3);
          closeScreen(0);
      }
      else if(i==3){
          
      }
      else if(i==4){
          System.exit(0);
      }
  }
  
  public void searchLogin(String login){
      if(db.procuraConta(login) != -1){
          
      }
      else{
          
      }
  }

}
