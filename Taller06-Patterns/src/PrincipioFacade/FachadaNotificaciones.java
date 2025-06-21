package PrincipioFacade;

import PrincipioFactoryMethod.Reporte;

public class FachadaNotificaciones {

    private NotificadorCorreo correo;
    private NotificadorWhatsApp whatsapp;
    private NotificadorTelegram telegram;
    public FachadaNotificaciones() {
        this.correo = new NotificadorCorreo();
        this.whatsapp = new NotificadorWhatsApp();
        this.telegram = new NotificadorTelegram();
    }

    //En caso de querer enviar por todos a la vez.
    public void enviarATodos(String mensaje, String destinatario) {
        correo.enviarMensaje(mensaje, destinatario);
        whatsapp.enviarMensaje(mensaje, destinatario);
        telegram.enviarMensaje(mensaje, destinatario);
    }

    

}
