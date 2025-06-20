package PrincipioFacade;

public class SistemaFacade {

    public static void main(String[] args) {
        FachadaNotificaciones notificaciones = new FachadaNotificaciones();

        notificaciones.enviarPorCorreo("Hola por correo", "correo@ejemplo.com");
        notificaciones.enviarPorWhatsApp("Hola por WhatsApp", "+593123456789");
        notificaciones.enviarPorTelegram("Hola por Telegram", "@usuarioTelegram");

        
        notificaciones.enviarATodos("Mensaje importante", "Destino general");

        //El destino general podría ser descrito como una coleccción
        //de elementos con cada posible destinatario.
    }

}
