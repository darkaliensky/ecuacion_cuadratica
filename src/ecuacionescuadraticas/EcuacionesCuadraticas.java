/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionescuadraticas;
import java.util.Scanner;
/**
 *
 * @author darkaliensky
 */
public class EcuacionesCuadraticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double A;
        double B;
        double C;
        double raiz1;
        double raiz2;
        double ecuacion;
        String seguir;
        do{
            System.out.println("Dada la ecuación cuadrática de la forma Ax² + Bx + C");
            System.out.println("Ingrese el coeficiente cuadrático (Ax²) de la ecuación");
            A = leer.nextDouble();
            System.out.println("Ingrese el coeficiente lineal (Bx) de la ecuación");
            B = leer.nextDouble();
            System.out.println("Ingrese el coeficiente númerico (C) de la ecuación");
            C = leer.nextDouble();
            
            raiz1 = (-B) + (Math.sqrt(B*B - 4*A*C));
            raiz1 = raiz1/ (2*A);
      
            raiz2 = (-B) - (Math.sqrt(B*B - 4*A*C));
            raiz2 = raiz2/ (2*A);
            
            System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² +" +B+"x +" +C);
            System.out.println("x1 = " +raiz1+ " x2 = " +raiz2);
            System.out.println("¿Desea continuar con otra operación? Presione S para continuar y cualquier tecla para salir");
            seguir = leer.next();
        }while(seguir.equals("s") || seguir.equals("S"));
    }
    
}
