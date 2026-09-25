package Pimitivos;
import java.util.Scanner;

public class Decla {
    public static void main (String[] args){
      Scanner sc = new Scanner (System.in);
        System.out.printf("Digite um Byte ");
        byte bit = sc.nextByte();
        System.out.println("o byte é " +bit);


        System.out.printf("Digite um numero Inteiro");
        int inteiro = sc.nextInt();
        System.out.println("O seu númmero inteiro é " +inteiro);

        System.out.printf("Digite um número longo");
        long longo = sc.nextLong ();
        System.out.println("O seu numero longo é " +longo);

        System.out.printf("Digite um número flutuante");
        float flutuante = sc.nextFloat();
        System.out.println("O seu número flutuante que é com virgula" +flutuante);

        System.out.printf("Digite um valor para o tipo primitivo Double");
        double doube = sc.nextDouble();
        System.out.println("O seu númmero double que ");


        System.out.printf("Digite um valor para o tipo primitivo char");
      char cha = sc.next().charAt(0);
      System.out.println("Seu em char é " +cha);

        System.out.printf("Digite sé é verdadeiro ou falso, sabendo que o tipo é boolean ");
        boolean boo = sc.nextBoolean();
        System.out.println("O seu tipo boolean é ");


      sc.close();


    }

}
