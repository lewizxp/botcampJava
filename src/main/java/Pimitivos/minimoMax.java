
package Pimitivos;
import java.util.Scanner;
public class minimoMax {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Vamoss aprender o maximo e minimo dos tipos primitivos, vc vai digitar os ");
        System.out.println("byte: " + Byte.MIN_VALUE + " até " + Byte.MAX_VALUE);
        System.out.println("short: " +Short.MIN_VALUE + " vai até" + Short.MAX_VALUE);
        System.out.println("int : " +Integer.MIN_VALUE + " e vai até " + Integer.MAX_VALUE);
        System.out.println("long : " +Long.MIN_VALUE + "e vai até " +Long.MAX_VALUE);
        System.out.println("float :" + Float.MIN_VALUE + "e vai até " + Float.MAX_VALUE);
        System.out.println("Double :" +Double.MIN_VALUE + "e vai até "  + Double.MAX_VALUE);
        sc.close();
    }
}
