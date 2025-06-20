package PrincipioFactoryMethod;


public class PDF implements Reporte{
    private String encabezado;
    private String cuerpo;
    private String pie;
    private String exportacion;

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }


    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }


    public void setPie(String pie) {
        this.pie = pie;
    }


    public void setExportacion(String exportacion) {
        this.exportacion = exportacion;
    }


    public void generarReporte(){
        System.out.println("Generando reporte en PDF");
        System.out.println(encabezado);
        System.out.println(cuerpo);
        System.out.println(pie);
        System.out.println(exportacion);
    }


    @Override
    public String toString() {
        return "PDF [encabezado=" + encabezado + ", cuerpo=" + cuerpo + ", pie=" + pie + ", exportacion=" + exportacion
                + "]";
    }

    

}
