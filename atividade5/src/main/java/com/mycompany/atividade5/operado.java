/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author matat
 */
public class operado {
    
    private float n1;
    private float n2;
    
    public float Adicao (float n1, float n2)
    {
        return n1 + n2;
    }
    
    public float Subtracao (float n1, float n2)
    {
        return n1 - n2;
    }
    
    public float Multiplicacao (float n1, float n2)
    {
        return n1 * n2;
    }
    
    public float Divicao (float n1, float n2)
    {
        return n1 / n2;
    }
    
    //atribuicao
    public float RestoDiv (float n1, float n2)
    {
        return n1 %= n2;
    }
}
