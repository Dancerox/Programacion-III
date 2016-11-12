/**
 * Christian Brito Ramos
 * Daniel Jesús Cerdeña López
 * 
 **/
 
import java.util.Scanner; 
public class ComparaMetodos {
    
    public static void main(String[] args) {
        DatosEstadisticos de = new DatosEstadisticos();
        DatosEstadisticos de2 = new DatosEstadisticos();
        Ordenar1Vector ov = new Ordenar1Vector();
        Ordenar2Vector ov2 = new Ordenar2Vector();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca tamaño del vector: ");
        int tam = reader.nextInt();
        
        int[] v = GeneraCaso.generaVector(tam, true);
        int[] v2 = GeneraCaso.generaVector(tam, true);
        
        ov.ordena(v, de);
        ov2.ordena(v2, de2);
        
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +ov.nombreMetodo()+"\' en Java para "+tam+" numeros es de "
                +de.dameTiempo()+" segundos, con " + de.dameComparaciones() + 
                " comparaciones y " + de.dameMovimientos() + " movimientos.\n");
                
        System.out.print("El tiempo de ejecución del algoritmo \'"
                +ov2.nombreMetodo()+"\' en Java para "+tam+" numeros es de "
                +de2.dameTiempo()+" segundos, con " + de2.dameComparaciones() + 
                " comparaciones y " + de2.dameMovimientos() + " movimientos.\n");
    }    

}
