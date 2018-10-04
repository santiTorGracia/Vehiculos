import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * This class reads Vehiculo (s) from a file. This file must be in the form:
 * type (Coche/Microbus/Furgoneta/Camion)
 * matricula
 * plazas/pma
 */
public class VehiculoReader {
    private String[] lines;

    public VehiculoReader(String filename) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
        Stream<String> stream = br.lines();
        lines = (String[]) stream.toArray();
    }

    public List<Vehiculo> getVehiculos() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        for(int i = 0; i < lines.length;) {
            String type = lines[i++];
            String matricula = lines[i++];
            int plORpma = Integer.valueOf(lines[i++]);
            vehiculos.add(getVehiculo(type, matricula, plORpma));
        }

        return vehiculos;
    }

    private Vehiculo getVehiculo(String type, String matricula, int plORpma) {
        switch(type){
            case "Coche":
                return new Coche(matricula, plORpma);
            case "Microbus":
                return new Microbus(matricula, plORpma);
            case "Furgoneta":
                return new Furgoneta(matricula, plORpma);
            case "Camion":
                return new Camion(matricula, plORpma);
        }
        throw new IllegalArgumentException("type is not valid.");
    }
}
