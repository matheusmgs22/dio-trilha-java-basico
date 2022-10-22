
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 15 , 50 , 8 , 4};
        
        System.out.println("Vetor: ");

        for(int count =0; count < (vetor.length) ; count++){

            System.out.print(vetor[count] + "  ");


        }

        System.out.println("\nVetor Inverso:  ");

        for (int i = (vetor.length - 1) ; i >= 0; i --){

            System.out.print(vetor[i] + "  ");
        
        }
    }
}
