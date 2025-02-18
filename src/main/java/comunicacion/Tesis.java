package comunicacion;

import java.util.Arrays;

public class Tesis extends Escrito{
    String idea;
    String[] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Tesis(String origen, String titulo, String autor, int paginas,
                 String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);

        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){

        return getPaginas() * palabrasPagina * 5;

    }
    public String interpretacion() {

        return interpretacion;
    }



    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n"
                + getPaginas() + "\n" + idea + "\n" + argumentos.length +
                "\n" + conclusion + "\n" + referencias;
    }
}
