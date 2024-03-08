//rgm:11222101928
package com.mycompany.atividade4;


public class CorpoHumano {
   public float massa;
   private float densidade; 
   private float volume;
   private float altura;
   private float imc;
   
   public CorpoHumano(float massa, float volume, float altura)
   {
     this.massa = massa;
     this.volume = volume;
     this.altura = altura;
     densidade = massa / volume;
     imc = massa / (altura * altura); 
   }
   public float GetMassa()
   {
       return massa;
   }
   
   public float GetVolume()
   {
       return volume;
   }
   
   public float GetDensidade()
   {
       return densidade;
   }
   
   public float GetAltura()
   {
       return altura;
   }
   
   public float GetImc()
   {
       return imc;
   }
   
   public void SetMassa(float massa)
   {
       this.massa = massa;
       densidade = massa / volume;
   }
   
   
   public void SetVolume(float volume)
   {
       this.volume = volume;
       densidade = massa / volume;
   } 
}
