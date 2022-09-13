package e6p2s4;
import java.util.Scanner;
public class E6P2S4 {
    public static void main(String[] args) {
        Scanner inqresar = new Scanner(System.in);
        String cadena= "";
        System.out .println("Ingrese un caracter: "); 
        String caracter = inqresar.nextLine();
        for (int i=1; 1<=20; i++){
                cadena = cadena + caracter; 
        System.out .println(cadena);

    }
   } 
}
