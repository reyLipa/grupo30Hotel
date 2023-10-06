
package Entidades;

public class Habitacion {
    
    private int idHabitacion;    
    private TipoHabitacion idTipoHab;
    private int numHabitacion;
    private String descripcion;
    private boolean estado;

    public Habitacion(int idHabitacion, TipoHabitacion idTipoHab, int numHabitacion, String descripcion, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.idTipoHab = idTipoHab;
        this.numHabitacion = numHabitacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Habitacion(TipoHabitacion idTipoHab, int numHabitacion, String descripcion, boolean estado) {
        this.idTipoHab = idTipoHab;
        this.numHabitacion = numHabitacion;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Habitacion() {
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getIdTipoHab() {
        return idTipoHab;
    }

    public void setIdTipoHab(TipoHabitacion idTipoHab) {
        this.idTipoHab = idTipoHab;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", idTipoHab=" + idTipoHab + ", numHabitacion=" + numHabitacion + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
    
    

    

    
    
    
    
    
}
