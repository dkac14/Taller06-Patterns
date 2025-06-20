package PrincipioDecorator;

import PrincipioFactoryMethodYBuilder.Informe;

public abstract class DecoradorInforme implements InformeInterface {
    private Informe informe;

    public DecoradorInforme(Informe informe){
        this.informe = informe;
    }
}
