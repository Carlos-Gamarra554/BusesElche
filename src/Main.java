import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Parada p1 = new Parada("001", "Doctor Caro", "C/ Centre-Doctor Caro");
        Parada p2 = new Parada("002", "Vicente Blasco 22", "C/ Vicente Blasco Ibáñez, 22");
        Parada p3 = new Parada("003", "Vicente Blasco 80", "C/ Vicente Blasco Ibáñez, 80");
        Parada p4 = new Parada("004", "Inem Carrús", "Inem Carrús");
        Parada p5 = new Parada("005", "Pedro Moreno", "C/ Pedro Moreno Sastre, 62");


        Linea lineaA = new Linea("A");
        lineaA.addTrayecto("001", "002", 75);
        lineaA.addTrayecto("002", "003", 60);
        lineaA.addTrayecto("003", "004", 40);
        lineaA.addTrayecto("004", "005", 40);
        lineaA.addTrayecto("005", "001", 40);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige parada inicial (código): ");
        String origen = scanner.nextLine();

        System.out.println("Elige parada final (código): ");
        String destino = scanner.nextLine();

        int totalTiempo = 0;
        List<String> recorrido = new ArrayList<>();
        recorrido.add(origen);

        if (lineaA.getTiempo(origen, destino) != null) {
            totalTiempo += lineaA.getTiempo(origen, destino);
            recorrido.add(destino);
        } else {
            System.out.println("No se encontró un trayecto directo. Añade lógica adicional.");
        }
        System.out.println("Duración total del trayecto: " + totalTiempo + " segundos.");
        System.out.println("Recorrido -> " + recorrido);
    }
}