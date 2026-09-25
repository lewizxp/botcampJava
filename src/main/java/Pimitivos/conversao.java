package Pimitivos;
import java.util.Scanner;

public class conversao {
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome sera guardado apenass a SSegunda letra dele");
        char cha = sc.next().charAt(1);
        System.out.println("É " +cha);



    }
}
