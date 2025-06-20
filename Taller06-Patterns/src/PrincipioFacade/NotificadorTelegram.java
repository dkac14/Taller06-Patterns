package PrincipioFacade;

public class NotificadorTelegram implements Notificador{

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {

        
        System.out.println("Enviando Telegram a " + destinatario + ": " + mensaje);
    }

}
