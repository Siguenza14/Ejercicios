package e4p1s4;
import java.util.Scanner;
public class E4P1S4 {
     public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in); 
        float notal, nota2, nota3, promedio;
        System.out .println("lnqrese la primera nota"); 
        notal = Entrada.nextFloat();      
        System.out .println("lngrese la primera noca");
        nota2 = Entrada.nextFloat();
        System.out .println("Inqrese la primera nota"); 
        nota3 = Entrada .nextFloat();
        promedio = (notal + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio); 
        if (promedio >=7){
        System.out.println ("Promocionado");
        } else if (promedio >= 4){
            System.out.println("Reglar");
                 
        } else {
        System .out.println("Reprobado");

        } 
    }
    
}
