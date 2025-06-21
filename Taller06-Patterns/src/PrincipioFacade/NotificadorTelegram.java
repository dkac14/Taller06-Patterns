package PrincipioFacade;

public class NotificadorTelegram{

    
    public void enviarMensaje(String mensaje, String destinatario) {

        
        System.out.println("Enviando Telegram a " + destinatario + ": " + mensaje);
    }

}
