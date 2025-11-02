/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador investigador) {
        this.investigadores.add(investigador);
    }
    
    public ArrayList<Investigador> getInvestigadores() {
        return investigadores;
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("--- DOCUMENTAL ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
System.out.println("Investigadores asociados: " + this.investigadores.size());
        
       
        if (!investigadores.isEmpty()) {
            System.out.println("Lista de Investigadores:");
            for (Investigador i : investigadores) {
                System.out.println("  - " + i.getNombreCompleto() + " (" + i.getEspecialidad() + ")");
            }
        }
        System.out.println();
    }
}