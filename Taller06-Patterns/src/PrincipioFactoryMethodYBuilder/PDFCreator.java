package principiofactorymethodybuilder;
public class PDFCreator extends GeneradorReporte{

    public Formato crearReporte(){
        return new PDF();
    }

}
