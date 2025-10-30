public class Abogado extends Persona implements Interfaz {
    private int casosGanados;
    private double pagoPorCaso;


    public Abogado () {
    }
    public Abogado(String nombre, String apellido, int edad, int casosGanados, double pagoPorCaso) {
        super(nombre, apellido, edad);
        this.casosGanados = casosGanados;
        this.pagoPorCaso = pagoPorCaso;
    }

    @Override
    public double calcularIngresos() {
        return casosGanados * pagoPorCaso;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Horas trabajadas: " + casosGanados);
        System.out.println("Horas trabajadas: " + pagoPorCaso);
    }
    @Override
    public void saludar() {
        System.out.println("Hola, soy un abogado estudiado en Harvard ");
    }

    @Override
    public void despedirse() {
        System.out.println("Adios debo seguir trabajando en un caso importante ");
    }
}
