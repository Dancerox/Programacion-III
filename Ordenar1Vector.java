import static java.lang.System.currentTimeMillis;
 
public class Ordenar1Vector implements OrdenarVector{
  
    @Override
    public String nombreMetodo(){
        return "Selección Lineal con Intercambio";
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de){
        int menor;
        int pos;
        double t_inicio = currentTimeMillis();

        for(int i = 0; i < v.length-1; i++){
            menor = v[i];
            pos = i;
                 
            for(int j = i+1; j < v.length; j++){
                if(menor > v[j]){
                    menor = v[j];
                    pos = j;
                }
                de.añadeComparacion();
            }
            
            v[pos] = v[i];
            v[i] = menor;
            de.estableceMovimientos(2);
        }
        
        double t_fin = currentTimeMillis();
        de.estableceTiempo((t_fin-t_inicio)/1000);
    }
}