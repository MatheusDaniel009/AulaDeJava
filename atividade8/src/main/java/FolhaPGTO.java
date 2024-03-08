
public class FolhaPGTO {
    public static void main(String args[])
    {
       Mensalista men1, men2;
       Horista hora1, hora2;
       
       men1 = new Mensalista("Jose","Rua abc","Junior");
       men1.calcularSalario();
       men1.calcuarinss();
        System.out.println("Nome: " + men1.GetNome());
        
        System.out.println("EnderecoNome: " + men1.GeeEndereco());
        
        System.out.println("Salario: " + men1.GetSalario());
        
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
       men2.calcuarinss();
        System.out.println("Nome: " + men2.GetNome());
        
        System.out.println("EnderecoNome: " + men2.GeeEndereco());
        
        System.out.println("Salario: " + men2.GetSalario());
        
        
        hora1 = new Horista ("Carlos", "Rua xyz", 20);
        hora1.CalcularSalario();
        System.out.println("Nome: " + hora1.GetNome());
        
        System.out.println("EnderecoNome: " + hora1.GeeEndereco());
        
        System.out.println("Salario:" + hora1.GetSalario());
        
        
        hora2 = new Horista ("Cristina", "Rua do centro", 100);
        hora1.CalcularSalario();
        System.out.println("Nome: " + hora2.GetNome());
        
        System.out.println("EnderecoNome: " + hora2.GeeEndereco());
        
        System.out.println("Salario:" + hora2.GetSalario());
        
    }
}
