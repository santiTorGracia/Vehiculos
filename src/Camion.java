public class Camion extends VehiculoCarga {

    @Override
    public double getPrecioAlquiler(int dias) {
        return super.getPrecioAlquiler(dias) + 40;
    }
}
