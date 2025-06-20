package PrincipioBuilder;

import PrincipioFactoryMethod.PDF;
import PrincipioFactoryMethod.Reporte;

public class PDFBuilder implements ReporteBuilder {
    

    private PDF pdf = new PDF();


    @Override
    public void crearEncabezado(String encabezado) {
        pdf.setEncabezado("Encabezado del reporte PDF");
    }

    @Override
    public void crearCuerpo(String cuerpo) {
        pdf.setCuerpo("Cuerpo del reporte PDF");
    }

    @Override
    public void crearPie(String pie) {
        pdf.setPie("Pie de página del reporte PDF");
    }

    @Override
    public void crearExportacion(String exportacion) {
        pdf.setPie("Pie de página del reporte PDF");
    }

    public Reporte obtenerReporte() {
        return pdf;
    }
    

}
