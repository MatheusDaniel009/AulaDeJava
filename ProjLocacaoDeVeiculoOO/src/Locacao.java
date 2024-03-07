
import javax.swing.JOptionPane;


public class Locacao {
    
    public String cliente, veiculo;
    public int idade, numDias;
    public double vlDiaria, qtKm;
    
    public void Cadastrar(){
        
        this.cliente = JOptionPane.showInputDialog(null, "digite o nome do cliente: ");
        this.veiculo = JOptionPane.showInputDialog(null, "digite o nome do veiculo: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade do cliente: "));
        this.numDias = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero de dias de locação: "));
        this.vlDiaria = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor diaria da locação: "));
        this.qtKm = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a quantidade de Km rodado: "));
        JOptionPane.showMessageDialog(null, "o cadastro foi um sucesso");
        
    }
    
    public void Exibir(){
        
        JOptionPane.showMessageDialog(null,"nome do cliente: " + this.cliente +
                "\nidade do cliente: " + this.idade +
                "\nnome do veiculo:: " + this.veiculo +
                "\nquantidade de km rodado: " + this.qtKm +
                "\nnumero de dia alugado: " + this.numDias +
                "\n valor daa diaria: " + this.vlDiaria);
    }
    
    public double CalcularAluguel(double vlKm){
        double vt;
        
        vt = (this.numDias * this.vlDiaria) + (this.qtKm * vlKm);
        
        return vt;
        
    }
    
    public void CalcularDesconto(double vt){
        
        
        if (this.idade >= 70){
            vt = vt - (vt * 0.20);
            
            JOptionPane.showMessageDialog(null, "o valor com o desconto e: " + vt);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "vc nao tem desconto vc \nvai pagar: " + vt);
        }
    }
}
