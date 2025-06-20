package PrincipioFactoryMethod;
public class ExcelCreator extends CreadorReporte{

    public Reporte crearReporte(){
        return new Excel();
    }

}
