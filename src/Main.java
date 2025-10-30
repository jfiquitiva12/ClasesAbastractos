import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // construir un modelo q implemente una clase abstracta, metodos abstractos y
        // constuirle una interfaz de programacion que tenga minimo 2 metodos la interfaz
        // y en el Main llamamos a los menus

        // objetos
        Persona v1 = new Ingeniero("Messi", "Ronaldo", 34, 48, 5000);
        Persona v2 = new Ingeniero("Alberto", "Fernandez", 29, 38, 5000);

        Persona b1 = new Abogado("Angie", "Guadalupe", 21, 4, 1800000);
        Persona b2 = new Abogado("Gabriel", "Marquez", 36, 7, 1600000);


        Ingeniero h1 = new Ingeniero();
        h1.mostrarDatos();

        Abogado n1 = new Abogado();
        n1.mostrarDatos();

        Interfaz k1 = new Ingeniero();
        k1.saludar();

        Interfaz k2 = new Ingeniero();
        k2.saludar();

        Interfaz k3 = new Abogado();
        k3.saludar();

        Interfaz k4 = new Abogado();
        k4.saludar();



    }
}