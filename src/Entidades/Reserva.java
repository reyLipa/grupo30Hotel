
package Entidades;

import java.time.LocalDate;

public class Reserva {
    
    private int idReserva;
    private Huesped idHuesped;
    private Habitacion idHabitacion;   
    private int cantPersonas;
    private LocalDate fechaReserva,fechaEntrada, fechaSalida;
    private String tipoReserva;
    private boolean estado;
    private Pago idPago;

    public Reserva(int idReserva, Huesped idHuesped, Habitacion idHabitacion, int cantPersonas, LocalDate fechaReserva, LocalDate fechaEntrada, LocalDate fechaSalida, String tipoReserva, boolean estado, Pago idPago) {
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.cantPersonas = cantPersonas;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoReserva = tipoReserva;
        this.estado = estado;
        this.idPago = idPago;
    }

    public Reserva(Huesped idHuesped, Habitacion idHabitacion, int cantPersonas, LocalDate fechaReserva, LocalDate fechaEntrada, LocalDate fechaSalida, String tipoReserva, boolean estado, Pago idPago) {
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.cantPersonas = cantPersonas;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.tipoReserva = tipoReserva;
        this.estado = estado;
        this.idPago = idPago;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHuesped=" + idHuesped + ", idHabitacion=" + idHabitacion + ", cantPersonas=" + cantPersonas + ", fechaReserva=" + fechaReserva + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", tipoReserva=" + tipoReserva + ", estado=" + estado + ", idPago=" + idPago + '}';
    }

}