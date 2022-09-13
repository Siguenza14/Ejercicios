package e1p1s3;
import java.util.Scanner;
public class E1P1S3 {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    int numero1;
    int numero2;
    int suma;
    System.out.print("Escriba el primer numero: ");
    numero1 = entrada.nextInt();

    System.out.print("Escriba el segundo numero: ");
    numero2 = entrada.nextInt();

    suma = numero1 + numero2;
    
    System.out.println("La suma es " + suma);   // TODO code application logic here
    }
    
}
