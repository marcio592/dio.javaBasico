/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author marci
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos m = new Metodos(0, 0);
        m.setValor1(2);
        m.setValor2(2);
        
       
        System.out.println(m.soma(m.getValor1(), m.getValor2()));
    }
    
}
