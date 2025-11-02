/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
	private ArrayList<Temporada> listaDeTemporadas;
    private int temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaDeTemporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        this.listaDeTemporadas.add(temporada);
    }
    
    public ArrayList<Temporada> getListaDeTemporadas() {
        return listaDeTemporadas;
    }

    public int getNumeroDeTemporadas() {
        return listaDeTemporadas.size();
    }

    
    @Override
    public void mostrarDetalles() {
        System.out.println("--- SERIE DE TV ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.listaDeTemporadas.size());
        if (!listaDeTemporadas.isEmpty()) {
            System.out.println("Detalle de Temporadas:");
            for (Temporada t : listaDeTemporadas) {
                System.out.println("  - T" + t.getNumeroTemporada() + ": " + t.getTituloPrincipal() + " (" + t.getNumeroEpisodios() + " eps)");
            }
        }
        System.out.println();
    }
}