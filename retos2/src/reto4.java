package retos2;
import java.util.Scanner;

public class reto4 {
   public static void main(String[] args) {
    int cantidad;
    int [] numeros;
    int dos=0;
    

    Scanner captura=new Scanner(System.in);
    System.out.println("Ingrese la cantidad de numeros");
        cantidad = captura.nextInt(); 
        numeros = new int [cantidad];

   
    for(int n=0;n<numeros.length;n++) {
        System.out.println("Digite numeros ");
        numeros[n]=captura.nextInt();
       
        
    }
        for(int n=0;n<numeros.length;n++) {
            System.out.println("Los numeros son: "+ numeros[n]);
            if (numeros[n]== 2) {
                dos++;
                } 
 }  
 System.out.println("Digito un dos ");
 System.out.println("total de dos ingresados"+dos);
   }
}
