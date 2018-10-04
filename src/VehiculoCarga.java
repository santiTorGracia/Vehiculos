public class VehiculoCarga extends Vehiculo {
    private int pma;

    @Override
    public float getPrecioAlquiler(int dias) {
        float precio = super.getPrecioAlquiler(dias);
        return precio + 20*pma;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
}
