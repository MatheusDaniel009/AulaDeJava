
package projconstrutor;


public class Aluno {
    public String nome;
    public int rga;
    
    public Aluno(){
        
       this("joaquim", 1234);
    }
    
    public Aluno (String nm, int ra){
        this.nome = nm;
        this.rga = ra;
    }
}
