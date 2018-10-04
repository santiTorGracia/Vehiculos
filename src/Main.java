import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int DIAS_ALQUILER = 7;

    public static void main(String[] args){
        List<Vehiculo> vehiculos = cargarVehiculos();
        displayVehiculos(vehiculos);


        do {
            System.out.print("Introduce una matrícula: ");
            Scanner in = new Scanner(System.in);
            String matricula = in.next();

            for(Vehiculo v: vehiculos){
                if(v.getMatricula().equals(matricula)){
                    displayVehiculo(v);
                }
            }
        } while(true);
    }

    private static void displayVehiculos(List<Vehiculo> vehiculos) {
        for(Vehiculo v: vehiculos){
            displayVehiculo(v);
        }
    }

    private static void displayVehiculo(Vehiculo v) {
        System.out.println("Matricula: " + v.getMatricula());
        if(v instanceof VehiculoCarga) {
            System.out.println("PMA: " + ((VehiculoCarga) v).getPma());
        } else if(v instanceof VehiculoGente){
            System.out.println("Plazas: " + ((VehiculoGente) v).getPlazas());
        }
        System.out.println("Precio Alquiler: " + v.getPrecioAlquiler(DIAS_ALQUILER));
    }

    private static List<Vehiculo> cargarVehiculos(){
        Random random = new Random();
        List<Vehiculo> vehiculos = new ArrayList<>();

        Camion camion = new Camion();
        camion.setMatricula(String.valueOf(random.nextInt()%100 + 1));
        camion.setPma(random.nextInt()%10);
        vehiculos.add(camion);

        Coche coche = new Coche();
        coche.setMatricula(String.valueOf(random.nextInt()%100 + 1));
        coche.setPlazas(random.nextInt()%10);
        vehiculos.add(coche);

        Microbus microbus = new Microbus();
        microbus.setMatricula(String.valueOf(random.nextInt()%100 + 1));
        microbus.setPlazas(random.nextInt()%10);
        vehiculos.add(microbus);

        Furgoneta furgoneta = new Furgoneta();
        furgoneta.setMatricula(String.valueOf(random.nextInt()%100 + 1));
        furgoneta.setPma(random.nextInt()%10);
        vehiculos.add(furgoneta);

        return vehiculos;
    }
}
