
public class Cliente {
    //variavveis
    public String nome;
    public int telefone;
    private String Tipo_pessoa;
    
    //metodo set
    
    public void setTipoPessoa(String tp){
        
        this.Tipo_pessoa = tp;
    }
    
    // metodo get
    
    public String getTipoPessoa(){
        
        return this.Tipo_pessoa;
    }
    
    // metodos
    
    public double CalculaDesc(){
        
        double desc = 0;
        
        if (this.Tipo_pessoa.equals("F")){
            
            desc = 10;
        }
        else if (this.Tipo_pessoa.equals("J")){
            
            desc = 20;
        }
        
        return desc;
        
    }
    
}
