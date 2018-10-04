public class Camion extends VehiculoCarga {

    public Camion(String matricula, int pma) {
        super(matricula, pma);
    }

    @Override
    public double getPrecioAlquiler(int dias) {
        return super.getPrecioAlquiler(dias) + 40;
    }

    @Override
    public String toString() {
        return "El camión tiene matrícula: " + getMatricula() +
                " y puede soportar una carga máxima de " + getPma() + ".";
    }
}
