package e6p3s4;
import java.util.Scanner;
public class E6P3S4 {
        public static void main(String[] args) {
        int fact=1, num, cont=1;
        Scanner entrada = new Scanner (System .in);
        System.out.println("lnqrese un numero: ");
        num = entrada.nextInt ();
        do{
        fact =fact*cont;
        cont = cont +1;
       } while (cont <=num);
        System.out.println("El tactorial e: "+fact);

    }
   } 

