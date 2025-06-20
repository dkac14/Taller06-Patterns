package PrincipioFactoryMethod;
public class PDFCreator extends CreadorReporte{

    public Reporte crearReporte(){
        return new PDF();
    }

}
