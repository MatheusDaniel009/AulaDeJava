
public class Autonomo extends Funcionario  {
    // atributos
    public double totVendas, precVendas;
    
    // metodos
    public double CalcSal(){
        // faz o calculo para pegar 20 porcento da media de vendas
        return (this.precVendas / this.totVendas)* 0.20;
    }
    
}
