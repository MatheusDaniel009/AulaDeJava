package projveiculoconstrutor2;


public class Veiculo {
     //variaveis
    public int anoveiculo;
    public double valorveiculo;
    
    //metodos construtores
    public Veiculo(int av, double vv){
        
        this.anoveiculo = av;
        this.valorveiculo =  vv;
    }
    // valor desconto
    public void CalculaDesconto(){
        if (this.anoveiculo <= 10){
       this.valorveiculo = this.valorveiculo - (this.valorveiculo * 0.1);
    }
        else{
            this.valorveiculo = this.valorveiculo - (this.valorveiculo * 0.05);
        } 
    }
    
}
