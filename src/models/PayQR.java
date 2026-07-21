package models;

public class PayQR extends Pay {
    private String numeroTelefono;
    private String proveedor;

    public PayQR(double monto, String numeroTelefono, String proveedor) {
        super(monto);
        this.numeroTelefono = numeroTelefono;
        this.proveedor = proveedor;
    }

    @Override
    public boolean procesarPago() {
        System.out.println(" Generating Dynamic QR Code for " + proveedor + "...");
        System.out.println(" Validating Token for phone: " + numeroTelefono);
        return true;
    }

    @Override
    public void generarComprobante() {
        System.out.println("--- COMPROBANTE BILLETERA DIGITAL ---");
        System.out.println("Proveedor     : " + proveedor);
        System.out.println("ID Transacción: QR-" + idTransaccion);
        System.out.println("Monto Pagado  : S/ " + monto);
        System.out.println("Estado        : CONFIRMADO EN TIEMPO REAL");
        System.out.println("------------------------------------");
    }
}