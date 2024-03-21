
package projconstrutor;

import javax.swing.JOptionPane;


public class principal {

   
    public static void main(String[] args) {
        Aluno al = new Aluno();
        
        JOptionPane.showMessageDialog(null, "nome: " + al.nome + 
                "\nrga: " + al.rga);
    }
    
}
