package retos2;

import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
            int ganador = 0;
    
            System.out.print("Ingrese el número de competidores: ");
            int numComp = captura.nextInt();
    
            String[] nom = new String[numComp];
            double[] tiem = new double[numComp];
    
            for (int i = 0; i < numComp; i++) {
                System.out.print("Competidor "+ i+1);
                System.out.print("Ingrese el nombre del competidor: ");
                nom[i] = captura.next();
                System.out.print("Ingrese el tiempo en segundos: ");
                tiem[i] = captura.nextDouble();
            }
    
          
            System.out.println("\nResultados de la competencia:");
            for (int i = 0; i < numComp; i++) {
                System.out.print(nom[i]+tiem[i]);
            }
    
            
           
            for (int i=1;i<numComp;i++) {
                if (tiem[i] < tiem[ganador]) {
                    ganador = i;
                }
            }
            System.out.print("El ganador es:"+nom[ganador] + tiem[ganador]);
            captura.close();
        }
    }
