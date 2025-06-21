package PrincipioFacade;

import PrincipioFactoryMethod.Reporte;

public interface Notificador {
    
    void enviarMensaje(Reporte reporte, String destinatario);

}
