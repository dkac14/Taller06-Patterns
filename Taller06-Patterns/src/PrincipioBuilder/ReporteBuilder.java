package PrincipioBuilder;

import PrincipioFactoryMethod.Reporte;

public interface ReporteBuilder extends Reporte{

    void crearEncabezado(String encabezado);
    void crearCuerpo(String cuerpo);
    void crearPie(String pie);
    void crearExportacion(String exportacion);
    void generarReporte();

}
