package e7p1s6;
import java.util.Scanner;
public class E7P1S6 {
    public static void main(String[] args) {
       String nombre,clave;
       Scanner entrada = new Scanner(System.in);  
       System .out.print("Ingrese Nombre de usuario:"); 
       nombre = entrada.nextLine();
       System .out.print("Inqrese Clave de usuario: "); 
       clave = entrada.nextLine();
       if (nombre.equals("juan") && clave.equals("l23456")){
       System .out.println("Bienvenido al Sistema");
       }
       else {
       System .out.println("Nombre de Usuario o contraseña Incorrecto");
      }

    }
    
}
