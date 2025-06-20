package PrincipioFactoryMethod;

public abstract class CreadorReporte {
    abstract Reporte crearReporte();

    public void EnviarReporte(Reporte reporte){
        System.out.println("Enviando reporte");
    }
    
    public void enviar(String mensaje) {
        System.out.println("Enviando notificacion por email");
    }
}
