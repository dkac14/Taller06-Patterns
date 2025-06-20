package PrincipioFacade;

public class NotificadorCorreo implements Notificador{

    @Override
    public void enviarMensaje(String mensaje, String destinatario) {

        
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }

}
