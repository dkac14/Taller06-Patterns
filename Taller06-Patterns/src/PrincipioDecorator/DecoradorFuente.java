package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public class DecoradorFuente extends DecoradorInforme {

    public DecoradorFuente(Reporte informe) {
        super(informe);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoFuente(){
        System.out.println("Aplicando fuente de texto al Informe");
    }

}
