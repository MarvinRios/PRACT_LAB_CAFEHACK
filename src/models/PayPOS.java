package models;

public class PayPOS extends Pay {
    private String numeroTarjeta;

    public PayPOS(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago() {
        System.out.println(" Connecting to POS Terminal...");
        System.out.println(" Processing Card: **** **** **** " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        return true;
    }

    @Override
    public void generarComprobante() {
        System.out.println("--- COMPROBANTE POS (TARJETA) ---");
        System.out.println("ID Transacción: POS-" + idTransaccion);
        System.out.println("Monto Pagado  : S/ " + monto);
        System.out.println("Estado        : APROBADO EN CAJA");
        System.out.println("---------------------------------");
    }
}