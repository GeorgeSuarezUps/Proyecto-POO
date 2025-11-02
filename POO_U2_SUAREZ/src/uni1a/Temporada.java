package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;
    private String tituloPrincipal;

    // CONSTRUCTOR
    public Temporada(int numeroTemporada, int numeroEpisodios, String tituloPrincipal) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
        this.tituloPrincipal = tituloPrincipal;
    }

    // GETTERS (Métodos de Acceso)
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    // SETTERS (Métodos de Mutación)
    public void setNumeroTemporada(int numeroTemporada) {
        // Validación básica
        if (numeroTemporada > 0) {
            this.numeroTemporada = numeroTemporada;
        }
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        // Validación básica
        if (numeroEpisodios >= 0) {
            this.numeroEpisodios = numeroEpisodios;
        }
    }

    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }
}