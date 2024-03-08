
import javax.swing.JOptionPane;

public class ContaCorente {
    public String nome_criente;
    public String banco;
    public int agencia;
    public int num_conta;
    public double saldo;
    
    public void Cadastro(String nm, String ban, int ag, int ncon){
        this.nome_criente = nm;
        this.banco = ban;
        this.agencia = ag;
        this.num_conta = ncon;
        JOptionPane.showMessageDialog(null, "dados cadastrados com sucesso");
    
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome do cliente: "+ this.nome_criente+
                "\n banco: "+ this.banco + " agencia: "+ this.agencia +
                "\n numero do banco: " + this.num_conta);
    
    }
    
    public void ConsutarSaldo(){
        JOptionPane.showMessageDialog(null, "saldo disponivel: " + this.saldo);
    
    }
    
    public void Depositar(double valor){
        this.saldo+= valor;
        JOptionPane.showMessageDialog(null, "deposito efeituado com sucesso");
    }
    
    
    public void Sacar(double valor){
        this.saldo-= valor; 
        if (this.saldo < 0){
            JOptionPane.showMessageDialog(null, "nao foi possivel sacar");
        }
        else {
            JOptionPane.showMessageDialog(null, "sacado com sucesso");
        }
    }
       
    
    
}
