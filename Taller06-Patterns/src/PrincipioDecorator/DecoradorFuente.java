package PrincipioDecorator;

import PrincipioFactoryMethod.Reporte;

public class DecoradorFuente extends DecoradorInforme {

    public DecoradorFuente(Reporte reporte) {
        super(reporte);
        //TODO Auto-generated constructor stub
    }

    public void aplicandoFuente(){
        System.out.println("Aplicando fuente de texto al Informe");
    }


    @Override
    public void enviar(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviar'");
    }

}
