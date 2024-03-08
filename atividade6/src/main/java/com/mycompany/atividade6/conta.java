
package com.mycompany.atividade6;

import java.util.Scanner;

public class conta {
     Scanner ler = new Scanner(System.in);
     
     public void soma()
     {
         System.out.println("digite o valor de n1");
         float n1 = ler.nextFloat();
         System.out.println("digite o valor de n2");
         float n2 = ler.nextFloat();
         System.out.println("digite o valor de n3");
         float n3 = ler.nextFloat();
         float n4 = n1 + n2 + n3;
         System.out.println("o valor é " + n4);
     }
     public void sub()
     {
         System.out.println("digite o valor de n1");
         float n1 = ler.nextFloat();
         System.out.println("digite o valor de n2");
         float n2 = ler.nextFloat();
         System.out.println("digite o valor de n3");
         float n3 = ler.nextFloat();
         float n4 = - n1 - n2 - n3;
         System.out.println("o valor é " + n4);
     }
     
     public void multi()
     {
         System.out.println("digite o valor de n1");
         float n1 = ler.nextFloat();
         System.out.println("digite o valor de n2");
         float n2 = ler.nextFloat();
         float n3 = n1 * n2;
         System.out.println("o valor é " + n3);
     }
     
     
     public void divicao()
     {
         System.out.println("digite o valor de n1");
         float n1 = ler.nextFloat();
         System.out.println("digite o valor de n2");
         float n2 = ler.nextFloat();
         float n3 = n1 / n2;
         System.out.println("o valor é " + n3);
     }
     
     public void media()
     {
         System.out.println("digite a nota da m1");
         float m1 = ler.nextFloat();
         System.out.println("digite a nota da m2");
         float m2 = ler.nextFloat();
         float media = (m1 + m2 * 2) / 3;
         System.out.println("a media é " + media);
         
     }
     
     public void contagem()
     {
         System.out.println("digite ate qual valor deve contar");
         int c = ler.nextInt();
         
         for(int l = 0; l <= c; l++)
         {
             System.out.println(l);
         }
     }
     
     public void contagem_desquecente()
     {
         System.out.println("digite ate qual valor deve contar");
         int c = ler.nextInt();
         
         for(int l = c; l >= 0; l--)
         {
             System.out.println(l);
         }
     }
     public void media_true()
     {
         System.out.println("digite a nota da m1");
         float m1 = ler.nextFloat();
         System.out.println("digite a nota da m2");
         float m2 = ler.nextFloat();
         while(m1 < 0 && m1 > 10 && m2 > 0 && m2 < 10)
         {
             System.out.println("digite a nota da m1");
             m1 = ler.nextFloat();
             System.out.println("digite a nota da m2");
             m2 = ler.nextFloat();
         }
         float media = (m1 + m2 * 2) / 3;
         System.out.println("a media é " + media);
         
     }
     
     
}
