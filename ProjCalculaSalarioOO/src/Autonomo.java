
import javax.swing.JOptionPane;


public class Autonomo {
    //variaveis
    public String nome;
    public int registro;
    private String filial, cargo;
    private double valorTot, porcVendas;
    
    //metoddos get
    public String getFilial(){
        return this.filial;
    }

    public String getCargo(){
        return this.cargo;
    }
    
    public double getValorTotal(){
        return this.valorTot;
    }
    
    public double getPorcentagemVendas(){
        return this.porcVendas;
    }
    
    //metodos set
    public void setFilial(String fi){
        this.filial = fi;
    }
    
    public void setCargo(String car){
        this.cargo = car;
    }
    
    public void setValorTotal(double vt){
        this.valorTot = vt;
    }
    
    public void setPorcentagemVendas(double pv){
        this.porcVendas = pv;
    }
    
    
    //funcao
    public double CalcularSalario(){
        return this.valorTot * this.porcVendas;
    }
    
    public void ExibirSalario(double sal){
        
        JOptionPane.showMessageDialog(null, "seu salario é: " + sal);
    }
    
}
