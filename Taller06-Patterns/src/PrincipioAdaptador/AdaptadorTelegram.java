package PrincipioAdaptador;

import PrincipioDecorator.InformeInterface;
import PrincipioFactoryMethod.Reporte;

public class AdaptadorTelegram implements InformeInterface{
    private Telegram Telegram;

    public AdaptadorTelegram(Telegram servicioTelegram) {
        this.Telegram = Telegram;
    }

    public void enviar(String mensaje) {
        Telegram.enviarTelegram(mensaje);
    }


}
