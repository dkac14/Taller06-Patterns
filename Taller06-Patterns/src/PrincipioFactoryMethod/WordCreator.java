package PrincipioFactoryMethod;
public class WordCreator extends CreadorReporte{

    public Reporte crearReporte(){
        return new Word();
    }

}
