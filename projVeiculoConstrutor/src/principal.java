
import javax.swing.JOptionPane;


public class principal {

  
    public static void main(String[] args) {
        veiculo vei = new veiculo();
        vei.CalculaDesconto();
        
        JOptionPane.showMessageDialog(null, "valor do veiculo R$:" + vei.valorveiculo );
    }
    
}
