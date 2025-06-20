package PrincipioFacade;

import PrincipioFactoryMethod.Reporte;

public class NotificadorCorreo implements Notificador{

    @Override
    public void enviarMensaje(Reporte reporte, String destinatario) {


        System.out.println("Enviando correo a " + destinatario + ": " + reporte);
        
    }

}
