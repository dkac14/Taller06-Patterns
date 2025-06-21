package PrincipioAdaptador;

import PrincipioDecorator.InformeInterface;

public class AdaptadorWhatsApp implements InformeInterface{
    private WhatsApp WhatsApp;

    public AdaptadorWhatsApp(WhatsApp WhatsApp) {
        this.WhatsApp = WhatsApp;
    }

    public void enviar(String mensaje) {
        WhatsApp.enviarMensajeWhatsApp(mensaje);
    }

    
}
