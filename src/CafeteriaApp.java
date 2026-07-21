public class CafeteriaApp {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   BIENVENIDOS A COFFEE CODE SHOP   ");
        System.out.println("=========================================");

        FactoryPay fabrica;

        // 1. Cliente paga en Caja con Tarjeta POS
        fabrica = new FactoryPayPOS(18.50, "4557880012349981");
        fabrica.ejecutarTransaccion();

        // 2. Cliente paga por la App Móvil con Yape (QR)
        fabrica = new FactoryPayQR(24.00, "987654321", "YAPE");
        fabrica.ejecutarTransaccion();

        // 3. Cliente hace pedido web y paga Online
        fabrica = new FactoryPayWeb(45.00, "juan.perez@email.com", "TOK_SECURE_9921");
        fabrica.ejecutarTransaccion();
    }
}