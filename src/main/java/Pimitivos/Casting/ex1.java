package Pimitivos.Casting;
import java.util.Scanner;

public class ex1 {
public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite sua um número inteiro");
    int number = sc.nextInt();
    System.out.println("Digite o segundo ");
    int number2 = sc.nextInt();

    System.out.println("Os seus numeros divididos sem o cast " + number / number2);
    System.out.println("Os seus numeros divididos com o cast " + ((double) number / number2));

    sc.close();
}
}
