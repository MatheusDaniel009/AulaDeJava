
package projloginmvc;

import javax.swing.JOptionPane;


public class ControleLogin {
    
    Usuario use = new Usuario();
    
    public void logar(String login, int senha){
       use.setLogin(login);
       use.setSenha(senha);
       
       if (use.verifica()){
           new FormLogado().setVisible(true);
       }
       else {
           JOptionPane.showMessageDialog(null, "login ou senha invalida tente mais uma fez!!!");
           new FormLogin().setVisible(true);
           
       }
        
    }
}
