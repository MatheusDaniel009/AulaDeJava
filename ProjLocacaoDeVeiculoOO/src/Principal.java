
import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        
        int op = 0;
        double vlrKm = 0;
        Locacao loca = new Locacao();
        
        while (op != 5){
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1) cadastrar:"
                    + "\n2) exibir:"
                    + "\n3)valor do aaluguel:"
                    + "\n4)valor com desconto:"
                    + "\n5)sair do programa:"
                    + "\nescolha uma opção:"));
            
            switch(op){
                
                case 1:
                    loca.Cadastrar();
                    break;
                case 2:
                    loca.Exibir();
                    break;
                case 3:
                    vlrKm = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor por Km: "));
                    JOptionPane.showMessageDialog(null,"o valor  ser pago e: " + loca.CalcularAluguel(vlrKm));
                    break;
                    
                case 4:
                    if (vlrKm == 0){
                        vlrKm = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor por Km: "));
                        loca.CalcularDesconto(loca.CalcularAluguel(vlrKm));
                    } 
                    else{
                        
                        loca.CalcularDesconto(loca.CalcularAluguel(vlrKm));
                    }
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "o programa sera fechado");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "escolha uma opção valida!!!");
                    break;
            }
        }

    }
    
}
