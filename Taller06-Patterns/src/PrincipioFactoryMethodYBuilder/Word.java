package principiofactorymethodybuilder;
public class Word implements Formato{
    private String encabezado;
    private String cuerpo;
    private String pie;
    private String exportacion;

    public void crearEncabezado(String encabezado){
        this.encabezado=encabezado;
    }


    public void crearCuerpo(String cuerpo){
        this.cuerpo=cuerpo;
    }

    public void crearPie(String pie){
        this.pie=pie;
    }

    public void crearExportacion(String exportacion){
        this.exportacion=exportacion;
    }

    public void generarReporte(){
        System.out.println("Generando reporte en Word");
        System.out.println(encabezado);
        System.out.println(cuerpo);
        System.out.println(pie);
        System.out.println(exportacion);
    }
}
