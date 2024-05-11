public class Doctor {
    // Atributos
    int idDoctor;
    String nombre;
    String especialidad;

    // Constructor
    public Doctor(int idDoctor, String nombre, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Métodos
    public void mostrarNombre() {
        System.out.println(nombre);
    }
}
