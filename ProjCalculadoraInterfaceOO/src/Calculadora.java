
public class Calculadora {
    //variavel
    public Double n1, n2;
    
    // metodos set
    public void setN1(double num1){
        this.n1 = num1;
    }
    public void setN2 (double num2){
        this.n2 = num2;
    }
    
    // metodos de calculos
    public double somar() {
        
       double soma = this.n1 + this.n2;
       
       return soma;
    }
    
    public double sutrair() {
        
        double sub = this.n1 - this.n2;
        
        return sub;
    }
    
    public double multiblicar() {
        
        double multi = this.n1 * this.n2;
        
        return multi;
    }
    
    public double dividir() {
        
        double div = this.n1 / this.n2;
        
        return div;
    }
}
