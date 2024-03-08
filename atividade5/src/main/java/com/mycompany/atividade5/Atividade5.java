//rgm:11222101928

package com.mycompany.atividade5;

import java.util.Scanner;
public class Atividade5 
{

    public static void main(String[] args) 
    {
      
      float n1;
      float n2;
  
       
       Scanner ler = new Scanner(System.in);
        int e;
        boolean t;
        char l;
        do
        {
        
         System.out.println("Escolha um operador:\n 1 = adição\n 2 = subtração\n 3 = multiplicação\n 4 = divisão\n 5 = divisão com resto");
         e = ler.nextInt();
             while (e <= 0 || e > 5)
             {
                 System.out.println("Ops, você digitou um valor inválido. Por favor, digite novamente.");
                 e = ler.nextInt();
             }
             
             System.out.print("Por favor, digite o valor do primeiro número que você deseja utilizar para a operação matemática: ");
             n1 = ler.nextFloat();
             
             System.out.print("Por favor, digite o valor do segundo número que você deseja utilizar para a operação matemática: ");
             n2 = ler.nextFloat(); 
             
              operado op = new operado();
             switch (e)
             {
                 case 1:
                System.out.println("o rejutado é:" + op.Adicao(n1,n2));
                break; 
                
                case 2:
                System.out.println("o rejutado é:" + op.Subtracao(n1,n2));
                break;
                
                case 3:
                System.out.println("o rejutado é:" + op.Multiplicacao(n1,n2));
                break;
                
                case 4:
                System.out.println("o rejutado é:" + op.Divicao (n1, n2));
                break;
                
                case 5:
                System.out.println("o rejutado é:" + op.RestoDiv(n1, n2) );
                break;
       
             }
             
             System.out.println("Se você quiser fazer outro cálculo, digite a letra 't'. Caso contrário, basta digitar qualquer outra letra.");
             l = ler.next().charAt(0);
             if (l == 't' || l == 'T')
             {
                 t = true;
             }
             else
             {
                 t = false;
             }
            
        } 
             while(t == true);
    }
}
