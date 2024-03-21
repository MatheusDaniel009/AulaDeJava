
import javax.swing.JOptionPane;


public class Hospede {
    // 
    public String nome;
    private String cpf;
    private int telefona;
    public int idade;
    
    // metodos get
    public String getCpf() {
        
        return this.cpf;
    }
    
    public int getTelefone() {
        
        return this.telefona;
    }
    
    // metodos set
    
    public void setCpf(String CPF){
        
        this.cpf = CPF;
    }
    
    public void setTelefone(int tele){
        
        this.telefona = tele;
    }
    
    // metodo calcula desconto
    
    public void CalcularDesconto(double vl){
        
        if (this.idade >= 60){
            
            vl = vl - (vl * 0.1);
            JOptionPane.showMessageDialog(null, "o valor com o desconto é R$:" + vl);
        }
        else{
            JOptionPane.showMessageDialog(null, "voce não tem desconto voce vai pagar R$:" + vl);
        }
    }
}
