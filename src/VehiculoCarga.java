public class VehiculoCarga extends Vehiculo {
    private int pma;

    @Override
    public double getPrecioAlquiler(int dias) {
        double precio = super.getPrecioAlquiler(dias);
        return precio + 20*pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
}
