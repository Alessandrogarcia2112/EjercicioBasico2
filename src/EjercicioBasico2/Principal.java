package EjercicioBasico2;

import java.util.Scanner;

public class Principal {
    static void main(){
        int fin = 0;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Media, mayor y menor de números");
        do {
            System.out.println("Introduce un número, con un negativo o 0 termina la lectura: ");
            numero = teclado.nextInt();
        } while(numero>fin);
            
    }
}
