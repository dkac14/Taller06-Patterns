package PrincipioBuilder;


import PrincipioFactoryMethod.Excel;
import PrincipioFactoryMethod.Reporte;

public class ExcelBuilder implements ReporteBuilder{
    private Excel excel = new Excel();


    @Override
    public void crearEncabezado(String encabezado) {
        excel.setEncabezado("Encabezado del reporte Excel");
    }

    @Override
    public void crearCuerpo(String cuerpo) {
        excel.setCuerpo("Cuerpo del reporte Excel");
    }

    @Override
    public void crearPie(String pie) {
        excel.setPie("Pie de página del reporte Excel");
    }

    @Override
    public void crearExportacion(String exportacion) {
        excel.setPie("Pie de página del reporte Excel");
    }

    public Reporte obtenerReporte() {
        return excel;
    }

    

}
