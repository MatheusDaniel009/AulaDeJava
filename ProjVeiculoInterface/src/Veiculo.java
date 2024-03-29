
public class Veiculo {
    //variaveis
    public String marca, modelo;
    private double valor;
    private int ano;
    
    //metodos set
    public void setValor(double vl){
        
        this.valor = vl;
    }
    
    public void setAno(int ano){
        
        this.ano = ano;
    }
    
    // metodos get
    
    public double getValor(){
        
        return this.valor;
    }
    
    public int getAno(){
        
        return this.ano;
    }
    
    // metodos
    
    public double CalcularDesconto(){
        //variavel
        double desconto = this.valor - (this.valor * 0.3);
        
        // if e else parar ver o o tamanho do desconto
        if(this.ano <= 2){
            
            desconto = this.valor - (this.valor * 0.1);
        }
        
        else if ( this.ano > 2 && this.ano <= 10){
            
            desconto = this.valor - (this.valor * 0.2);
        }
        
        return desconto;
        
    }
    
}
