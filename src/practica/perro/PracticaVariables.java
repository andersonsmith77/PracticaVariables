package practica.perro;


import java.util.Scanner;

public class PracticaVariables {
    
    public static void main(String[] args) {
    
        String nombre,crush;
           Scanner teclado = new Scanner(System.in);
           System.out.print("Hola viejo, decime tu nombre. ");
           System.out.println();
            nombre = teclado.nextLine();
           System.out.println("Hola "+nombre); 
           
           System.out.print("¿Quien es tu Crush? ");
           System.out.println();
            crush = teclado.nextLine();
           System.out.println("Ponete las pilas con "+crush+","+ " no seas tonto "+ nombre+ ".");
     
           
           System.out.println("no hay luz");
    }
    
}
