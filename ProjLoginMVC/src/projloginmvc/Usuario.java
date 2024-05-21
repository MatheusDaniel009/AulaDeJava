
package projloginmvc;

public class Usuario {
    // atributos
    private String login;
    private int senha;
    
    // metodos get 
    public String getLogin(){
        
        return this.login;
    }
    
    public int getSenha(){
        
        return this.senha;
    }
    
    //metodos set
    
    public void setLogin(String logi){
        
        this.login = logi;
    }
    
    public void setSenha (int sen){
        
        this.senha = sen;
    }
    
    // metodos 
    public boolean verifica(){
        
        boolean verifica = this.login.equals("elias") && this.senha == 6924;
        
        return verifica;
    }
    
}
