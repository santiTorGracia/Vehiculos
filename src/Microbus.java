public class Microbus extends VehiculoGente {

    public Microbus(String matricula, int plazas) {
        super(matricula, plazas);
    }

    @Override
    public double getPrecioAlquiler(int dias) {
        return super.getPrecioAlquiler(dias) + getPlazas()*2;
    }
}
