package PrincipioAdaptador;

import PrincipioDecorator.InformeInterface;
import PrincipioFactoryMethod.Reporte;

public class AdaptadorTelegram implements InformeInterface{
    private Telegram Telegram;

    public AdaptadorTelegram(ServicioTelegram servicioTelegram) {
        this.Telegram = Telegram;
    }

    public void enviar(String mensaje) {
        Telegram.enviarTelegram(mensaje);
    }

    @Override
    public void EnviarReporte(Reporte reporte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EnviarReporte'");
    }
}
