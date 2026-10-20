package EjercicioBasico2;

import java.util.Scanner;

public class Principal {
      static void main(){
        int fin = 0;
        int numero;
        double media=0;
        int menor = 0;
        int mayor = 0;
        int contador=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Media, mayor y menor de números");
        System.out.println("Introduce un número, con un negativo o 0 termina la lectura: ");
        numero = teclado.nextInt();
        if (numero<=fin){
            System.out.println("Numero no válido introduce otro");
        } else {
            mayor = numero;
            menor = numero;
            media = numero;
            contador = 1;
            do {
                System.out.println("Introduce otro número, con 0 o negativo se termina el programa");
                numero = teclado.nextInt();
                if (numero>fin){
                    media = media + numero;
                    contador = contador + 1;
                }
                if (numero>mayor){
                    mayor=numero;
                }
                if(numero<menor){
                    menor=numero;
                }
            }while(numero>fin);
            media = media / contador;
            System.out.println("La media es: "+media);
            System.out.println("El menor es: "+menor);
            System.out.println("El mayor es: "+mayor);
        }
    }
}
