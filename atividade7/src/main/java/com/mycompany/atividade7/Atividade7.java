
package com.mycompany.atividade7;


public class Atividade7 {

    public static void main(String[] args) {
        relogio r = new relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("hora" + r.Gethora() + ":" + r.Getminuto() + ":" + r.GetSegundo());
        System.out.println("\n\n");
       
        r = new relogio(0,0,0);
        System.out.println("utilizando construtor que requer hora, minuto e segundo");
        System.out.println("hora" + r.Gethora() + ":" + r.Getminuto() + ":" + r.GetSegundo());
        System.out.println("\n\n");
        
        
        r = new relogio(0);
        System.out.println("utilizando construtor que requer hora");
        System.out.println("hora" + r.Gethora() + ":" + r.Getminuto() + ":" + r.GetSegundo());
        System.out.println("\n\n");
        
        
        r = new relogio(0,0);
        System.out.println("utilizando construtor que requer hora e minuto");
        System.out.println("hora" + r.Gethora() + ":" + r.Getminuto() + ":" + r.GetSegundo());
        System.out.println("\n\n");
    
        System.out.println("utilizando construtor vazio");
        System.out.println("mas atribuindo valores atraves dos metodos de aceso");
        r.SetHora(13);
        r.SetMinuto(40);
        r.SetSegundo(10);
        System.out.println("hora" + r.Gethora() + ":" + r.Getminuto() + ":" + r.GetSegundo());
        System.out.println("\n\n");
    
    
        
    }
}
