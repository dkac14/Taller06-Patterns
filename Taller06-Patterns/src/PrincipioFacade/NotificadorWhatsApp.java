package PrincipioFacade;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {
        System.out.println("Enviando WhatsApp a " + destinatario + ": " + mensaje);
    }


}
