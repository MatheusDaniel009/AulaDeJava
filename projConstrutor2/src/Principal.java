
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Aluno al = new Aluno("joana", 4321);
        
        JOptionPane.showMessageDialog(null, "nome: " + al.nome + 
                "\nrga: " + al.rga);
    }
    
}
