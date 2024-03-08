
public class Horista extends empregado
{
    private double horas;
    
    public Horista (String n, String e, double h)
    {
        super(n, e);
        horas = h;
    }
    
    public void SetHoras (double h)
    {
        horas = h;
    }
    
    public double GetHoras()
    {
        return horas;
    }
    
    public void CalcularSalario()
    {
        salario = horas * 50;
    }
}
