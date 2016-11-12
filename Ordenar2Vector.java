import static java.lang.System.currentTimeMillis;


public class Ordenar2Vector implements OrdenarVector {
    
    @Override
    public String nombreMetodo(){
        return "Fusión natural";
    }
    
    @Override
    public void ordena(int[] v, DatosEstadisticos de){
        boolean cambio;
        int lder, otral, lizq, lsal, movlizq, movlsal, aux;
        int[] auxvec;
        double t_inicio = currentTimeMillis();
        
        do {
            for(int x=0;x<v.length;x++) {
                System.out.printf(v[x] + ",");
            }
            System.out.printf("\n");
            for(int y=0;y<v.length;y++) {
                System.out.printf(v[y] + ",");
            }
            System.out.printf("\n");
            cambio = false;
            lder = v.length-1; 
            otral = v.length-1;
            lizq = 0;
            lsal = 0;
            movlizq = 1;
            movlsal = 1;
            auxvec = new int[v.length];
            while (lizq < lder) {
                if(v[lizq] > v[lder]) {
                    aux = lizq;
                    lizq = lder;
                    lder = aux;
                    movlizq -= 1;
                }
                de.añadeComparacion();
                auxvec[lsal] = v[lizq];
                de.añadeMovimiento();
                lsal = lsal+movlsal;
                lizq = lizq+movlizq;
                if(v[lizq-movlizq] > v[lizq]) {
                    do {
                        auxvec[lsal] = v[lder];
                        de.añadeMovimiento();
                        lsal = lsal+movlsal;
                        lder = lder-movlizq;
                        de.añadeComparacion();
                    } while (v[lder+movlizq] <= v[lder]);
                    de.estableceComparaciones(-1);
                    cambio = true;
                    movlsal -= 1;
                    aux = lsal;
                    lsal = otral;
                    otral = aux;
                }
                de.añadeComparacion();
            }
            auxvec[lsal] = v[lizq];
            for(int i=1;i<v.length;i++) {
                v[i] = auxvec[i];
                de.añadeMovimiento();
            }
            
        } while(cambio != false);
        
        System.out.printf("\nFinal: ");
        for(int y=0;y<v.length;y++) {
            System.out.printf(v[y] + ",");
        }
        System.out.printf("\n");
        
        double t_fin = currentTimeMillis();
        de.estableceTiempo((t_fin - t_inicio) / 1000);
        
    }    
    
}