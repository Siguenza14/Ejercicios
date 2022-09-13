package e7p3s4;
public class E7P3S4 {
    public static void main(String[] args) {
        int suma = 0, cant = 0 , valor, promedio; 
        Scanner entrada = new Scanner (System.in); 
        do {
        System.out.println ("Ingrese o pa_a sa11r"); 
        System.out.println ("Inqrese e1 valor"); 
        valor = entrada .nextint ();
        if (valor != 0){
        suma = suma +valor;
        cant = cant +1;
        }
       } while (valor != 0);
        if  (cant != 0){
            promedio = suma / cant;
        
        System.out.println ("E1 promedio es: " + promedio);
        } else {
        System.out.println ("No se ingresaron valores");
      }
    }
    
}
