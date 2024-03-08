
package eq2grau;

public class Calculo {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    
    public void Set_a (double a)
    {
        this.a = a;
    }
    
    public double Get_a ()
    {
        return a;
    }
    
    public void Set_b (double b)
    {
        this.b = b;
    }
    
    public double Get_b ()
    {
        return b;
    }
    
    public void Set_c (double c)
    {
        this.c = c;
    }
    
    public double Get_c ()
    {
        return c;
    }
    
    public void CalculoDelta ()
    {
        delta = b*b - 4 * a * c;
    }
    
    public double GetDelta ()
    {
        return delta;
    }
    
    public void CalculoX1 ()
    {
        x1 = (-b + Math.sqrt (delta))/ (2 * a);
    }
    
    public Double Get_X1 ()
    {
        return x1;
    }
    
    public void CalculoX2 ()
    {
        x2 = (-b - Math.sqrt (delta))/ (2 * a);
    }
    
     public Double Get_X2 ()
    {
        return x2;
    }
    
}
