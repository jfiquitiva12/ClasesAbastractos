public class Ingeniero extends Persona implements Interfaz {
    private double horasTrabajadas;
    private double tarifaHora;


    public Ingeniero() {
    }

    public Ingeniero(String nombre, String apellido, int edad, double horasTrabajadas, double tarifaHora) {
        super(nombre, apellido, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularIngresos() {
        return horasTrabajadas * tarifaHora;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Horas trabajadas: " + horasTrabajadas);
        System.out.printf("Tarifa hora: " + tarifaHora);
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un Ingeniero de sistemas Estudiado en la Universidad Cundinamarca ");
    }

    @Override
    public void despedirse() {
        System.out.println("Adios, debo seguir trabajando en mis proyectos ");
    }
}
