import java.util.Scanner;
public class Main {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome ");
        String name = scanner.next();

        System.out.println("Informe sua idade");
        int idade = scanner. nextInt();
        System.out.printf(  name + " , " + idade + "." );

    }
}
