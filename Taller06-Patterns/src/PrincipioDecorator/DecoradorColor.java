package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public class DecoradorColor extends DecoradorInforme{

    public DecoradorColor(Reporte reporte) {
        super(reporte);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoColor(){
        System.out.println("Aplicando color al Informe");
    }

    @Override
    public void EnviarReporte(Reporte reporte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EnviarReporte'");
    }

    @Override
    public void enviar(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviar'");
    }

}
