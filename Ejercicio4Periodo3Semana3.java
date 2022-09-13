package e4p3s3;
import java.util.Scanner;
public class E4P3S3 {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in); 
        int contador;
        int fin;
        System.out.println ("Por favor ingrese el valor inicial (Contador )" ) ;
        contador = Reader.nextInt ();
        System.out.println("Por favor ahora  ingrese el valor final") ;
        fin = Reader.nextInt ( ) ;
        while (contador <= fin){
        System.out.println("Valo actual de la 1teracion "+contador);
        contador++;
       }
    }
    
}
