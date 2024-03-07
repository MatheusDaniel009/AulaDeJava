package projcalculaimpostooo;

import javax.swing.JOptionPane;

public class Funcionario {
    public String nome;
    public int idade, resistro;
    public double salario;
    
    public void Cadastrar(){
        this.nome = JOptionPane.showInputDialog("digite seu nome: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("digite a sua idade: "));
        this.resistro = Integer.parseInt(JOptionPane.showInputDialog("digite o seu resistro: "));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("digite o seu salario"));
        JOptionPane.showMessageDialog(null, "cadastro bem sucedido");
    }
    
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome: "+ this.nome +
                "\nresistro: "+ this.resistro +
                "\nidade: " + this.idade +
                "\nsalario: " + this.salario);
    }
    
    public double CalcularImposto(double porInp){
        double valorImp;  
        valorImp = salario * porInp;
         return  valorImp;
    }
    
    public void CalcularDesconto( double valorImp){
        
        if (this.idade >= 60){
            valorImp = valorImp / 2;
            
            JOptionPane.showMessageDialog(null, "o valor com o desconto e: " + valorImp);
           
        }
        else {
            JOptionPane.showMessageDialog(null, "vc nao tem desconto"
                    + "\nvc vai pagar: " + valorImp);
        }
    } 
}
