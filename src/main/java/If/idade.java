package If;
import java.util.Scanner;

public class idade {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        int idade = 0;

         if (idade >= 18) {
             System.out.println("maior de idade");
         } else if (idade <18){
            System.out.println("menor de idade");
        } if (idade == 0){
            System.out.println("numero nulo");
         }

    }
}
