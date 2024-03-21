
public class Hospedagem {
    public int numDias;
    public double valorDiaria;
    private double Consumo, adicional;
    
 
    
    // metodos set
    public void setCosumo(double cos){
        
        this.Consumo = cos;
    }
    public void setAdional (double adi){
        
        this.adicional = adi;
    }
    
    // calcular checkout
    public double CalculaCheckout(){
        
        double valor;
        
        valor = (this.numDias * this.valorDiaria) + this.Consumo + this.adicional;
        return valor;
    }  
}
