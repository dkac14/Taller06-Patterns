package principiosigleton;

public class GeneradorDeReportes {
    // Instancia única
    private static GeneradorDeReportes instancia;

    // Constructor privado
    private GeneradorDeReportes() {
        System.out.println("Inicializando generador de reportes...");
    }

    // Método de acceso global (Singleton lazy)
    public static GeneradorDeReportes obtenerInstancia() {
        if (instancia == null) {
            instancia = new GeneradorDeReportes();
        }
        return instancia;
    }

    // Método funcional
    public void generar(String tipo) {
        System.out.println("Generando reporte en formato: " + tipo);
    }
}
