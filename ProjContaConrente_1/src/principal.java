
import javax.swing.JOptionPane;


public class principal {

    public static void main(String[] args) {
        
     
        int op = 0;
        String msg = "1) Se cadastre\n"
                    + "2) veja seu cadastro\n"
                    + "3) consute seu saldo\n"
                    + "4) deposite\n"
                    + "5) saque\n"
                    + "6) sair\n";
        ContaCorente cc = new ContaCorente();
        
        
        cc.Exibir();
        while (op != 6){
            op = Integer.parseInt(JOptionPane.showInputDialog(msg + "\ndigite o numero da operação: "));
            switch (op){
                case 1:
                    String nome = JOptionPane.showInputDialog("digite seu nome: ");
                    String ba = JOptionPane.showInputDialog("digite o nome do banco: ");
                    int agen = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da agencia: "));
                    int nu_con = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da conta"));
                    
                   
                    cc.Cadastro(nome, ba, op, nu_con);
                    break;
                case 2:
                    cc.Exibir();
                    
                    break;
                case 3:
                    cc.ConsutarSaldo();
                    break;
                case 4:
                    double va = Double.parseDouble(JOptionPane.showInputDialog("digite o valor que vc quer depocitar: "));
                    cc.Depositar(va);
                    break;
                case 5:
                    double va2= Double.parseDouble(JOptionPane.showInputDialog("digite o valor que vc quer saca"));
                    cc.Sacar(va2);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "progama enserra com sucesso"); 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "valor invalido");
                    
                    
            
            }
        
        
        }
        
    }
    
}
