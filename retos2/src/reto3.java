package retos2;
import java.util.Scanner;
public class reto3 {
    public static void main(String []args) {

        String [][] productos = new String [4][4];
        Scanner captura = new Scanner (System.in);

        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
             System.out.println("Ingrese el producto con su precio en la posicion["+ i+"]["+j+"]");
             productos[i][j]= captura.nextLine(); 
                        
             }
         }
 
         for (int i=0;i<4;i++) {
             for (int j=0;j<4;j++) {
                 System.out.print("[" + productos [i][j] + "]"); 
                 
         
                         
              }
              System.out.println();
          }


    }
}