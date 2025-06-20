package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public interface InformeInterface {
    public void EnviarReporte(Reporte reporte);

    public void enviar(String mensaje);
}
