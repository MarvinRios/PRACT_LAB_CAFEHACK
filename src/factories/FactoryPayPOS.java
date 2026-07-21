package factories;

public class FactoryPayPOS extends FactoryPay {
    private double monto;
    private String numeroTarjeta;

    public FactoryPayPOS(double monto, String numeroTarjeta) {
        this.monto = monto;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public Pay crearPago() {
        return new PayPOS(monto, numeroTarjeta);
    }
}