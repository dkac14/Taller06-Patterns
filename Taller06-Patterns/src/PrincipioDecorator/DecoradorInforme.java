package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public abstract class DecoradorInforme implements InformeInterface {
    private Reporte informe;

    public DecoradorInforme(Reporte informe){
        this.informe = informe;
    }
}
