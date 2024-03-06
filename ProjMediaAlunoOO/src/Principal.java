
import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        
      String nome;
      double nt1;
      double nt2;
      
      Aluno alu = new Aluno();
      
      nome = JOptionPane.showInputDialog("digite o nome do aluno: ");
      nt1 = Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota: "));
      nt2 = Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota"));
      
      alu.CadastrarAluno(nome, nt1, nt2);
      alu.ExibirAluno();
      
      double med = alu.CalcularMedia();
      JOptionPane.showMessageDialog(null, "media do " + nome + " é " + med);
      
      alu.ExibirSituacao(med);
    }
    
}
