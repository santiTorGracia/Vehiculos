import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int DIAS_ALQUILER = 7;
    private static final String FILENAME = "vehiculos.txt";

    public static void main(String[] args) throws FileNotFoundException {
        VehiculoReader reader = new VehiculoReader(FILENAME);
        List<Vehiculo> vehiculos = reader.getVehiculos();
        displayVehiculos(vehiculos);

        do {
            System.out.print("Introduce una matrícula: ");
            Scanner in = new Scanner(System.in);
            String matricula = in.next();

            for(Vehiculo v: vehiculos){
                if(v.getMatricula().equals(matricula)){
                    System.out.println(v.toString());
                }
            }
        } while(true);
    }

    private static void displayVehiculos(List<Vehiculo> vehiculos) {
        for(Vehiculo v: vehiculos){
            System.out.println(v.toString());
        }
    }
}
