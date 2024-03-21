
import javax.swing.JOptionPane;


public class Principal {

  
    public static void main(String[] args) {
        // instanciando classes
        Hospede hosp = new Hospede();
        Hospedagem hospeda = new Hospedagem();
        // variaveis
        int op= 0;
        double vl = 0;
        
        while (op != 5){
            op = Integer.parseInt( JOptionPane.showInputDialog(null,
                    "1)cadastre-se"
                    + "\n2)exibir"
                    + "\n3)valor do Checkout"
                    + "\n4)valor com desconto"
                    + "\n5)sair do programa"
                    + "\ndigite o a opção degesada: "));
            
            switch(op){
                case 1:
                    // variaveis
                    String cp;
                    int tele;
                    // pedindo para o user dar as informacao
                    hosp.nome = JOptionPane.showInputDialog(null,"digite o nome do cliente: ");
                    hosp.idade = Integer.parseInt(JOptionPane.showInputDialog(null,"digide a idade do cliente: "));
                    cp =  JOptionPane.showInputDialog(null,"digite o cpf do cliente: ");
                    tele = Integer.parseInt(JOptionPane.showInputDialog(null,"digide o telefone do cliente: "));
                    hosp.setCpf(cp);
                    hosp.setTelefone(tele);
                    break;
                case 2:
                    //mostrando as informacoes
                    JOptionPane.showMessageDialog(null,
                            "nome: " + hosp.nome + 
                            "\nidade: " + hosp.idade +
                            "\ncpf: "+ hosp.getCpf() + 
                            "\ntelefone: " + hosp.getTelefone());
                    
                    break;
                case 3:
                    //variaveis
                    double con, adi;
                    //pega os valores para calcular o Checkout
                    hospeda.numDias = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o quantos dias o cliente se hospedou: "));
                    hospeda.valorDiaria = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor da diaria: "));
                    con = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor dos consumos: "));
                    adi = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor dos adicionais: "));
                    hospeda.setAdional(adi);
                    hospeda.setCosumo(con);
                    vl = hospeda.CalculaCheckout();
                    JOptionPane.showMessageDialog(null, "o valor do Checkout é R$:" + vl);
                    
                    break;
                case 4:
                    //se o vl tiver zero para adicionar valores

                    if (vl == 0){
                     
                    //pega os valores para calcular o Checkout
                    hospeda.numDias = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o quantos dias o cliente se hospedou: "));
                    hospeda.valorDiaria = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor da diaria: "));
                    con = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor dos consumos: "));
                    adi = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor dos adicionais: "));
                    hospeda.setAdional(adi);
                    hospeda.setCosumo(con);
                    vl = hospeda.CalculaCheckout();
                    // calcula desconto se tiver
                    hosp.CalcularDesconto(vl);
                        
                    }
                    else{
                        // calcula desconto se tiver
                        hosp.CalcularDesconto(vl);
                    }
                    
                    break;
                case 5:
                    //para fechar o programa
                    JOptionPane.showMessageDialog(null,"o programa vai se fechar!!!");
                    
                    
                    break;
                default:
                    // caso o user digite um valor que nao esta no switch
                    JOptionPane.showMessageDialog(null,"digite um numero valido!!!");
                    break;
            
                
            }
            
        }
    }
    
}
