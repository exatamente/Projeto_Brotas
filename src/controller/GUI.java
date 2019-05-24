/**
 * 
 */
package controller;

import java.util.Scanner;
import javax.swing.JOptionPane;
import main.Database;
import view.Inicial;
import view.Login;
import view.LoginAnonimo;
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
  static LoginAnonimo telaLoginAn;
  
  static String login;
  static String senha;

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
      else if (i==4){
          telaLoginAn = new LoginAnonimo();
          telaLoginAn.setVisible(true);
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
      else if(i==4){
          telaLoginAn.setVisible(false);
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
          renderScreen(4);
          closeScreen(0);
      }
      else if(i==4){
          System.exit(0);
      }
  }
  
  public void searchLoginCadastro(String login){
      if(db.procuraConta(login) != -1){
          JOptionPane.showMessageDialog(telaCadastro, "Login já utilizado!", "Erro", JOptionPane.ERROR_MESSAGE, null);
      }
      else{
          this.login = login;
          renderScreen(2);
          closeScreen(1);
          
      }
  }

}
