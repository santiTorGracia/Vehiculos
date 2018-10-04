public class Microbus extends VehiculoGente {

    @Override
    public double getPrecioAlquiler(int dias) {
        return super.getPrecioAlquiler(dias) + getPlazas()*2;
    }
}
