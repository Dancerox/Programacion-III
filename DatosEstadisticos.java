public class DatosEstadisticos{
    
    private double tiempo;
    private int numCom;
    private int numMov;
   
    public DatosEstadisticos(){
        this.tiempo = 0.0;
        this.numCom = 0;
        this.numMov = 0;
    }
      
    public void añadeTiempo(double ms){
        this.tiempo = this.tiempo + ms;
    }
         
    public void estableceTiempo(double ms){
        this.tiempo = ms;
    }
        
    public double dameTiempo(){
        return this.tiempo;
    }
    
    public void añadeComparacion() {
        this.numCom++;
    }
    
    public void estableceComparaciones(int numCom) {
        this.numCom = numCom;
    }
    
    public int dameComparaciones() {
        return this.numCom;
    }
    
    public void añadeMovimiento() {
        this.numMov++;
    }
    
    public void estableceMovimientos(int numMov) {
        this.numMov = numMov;
    }
    
    public int dameMovimientos() {
        return this.numMov;
    }
    
}