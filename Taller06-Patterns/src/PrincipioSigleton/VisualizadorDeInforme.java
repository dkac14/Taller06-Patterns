package PrincipioSigleton;

public class VisualizadorDeInforme {
    private static VisualizadorDeInforme instancia;

    // Constructor privado
    private VisualizadorDeInforme() {
        System.out.println("Visualizador inicializado");
    }

    // Método para obtener la instancia única
    public static VisualizadorDeInforme obtenerInstancia() {
        if (instancia == null) {
            instancia = new VisualizadorDeInforme();
        }
        return instancia;
    }

    // Método para mostrar un reporte
    public void mostrarInforme(String contenido) {
        System.out.println("Mostrando reporte:\n" + contenido);
    }
}
