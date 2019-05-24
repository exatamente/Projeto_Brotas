/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import main.Database;
import view.Inicial;
import view.Login;
import view.LoginAnonimo;
import view.MenuLogado;
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
  static MenuLogado telaMenuLog;
  
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
      }else if (i==5){
          telaMenuLog = new MenuLogado();
          telaMenuLog.setVisible(true);
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
      }else if (i==5){
          telaMenuLog.setVisible(false);
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
          telaFichaC.setText(login);
          
      }
  }
  
  public void getNewUserInfo(ArrayList <String> dados){
      db.criaConta(login, dados.get(0), dados.get(2), Integer.parseInt(dados.get(3)), Double.parseDouble(dados.get(5)), Double.parseDouble(dados.get(4)), dados.get(6));
      JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
      renderScreen(5);
      closeScreen(2);
  }
  public void getLoggedButtonPressed(int i){
      if(i==1){
          JOptionPane.showMessageDialog(null, "Calendario inativo pelo momento.");
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

}
