

package com.mycompany.atividade4;


public class Atividade4 {

    public static void main(String[] args) throws Exception  {
      
        float massa = 16;
        float volume = 0;
        float altura = 4;
        
        CorpoHumano c1 = new CorpoHumano(massa,volume, altura);
        c1.GetDensidade();
        c1.GetMassa();
        c1.GetVolume();
        c1.SetMassa(massa);
        c1.SetVolume(volume);
        c1.massa = 2;
        c1.GetImc();
        System.out.println("a" + c1.GetImc());
        
    }
}

/*
  1)O código não funcionará porque a variável 'massa' está definida como privada.
  2)O código pode funcionar se a classe foi alterada para pública e a variável "massa" agora pode ser acessada de fora da classe.
  3)O código pode deixar de funcionar porque o método foi alterado para privado. 
*/