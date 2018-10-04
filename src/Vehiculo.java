public class Vehiculo {
    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioAlquiler(int dias){
        return 50*dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
