import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;
        
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            
            contador = contador + 1;
        } while(contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));


    }
}