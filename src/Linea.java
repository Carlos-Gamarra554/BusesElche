import java.util.HashMap;
import java.util.Map;

class Linea {
    String id;
    Map<String, Integer> tiempos;

    public Linea(String id) {
        this.id = id;
        this.tiempos = new HashMap<>();
    }

    public void addTrayecto(String origen, String destino, int tiempo) {
        tiempos.put(origen + "-" + destino, tiempo);
    }

    public Integer getTiempo(String origen, String destino) {
        return tiempos.get(origen + "-" + destino);
    }
}