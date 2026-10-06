package If;
import java.util.Scanner;

public class idade {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

         if (idade >= 18) {
             System.out.println("maior de idade");
         } else {
             System.out.println("menor de idade");
         }

    }
}
