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


    public void enviarPorCorreo(Reporte reporte, String destinatario) {
        correo.enviarMensaje(reporte, destinatario);
    }

    public void enviarPorWhatsApp(Reporte reporte, String destinatario) {
        whatsapp.enviarMensaje(reporte, destinatario);
    }

    public void enviarPorTelegram(Reporte reporte, String destinatario) {
        telegram.enviarMensaje(reporte, destinatario);
    }

    //En caso de querer enviar por todos a la vez.
    public void enviarATodos(Reporte reporte, String destinatario) {
        correo.enviarMensaje(reporte, destinatario);
        whatsapp.enviarMensaje(reporte, destinatario);
        telegram.enviarMensaje(reporte, destinatario);
    }

    

}
