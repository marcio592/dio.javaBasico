/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author marci
 */
public class Metodos {
    
    private int valor1;
    private int valor2;
    
    
   public  Metodos(int valor1, int valor2){
       this.valor1=valor1;
       this.valor2=valor2;
       
    }
   public int getValor1(){
       return this.valor1;
   }
   public void setValor1(int valor1){
       this.valor1=valor1;
   }
   public int getValor2(){
       return this.valor2;
   }
   public void setValor2(int valor2){
       this.valor2=valor2;
   }
   public int soma(int valor1, int valor2){
       return (valor1 + valor2);
    
}
}
