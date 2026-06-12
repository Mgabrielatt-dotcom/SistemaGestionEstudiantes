public class SistemaGestionEstudiantes {

    // Clase Estudiante
    static class Estudiante {
        String nombre;
        int edad;
        String matricula;

        // Constructor
        public Estudiante(String nombre, int edad, String matricula) {
            this.nombre = nombre;
            this.edad = edad;
            this.matricula = matricula;
        }

        // Método para mostrar información
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Matrícula: " + matricula);
        }
    }

    // Método principal
    public static void main(String[] args) {

        // Crear objetos
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 20, "A001");
        Estudiante estudiante2 = new Estudiante("María López", 22, "A002");

        // Mostrar información
        System.out.println("Información de los estudiantes:");
        estudiante1.mostrarInformacion();
        System.out.println();
        estudiante2.mostrarInformacion();
    }
}
