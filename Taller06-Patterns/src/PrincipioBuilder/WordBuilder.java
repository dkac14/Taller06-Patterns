package PrincipioBuilder;

public class WordBuilder implements ReporteBuilder{

    @Override
    public void crearEncabezado(String encabezado) {
        word.setEncabezado("Encabezado del reporte PDF");
    }

    @Override
    public void crearCuerpo(String cuerpo) {
        word.setCuerpo("Cuerpo del reporte PDF");
    }

    @Override
    public void crearPie(String pie) {
        word.setPie("Pie de página del reporte PDF");
    }

    @Override
    public void crearExportacion(String exportacion) {
        word.setPie("Pie de página del reporte PDF");
    }

}
