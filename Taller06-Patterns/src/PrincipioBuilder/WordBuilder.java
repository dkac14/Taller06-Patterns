package PrincipioBuilder;

import PrincipioFactoryMethod.Word;
import PrincipioFactoryMethod.Reporte;

public class WordBuilder implements ReporteBuilder{

    private Word word = new Word();


    @Override
    public void crearEncabezado(String encabezado) {
        word.setEncabezado("Encabezado del reporte Word");
    }

    @Override
    public void crearCuerpo(String cuerpo) {
        word.setCuerpo("Cuerpo del reporte Word");
    }

    @Override
    public void crearPie(String pie) {
        word.setPie("Pie de página del reporte Word");
    }

    @Override
    public void crearExportacion(String exportacion) {
        word.setPie("Pie de página del reporte Word");
    }

    public Reporte obtenerReporte() {
        return word;
    }
    

}
