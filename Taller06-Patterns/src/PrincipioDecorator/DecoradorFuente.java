package PrincipioDecorator;

import PrincipioFactoryMethod.Informe;

public class DecoradorFuente extends DecoradorInforme {

    public DecoradorFuente(Informe informe) {
        super(informe);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoFuente(){
        System.out.println("Aplicando fuente de texto al Informe");
    }

}
