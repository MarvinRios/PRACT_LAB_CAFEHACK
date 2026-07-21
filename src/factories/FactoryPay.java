package factories;

public abstract class FactoryPay {
    public abstract Pay crearPago();

    public void ejecutarTransaccion() {
        Pay pago = crearPago();
        System.out.println("\n--- INICIANDO PROCESO DE COBRO ---");
        boolean exito = pago.procesarPago();
        if (exito) {
            pago.generarComprobante();
        } else {
            System.out.println(" X Fallo en el procesamiento del pago.");
        }
    }
}