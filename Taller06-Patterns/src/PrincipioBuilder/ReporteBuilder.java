package PrincipioBuilder;

import PrincipioFactoryMethod.Reporte;

public interface ReporteBuilder{

    void crearEncabezado(String encabezado);
    void crearCuerpo(String cuerpo);
    void crearPie(String pie);
    void crearExportacion(String exportacion);
    Reporte obtenerReporte();
    

}
