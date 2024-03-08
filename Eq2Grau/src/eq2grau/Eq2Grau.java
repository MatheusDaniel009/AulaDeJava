
package eq2grau;

import java.util.Scanner;

public class Eq2Grau {

    public static void main(String[] args) {
      Calculo Cal = new Calculo();
      Scanner ler = new Scanner (System.in);
      
        System.out.print("digite o valor de a: ");
        Cal.Set_a(ler.nextDouble());
        
        System.out.print("digite o valor de b: ");
        Cal.Set_b(ler.nextDouble());
        
        System.out.print("digite o valor de c: ");
        Cal.Set_c(ler.nextDouble());
        Cal.CalculoDelta();
        Cal.CalculoX1();
        Cal.CalculoX2();
        System.out.println("o resutado do x1 é " + Cal.Get_X1() );
        System.out.println("o resutado do x2 é " + Cal.Get_X2());
    }
    
}
