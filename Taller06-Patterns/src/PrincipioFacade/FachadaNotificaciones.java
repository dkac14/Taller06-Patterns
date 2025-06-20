package PrincipioFacade;

public class FachadaNotificaciones {

    private NotificadorCorreo correo;
    private NotificadorWhatsApp whatsapp;
    private NotificadorTelegram telegram;
    public FachadaNotificaciones() {
        this.correo = new NotificadorCorreo();
        this.whatsapp = new NotificadorWhatsApp();
        this.telegram = new NotificadorTelegram();
    }


    public void enviarPorCorreo(String mensaje, String destinatario) {
        correo.enviarMensaje(mensaje, destinatario);
    }

    public void enviarPorWhatsApp(String mensaje, String destinatario) {
        whatsapp.enviarMensaje(mensaje, destinatario);
    }

    public void enviarPorTelegram(String mensaje, String destinatario) {
        telegram.enviarMensaje(mensaje, destinatario);
    }

    //En caso de querer enviar por todos a la vez.
    public void enviarATodos(String mensaje, String destinatario) {
        correo.enviarMensaje(mensaje, destinatario);
        whatsapp.enviarMensaje(mensaje, destinatario);
        telegram.enviarMensaje(mensaje, destinatario);
    }

    

}
