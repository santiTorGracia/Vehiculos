public class Furgoneta extends VehiculoCarga{
    public Furgoneta(String matricula, int pma) {
        super(matricula, pma);
    }

    @Override
    public String toString() {
        return "La furgoneta tiene matrícula: " + getMatricula() +
                " y puede soportar una carga máxima de " + getPma() + ".";
    }
}
