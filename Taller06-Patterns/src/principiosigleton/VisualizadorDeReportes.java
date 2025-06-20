package principiosigleton;

public class VisualizadorDeReportes {
    private static VisualizadorDeReportes instancia;

    // Constructor privado
    private VisualizadorDeReportes() {
        System.out.println("Visualizador inicializado");
    }

    // Método para obtener la instancia única
    public static VisualizadorDeReportes obtenerInstancia() {
        if (instancia == null) {
            instancia = new VisualizadorDeReportes();
        }
        return instancia;
    }

    // Método para mostrar un reporte
    public void mostrarReporte(String contenido) {
        System.out.println("Mostrando reporte:\n" + contenido);
    }
}
