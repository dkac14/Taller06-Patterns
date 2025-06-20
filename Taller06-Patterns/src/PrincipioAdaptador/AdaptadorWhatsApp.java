package PrincipioAdaptador;

import PrincipioDecorator.InformeInterface;
import PrincipioFactoryMethod.Reporte;

public class AdaptadorWhatsApp implements InformeInterface{
    private WhatsApp WhatsApp;

    public AdaptadorWhatsApp(WhatsApp WhatsApp) {
        this.WhatsApp = WhatsApp;
    }

    public void enviar(String mensaje) {
        WhatsApp.enviarMensajeWhatsApp(mensaje);
    }

    @Override
    public void EnviarReporte(Reporte reporte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EnviarReporte'");
    }
}
