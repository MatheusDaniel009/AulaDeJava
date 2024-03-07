
package projcalculaimpostooo;

import javax.swing.JOptionPane;

public class ProjCalculaImpostoOO {

   
    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        double  inp = 0;
        int op = 0;
        

        while (op != 5){
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "1) cadastre-se:"
                    + "\n2) exibir:"
                    + "\n3) valor do imposto:"
                    + "\n4) valor do desconto:"
                    + "\n5) sair do programa:"
                    + "\nescolha uma opção: "));
            
            switch (op){
                case 1:
                    fun.Cadastrar();
                    break;
                case 2:
                    fun.Exibir();
                    break;
                case 3:
                    inp = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do imposto"));
                    JOptionPane.showMessageDialog(null, "o valor do imposto e: "+ fun.CalcularImposto(inp));
                    break;
                case 4:
                    if (inp == 0){
                        inp = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do imposto"));
                        fun.CalcularDesconto(fun.CalcularImposto(inp));
                    }
                    else {
                        
                        fun.CalcularDesconto(fun.CalcularImposto(inp));
                    }
                    
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "o programa sera fechado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "digite um valor valido!!!");
                    break;
            }
        }
        
        
        
        
        
        
        
    }
    
}
