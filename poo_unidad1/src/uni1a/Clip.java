package uni1a;

// Clip hereda de ContenidoAudiovisual
public class Clip extends ContenidoAudiovisual {
    private String plataformaOrigen; // Ej: TikTok, Instagram, YouTube Shorts
    private boolean esPromocional;
    
    // CONSTRUCTOR
    public Clip(String titulo, int duracionEnMinutos, String genero, String plataformaOrigen, boolean esPromocional) {
        // Llama al constructor de la clase base
        super(titulo, duracionEnMinutos, genero); 
        this.plataformaOrigen = plataformaOrigen;
        this.esPromocional = esPromocional;
    }

    // MÉTODO ESPECÍFICO
    public void compartir() {
        System.out.println("El Clip '" + getTitulo() + "' de " + plataformaOrigen + " ha sido compartido.");
    }

    // IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO
    @Override
    public void mostrarDetalles() {
        System.out.println("--- C L I P ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Plataforma: " + this.plataformaOrigen);
        System.out.println("Tipo: " + (this.esPromocional ? "Promocional" : "General"));
    }
    
    // Getters y Setters
    public String getPlataformaOrigen() {
        return plataformaOrigen;
    }

    public void setPlataformaOrigen(String plataformaOrigen) {
        this.plataformaOrigen = plataformaOrigen;
    }
    
    public boolean esPromocional() {
        return esPromocional;
    }

    public void setEsPromocional(boolean esPromocional) {
        this.esPromocional = esPromocional;
    }
}