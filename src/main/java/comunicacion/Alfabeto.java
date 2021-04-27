package comunicacion;
import java.util.Arrays;

public class Alfabeto extends Pictograma {
    String[] letras;
    String interpretacion;

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {

        return letras.length;
    }

    public String interpretacion() {

        return interpretacion;
    }

    @Override
    public String toString() {
        String str = String.join(", ", letras);
        return str;
    }
}
