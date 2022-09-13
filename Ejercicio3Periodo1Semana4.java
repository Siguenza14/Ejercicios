package e3p1s4;
import java.util.Scanner;
public class E3P1S4 {
    public static void main(String[] args) {
       	Scanner Entrada = new Scanner (System.in);
	System.out.println("lngrese el numero de meses: ");
	float NM = Entrada.nextFloat ();
	double precio, prima, descuento, deuda, cuota;
	if (NM >=1 && NM <=65){
	precio =23000 * 1.13;
	descuento = 0;
	if (NM == 36){
	descuento = precio * 0.2;
	prima = (precio - descuento ) * 0.15;
        deuda =(precio - descuento)-prima ;
        }else {
           prima = precio * 015;
           deuda = precio - prima; 
        }
        cuota = deuda / NM;
	System.out.println( "Precio : " + precio) ;
	System.out.println ("Descuento : " + descuento);
	System.out.println("Deuda: " + deuda);
	System.out.println ("Cuota: " + cuota);
	} else {
	System .out .println ("Lo siento corazon lea por favor");
        }
    }
    
}
