package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public abstract class DecoradorInforme implements InformeInterface {
    private Reporte reporte;

    public DecoradorInforme(Reporte reporte){
        this.reporte = reporte;
    }
}
