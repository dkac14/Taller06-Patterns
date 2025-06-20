package PrincipioDecorator;

import PrincipioFactoryMethod.Informe;

public class DecoradorColor extends DecoradorInforme{

    public DecoradorColor(Informe informe) {
        super(informe);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoColor(){
        System.out.println("Aplicando color al Informe");
    }

}
