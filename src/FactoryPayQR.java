public class FactoryPayQR extends FactoryPay {
    private double monto;
    private String numeroTelefono;
    private String proveedor;

    public FactoryPayQR(double monto, String numeroTelefono, String proveedor) {
        this.monto = monto;
        this.numeroTelefono = numeroTelefono;
        this.proveedor = proveedor;
    }

    @Override
    public Pay crearPago() {
        return new PayQR(monto, numeroTelefono, proveedor);
    }
}