/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Isoceles;
import java.util.Scanner;

/**
 *
 * @author Viking
 */
public class PrinciplaIsoceles {
    
     @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         double lado, base;
         int numTriang;
         System.out.println("Programa que calcula elperimetro y el area de varios triangulos");
         System.out.println("Cuantos triangulos calcular");
         numTriang=teclado.nextInt();
         
         Isoceles triangulos[]=new Isoceles[numTriang];
         
         for(int i=0;i<numTriang;i++){
        
         System.out.println("Dame los datos de triangulo"+(i+1));
         System.out.println("Dame la base:");
         base=teclado.nextDouble();
         System.out.println("Dame la altura:");
         lado=teclado.nextDouble();
             System.out.println("\n");
         triangulos[i]=new Isoceles(base, lado);System.out.println("El perimetro del triangulo es "+triangulos[i].calcularPerimetro());
         
         System.out.println("El area del triangulo es "+triangulos[i].calcularArea());
}
         
         


    
    }
    
    
}
