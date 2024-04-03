
import java.util.Random;


public class Loteria {
    //variaveis
    public int n1, n2, n3, n4, n5;
    
    public int ns1, ns2, ns3, ns4, ns5;
    
    public void Sortear(){
        Random aleatorio = new Random();
        
        boolean igual = true;
        // converir que nao vai ter numero repetido e zero no sortei 
        while(igual){
        this.ns1 = aleatorio.nextInt(21);
        this.ns2 = aleatorio.nextInt(21);
        this.ns3 = aleatorio.nextInt(21);
        this.ns4 = aleatorio.nextInt(21);
        this.ns5 = aleatorio.nextInt(21);
        igual = (this.ns1 == this.ns2 || this.ns1 == this.ns3 || this.ns1 == this.ns4 || this.ns1 == this.ns5 || this.ns1 == 0) ||
                (this.ns2 == this.ns3 || this.ns2 == this.ns4 || this.ns2 == this.ns5 || this.ns2 == 0) ||
                (this.ns3 == this.ns4 || this.ns3 == this.ns5 || this.ns3 == 0) ||
                (this.ns4 == this.ns5 || this.ns4 == 0) ||
                (this.ns5 == 0);
        }
    }
    
    //ve quanto numeros foi acertados
    public int CalcAcertos (){
        int acerto = 0;
        
        if (this.n1 == this.ns1 || this.n1 == this.ns2 || this.n1 == this.ns3 || this.n1 == this.ns4 || this.n1 == this.ns5){
            acerto ++;
        }
        if (this.n2 == this.ns1 || this.n2 == this.ns2 || this.n2 == this.ns3 || this.n2 == this.ns4 || this.n2 == this.ns5){
            acerto ++;
        }
        if (this.n3 == this.ns1 || this.n3 == this.ns2 || this.n3 == this.ns3 || this.n3 == this.ns4 || this.n3 == this.ns5){
            acerto ++;
        }
        if (this.n4 == this.ns1 || this.n4 == this.ns2 || this.n4 == this.ns3 || this.n4 == this.ns4 || this.n4 == this.ns5){
            acerto ++;
        }
        if (this.n5 == this.ns1 || this.n5 == this.ns2 || this.n5 == this.ns3 || this.n5 == this.ns4 || this.n5 == this.ns5){
            acerto ++;
        }
        
        return acerto;
    }
    
    // calcula o valor do premio
    public double VerificaPremio(int acer){
        double valor = 0;
        
        if (acer >= 1){
            
            valor = 1000;
        }
        if (acer >=3){
            
            valor  = 5000;
        }
        if (acer == 5){
            
            valor = 10000;
        }
        
        return valor;
    }
    
}
