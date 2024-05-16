public class Doctor {
    // Atributos
    static int idDoctor = 0;
    String nombre;
    String especialidad;

    public Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
        idDoctor++;
    }

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

    public void mostrarID() {
        System.out.println("ID del doctor: " + idDoctor);
    }
}
