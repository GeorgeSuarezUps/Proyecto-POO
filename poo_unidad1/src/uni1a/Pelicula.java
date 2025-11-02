/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    private ArrayList<Actor> actores;
    
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void agregarActor(Actor actor) {
        this.actores.add(actor);
    }
    
    // GETTER para obtener la lista de actores (útil para mostrar detalles)
    public ArrayList<Actor> getActores() {
        return actores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Número de Actores: " + actores.size());
        if (!actores.isEmpty()) {
            System.out.print("Elenco Principal: ");
            for (Actor actor : actores) {
                System.out.print(actor.getNombre() + " (" + actor.getPaisOrigen() + "); ");
            }
            System.out.println();
        }
        System.out.println();
    }
}