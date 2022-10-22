import java.util.Random;

import javax.swing.BoundedRangeModel;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class numerosAleatorios {

public static void main(String[] args) {
    Random random = new Random(); 

    int [] numerosAleatorios = new int [20];

    for(int i = 0; i < numerosAleatorios.length; i++){
        int numero = random.nextInt(100);
        numerosAleatorios [i]  = numero; 

    }

    System.out.print("\nAntecessor dos Numeros Aleatorios: ");
    for (int numero : numerosAleatorios) {
        System.out.print((numero-1) + "  ");
    }

    System.out.print("\nSucessores dos numeros Aleatorios: ");
    for (int numero: numerosAleatorios) {
    
        System.out.print((numero + 1) + "  ");
    
        }
    }
}
