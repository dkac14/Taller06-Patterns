package PrincipioFacade;

import PrincipioFactoryMethod.Reporte;

public class NotificadorCorreo{

    
    public void enviarMensaje(String mensaje, String destinatario) {


        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
        
    }

}
