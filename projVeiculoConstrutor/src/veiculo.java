
public class veiculo {
    //variaveis
    public int anoveiculo;
    public double valorveiculo;
    
    //metodos construtores
    public veiculo (){
        
        this(9, 50000);
    }
    public veiculo(int av, double vv){
        
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
