
package projveiculoconstrutor2;

import javax.swing.JOptionPane;


public class principal {

   
    public static void main(String[] args) {
        Veiculo vei = new Veiculo(11, 50000);
        vei.CalculaDesconto();
        
        JOptionPane.showMessageDialog(null, "valor do veiculo R$:" + vei.valorveiculo );
    }
    
}
