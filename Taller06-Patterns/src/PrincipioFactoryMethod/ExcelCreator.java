package PrincipioFactoryMethod;

import PrincipioBuilder.ExcelBuilder;
import PrincipioBuilder.ReporteBuilder;

public class ExcelCreator extends CreadorReporte {
    @Override
    public Reporte crearReporte() {
        ReporteBuilder builder = new ExcelBuilder();
        builder.crearEncabezado("Encabezado");
        builder.crearCuerpo("Cuerpo");
        builder.crearPie("Pie");
        builder.crearExportacion("Exportado como .xlsx");
        return 
    }
}
