public class Linea {
    private String codigo;
    private int periodicidad;

    public Linea(String codigo, int periodicidad) {
        this.codigo = codigo;
        this.periodicidad = periodicidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }
}
