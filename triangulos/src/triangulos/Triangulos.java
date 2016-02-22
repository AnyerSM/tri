/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import java.util.Scanner;

/**
 *
 * @author Santos Moreno
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    private Scanner teclado;
    private int lado1, lado2, lado3;
    public void Inicializar(){
        teclado = new Scanner (System.in);
        System.out.println("Medida del lado 1: ");
        lado1 = teclado.nextInt();
        System.out.println("Medida del lado 2: ");
        lado2 = teclado.nextInt();
        System.out.println("Medida del lado 3: ");
        lado3 = teclado.nextInt();
    }
    public void LadoMayor(){
        System.out.println("Lado mayor");
        if(lado1>lado2 && lado1>lado3){
            System.out.println(lado1);
        }else{
            if(lado2>lado3){
                System.out.println(lado2);
        }else{
                System.out.println(lado3);
                }
        

        }
        
    }
    public void TipoTriangulo(){
        if(lado1==lado2 && lado1==lado3)
            System.out.println("El triangulo equilátero");
        if((lado1==lado2 && lado1||))
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
