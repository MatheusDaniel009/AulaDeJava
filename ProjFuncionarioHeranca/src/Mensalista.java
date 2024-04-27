
public class Mensalista extends Funcionario {
    // atributos
   public double salBruto, desconto;
    
    // metodos
    public double CalcSal(){
        // faz o calculo de subtrair os descontos do salario bruto
        return this.salBruto - this.desconto;
    }
}
       
