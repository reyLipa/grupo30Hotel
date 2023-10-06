
package Entidades;
import java.time.LocalDate;


public class Pago {
     private int idPago;
    private double pagoTotal; 
    private LocalDate fechaPago;
    private boolean estado;

    public Pago(int idPago, double pagoTotal, LocalDate fechaPago, boolean estado) {
        this.idPago = idPago;
        this.pagoTotal = pagoTotal;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    public Pago(double pagoTotal, LocalDate fechaPago, boolean estado) {
        this.pagoTotal = pagoTotal;
        this.fechaPago = fechaPago;
        this.estado = estado;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", pagoTotal=" + pagoTotal + ", fechaPago=" + fechaPago + ", estado=" + estado + '}';
    }
    
    
}
