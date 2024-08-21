import com.cibancode.figuras.ejemplo1.Circulo;
import com.cibancode.figuras.ejemplo1.Triangulo;
import com.cibancode.figuras.ejemplo1.Cuadrado;
import com.cibancode.figuras.ejemplo1.Figuras;

public class Main {
    public static void main(String[] args) {
        Figuras figuraManager = new Figuras();

        // Agregar diferentes tipos de figuras
        figuraManager.addFigura(new Cuadrado());
        figuraManager.addFigura(new Circulo());
        figuraManager.addFigura(new Triangulo());

        // Dibujar todas las figuras
        figuraManager.dibujarFiguras();
    }
}