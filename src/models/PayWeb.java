package models;

public class PayWeb extends Pay {
    private String emailCliente;
    private String tokenTarjeta;

    public PayWeb(double monto, String emailCliente, String tokenTarjeta) {
        super(monto);
        this.emailCliente = emailCliente;
        this.tokenTarjeta = tokenTarjeta;
    }

    @Override
    public boolean procesarPago() {
        System.out.println(" Connecting to Online Payment Gateway...");
        System.out.println(" Authorizing token " + tokenTarjeta + " for " + emailCliente);
        return true;
    }

    @Override
    public void generarComprobante() {
        System.out.println("--- COMPROBANTE WEB ONLINE ---");
        System.out.println("Cliente Email : " + emailCliente);
        System.out.println("ID Transacción: WEB-" + idTransaccion);
        System.out.println("Monto Pagado  : S/ " + monto);
        System.out.println("Estado        : APROBADO Y ENVIADO POR EMAIL");
        System.out.println("------------------------------");
    }
}