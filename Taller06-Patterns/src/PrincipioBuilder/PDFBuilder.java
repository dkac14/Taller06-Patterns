package PrincipioBuilder;

public class PDFBuilder implements ReporteBuilder {
    

    public void crearEncabezado(String encabezado) {
        pdf.setEncabezado("Encabezado del reporte PDF");
    }

    public void crearCuerpo(String cuerpo) {
        pdf.setCuerpo("Cuerpo del reporte PDF");
    }

    @Override
    public void crearPie(String pie) {
        pdf.setPie("Pie de página del reporte PDF");
    }

    @Override
    public void crearExportacion() {
        pdf.setPie("Pie de página del reporte PDF");
    }
    

}
