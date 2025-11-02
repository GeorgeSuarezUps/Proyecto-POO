package uni1a;

// Film hereda de ContenidoAudiovisual
public class Film extends ContenidoAudiovisual {
    private String director;
    private int presupuestoMillones; // En millones de USD

    // CONSTRUCTOR
    public Film(String titulo, int duracionEnMinutos, String genero, String director, int presupuestoMillones) {
        // Llama al constructor de la clase base
        super(titulo, duracionEnMinutos, genero); 
        this.director = director;
        this.presupuestoMillones = presupuestoMillones;
    }

    // MÉTODO ESPECÍFICO
    public String obtenerPresupuesto() {
        return "Presupuesto estimado: $" + presupuestoMillones + " millones.";
    }

    // IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO
    @Override
    public void mostrarDetalles() {
        System.out.println("--- F I L M ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Director: " + this.director);
        System.out.println("Presupuesto: " + obtenerPresupuesto());
    }
    
    // Getters y Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPresupuestoMillones() {
        return presupuestoMillones;
    }

    public void setPresupuestoMillones(int presupuestoMillones) {
        this.presupuestoMillones = presupuestoMillones;
    }
}