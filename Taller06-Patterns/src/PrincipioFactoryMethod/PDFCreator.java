package PrincipioFactoryMethod;

import PrincipioBuilder.PDFBuilder;
import PrincipioBuilder.ReporteBuilder;

public class PDFCreator extends CreadorReporte{

    public Reporte crearReporte(){
        ReporteBuilder builder = new PDFBuilder();
        builder.crearEncabezado("Encabezado");
        builder.crearCuerpo("Cuerpo");
        builder.crearPie("Pie");
        builder.crearExportacion("Exportado como .pdf");
        return builder.obtenerReporte();
    }

}
