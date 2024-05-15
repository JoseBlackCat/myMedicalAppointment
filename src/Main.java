public class Main {
    public static void main(String[] args) {
        Doctor firstDoctor = new Doctor();
        firstDoctor.nombre = "Alejandro Rodriguez";
        firstDoctor.mostrarID();
        firstDoctor.mostrarNombre();

        Doctor secondDoctor = new Doctor();
        secondDoctor.mostrarID();
    }
}