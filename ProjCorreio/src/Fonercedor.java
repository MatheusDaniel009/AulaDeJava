
public class Fonercedor {
    
    // variaveis
    public String nome, cidade;
    private int tepo_entrega;
    
    // metodo set
    public void setTempoEntrega(int te){
        
        this.tepo_entrega = te;
    }
    
    // metodo get
    public int getTempoEntrega(){
        
        return this.tepo_entrega;
    }
    
    // metodos
    
    public String AnalisarTempo(){
        String at;
        
        if (this.tepo_entrega <= 2){
            
            at  =  "prioridade";
        }
        
        else {
            
            at = "normal";
        }
        
        return at;
    }
    
}
