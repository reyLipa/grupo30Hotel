
package Entidades;


public class TipoHabitacion {
    private int idTipoHab;
    private CategoriaHabitacion tipohabitacion;
    private int cantPersonasMax;
    private int cantCamas;
    private CategoriaCama tipoCamas;//cambiar a string
    private double precioNoche;

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idTipoHab, CategoriaHabitacion tipohabitacion, int cantPersonasMax, int cantCamas, CategoriaCama tipoCamas, double precioNoche) {
        this.idTipoHab = idTipoHab;
        this.tipohabitacion = tipohabitacion;
        this.cantPersonasMax = cantPersonasMax;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public TipoHabitacion(CategoriaHabitacion tipohabitacion, int cantPersonasMax, int cantCamas, CategoriaCama tipoCamas, double precioNoche) {
        this.tipohabitacion = tipohabitacion;
        this.cantPersonasMax = cantPersonasMax;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

    public int getIdTipoHab() {
        return idTipoHab;
    }

    public void setIdTipoHab(int idTipoHab) {
        this.idTipoHab = idTipoHab;
    }

    public CategoriaHabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(CategoriaHabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public int getCantPersonasMax() {
        return cantPersonasMax;
    }

    public void setCantPersonasMax(int cantPersonasMax) {
        this.cantPersonasMax = cantPersonasMax;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public CategoriaCama getTipoCamas() {
        return tipoCamas;
    }

    public void setTipoCamas(CategoriaCama tipoCamas) {
        this.tipoCamas = tipoCamas;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idTipoHab=" + idTipoHab + ", tipohabitacion=" + tipohabitacion + ", cantPersonasMax=" + cantPersonasMax + ", cantCamas=" + cantCamas + ", tipoCamas=" + tipoCamas + ", precioNoche=" + precioNoche + '}';
    }
    


    
    
}
