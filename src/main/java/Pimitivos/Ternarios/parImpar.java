package Pimitivos.Ternarios;
import java.util.Scanner;

public class parImpar {
    public static void main (String[]args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número ");
        int number = sc.nextInt();
        System.out.println(number +" é " + ((number % 2 == 0) ? "par" : "ímpar"));
    }
}
