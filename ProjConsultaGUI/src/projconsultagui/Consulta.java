
package projconsultagui;

public class Consulta {
    // variaveis
    public String nome, sexo;
    public int idade;
    public double vlConsulta;
    
    //metodos
    public Double CalcularPromocao(){
        double promocao = this.vlConsulta;
        if (this.idade > 80){
            
            promocao = this.vlConsulta / 2;
        }
        
        return promocao;
        
    }
    
}
