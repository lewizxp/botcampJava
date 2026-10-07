package Pimitivos.Casting;
import java.util.Scanner;
public class ex3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número decimal");
        double n1 = sc.nextDouble();

        int parteInteira= (int) n1;
        double parteDecimal = n1 - parteInteira;

        int resultado = (parteDecimal >=0.5) ? parteInteira + 1 : parteInteira;
        System.out.println("seu numero arredondado é " +resultado);

    }
}
