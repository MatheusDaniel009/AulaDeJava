
package com.mycompany.atividade7;

import java.util.Scanner;

 class relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    Scanner ler = new Scanner(System.in);
    
    public relogio()
    {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    
    public relogio ( int h )
    {
        System.out.println("digite a hora");
        h = ler.nextInt();
        while ( h < 0 | h > 23 )
        {
            System.out.println("digite uma hora valida");
            h = ler.nextInt();
        }
        
        hora = h;
        minuto = 0;
        segundo = 0;
       
    }
    
    public relogio ( int h, int m)
    {
        System.out.println("digite a hora");
        h = ler.nextInt();
        while ( h < 0 | h > 23 )
        {
            System.out.println("digite uma hora valida");
            h = ler.nextInt();
        }
        System.out.println("digite o minuto");
        m = ler.nextInt();
        while ( m < 0 | m > 60 )
        {
            System.out.println("digite um minuto valida");
            m = ler.nextInt();
        }
        hora = h;
        minuto = m;
        segundo = 0;
        
    }
    
    public relogio ( int h, int m, int s)
    {
         System.out.println("digite a hora");
        h = ler.nextInt();
        while ( h < 0 | h > 23 )
        {
            System.out.println("digite uma hora valida");
            h = ler.nextInt();
        }
        System.out.println("digite o minuto");
        m = ler.nextInt();
        while ( m < 0 | m > 60 )
        {
            System.out.println("digite um minuto valida");
            m = ler.nextInt();
        }
        System.out.println("digite o segundo");
        s = ler.nextInt();
        while ( s < 0 | s > 60 )
        {
            System.out.println("digite um segundo valida");
            s = ler.nextInt();
        }
        hora = h;
        minuto = m;
        segundo = s;
       
    }
    
    public void SetSegundo(int s)
    {
        System.out.println("digite o segundo");
        s = ler.nextInt();
        while ( s < 0 | s > 60 )
        {
            System.out.println("digite um segundo valida");
            s = ler.nextInt();
        }
        segundo = s;
    
    }
    
    public void SetMinuto(int m)
    {
        System.out.println("digite o minuto");
        m = ler.nextInt();
        while ( m < 0 | m > 60 )
        {
            System.out.println("digite um minuto valida");
            m = ler.nextInt();
        }
        minuto = m;
    
    }
    
    public void SetHora(int h)
    {
        System.out.println("digite a hora");
        h = ler.nextInt();
        while ( h < 0 | h > 23 )
        {
            System.out.println("digite uma hora valida");
            h = ler.nextInt();
        }
        hora = h;
    
    }
    
    public int GetSegundo ()
    {
        return segundo;
    }
    
    
    public int Getminuto ()
    {
        return minuto;
    }
    
    
    public int Gethora ()
    {
        return hora;
    }
    
    

}
