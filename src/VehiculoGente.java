public class VehiculoGente extends Vehiculo {
    private int plazas;

    @Override
    public double getPrecioAlquiler(int dias) {
        double precio = super.getPrecioAlquiler(dias);
        return precio + 1.5*plazas*dias;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
