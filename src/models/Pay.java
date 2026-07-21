package models;

import java.util.UUID;

public abstract class Pay {
    protected double monto;
    protected String idTransaccion;

    public Pay(double monto) {
        this.monto = monto;
        this.idTransaccion = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public abstract boolean procesarPago();

    public abstract void generarComprobante();

    public double getMonto() {
        return monto;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }
}
