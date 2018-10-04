public class Coche extends VehiculoGente {
    public Coche(String matricula, int plazas) {
        super(matricula, plazas);
    }

    @Override
    public String toString() {
        return "El coche tiene matrícula: " + getMatricula() + " y "
                + getPlazas() + " plazas.";
    }
}
