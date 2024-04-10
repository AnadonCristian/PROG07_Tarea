/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.prog07_tarea;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class PROG07_Tarea {

    public static void main(String[] args) {
        
      
    
    int opcion;
    
    do{
    System.out.println("1. Abrir nueva cuenta.");
    System.out.println("2. Ver listado de cuentas disponibles.");
    System.out.println("3. Obtener datos de cuenta.");
    System.out.println("4. Realizar ingreso en cuenta.");
    System.out.println("5. Retirar efectivo cuenta.");
    System.out.println("6. Consultar saldo cuenta.");
    System.out.println("7. salir.");
    
        System.out.println("Elige opción: ");
        Scanner teclado = new Scanner(System.in);
        opcion=teclado.nextInt();
       
    switch(opcion){
        case 1:
            
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
        case 7:
            
            break;
            
            
          
    }
        
    } while(7 != opcion);
    }
}
