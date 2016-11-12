public class MediaDatosEstadisticos {

    private double medTiempo;
    private int medNumCom;
    private int medNumMov;
    
    public MediaDatosEstadisticos() {
        this.medTiempo = 0.0;
        this.medNumCom = 0;
        this.medNumMov = 0;
    }
    
    public void añadeDatosEstadisticos(DatosEstadisticos de) {
        this.medTiempo += de.dameTiempo();
        this.medNumCom += de.dameComparaciones();
        this.medNumMov += de.dameMovimientos();
    }
    
    public double dameMediaTiempos() {
        return this.medTiempo;
    }
    
    public double dameMediaComparaciones() {
        return this.medNumCom;
    }
    
    public double dameMediaMovimientos() {
        return this.medNumMov;
    }
    
}