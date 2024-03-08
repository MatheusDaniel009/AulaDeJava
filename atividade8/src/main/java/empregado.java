
public class empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    //Construtor
    public empregado( String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String GetNome()
    {
        return nome;
    }
    
    public String GeeEndereco()
    {
        return endereco;
    }
    
    public double GetSalario()
    {
        return salario;
    }
    
    public void SetNome (String nome)
    {
        this.nome = nome;
    }
    
    public void SetEndereco (String endereco)
    {
        this.endereco = endereco;
    }
    
    public void SetSalario (double salario)
    {
        this.salario = salario;
    }
    
    public double calcularIrpf()
    {
        double aux;
        if (salario < 2500)
        {
            aux = 0.1 * salario;
        }
        else if (salario >= 2500 && salario < 3500 )
        {
            aux = 0.7 * salario;
        }
        else if (salario >= 3500 && salario < 5500)
        {
            aux = 0.15 * salario;
        }
        else
        {
            aux = 0.22 * salario;
        }
        return (aux);
    }  
    
    public double calcuarinss()
    {
        double inss;
        if (salario < 2500) 
        {
          inss = 0.7 * salario;    
            
        } else if (salario >= 2500 && salario < 3500) 
        {
            inss = 0.9 * salario;
        }
        
        else if (salario >= 3500 && salario < 5500)
        {
            inss = 0.12 * salario;
        }
        
        else
        {
            inss = 0.14 * salario;
        }
        return (inss);
    }
}
