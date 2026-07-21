package factories;

public class FactoryPayWeb extends FactoryPay {
    private double monto;
    private String emailCliente;
    private String tokenTarjeta;

    public FactoryPayWeb(double monto, String emailCliente, String tokenTarjeta) {
        this.monto = monto;
        this.emailCliente = emailCliente;
        this.tokenTarjeta = tokenTarjeta;
    }

    @Override
    public Pay crearPago() {
        return new PayWeb(monto, emailCliente, tokenTarjeta);
    }
}