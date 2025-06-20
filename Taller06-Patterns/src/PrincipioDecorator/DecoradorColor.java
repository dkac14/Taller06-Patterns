package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public class DecoradorColor extends DecoradorInforme{

    public DecoradorColor(Reporte informe) {
        super(informe);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoColor(){
        System.out.println("Aplicando color al Informe");
    }

}
