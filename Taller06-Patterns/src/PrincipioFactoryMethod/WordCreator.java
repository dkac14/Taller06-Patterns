package PrincipioFactoryMethod;

import PrincipioBuilder.WordBuilder;
import PrincipioBuilder.ReporteBuilder;

public class WordCreator extends CreadorReporte{

    public Reporte crearReporte(){
        ReporteBuilder builder = new WordBuilder();
        builder.crearEncabezado("Encabezado");
        builder.crearCuerpo("Cuerpo");
        builder.crearPie("Pie");
        builder.crearExportacion("Exportado como .doc");
        return builder.obtenerReporte();
    }

}
