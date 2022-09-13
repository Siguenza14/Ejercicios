package e1p3s1;
import java.util.Scanner;
public class E1P3S1 {
    public static void main(String[] args) {
     Scanner ingresar = new Scanner(System.in);
     double nota;

    System.out.println("favor ingresar un va1or desde 1 hasea 10" );
    nota = ingresar.nextDouble();

    while (nota<1 |   nota>10)
     {
    System.out.println("Lo siento mucho pero e1 va1or proporcionado no es correcto" ); 
    nota = ingresar.nextDouble();
  
    }
  }  
}
