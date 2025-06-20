package principiofactorymethodybuilder;
public class WordCreator extends GeneradorReporte{

    public Formato crearReporte(){
        return new Word();
    }

}
