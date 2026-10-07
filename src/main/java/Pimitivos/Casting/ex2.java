package Pimitivos.Casting;
import java.util.Scanner;

public class ex2 {
    public static void main (String []args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Digite sua primeira nota ");
        int nota1= sc.nextInt();
        System.out.println("Digite sua segunda nota");
        int nota2 = sc.nextInt();

        double media = (double) (nota1 + nota2) /2;
        System.out.println("Sua media é " +media);


    }
}
