package retos2;

import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        double promedio = 0;
        int CanNot;
        
        System.out.println("Ingrese la cantidad de notas");
        CanNot = captura.nextInt();
        
        
        double[] notas = new double[CanNot];
        
        
        for (int i=0;i<CanNot;i++) {
            System.out.println("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = captura.nextDouble();
        }
        
       
        
        for (int i=0;i<CanNot;i++) {
            promedio=promedio+notas[i];
        
            promedio=promedio/CanNot;
        }
        
       
        if (promedio<30) {
            System.out.println("Tu nota final es " + promedio + " y Reprobaste");
        } else if (promedio>=30 && promedio<40) {
            System.out.println("Tu nota final es " + promedio + "y Pasaste Raspando");
        } else if (promedio>40) {
            System.out.println("Tu nota final es " + promedio + "y Aprobaste con buenos resultados");
        }
        
       
        captura.close();
    }
    
}

