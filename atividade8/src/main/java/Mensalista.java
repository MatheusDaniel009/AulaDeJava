
public class Mensalista extends empregado {
    private String cargo;
    
    public Mensalista (String n, String e, String c)
    {
        super(n, e);
        cargo = c;
    }    

public void Set_Cargo (String c)
{
    cargo = c;
}

public String Get_Cargo()
{
    return (cargo);
}

public void calcularSalario()
{
    if (cargo.equals("Junior")) 
    {
        salario = 2500;
    } 
    else if (cargo.equals("Pleno"))
    {
        salario = 3500;
    }
    else 
    {
        salario = 5500;
    }
}
    
}
