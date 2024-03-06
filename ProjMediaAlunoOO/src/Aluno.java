
import javax.swing.JOptionPane;



public class Aluno {
    public String nome_aluno;
    public double nota1;
    public double nota2;

    
    public void CadastrarAluno(String nm, double n1, double n2){
        this.nome_aluno = nm;
        this.nota1 = n1;
        this.nota2 = n2;
        JOptionPane.showMessageDialog(null,"cadastro bem sucedido");
    }
    
    public void ExibirAluno(){
        JOptionPane.showMessageDialog(null, "nome do aluno: "+ this.nome_aluno + 
                "\nnota1: " + this.nota1 + 
                "\nnota2: " + this.nota2);
    }
    
    public double CalcularMedia(){
        double media = (this.nota1 + this.nota2)/2;
        
        return media;
    }
    
    public void ExibirSituacao(double med){
        if (med >= 5){
            JOptionPane.showMessageDialog(null, "parabens vc foi aprovado");
        }
        else {
            JOptionPane.showMessageDialog(null, "sinto muito maas vc foi reprovado");
        
        }
    
    }
}
