
import javax.swing.JOptionPane;


public class Horista {
    //variaveis
    public String nome;
    public int registro;
    private String setor, funcao;
    private double valorHora, numHoras;
    
    // metodos get
    public String getSetor(){
        return this.setor;
    }
    
    public String getFuncao(){
        return this.funcao;
    }
    
    public double getValorHora(){
        return this.valorHora;
    }
    
    public double getNumerosHoras(){
        return this.numHoras;
    }
    
    // metodos set
    public void setSetor(String se){
        
        this.setor = se;
    }
    
    public void setFuncao(String fun){
        
        this.funcao = fun;
    }
    
    public void setValorHoras(double vh){
        
        this.valorHora = vh;
    }
    
    public void setNumerosHoras(double nh){
        
        this.numHoras = nh;
    }
    
    //funcaos
    
    public double CalculaSalario(){
        
        return this.valorHora * this.numHoras;
    }
    
    public void ExibiSalario(double sal){
         JOptionPane.showMessageDialog(null, "seu salario é: " + sal);
    } 
    
    
    
}
