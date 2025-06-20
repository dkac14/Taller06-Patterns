package principiofactorymethodybuilder;
public class ExcelCreator extends GeneradorReporte{

    public Formato crearReporte(){
        return new Excel();
    }

}
